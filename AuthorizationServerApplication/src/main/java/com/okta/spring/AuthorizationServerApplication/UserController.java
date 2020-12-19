package com.okta.spring.AuthorizationServerApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    //This file allows the client apps to find out more
    // about the users that authenticate with the server.

    @GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }
}