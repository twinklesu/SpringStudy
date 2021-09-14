package com.gdsc.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

// @Table 어노테이션은 db와 entity의 이름이 같아서 안해줘도 됨
@Entity // DB 테이블 임
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String hp;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String major;

    private String profile_pic;

    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean isAuth;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updatedAt;


}

//CREATE TABLE `user` (
//   `id` int NOT NULL AUTO_INCREMENT,
//   `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
//   `email` varchar(255) NOT NULL,
//   `hp` varchar(255) NOT NULL,
//   `is_auth` tinyint(1) NOT NULL DEFAULT '0',
//   `major` varchar(255) NOT NULL,
//   `name` varchar(255) NOT NULL,
//   `nickname` varchar(255) NOT NULL,
//   `password` varchar(255) NOT NULL,
//   `profile_pic` varchar(255) DEFAULT NULL,
//   `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//   `user_id` varchar(255) NOT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci