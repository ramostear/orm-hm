package com.ramostear.hm.service.impl;

import com.ramostear.hm.model.User;
import com.ramostear.hm.orm.jpa.UserRepository;
import com.ramostear.hm.orm.mybatis.UserMapper;
import com.ramostear.hm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ramostear on 2019/6/6 0006.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private UserMapper userMapper;

    @Autowired
    UserServiceImpl(UserRepository userRepository,UserMapper userMapper){
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        return userMapper.selectByUserId(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userMapper.selectAllUser();
    }
}
