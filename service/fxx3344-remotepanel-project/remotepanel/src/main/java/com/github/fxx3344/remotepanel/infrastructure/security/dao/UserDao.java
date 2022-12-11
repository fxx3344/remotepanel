package com.github.fxx3344.remotepanel.infrastructure.security.dao;

import com.github.fxx3344.remotepanel.infrastructure.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * description: UserDao <br>
 * date: 2022/12/11 下午10:35 <br>
 * author: xi.feng <br>
 * version: 1.0 <br>
 */
public interface UserDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
