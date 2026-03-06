package com;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update_Mobile_Number_By_Using_Email {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String update = "update User_Information user set user.mobile_number = ?1 where user.email = ?2";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Database_Properties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery(update);
		System.out.println("Enter user mobile number : ");
		long mobile_number = sc.nextLong();
		query.setParameter(1, mobile_number);
		System.out.println("Enter user email id : ");
		String email = sc.next();
		query.setParameter(2, email);
		int result = query.executeUpdate();
		if(result != 0) {
			System.out.println("Data updated");
		}else {
			System.out.println("No data updated");
		}
		et.commit();
		em.clear();
		sc.close();
	}
}