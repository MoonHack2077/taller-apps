package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Animal;

public interface IAnimalRepository extends JpaRepository<Animal, Integer>{

}
