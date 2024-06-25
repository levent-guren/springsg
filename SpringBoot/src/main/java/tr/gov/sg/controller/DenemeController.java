package tr.gov.sg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tr.gov.sg.dto.HesapDTO;

@Controller
public class DenemeController {
	@GetMapping("/merhaba")
	@ResponseBody
	public String merhaba(String adi) {
		System.out.println("Merhaba çalıştı");
		return "Merhaba " + adi;
	}

	@GetMapping("/islem")
	@ResponseBody
	public String islem(int sayi1, int sayi2, String islem) {
		int sonuc = 0;
		switch (islem) {
		case "+": {
			sonuc = sayi1 + sayi2;
			break;
		}
		case "-": {
			sonuc = sayi1 - sayi2;
			break;
		}
		}
		return "Sonuc " + sonuc;
	}

	@GetMapping("/islem2")
	@ResponseBody
	public String islem(HesapDTO dto) {
		int sonuc = 0;
		switch (dto.getIslem()) {
		case "+": {
			sonuc = dto.getSayi1() + dto.getSayi2();
			break;
		}
		case "-": {
			sonuc = dto.getSayi1() - dto.getSayi2();
			break;
		}
		}
		return "Sonuc " + sonuc;
	}
}
