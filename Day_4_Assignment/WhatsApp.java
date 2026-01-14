package Day_4_Assignment;

public class WhatsApp extends App {
	public WhatsApp(String name, long size){
		this.name = name;
		this.size = size;
	}
	public static void main(String[] args) {
		WhatsApp app1 = new WhatsApp("WhatsApp", 24);
		WhatsApp app2 = new WhatsApp("WhatsApp", 28);
		app1.print();
		app2.print();
	}
}