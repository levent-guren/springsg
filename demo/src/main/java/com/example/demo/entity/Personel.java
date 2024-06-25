package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Personel {
	@Id
	private int id;
	private String adi;
	private String soyadi;
}
