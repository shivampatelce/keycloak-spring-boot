package com.example.keycloak_demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableMethodSecurity
public class AppController {

    @GetMapping("/user")
    @PreAuthorize("hasRole('user')")
    public String user() {
        return "Response for user";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('admin')")
    public String admin() {
        return "Response for admin";
    }
}
