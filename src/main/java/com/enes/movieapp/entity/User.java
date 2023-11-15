package com.enes.movieapp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String surname;

    @Column(length = 50)
    private String email;

    @Column(length = 15)
    private String phone;

    @Column(length = 32)
    private String password;

    @ManyToMany
    private List<Movie> favMovies;

    @ManyToMany
    private List<Genre> favGenres;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<MovieComment> comments;
}
