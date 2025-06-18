package com.ncs.kt.dao;

import java.util.HashMap;
import java.util.List;

public interface UserDAO {
    List<HashMap<String, Object>> listAll();

    HashMap<String, Object> readUser(String userID);
}
