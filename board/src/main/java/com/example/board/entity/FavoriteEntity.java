package com.example.board.entity;

import com.example.board.entity.pk.FavoritePk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "favorit")
@Table(name = "favorit")
@IdClass(FavoritePk.class)
public class FavoriteEntity {
    @Id
    private Integer boardNumber;
    @Id
    private String userEmail;
}
