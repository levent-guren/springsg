package tr.gov.sg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Personel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PersonelSEQ")
	@SequenceGenerator(name = "PersonelSEQ", sequenceName = "personel_pk_seq")
	private int id;
	private String adi;
	private String soyadi;
}
