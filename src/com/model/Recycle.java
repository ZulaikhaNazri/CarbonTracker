package com.model;

public class Recycle {
	
	private int id;
	private int userId;
	private String tarikh;
	private double jumlah_recycle;
	private double jumlah_bayaran;
	private double jumlah_carbon;

	User user;
	
	public Recycle() {
	
	}
	
	public Recycle(int id,String tarikh, double jumlah_recycle, double jumlah_bayaran) {
		super();
		this.id = id;
		this.tarikh = tarikh;
		this.jumlah_recycle = jumlah_recycle;
		this.jumlah_bayaran = jumlah_bayaran;
		
	}
	
	public int getUserID() {
		int userid = user.getId();
		return userid;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserId(int UserId) {
		user = new User(UserId);
		this.userId = UserId;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	
	public String getTarikh() {
		return tarikh;
	}
	public void setTarikh(String tarikh) {
		this.tarikh = tarikh;
	}
	public double getJumlah_recycle() {
		return jumlah_recycle;
	}
	public void setJumlah_recycle(double jumlah_recycle) {
		this.jumlah_recycle = jumlah_recycle;
	}
	public double getJumlah_bayaran() {
		return jumlah_bayaran;
	}
	public void setJumlah_bayaran(double jumlah_bayaran) {
		this.jumlah_bayaran = jumlah_bayaran;
	}
	public double getJumlah_carbon() {
		return jumlah_carbon;
	}
	public void setJumlah_carbon(double jumlah_carbon) {
		this.jumlah_carbon = jumlah_carbon;
	}

	

}
