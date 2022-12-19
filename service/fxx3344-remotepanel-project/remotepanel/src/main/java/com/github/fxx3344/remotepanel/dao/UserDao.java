package com.github.fxx3344.remotepanel.dao;

import com.github.fxx3344.remotepanel.entity.common.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * description: UserDao <br>
 * date: 2022/12/20 上午12:10 <br>
 * author: xi.feng <br>
 * version: 1.0 <br>
 */
public interface UserDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
