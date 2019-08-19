package hu.nl.hibernate.pojo;

import java.sql.Date;

public class Reiziger {
	// all the info of the reiziger is loaded into reiziger.hbm.xml and referenced from the hibernate.cfg.xml
	
	private int reizigerid;
	private String voorletters;
	private String tussenvoegsel;
	private String achternaam;
	private Date gebortedatum;
	
	
	public Reiziger(String voorletters, String tussenvoegsel, String achternaam, Date gebortedatum) {
		super();
		this.voorletters = voorletters;
		this.tussenvoegsel = tussenvoegsel;
		this.achternaam = achternaam;
		this.gebortedatum = gebortedatum;
	}
	public Reiziger(int reizigerid, String voorletters, String tussenvoegsel, String achternaam, Date gebortedatum) {
		super();
		this.reizigerid = reizigerid;
		this.voorletters = voorletters;
		this.tussenvoegsel = tussenvoegsel;
		this.achternaam = achternaam;
		this.gebortedatum = gebortedatum;
	}
	public Reiziger() {
	}
	public int getReizigerid() {
		return reizigerid;
	}
	public void setReizigerid(int reizigerid) {
		this.reizigerid = reizigerid;
	}
	public String getVoorletters() {
		return voorletters;
	}
	public void setVoorletters(String voorletters) {
		this.voorletters = voorletters;
	}
	public String getTussenvoegsel() {
		return tussenvoegsel;
	}
	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public Date getGebortedatum() {
		return gebortedatum;
	}
	public void setGebortedatum(Date gebortedatum) {
		this.gebortedatum = gebortedatum;
	}
	@Override
	public String toString() {
		return "Reiziger [reizigerid=" + reizigerid + ", tussenvoegsel=" + tussenvoegsel + ", achternaam=" + achternaam
				+ ", gebortedatum=" + gebortedatum + "]";
	}
	
	
	
}
