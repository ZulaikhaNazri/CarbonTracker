package com.model;

public class Water {
	
	private String id;
	private String bulan;
	private int bilangan_hari;
	private double faktor_prorata;
	private double jumlah_air;
	private double jumlah_bayaran;
	private double jumlah_karbon;
	
	User user;
	
	public Water() {
		// TODO Auto-generated constructor stub
	}
	
	public Water(String id, String userId, String bulan, int bilangan_hari, double faktor_prorata, double jumlah_air,
			double jumlah_bayaran) {
		super();
		this.id = id;
		setUserID(userId);
		this.bulan = bulan;
		this.bilangan_hari = bilangan_hari;
		this.faktor_prorata = faktor_prorata;
		this.jumlah_air = jumlah_air;
		this.jumlah_bayaran = jumlah_bayaran;
	}
	
	public String getUserID() {
		String userid = user.getId();
		return userid;
	}
	
	public void setUserID(String userId) {
		user.setId(userId);
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBulan() {
		return bulan;
	}
	public void setBulan(String bulan) {
		this.bulan = bulan;
	}
	public int getBilangan_hari() {
		return bilangan_hari;
	}
	public void setBilangan_hari(int bilangan_hari) {
		this.bilangan_hari = bilangan_hari;
	}
	public double getFaktor_prorata() {
		return faktor_prorata;
	}
	public void setFaktor_prorata(double faktor_prorata) {
		this.faktor_prorata = faktor_prorata;
	}
	public double getJumlah_air() {
		return jumlah_air;
	}
	public void setJumlah_air(double jumlah_air) {
		this.jumlah_air = jumlah_air;
	}
	public double getJumlah_bayaran() {
		return jumlah_bayaran;
	}
	public void setJumlah_bayaran(double jumlah_bayaran) {
		this.jumlah_bayaran = jumlah_bayaran;
	}
	public double getJumlah_karbon() {
		return jumlah_karbon;
	}
	public void setJumlah_karbon(double jumlah_karbon) {
		this.jumlah_karbon = jumlah_karbon;
	}

	
}
