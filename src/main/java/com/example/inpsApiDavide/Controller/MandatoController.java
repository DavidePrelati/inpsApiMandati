package com.example.inpsApiDavide.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inpsApiDavide.Model.Mandato;
import com.example.inpsApiDavide.Service.MandatoService;

@RestController
@RequestMapping("/mandati")
public class MandatoController {
	
	@Autowired
	private MandatoService mandatoService;
	
	@GetMapping("/attesa-attivazione")
	public List<Mandato> recuperoMandatiAttesaAttivazione(){
		return mandatoService.mandatiAttesaAttivazione();
	}
	
	@GetMapping("/attesa-attivazione/cf/{codice_fiscale}")
	public List<Mandato> recuperoMandatiPerCodiceFiscale(@PathVariable String codice_fiscale) {
	    return mandatoService.mandatiAttesaAttivazionePerCf(codice_fiscale);
	}
	
	@GetMapping("/attesa-attivazione/dataInizioAttivazione/{data_inizio_attivazione}")
	public List<Mandato> recuperoMandatiPerDataIniAtt(@PathVariable String data_inizio_attivazione){
		return mandatoService.mandatiAttesaAttivazionePerDataIniAtt(data_inizio_attivazione);
	}

	@GetMapping("/attesa-attivazione/dataAttivazione/{data_attivazione}")
	public List<Mandato> recuperoMandatiPerDataAttivazione(@PathVariable String data_attivazione){
		return mandatoService.mandatiAttesaAttivazionePerDataAttivazione(data_attivazione);
	}
	
	@GetMapping("/attesa-attivazione/dataSottoscrizione/{data_sottoscrizione}")
	public List<Mandato> recuperoMandatiPerSottoscrizione(@PathVariable String data_sottoscrizione){
		return mandatoService.mandatiAttesaAttivazionePerDataSottoscrizione(data_sottoscrizione);
	}

}
