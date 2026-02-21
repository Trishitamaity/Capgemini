package Enum;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("Date : " + date);
		System.out.println("Time : " + time);
		System.out.println("DateTime : " + datetime);
		DateTimeFormatter newformat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatted = datetime.format(newformat);
		System.out.println("Formatted DateTime: " + formatted);
	}
}