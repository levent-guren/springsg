package tr.gov.sg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.log4j.Log4j2;
import tr.gov.sg.entity.Personel;
import tr.gov.sg.service.PersonelService;

@Controller
@Log4j2
public class PersonelController {
	@Autowired
	private PersonelService personelService;

	@PostMapping("/personelListele")
	public String getPersonel(Model model) {
		log.error("PersonelController.getPersonel() çağırıldı");
		List<Personel> personeller = personelService.tumPersonelleriGetir();
		model.addAttribute("liste", personeller);
		return "personelListesi";
	}
}
