package com.model;

public class User {
	
	private int id;
	private String name;
    private String address;
    private String email;
    private String category;
    private String username;
    private String password;
    
    public User() {
    }
    
	public User(int id, String name, String address, String email, String category, String username, String password) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.category = category;
		this.username = username;
		this.password = password;
	}
	
	public User(int id) {
        this.id = id;
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
