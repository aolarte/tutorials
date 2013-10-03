package test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import test.service.IPersonService;
import test.model.Person;

import java.util.List;


@Controller
public class TestController {

    @Autowired
    private IPersonService personService;

    @RequestMapping(value="/view",method = RequestMethod.GET)
    public ModelAndView view() {
        ModelAndView ret=new ModelAndView("view");
        List<Person> persons=personService.findAll();
        ret.addObject("persons",persons);
        return ret;
    }

    @RequestMapping(value="/view/{id}",method = RequestMethod.GET)  //1
    public ModelAndView viewById(@PathVariable Long id) { //2
        ModelAndView ret=new ModelAndView("person");
        Person person=personService.findById(id); //3
        ret.addObject("person",person);
        return ret;
    }

    @RequestMapping(value="/new",method = RequestMethod.GET)
    public ModelAndView newPerson(Person person) { //4
        ModelAndView ret=new ModelAndView("person");
        ret.addObject("person",person);
        return ret;
    }

    @RequestMapping(value="/post",method =  RequestMethod.POST)
    public ModelAndView post(Person person) { //5
        ModelAndView ret=new ModelAndView("view");
        personService.persist(person); //6
        List<Person> persons=personService.findAll();
        ret.addObject("persons",persons);
        return ret;

    }

}
