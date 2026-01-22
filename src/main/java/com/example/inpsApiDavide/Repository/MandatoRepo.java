package com.example.inpsApiDavide.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inpsApiDavide.Model.Mandato;

public interface MandatoRepo extends JpaRepository<Mandato, String>{

	List<Mandato> findByCodiceFiscale(String codice_fiscale);
	
    List<Mandato> findByDataInizioAttivazioneStartingWith(String data_inizio_attivazione);
    
    List<Mandato> findByDataAttivazioneStartingWith(String data_attivazione);
    
    List<Mandato> findByDataSottoscrizioneStartingWith(String data_sottoscrizione);


}
