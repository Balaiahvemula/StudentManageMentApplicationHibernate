package com.StudentsInfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDelete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction(); 
	Student st1=em.find(Student.class, 103);
	if(st1!=null) {
	et.begin();
	em.remove(st1);
	et.commit();
	System.out.println("Record got Deleted");
	}
	else System.out.println("Id not Found");
	}
}
