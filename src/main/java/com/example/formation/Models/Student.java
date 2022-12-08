package com.example.formation.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {

    private final String firstName;
    private final String lastName;
    private final Nationality nationality;
}
