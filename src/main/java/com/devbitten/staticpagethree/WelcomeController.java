package com.devbitten.staticpagethree;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome() {

        return "welcome";
    }

    /*
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login() {
    	String userN;
    	String passW;
    	
    	Account
        return new ModelAndView("login", "lgn", );
        
    }

    @RequestMapping("/dashboard")
    public String dashboard() {

        return "dashboard";
    }

    @RequestMapping("/register")
    public String register() {

        return "register";
    }
    */
}