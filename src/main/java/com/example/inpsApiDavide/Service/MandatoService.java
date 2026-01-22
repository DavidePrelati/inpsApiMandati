package com.example.inpsApiDavide.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inpsApiDavide.Model.Mandato;
import com.example.inpsApiDavide.Repository.MandatoRepo;

@Service
public class MandatoService {

	@Autowired
	private MandatoRepo mandatoRepo;
	
	public List<Mandato> mandatiAttesaAttivazione(){
		return mandatoRepo.findAll();
	}
	
	public List<Mandato> mandatiAttesaAttivazionePerCf(String codiceFiscale) {
		return mandatoRepo.findByCodiceFiscale(codiceFiscale);
	}
	
	public List<Mandato> mandatiAttesaAttivazionePerDataIniAtt(String dataInizioAttivazione){	
		return mandatoRepo.findByDataInizioAttivazioneStartingWith(dataInizioAttivazione);
	}
	
	public List<Mandato> mandatiAttesaAttivazionePerDataAttivazione(String dataAttivazione){	
		return mandatoRepo.findByDataAttivazioneStartingWith(dataAttivazione);
	}
	
	public List<Mandato> mandatiAttesaAttivazionePerDataSottoscrizione(String dataSottoscrizione){	
		return mandatoRepo.findByDataSottoscrizioneStartingWith(dataSottoscrizione);
	}
	
}
