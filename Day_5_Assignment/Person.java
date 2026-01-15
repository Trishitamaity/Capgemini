package Day_5_Assignment;

public class Person {
	String name;
	Pancard pancard;
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Trishita";
		Pancard card = new Pancard();
		card.panID = "P42H4GGVH5";
		card.dob = "14/04/2003";
		person.pancard = card;
		System.out.println(person.name);
		System.out.println(person.pancard.panID);
		System.out.println(person.pancard.dob);
	}
}
class Pancard {
	String panID;
	String dob;
}