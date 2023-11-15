package com.enes.movieapp.controller;

import com.enes.movieapp.entity.Movie;
import com.enes.movieapp.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController {

    private final MovieService service;

    @GetMapping("/findall")
    public ResponseEntity<List<Movie>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
}
