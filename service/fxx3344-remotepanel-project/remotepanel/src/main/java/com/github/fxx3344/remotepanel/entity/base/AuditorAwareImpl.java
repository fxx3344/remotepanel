package com.github.fxx3344.remotepanel.entity.base;

import com.github.fxx3344.remotepanel.entity.common.User;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * description: AuditorAwareImpl <br>
 * date: 2022/12/19 下午11:56 <br>
 * author: xi.feng <br>
 * version: 1.0 <br>
 */
public class AuditorAwareImpl implements AuditorAware<User> {

    @Override
    public Optional<User> getCurrentAuditor() {
        return Optional.empty();
    }
}
