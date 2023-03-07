package com.Question3;

public class Empoly {

	private int id;
	private String name;
	
	public Empoly(int id, String name) {
		super();
		this.id = id;
		this.name =name;
	}
	
	public Empoly() {
		
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

	@Override
	public String toString() {
		return "Empoly [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
