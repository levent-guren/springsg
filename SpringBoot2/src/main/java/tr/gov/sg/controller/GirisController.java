package tr.gov.sg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import tr.gov.sg.dto.giris.GirisDTO;
import tr.gov.sg.service.GirisService;

@Controller
//@RequestMapping("/giris")
public class GirisController implements CommandLineRunner {
	@Autowired
	private GirisService girisService;

	@Value("${isim:Levent}")
	private String name;

	@PostMapping("/giris2")
	public ModelAndView giris2(GirisDTO dto) {
		boolean sonuc = girisService.girisYap(dto);
		if (sonuc) {
			return new ModelAndView("menu");
		}
		ModelAndView result = new ModelAndView();
		result.setViewName("anaSayfa");
		result.addObject("hata", "Hatalı giriş yapıldı");
		return result;
	}

	@PostMapping("/giris")
	public String giris(GirisDTO dto, Model model) {
		boolean sonuc = girisService.girisYap(dto);
		if (sonuc) {
			return "menu";
		}
		model.addAttribute("hata", "Hatalı giriş yapıldı");
		return "anaSayfa";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Program çalıştı:" + name);
	}
}
