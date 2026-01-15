package Day_5_Assignment;

public class WhatsApp_Version_1 {
	public void chat() {
		System.out.println("Hello!");
	}
	public static void main(String[] args) {
		WhatsApp_Version_1 w1 = new WhatsApp_Version_1();
		w1.chat();
		WhatsApp_Version_2 w2 = new WhatsApp_Version_2();
		w2.chat();
		w2.status();
		WhatsApp_Version_3 w3 = new WhatsApp_Version_3();
		w3.chat();
		w3.status();
		w3.MetaAI();
	}
}
class WhatsApp_Version_2 extends WhatsApp_Version_1 {
	public void status() {
		System.out.println("Status");
	}
}
class WhatsApp_Version_3 extends WhatsApp_Version_2{
	public void MetaAI() {
		System.out.println("This is MetaAI");
	}
}