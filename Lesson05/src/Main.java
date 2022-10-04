
public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("Emre", "1", "Bursa",65);
		Student st2 = new Student("Can", "2", "Ankara",94);
		Student st3 = new Student("Ömer", "3", "İstanbul",31);
		
		Student[] students = {st1,st2,st3};
		
		Course c1 = new Course("Java", "102");
		System.out.println(c1.calcAvarage(students));
		
	}

}
