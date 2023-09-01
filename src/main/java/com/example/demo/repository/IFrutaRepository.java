package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Fruta;

public interface IFrutaRepository extends JpaRepository<Fruta, Integer>{

}
