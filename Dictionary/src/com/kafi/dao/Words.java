package com.kafi.dao;

public class Words {
	private int id;
	private String kafi;
	private String wc;
	private String ammari;
	private String ingliizo;
	
	
	public Words() {
		
	}
	public int getId() {
		return id;
	}
	public void setWc(String wc) {
		this.wc = wc;
	}
	public String getWc() {
		return wc;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKafi() {
		return kafi;
	}
	public void setKafi(String kafi) {
		this.kafi = kafi;
	}
	public String getAmmari() {
		return ammari;
	}
	public void setAmmari(String string) {
		this.ammari = string;
	}
	public String getIngliizo() {
		return ingliizo;
	}
	public void setIngliizo(String ingliizo) {
		this.ingliizo = ingliizo;
	}
	

}
