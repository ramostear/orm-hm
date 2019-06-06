package com.ramostear.hm.orm.jpa;

import com.ramostear.hm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ramostear on 2019/6/6 0006.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
