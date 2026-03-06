package com;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert_User_Details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Database_Properties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		User_Information user_information = new User_Information();
		System.out.println("Enter user name : ");
		user_information.setName(sc.next());
		System.out.println("Enter user email : ");
		user_information.setEmail(sc.next());
		System.out.println("Enter user mobile number : ");
		user_information.setMobile_number(sc.nextLong());
		System.out.println("Enter user gender : ");
		user_information.setGender(sc.next());
		System.out.println(user_information);
		System.out.println("Before persist : " + em.contains(user_information));
		em.persist(user_information);
		System.out.println("After persist : " + em.contains(user_information));
		System.out.println("Data inserted");
		et.commit();
		em.close();
		sc.close();
	}
}