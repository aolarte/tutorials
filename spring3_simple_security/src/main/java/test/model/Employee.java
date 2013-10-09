package test.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Employee {

  @Id
  @GeneratedValue
  private Long id;
  private String userName;
  private String password;
  @ManyToMany
  //@JoinTable(name="EMP_ROLES")
  private List<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}