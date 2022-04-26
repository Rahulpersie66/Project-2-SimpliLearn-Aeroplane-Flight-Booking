package com.simplilearn.aeroplane.dao;

import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.simplilearn.aeroplane.dto.RegisterUser;
import com.simplilearn.aeroplane.dto.TravelData;
import com.simplilearn.aeroplane.util.HibernateUtil;



public class AeroplaneDaoImpl {

	private SessionFactory factory;
	private String username=null;
	private String password=null;
	private String date=null;
	private String src=null;
	private String dest=null;
	private int noperson=0;
	
	public AeroplaneDaoImpl() {
		factory=HibernateUtil.getSessionFactory();
	
	}
	public Integer addRegisteredUser(RegisterUser user) {
		
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		Integer seqNo=(Integer)session.save(user);
		txn.commit();
		session.close();
		return seqNo;
	}
	public Integer addTravelData(TravelData travelData)
	{
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		Integer id =(Integer)session.save(travelData);
		txn.commit();
		session.close();
		return id;
	
	}
	
	public void getUserPass(String user,String pass)//its set method named get
	{
		username=user;
		password=pass;
	}
	
	public void setTravelDetails(String dt, String s,String d,int nop)
	{
		date=dt;
		src=s;
		dest=d;
		noperson=nop;
		
	}
	
	public String getUser()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public boolean checkUsernameAvailable(String username)
	{
		boolean isAvail=false;
		String uname=null;
		Set<RegisterUser> results;
		Session session=factory.openSession();
		String hql="From RegisterUser Where username='"+username+"'";
		TypedQuery<RegisterUser> query=session.createQuery(hql);
		results=new LinkedHashSet<RegisterUser>(query.getResultList());
		for(RegisterUser user:results )
			uname=user.getUsername();
		if(username.equals(uname))
			isAvail=true;
		session.close();
		return isAvail;
	}
	
	public boolean checkAlreadyRegistered(String username,String password)
	{	boolean isAlreadyAvail=false;
		String uname=null;String pwd=null;
		Set<RegisterUser> results;
		Session session=factory.openSession();
		String hql="From RegisterUser Where username='"+username+"' AND password='"+password+"'";
		TypedQuery<RegisterUser> query=session.createQuery(hql);
		results=new LinkedHashSet<RegisterUser>(query.getResultList());
		for(RegisterUser user:results )
			uname=user.getUsername();
		for(RegisterUser user:results )
			pwd=user.getPassword();
		if(username.equals(uname)&& password.equals(pwd))
			isAlreadyAvail=true;
		session.close();
		return isAlreadyAvail;
	
		
	}
	
	public void updatePasswordAdmin(String username,String password)
	{	Set<RegisterUser> results;int seqNoo=0;
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		String hql="From RegisterUser Where username='"+username+"'";
		TypedQuery<RegisterUser> query=session.createQuery(hql);
		results=new LinkedHashSet<RegisterUser>(query.getResultList());
		for(RegisterUser user:results )
			seqNoo=user.getSeqNo();
		System.out.println(seqNoo);
		System.out.println(seqNoo);
		RegisterUser user1=session.get(RegisterUser.class, seqNoo);
		user1.setPassword(password);
		session.update(user1);
		txn.commit();
		session.close();
		
	}
	
	public Set<TravelData> getAllTravelDetails(String date, String source,String destination)
	{
		Set<TravelData> allData;
		Session session=factory.openSession();
		String hql="from TravelData where Date_Of_Travel='"+date+"' AND Source='"+source+"' AND Destination='"+destination+"'";
		TypedQuery<TravelData> query=session.createQuery(hql);
		allData=new HashSet<TravelData>(query.getResultList());
		System.out.println(allData);
		System.out.println(allData);
		session.close();
		return allData;
	}
	
	public int getAvailableSeatsFlight(String date, String source,String destination)
	{	
		int seatsAvail=0;
		Set<TravelData> allData;
		Session session=factory.openSession();
		String hql="from TravelData where Date_Of_Travel='"+date+"' AND Source='"+source+"' AND Destination='"+destination+"'";
		TypedQuery<TravelData> query=session.createQuery(hql);
		allData=new HashSet<TravelData>(query.getResultList());
			
		for(TravelData data:allData)
			seatsAvail=data.getNoOfPerson();
		System.out.println(seatsAvail);
		System.out.println(seatsAvail);
		session.close();
		return seatsAvail;
	}

	public Set<TravelData> getAvailableSeats(String date, String source,String destination)
	{	
		Set<TravelData> allData;
		Session session=factory.openSession();
		String hql="from TravelData where Date_Of_Travel='"+date+"' AND Source='"+source+"' AND Destination='"+destination+"'";
		TypedQuery<TravelData> query=session.createQuery(hql);
		allData=new HashSet<TravelData>(query.getResultList());
		
		session.close();
		return allData;
	}
	
	public Set<TravelData> getConfirmDetails(int id)
	{	
		Set<TravelData> allData;
		Session session=factory.openSession();
		String hql="from TravelData where Id="+id;
		TypedQuery<TravelData> query=session.createQuery(hql);
		allData=new HashSet<TravelData>(query.getResultList());
		
		session.close();
		return allData;
	}
}
