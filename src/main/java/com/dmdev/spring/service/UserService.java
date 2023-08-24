package com.dmdev.spring.service;

import com.dmdev.spring.database.entity.User;
import com.dmdev.spring.database.repository.CompanyRepository;
import com.dmdev.spring.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService  {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

//    public User findAll() {
//    }
}
