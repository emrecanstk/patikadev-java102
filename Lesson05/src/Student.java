
public class Student {
	private String name;
	private String id;
	private String adress;
	private int note;
	
	public Student(String name, String id, String adress,int note) {
		this.name = name;
		this.id = id;
		this.adress = adress;
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public int getNote() {
		return note;
	}

	public void setId(int note) {
		this.note = note;
	}
	
}
