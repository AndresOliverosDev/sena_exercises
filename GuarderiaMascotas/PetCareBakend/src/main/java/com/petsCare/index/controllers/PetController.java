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

    @DeleteMapping("/deletePet")
    ResponseEntity<String> deletePet(@RequestBody Long id) {
        return petService.deletePet(id);
    }

    @PutMapping("/updatePet/{id}")
    ResponseEntity<String> updatePet(@PathVariable Long id, @RequestBody Pet pet) {
        return petService.updatePet(id, pet);
    }

    @GetMapping("/getAllPets")
    List<Pet> getAllPets() {
        return petService.getAllPets();
    }

    @GetMapping("/getByIdPet")
    Pet getByIdPet(@RequestBody Long id){
        return petService.getByIdPet(id);
    }

    @GetMapping("/getByNamePets")
    List<Pet> getByNamePets(@RequestBody String name) {
        return petService.getByNamePets(name);
    }

    @GetMapping()
}
