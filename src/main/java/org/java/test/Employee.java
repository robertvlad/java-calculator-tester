package org.java.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	private String nome,
					cognome,
					ruolo;
	private LocalDate dataNascita;
	 
	public Employee(String nome, String cognome, String ruolo, String dataNascita) throws Exception {

		LocalDate dataFormatted = LocalDate.parse(dataNascita, dtf);
		setNome(nome);
		setCognome(cognome);
		setRuolo(ruolo);
		setDataNascita(dataFormatted);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		
		if (nome.length() == 0) {
			
			throw new Exception("Campo nome vuoto");
		}
		
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) throws Exception {
		
		if (cognome.length() == 0) {
			
			throw new Exception("Campo cognome vuoto");
		}

		this.cognome = cognome;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) throws Exception {
		
		if (ruolo != "Boss" && ruolo != "Employee") {
			
			throw new Exception("Ruolo non trovato");
		}
		
		this.ruolo = ruolo;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) throws Exception {
		
		if (dataNascita.isAfter(LocalDate.now())) {
			
			throw new Exception("Data di nascita nel passato");
		}
		this.dataNascita = dataNascita;
	}	
}
