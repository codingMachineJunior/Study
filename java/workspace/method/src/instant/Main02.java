package instant;

class User{
	
	String name;
	int age;
	
	User(String name, int age){
//		������ �Ķ������ ���� ��������� ����
		this.name = name;
		this.age = age;
		
	}
	
	void print() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class Main02 {

	public static void main(String[] args) {
		User user = new User("����ȣ", 18);
		user.print();
	}

}
