package com.kavee.gearrentpro.controller;

import com.kavee.gearrentpro.entity.User;
import com.kavee.gearrentpro.service.LoginService;

public class LoginController {

    private final LoginService loginService;

    public LoginController() {
        loginService = new LoginService();
    }

   
    public User login(String username, String password) {

        User user = loginService.authenticate(username, password);

        if (user != null) {
            System.out.println("Login successful. Role: " + user.getRole());
            return user;
        } else {
            System.out.println("Invalid username or password.");
            return null;
        }
    }
}

