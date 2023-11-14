package com.enes.movieapp.service;

import com.enes.movieapp.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenreService {

    private final GenreRepository repository;
}
