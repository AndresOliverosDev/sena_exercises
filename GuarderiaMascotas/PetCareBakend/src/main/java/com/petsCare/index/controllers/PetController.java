package com.petsCare.index.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petsCare.index.models.Pet;
import com.petsCare.index.services.PetService;

@RestController
public class PetController {

    @Autowired
    PetService petService;

    @GetMapping("/getAllPets")
    List<Pet> getAllPets() {
        return petService.getAllPets();
    }
}
