package com.ncs.kt.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{
    @Autowired
    SqlSession session;
    String namespace= "com.ncs.kt.mapper.UserMapper";
    @Override
    public List<HashMap<String, Object>> listAll() {
        return session.selectList(namespace + ".listAll");
    }

    @Override
    public HashMap<String, Object> readUser(String userID) {
        return session.selectOne(namespace + ".readUser", userID);
    }
}
