package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {

    private int id;

    private String name;

    private Integer score;

    private String picture;
}
