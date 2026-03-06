package com;
import org.springframework.stereotype.Component;

@Component("Address")
public class Address {
	public Address() {
		System.out.println("This is my address");
	}
}