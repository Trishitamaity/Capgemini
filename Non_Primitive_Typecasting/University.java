package Non_Primitive_Typecasting;

public class University {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(231);
		s.setName("Trishita Maity");
		Trainer t = new Trainer();
		t.setName("Sandeep Chavan");
		t.setSubject("Java");
		t.setStudent(s);
		College c = new College();
		c.setName("IEM");
		c.setLocation("UEM Campus");
		c.setStudent(s);
		c.setTrainer(t);
		System.out.println(c.getName());
		System.out.println(c.getLocation());
		System.out.println(c.getStudent().getId());
		System.out.println(c.getStudent().getName());
		System.out.println(c.getTrainer().getName());
		System.out.println(c.getTrainer().getSubject());
	}
}