package com.okta.spring.OktaOAuthClient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class WebController {
    //This class simply creates two routes, one for the home route and one for the secured route.
    // Again, Spring Boot and Thymeleaf are auto-magicking this to the two template files in src/main/resources/templates.

    @RequestMapping("/securedPage")
    public String securedPage(Model model, Principal principal) {
        return "securedPage";
    }

    @RequestMapping("/")
    public String index(Model model, Principal principal) {
        return "index";
    }
}