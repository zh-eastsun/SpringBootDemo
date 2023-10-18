package com.zdy.java.springboot.demo.data;

import com.zdy.java.springboot.demo.bean.Ingredient;

import java.util.Optional;

interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
