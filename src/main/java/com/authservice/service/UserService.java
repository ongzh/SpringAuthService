package com.authservice.service;

import com.authservice.documents.Role;
import com.authservice.documents.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);


}
