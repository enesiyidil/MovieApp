package com.enes.movieapp.service;

import com.enes.movieapp.entity.User;
import com.enes.movieapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public void save(User user) {
        repository.save(user);
    }

    public void saveAll(List<User> users) {
        repository.saveAll(users);
    }
}
