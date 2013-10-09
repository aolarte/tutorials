package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.dao.IEmployeeDAO;
import test.model.Employee;
import test.model.Role;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class UserService implements UserDetailsService {

    @Autowired
    private IEmployeeDAO userDAO;


    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Employee employee =userDAO.findByUserName(userName);
        if (employee ==null) {
            throw new UsernameNotFoundException("Invalid Employee");
        }


        return createUserDetails(employee);
    }

    private UserDetails createUserDetails(Employee employee) {
        List<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>();
        for (Role role:employee.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        User ret=new User(employee.getUserName(),employee.getPassword(),true,true,true,true,authorities);
        return ret;
    }
}
