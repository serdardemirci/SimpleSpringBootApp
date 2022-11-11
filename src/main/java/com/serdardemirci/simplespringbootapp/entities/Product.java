package com.serdardemirci.simplespringbootapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private final Long id;

    private String name;
}
