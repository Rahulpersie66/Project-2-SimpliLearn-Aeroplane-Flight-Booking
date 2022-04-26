package com.simplilearn.aeroplane.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Travel_details_aerospace")
public class TravelData {
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="Airlines")
	private String Airlines;
	@Column(name="Date_Of_Travel")
	private String dateOfTravel;
	@Column(name="Source")
	private String source;
	@Column(name="Destination")
	private String destination;
	
	@Column(name="No_Of_Person_Left")
	private int noOfPerson;
	@Column(name="Cost_of_Person")
	private double costPerPerson;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirlines() {
		return Airlines;
	}
	public void setAirlines(String airlines) {
		Airlines = airlines;
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
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoOfPerson() {
		return noOfPerson;
	}
	public void setNoOfPerson(int noOfPerson) {
		this.noOfPerson = noOfPerson;
	}
	public double getCostPerPerson() {
		return costPerPerson;
	}
	public void setCostPerPerson(double costPerPerson) {
		this.costPerPerson = costPerPerson;
	}
	public TravelData(String airlines, String dateOfTravel, String source, String destination, int noOfPerson,
			double costPerPerson) {
		Airlines = airlines;
		this.dateOfTravel = dateOfTravel;
		this.source = source;
		this.destination = destination;
		this.noOfPerson = noOfPerson;
		this.costPerPerson = costPerPerson;
	}
	public TravelData(String dateOfTravel, String source, String destination, int noOfPerson, double costPerPerson) {
		this.dateOfTravel = dateOfTravel;
		this.source = source;
		this.destination = destination;
		this.noOfPerson = noOfPerson;
		this.costPerPerson = costPerPerson;
	}
	public TravelData(String dateOfTravel, String source, String destination, int noOfPerson) {
		this.dateOfTravel = dateOfTravel;
		this.source = source;
		this.destination = destination;
		this.noOfPerson = noOfPerson;
	}
	
	
	public TravelData(int id, String airlines, String dateOfTravel, String source, String destination, int noOfPerson,
			double costPerPerson) {
		super();
		this.id = id;
		Airlines = airlines;
		this.dateOfTravel = dateOfTravel;
		this.source = source;
		this.destination = destination;
		this.noOfPerson = noOfPerson;
		this.costPerPerson = costPerPerson;
	}
	@Override
	public String toString() {
		return "TravelData [id=" + id + ", Airlines=" + Airlines + ", dateOfTravel=" + dateOfTravel + ", source="
				+ source + ", destination=" + destination + ", noOfPerson=" + noOfPerson + ", costPerPerson="
				+ costPerPerson + "]";
	}
	public TravelData() {
		
	}
	
	
	
	
	
	
	
}
