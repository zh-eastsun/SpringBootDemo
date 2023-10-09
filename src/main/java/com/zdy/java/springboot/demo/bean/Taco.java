package com.zdy.java.springboot.demo.bean;

import lombok.Data;

import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredientList;
}
