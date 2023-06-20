package com.example.smileteam.dto;

import lombok.Data;

import javax.management.relation.Role;

@Data
public class RegisterReq {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private Role role;
}
