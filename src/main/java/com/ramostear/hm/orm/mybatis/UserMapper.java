package com.ramostear.hm.orm.mybatis;

import com.ramostear.hm.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Ramostear on 2019/6/6 0006.
 */
@Component
@Mapper
public interface UserMapper {

    User selectByUserId(Long id);

    List<User> selectAllUser();

}
