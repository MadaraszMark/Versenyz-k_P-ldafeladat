package main;

import java.time.LocalDate;

public class Pilotak {
	
	private String name;
	private LocalDate dateOfBirth;
	private String nationality;
	private int number;
	
	public Pilotak(String name, LocalDate dateOfBirth, String nationality, int number) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Pilotak [name=" + name + ", dateOfBirth=" + dateOfBirth + ", nationality=" + nationality + ", number="
				+ number + "]";
	}
	
	

}
