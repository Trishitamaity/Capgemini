package DSA_Day_4;

public class Lambda_Sample {
	public Lambda_Sample() {
		System.out.println("Lambda sample constructor");
	}
	static {
		System.out.println("Lambda sample static method");
	}
	{
		System.out.println("Lambda sample non static method");
	}
	public static void main(String[] args) {
		System.out.println("Main");
		Lambda_Sample lambda_sample = new Lambda_Sample();
		Lambda_Sample_2 lambda_sample_2 = new Lambda_Sample_2();
	}
}
class Lambda_Sample_2 extends Lambda_Sample {
	public Lambda_Sample_2(){
		super();
		System.out.println("Lambda sample child constructor");
	}
	{
		System.out.println("Lambda sample child non static method");
	}
	static {
		System.out.println("Lambda sample child static method");
	}
}