package com.model;

public class Electric {
	
	private String id;
	private String bulan;
	private int bilangan_hari;
	private double faktor_prorata;
	private double jumlah_elektrik;
	private double jumlah_bayaran;
	private double jumlah_karbon;
	
	User user;
	
	public Electric() {
	}
	
	public Electric(String id, String userId, String bulan, int bilangan_hari, double faktor_prorata, double jumlah_elektrik,
			double jumlah_bayaran) {
		super();
		this.id = id;
		setUserId(userId);
		this.bulan = bulan;
		this.bilangan_hari = bilangan_hari;
		this.faktor_prorata = faktor_prorata;
		this.jumlah_elektrik = jumlah_elektrik;
		this.jumlah_bayaran = jumlah_bayaran;
	}
	
	public String getUserId() {
		String userid = user.getId();
		return userid;
	}
	
	public void setUserId(String userId) {
		user.setId(userId);
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

	public double getJumlah_elektrik() {
		return jumlah_elektrik;
	}

	public void setJumlah_elektrik(double jumlah_elektrik) {
		this.jumlah_elektrik = jumlah_elektrik;
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

	@Override
	public String toString() {
		return "ElectricDAO [id=" + id + ", bulan=" + bulan + ", bilangan_hari=" + bilangan_hari + ", faktor_prorata="
				+ faktor_prorata + ", jumlah_elektrik=" + jumlah_elektrik + ", jumlah_bayaran=" + jumlah_bayaran
				+ ", jumlah_karbon=" + jumlah_karbon + "]";
	}

	
	
}
