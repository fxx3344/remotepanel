package com.github.fxx3344.remotepanel.dao;

import com.github.fxx3344.remotepanel.entity.linux.LinuxConnection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * description: LinuxConnectionDao <br>
 * date: 2022/12/20 上午12:11 <br>
 * author: xi.feng <br>
 * version: 1.0 <br>
 */
public interface LinuxConnectionDao extends JpaRepository<LinuxConnection, Long>, JpaSpecificationExecutor<LinuxConnection> {
}
