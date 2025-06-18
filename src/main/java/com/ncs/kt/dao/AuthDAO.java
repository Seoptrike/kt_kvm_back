package com.ncs.kt.dao;

import com.ncs.kt.domain.UserVO;

import java.util.HashMap;

public interface AuthDAO {
    HashMap<String,Object> Login(UserVO vo);

    void signUp(UserVO vo);
}
