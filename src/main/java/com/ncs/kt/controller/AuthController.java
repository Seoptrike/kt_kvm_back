package com.ncs.kt.controller;

import com.ncs.kt.dao.AuthDAO;
import com.ncs.kt.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthDAO adao;

    @PostMapping("/login")
    public int login(@RequestBody UserVO vo){
        int result; // 아이디 없음
        HashMap<String, Object> user = adao.Login(vo);
        if(user == null){
            result=0;
        }else{
            result=1;
        }
        return result;
    }

    @PostMapping("/signUp")
    public void signUp(@RequestBody UserVO vo){
        adao.signUp(vo);
    }
}