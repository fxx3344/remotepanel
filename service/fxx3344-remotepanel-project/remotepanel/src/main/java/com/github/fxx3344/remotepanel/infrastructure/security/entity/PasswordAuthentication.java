package com.github.fxx3344.remotepanel.infrastructure.security.entity;

import com.github.fxx3344.remotepanel.infrastructure.base.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * description: PasswordAuthentication <br>
 * date: 2022/12/11 下午10:34 <br>
 * author: xi.feng <br>
 * version: 1.0 <br>
 */
@Entity
@Table(name = "sc_pwd")
public class PasswordAuthentication extends EntityBase {

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
