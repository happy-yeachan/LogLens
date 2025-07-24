package com.example.loglens.user.repository;

import com.example.loglens.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // 없을 수 도 있으니 Optional 사용
    Optional<User> findByEmail(String email);
    // 이메일로 중복 체크
    boolean existsByEmail(String email);
}
