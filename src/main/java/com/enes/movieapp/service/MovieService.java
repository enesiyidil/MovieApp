package com.enes.movieapp.service;

import com.enes.movieapp.entity.Movie;
import com.enes.movieapp.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository repository;

    public void save(Movie movie) {
        repository.save(movie);
    }

    public Movie findById(Long id){
        Optional<Movie> optionalMovie = repository.findById(id);
        if(optionalMovie.isPresent()){
            return optionalMovie.get();
        }else{
            throw new RuntimeException("Film Bulunamadı!");
        }
    }

    public List<Movie> findAllByIds(List<Long> ids){
        return ids.stream().map(this::findById).collect(Collectors.toList());
    }

    public List<Movie> findAll() {
        return repository.findAll();
    }
}
