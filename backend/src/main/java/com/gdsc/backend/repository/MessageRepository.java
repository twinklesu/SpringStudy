package com.gdsc.backend.repository;

import com.gdsc.backend.entity.BoardScrap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<BoardScrap, Integer> {
    // <entity, primarykey의 타입>
    // 기본 CRUD 해줌
}
