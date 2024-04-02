package com.example.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "user")
@Table(name = "user")
public class BoardImageEntity {
    private Integer sequence;
    private Integer boardNumber;
    private String imageUrl;
}
