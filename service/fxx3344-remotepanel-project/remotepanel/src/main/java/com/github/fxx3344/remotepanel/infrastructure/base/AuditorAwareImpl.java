package com.github.fxx3344.remotepanel.infrastructure.base;

import com.github.fxx3344.remotepanel.infrastructure.security.entity.User;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * description: AuditorAwareImpl <br>
 * date: 2022/12/11 下午10:59 <br>
 * author: xi.feng <br>
 * version: 1.0 <br>
 */
@Component
public class AuditorAwareImpl implements AuditorAware<User> {
    @Override
    public Optional<User> getCurrentAuditor() {
        return Optional.empty();
    }
}
