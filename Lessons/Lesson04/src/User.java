
public class User {
	private String name;
	private int age;
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// değişkenlere doğrudan erişmek yerine getter setter kullandık
	// buna encapsulation denir
	
}
