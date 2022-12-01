package instant;

class User{
	
	String name;
	int age;
	
	User(String name, int age){
//		생성자 파라미터의 값을 멤버변수에 복사
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
		User user = new User("이준호", 18);
		user.print();
	}

}
