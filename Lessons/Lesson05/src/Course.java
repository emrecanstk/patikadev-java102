
public class Course {
	private String name;
	private String code;

	public Course(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double calcAvarage(Student[] students) {
		double avarage = 0;
		for (int i = 0; i < students.length; i++) {
			avarage += students[i].getNote();
		}
		return avarage/students.length;
	}

}
