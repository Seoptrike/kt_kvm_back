package com.ncs.kt.controller;

import com.ncs.kt.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserDAO udao;

    @GetMapping("/listAll")
    public List<HashMap<String, Object>> listAll(){
        return udao.listAll();
    }

    @PostMapping("/readUser")
    public HashMap<String,Object> readUser(@RequestBody String userID){
        return udao.readUser(userID);
    }
}
