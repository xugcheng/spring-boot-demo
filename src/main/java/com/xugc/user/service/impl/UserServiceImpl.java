package com.xugc.user.service.impl;

import com.xugc.user.domain.User;
import com.xugc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuguocheng on 2016/12/3.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAllUsers() {
        return jdbcTemplate.queryForList("select * from user ", User.class);
    }
}
