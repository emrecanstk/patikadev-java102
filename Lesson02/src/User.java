
public class User {
	public String name;
	public int id;
	
	static {
		System.out.println("ben bir kez çalışırım");      // nesne dahi oluşturulmadan önce çalışır.
	}
	
	{
		System.out.println("ben her nesne oluşturulduğunda çalışırım");
	}
	
	
	public User(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	
}
