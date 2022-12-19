package com.github.fxx3344.remotepanel.dao;

import com.github.fxx3344.remotepanel.entity.common.PasswordAuthentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * description: PasswordAuthenticationDao <br>
 * date: 2022/12/20 上午12:11 <br>
 * author: xi.feng <br>
 * version: 1.0 <br>
 */
public interface PasswordAuthenticationDao extends JpaRepository<PasswordAuthentication, Long>, JpaSpecificationExecutor<PasswordAuthentication> {
}
