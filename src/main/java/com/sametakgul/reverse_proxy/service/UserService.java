package com.sametakgul.reverse_proxy.service;

import com.sametakgul.reverse_proxy.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<User>();

    public UserService() {
        users.add(new User(1L,"Samet","Akgul"));
        users.add(new User(2L,"Muhammed","Akgul"));
        users.add(new User(3L,"John","Doe"));
        users.add(new User(4L,"Jane","Doe"));
    }

    public List<User> getUsers() {
        return users;
    }
}
