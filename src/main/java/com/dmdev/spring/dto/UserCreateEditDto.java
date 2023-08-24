package com.dmdev.spring.dto;

import lombok.Value;

import java.time.LocalDate;

@Value
public class UserCreateEditDto {
    String username;
    String firstName;
    LocalDate birthDate;
    String lastname;
    Integer companyID;
}
