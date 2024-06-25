package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, Integer> {

}
