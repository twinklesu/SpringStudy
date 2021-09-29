package com.gdsc.backend.repository;

import com.gdsc.backend.entity.Liked;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikedRepository extends JpaRepository<Liked, Integer> {
    // <entity, primarykey의 타입>
    // 기본 CRUD 해줌
}
