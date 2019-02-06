package com.pract.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FlightMain {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		FLightEntity ent=new FLightEntity();
		ent.setFlightNo(1766);
		ent.setDepCity("chennai");
		ent.setArrCity("hyderabad");
		ent.setSeatAvail(60);
		em.persist(ent);
	
		FLightEntity ent2=new FLightEntity();
		System.out.println("Please enter the flight number");
		int id=scan.nextInt();
		ent2=em.find(FLightEntity.class, id);
		int a=ent2.getFlightNo();
		String b=ent2.getDepCity();
		String c=ent2.getArrCity();
		int d=ent2.getSeatAvail();
	    System.out.println(a+" "+b+" "+" "+c+" "+d);
		    
	    FLightEntity ent3=new FLightEntity();
	    System.out.println("Enter number of tickets :");
	    int seat=scan.nextInt();
	    int i=(d-seat);
	    ent3.setFlightNo(ent.getFlightNo());
	    ent3.setDepCity(ent.getDepCity());
	    ent3.setArrCity(ent.getArrCity());
	    ent3.setSeatAvail(i);
	    em.merge(ent3);
	    
	    
	    
	    
	    
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		
		
	}
	
	
	
	
	
}
