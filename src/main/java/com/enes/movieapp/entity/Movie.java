package com.enes.movieapp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Genre> genre;

    private String language;

    private String image;

    private String name;

    private String country;

    private Double rating;

    private String summary;

    private LocalDate premired;

    private String url;

    @OneToMany
    private List<MovieComment> comments;
}
