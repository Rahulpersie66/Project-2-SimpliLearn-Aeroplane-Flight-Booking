package com.simplilearn.aeroplane.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Seat_Booked_Flight")
public class SeatBooked {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BookId")
	private int bookId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="username")
	private String username;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="EMail")
	private String emailAddress;
	
	@Column(name="Address")
	private String address;

	@Column(name="Mobile")
	private long phone;
	
	@Column(name="Airline")
	private String airline;
	
	@Column(name="FlightId")
	private int airId;
	
	@Column(name="DateOfTravel")
	private String dateOfTravel;
	
	@Column(name="Source")
	private String source;
	
	@Column(name="Destination")
	private String destintion;
	
	@Column(name="TotalCost")
	private double tcost;

	@Column(name="AdhaarCard")
	private long adhaar;


	

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getAirId() {
		return airId;
	}

	public void setAirId(int airId) {
		this.airId = airId;
	}

	public String getDateOfTravel() {
		return dateOfTravel;
	}

	public void setDateOfTravel(String dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestintion() {
		return destintion;
	}

	public void setDestintion(String destintion) {
		this.destintion = destintion;
	}

	public double getTcost() {
		return tcost;
	}

	public void setTcost(double tcost) {
		this.tcost = tcost;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public SeatBooked() {
	}

	public SeatBooked(String name, String username, int age, String emailAddress, String address, long phone,
			String airline, int airId, String dateOfTravel, String source, String destintion, double tcost,long adhaar) {
		this.name = name;
		this.username = username;
		this.age = age;
		this.emailAddress = emailAddress;
		this.address = address;
		this.phone = phone;
		this.airline = airline;
		this.airId = airId;
		this.dateOfTravel = dateOfTravel;
		this.source = source;
		this.destintion = destintion;
		this.tcost = tcost;
		this.adhaar=adhaar;
	}
	
	
	
}
