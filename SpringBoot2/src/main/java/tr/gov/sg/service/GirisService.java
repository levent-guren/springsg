package tr.gov.sg.service;

import org.springframework.stereotype.Service;

import tr.gov.sg.dto.giris.GirisDTO;

@Service
public class GirisService {
	public boolean girisYap(GirisDTO dto) {
		StringBuilder isim = new StringBuilder(dto.getEposta());
		int atIsaretiYeri = isim.indexOf("@");
		if (atIsaretiYeri != -1) {
			isim.delete(atIsaretiYeri, isim.length());
		}
		isim.reverse();
		return isim.toString().equals(dto.getSifre());
	}

}
