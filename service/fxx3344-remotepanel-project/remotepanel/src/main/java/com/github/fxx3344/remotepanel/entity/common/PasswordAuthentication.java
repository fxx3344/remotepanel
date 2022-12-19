package com.github.fxx3344.remotepanel.entity.common;

import com.github.fxx3344.remotepanel.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * description: PasswordAuthentication <br>
 * date: 2022/12/20 上午12:04 <br>
 * author: xi.feng <br>
 * version: 1.0 <br>
 */
@Entity
@Table(name = "sc_pwd")
public class PasswordAuthentication extends BaseEntity {
    @Column(length = 50, nullable = false, unique = true)
    private String username;

    @Column(length = 66, nullable = false)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
