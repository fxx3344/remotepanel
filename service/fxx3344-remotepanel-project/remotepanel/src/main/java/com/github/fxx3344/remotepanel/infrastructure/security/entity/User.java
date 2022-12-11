package com.github.fxx3344.remotepanel.infrastructure.security.entity;

import com.github.fxx3344.remotepanel.infrastructure.base.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * description: User <br>
 * date: 2022/12/11 下午10:35 <br>
 * author: xi.feng <br>
 * version: 1.0 <br>
 */
@Entity
@Table(name = "sc_user")
public class User extends EntityBase {

    @Column(length = 50, nullable = false, unique = true)
    private String identifier;

    @Column(name = "enb", nullable = false)
    private Boolean enable;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 50)
    private String email;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
