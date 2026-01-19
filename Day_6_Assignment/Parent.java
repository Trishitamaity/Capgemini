package Day_6_Assignment;

public abstract class Parent {
	public abstract void homeloan();
	public abstract void goldloan();
	public static void main(String[] args) {
		Junior_Deva jd = new Junior_Deva();
		jd.homeloan();
		jd.goldloan();
		Parent p = new Junior_Deva();
		p.homeloan();
		p.goldloan();
		Deva d = new Junior_Deva();
		d.homeloan();
		d.goldloan();
	}
}
abstract class Deva extends Parent{
	@Override
	public void homeloan() {
		System.out.println("Homeloan paid successfully");
	}
}
class Junior_Deva extends Deva{
	@Override
	public void goldloan() {
		System.out.println("Goldloan paid successfully");
	}
}