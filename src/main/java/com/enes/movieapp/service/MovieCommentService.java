package com.enes.movieapp.service;

import com.enes.movieapp.repository.MovieCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieCommentService {

    private final MovieCommentRepository repository;
}
