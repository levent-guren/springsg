package tr.gov.sg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.gov.sg.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, Integer> {
	public List<Personel> findByAdiLikeIgnoreCase(String adi);
}
