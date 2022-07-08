package stream;

public class Players {
	
	long id;
	String name;
	String address;
	int age;
	
	public Players(long id, String name, String address, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public Players() {
		
	}
	
}
