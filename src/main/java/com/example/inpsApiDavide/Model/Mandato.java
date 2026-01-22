package com.example.inpsApiDavide.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mandato")
public class Mandato {
	
	 @Id
	    private String codice;

	    @Column(name = "data_sottoscrizione")
	    private String dataSottoscrizione;

	    @Column(name = "data_attivazione")
	    private String dataAttivazione;

	    @Column(name = "data_inizio_attivazione")
	    private String dataInizioAttivazione;

	    @Column(name = "cf") 
	    private String codiceFiscale;
	
	public Mandato() {
	}

	public Mandato(String codice, String dataSottoscrizione, String dataAttivazione, String dataInizioAttivazione,
			String codiceFiscale) {
		this.codice = codice;
		this.dataSottoscrizione = dataSottoscrizione;
		this.dataAttivazione = dataAttivazione;
		this.dataInizioAttivazione = dataInizioAttivazione;
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDataSottoscrizione() {
		return dataSottoscrizione;
	}

	public void setDataSottoscrizione(String dataSottoscrizione) {
		this.dataSottoscrizione = dataSottoscrizione;
	}

	public String getDataAttivazione() {
		return dataAttivazione;
	}

	public void setDataAttivazione(String dataAttivazione) {
		this.dataAttivazione = dataAttivazione;
	}

	public String getDataInizioAttivazione() {
		return dataInizioAttivazione;
	}

	public void setDataInizioAttivazione(String dataInizioAttivazione) {
		this.dataInizioAttivazione = dataInizioAttivazione;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codice_fiscale) {
		this.codiceFiscale = codice_fiscale;
	}
	
	
		
}