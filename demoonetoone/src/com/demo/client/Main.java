package com.demo.client;

import com.demo.daoImp.InstructorDaoImp1;
import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetails;


public class Main {
	
	public static void main(String[] args) {

		Instructor instructor1 = new Instructor("Hiber","nate","one@two.com");
		Instructor instructor2 = new Instructor("Inter","nate","two@one.com");
		
		InstructorDetails instructorDetails1 = new InstructorDetails("www.youtube","relation");
		InstructorDetails instructorDetails2 = new InstructorDetails("www.twitter","relation");
		
		instructor1.setInstructorDetails(instructorDetails1);// making associate of intructor to instructordeails
		instructor2.setInstructorDetails(instructorDetails2);
		
		InstructorDaoImp1 s = new InstructorDaoImp1();
		
	    s.saveInstructor(instructor1);
	    s.saveInstructor(instructor2);
		
		System.out.println("done");

	}


}
