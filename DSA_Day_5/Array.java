package DSA_Day_5;
import java.util.*;
import java.time.LocalTime;
import java.time.LocalDate;

public class Array {
	public static List<ArrayRevision> getSortedEmployees(ArrayRevision[] employees){
		List<ArrayRevision> list = new ArrayList<>(Arrays.asList(employees));
        Comparator<ArrayRevision> Dob = (ArrayRevision e1, ArrayRevision e2) -> e1.getDob().compareTo(e2.getDob());
        Comparator<ArrayRevision> Time = (ArrayRevision e1, ArrayRevision e2) -> e1.getTime().compareTo(e2.getTime());
        Collections.sort(list, Dob.thenComparing(Time));
        return list;
	}
	public static List<List<String>> getSortedList(List<List<String>> data){
		Comparator<List<String>> Dob = (List<String> e1, List<String> e2) -> LocalDate.parse(e1.get(4)).compareTo(LocalDate.parse(e2.get(4)));
		Comparator<List<String>> Time = (List<String> e1, List<String> e2) -> LocalTime.parse(e1.get(5)).compareTo(LocalTime.parse(e2.get(5)));
        Collections.sort(data, Dob.thenComparing(Time));
        return data;
	}
	public static void main(String[] args) {
		ArrayRevision[] employees = {
			    new ArrayRevision(101, "Rajesh Kumar", "rajesh.kumar@company.com", 5, LocalDate.of(1990, 3, 15), LocalTime.of(9, 30, 0), 9876543210L),
			    new ArrayRevision(102, "Priya Sharma", "priya.sharma@company.com", 3, LocalDate.of(1993, 7, 22), LocalTime.of(10, 15, 0), 8765432109L),
			    new ArrayRevision(103, "Amitesh Patel", "amit.patel@company.com", 8, LocalDate.of(1988, 11, 5), LocalTime.of(8, 45, 0), 7654321098L),
			    new ArrayRevision(104, "Sneha Singh", "sneha.singh@company.com", 2, LocalDate.of(1995, 1, 30), LocalTime.of(9, 0, 0), 6543210987L),
			    new ArrayRevision(105, "Vikram Reddy", "vikram.reddy@company.com", 6, LocalDate.of(1988, 11, 5), LocalTime.of(7, 30, 0), 9432109876L),
			    new ArrayRevision(106, "Anjali Desai", "anjali.desai@company.com", 4, LocalDate.of(1992, 5, 12), LocalTime.of(8, 15, 0), 8321098765L)
		};
		List<ArrayRevision> sorted_employees = getSortedEmployees(employees);
		for(ArrayRevision employee : sorted_employees) {
			System.out.println(employee);
		}
		List<List<String>> data = new ArrayList<>();
		data.add(List.of("201", "Zayan", "zayan@gmail.com", "4", "1997-11-23", "09:40", "9876543210"));
		data.add(List.of("202", "Meera", "meera@gmail.com", "2", "2001-06-14", "07:20", "9123456789"));
		data.add(List.of("203", "Arjun", "arjun@gmail.com", "6", "1995-03-02", "10:05", "9988776655"));
		data.add(List.of("204", "Kavya", "kavya@gmail.com", "3", "1997-11-23", "06:50", "8899001122"));
		data.add(List.of("205", "Ishaan", "ishaan@gmail.com", "5", "1999-09-18", "08:30", "9001122334"));
		data.add(List.of("206", "Ritika", "ritika@gmail.com", "1", "2001-06-14", "09:10", "9011223344"));
		List<List<String>> Sorted_employees = getSortedList(data);
		for(List<String> employee : Sorted_employees) {
			System.out.println(employee);
		}
	}
}
class ArrayRevision{
	private int id;
	private String name;
	private String email;
	private int experience;
	private LocalDate dob;
	private LocalTime time;
	private long phone_number;
	public ArrayRevision() {
	}
	public ArrayRevision(int id, String name, String email, int experience, LocalDate dob, LocalTime time, long phone_number) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.experience = experience;
		this.dob = dob;
		this.time = time;
		this.phone_number = phone_number;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getExperience() {
		return experience;
	}
	public LocalDate getDob() {
		return dob;
	}
	public LocalTime getTime() {
		return time;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
	    return "id: " + id + "\tname: " + name + "\temail: " + email + "\texperience: " + experience + "\tdob: " + dob + "\ttime: " + time + "\tphone_number: " + phone_number;
	}
}