package tr.gov.sg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.gov.sg.entity.Personel;
import tr.gov.sg.repository.PersonelRepository;

@Service
public class PersonelService {
	@Autowired
	private PersonelRepository personelRepository;

	public List<Personel> tumPersonelleriGetir() {
		return personelRepository.findAll();
	}
}
