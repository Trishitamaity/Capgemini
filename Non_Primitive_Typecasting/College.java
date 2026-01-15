package Non_Primitive_Typecasting;

public class College {
	private String name;
	private String location;
	private Student student;
	private Trainer trainer;
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public Student getStudent() {
		return student;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
}