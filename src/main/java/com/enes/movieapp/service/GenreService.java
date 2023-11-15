package com.enes.movieapp.service;

import com.enes.movieapp.entity.Genre;
import com.enes.movieapp.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GenreService {

    private final GenreRepository repository;

    public List<Genre> saveGenreWithName(List<String> names){
        List<Genre> genreList = new ArrayList<>();
        for (String name : names) {
            Optional<Genre> optionalGenre = repository.findByName(name);
            if (optionalGenre.isPresent()){
                genreList.add(optionalGenre.get());
            }else {
                Genre genre = Genre.builder()
                        .name(name)
                        .build();
                genreList.add(repository.save(genre));
            }
        }
        return genreList;
    }
}
