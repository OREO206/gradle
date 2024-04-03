package com.example.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "search")
@Table(name = "search")
public class SearchLogEntity {
    private Integer logSequence;
    private String searchWord;
    private String relationWord;    
    private Boolean relation;
}
