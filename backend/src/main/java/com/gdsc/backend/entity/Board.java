package com.gdsc.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name="user_id", insertable = false, updatable = false)
    private int userId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @ManyToOne(targetEntity = BoardCategory.class)
    @JoinColumn(name="id", insertable = false, updatable = false)
    private int category;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT TRUE")
    private boolean isSecret;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 0")
    private int likeNum;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updatedAt;
}

//CREATE TABLE `board` (
//   `id` int NOT NULL AUTO_INCREMENT,
//   `content` varchar(255) NOT NULL,
//   `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
//   `image_url` varchar(255) NOT NULL,
//   `is_secret` tinyint(1) NOT NULL DEFAULT '1',
//   `like_num` int NOT NULL DEFAULT '0',
//   `title` varchar(255) NOT NULL,
//   `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//   `user_id` int DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   KEY `FKfyf1fchnby6hndhlfaidier1r` (`user_id`),
//   CONSTRAINT `FK1av22w7ltfvvpqkn6n37lituo` FOREIGN KEY (`id`) REFERENCES `board_category` (`id`),
//   CONSTRAINT `FKfyf1fchnby6hndhlfaidier1r` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
