package com.simplilearn.aeroplane.client;

import com.simplilearn.aeroplane.dao.AeroplaneDaoImpl;
import com.simplilearn.aeroplane.dto.RegisterUser;
import com.simplilearn.aeroplane.dto.TravelData;

public class Client {
	public static void main(String[] args) {
		AeroplaneDaoImpl dao=new AeroplaneDaoImpl();
//		RegisterUser user=new RegisterUser("Rahulpersie66","Rahul","Rana","Rahul Rana",24,"Chemistry22@");
//	Integer seqNo=dao.addRegisteredUser(user);
		TravelData data=new TravelData("Harvard Airloines","04/30/2022","Delhi","Banglore",32,5140.0);
		Integer id=dao.addTravelData(data);
		System.out.println("The sequence no is "+id);
	}
}
