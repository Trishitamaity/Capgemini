package com;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Named_Placeholder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = "select user from User_Information user where user.email = :em";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Database_Properties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery(select);
		System.out.println("Enter user email id : ");
		query.setParameter("em", sc.next());
		try {
			User_Information user = (User_Information)query.getSingleResult();
			System.out.println("User name : " + user.getName());
			System.out.println("User email : " + user.getEmail());
		}
		catch(Exception e) {
			System.err.println("No data found");
		}
		et.commit();
		em.clear();
		sc.close();
	}
}