package com.example.smileteam.service;


import com.example.smileteam.dto.RegisterReq;
import com.example.smileteam.dto.Role;

public interface AuthService {
    boolean login(String userName, String password);
    boolean register(RegisterReq registerReq, Role role);
}
