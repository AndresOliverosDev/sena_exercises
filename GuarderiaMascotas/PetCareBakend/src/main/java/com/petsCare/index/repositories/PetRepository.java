package com.petsCare.index.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petsCare.index.models.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{
    
    List<Pet> findAllByName(String name);

    List<Pet> findAllByColor(String color);

    List<Pet> findAllByGender(String gender);

    List<Pet> findAllBySpecie(String specie);

    List<Pet> findAllByRace(Integer race );
}
