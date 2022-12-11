package com.github.fxx3344.remotepanel.infrastructure.security.dao;

import com.github.fxx3344.remotepanel.infrastructure.security.entity.PasswordAuthentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * description: PasswordAuthenticationDao <br>
 * date: 2022/12/11 下午10:27 <br>
 * author: xi.feng <br>
 * version: 1.0 <br>
 */
public interface PasswordAuthenticationDao extends JpaRepository<PasswordAuthentication, Long>, JpaSpecificationExecutor<PasswordAuthentication> {
}
