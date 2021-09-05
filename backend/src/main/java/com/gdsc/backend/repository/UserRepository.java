package com.gdsc.backend.repository;

import com.gdsc.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // <entity, primarykey의 타입>
    // 기본 CRUD 해줌
}
