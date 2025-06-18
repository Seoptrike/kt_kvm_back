package com.ncs.kt.dao;

import com.ncs.kt.domain.UserVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class AuthDAOImpl implements AuthDAO{
    @Autowired
    SqlSession session;
    String namespace= "com.ncs.kt.mapper.AuthMapper";

    @Override
    public HashMap<String, Object> Login(UserVO vo) {
        return session.selectOne(namespace+ ".login", vo);
    }

    @Override
    public void signUp(UserVO vo) {
        session.insert(namespace + ".signUp", vo);
    }
}
