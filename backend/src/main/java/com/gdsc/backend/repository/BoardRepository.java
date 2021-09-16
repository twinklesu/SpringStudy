package com.gdsc.backend.repository;

import com.gdsc.backend.entity.Board;
import com.gdsc.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
    // <entity, primarykey의 타입>
    // 기본 CRUD 해줌
}
