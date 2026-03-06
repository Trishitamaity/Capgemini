package com;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remove_Data {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Database_Properties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		System.out.println("Enter user id : ");
		User_Information information = em.find(User_Information.class, sc.nextInt());
		if(information != null) {
			em.remove(information);
			System.out.println("Data removed successfully");
		}else {
			System.out.println("No data found");
		}
		et.commit();
		em.close();
		sc.close();
	}
}