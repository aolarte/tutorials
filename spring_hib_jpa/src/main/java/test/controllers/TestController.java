package test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import test.service.IPersonService;
import test.model.Person;

import java.util.List;


@Controller //1
public class TestController {

    @Autowired //2
    private IPersonService personService;

    @RequestMapping("/view")  //3
    public ModelAndView view() {
        ModelAndView ret=new ModelAndView("view"); //4
        List<Person> persons=personService.findAll();
        ret.addObject("persons",persons); //5
        return ret;
    }
}
