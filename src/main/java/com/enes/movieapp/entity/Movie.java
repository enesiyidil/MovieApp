package com.enes.movieapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Genre> genre;

    private String language;

    private String image;

    private String name;

    private String country;

    private Double rating;

    @Column(length = 2048)
    private String summary;

    private LocalDate premired;

    private String url;

    @OneToMany(mappedBy = "movie")
    @JsonIgnore
    private List<MovieComment> comments;
}
