package hiding;

class User{
	public String name = "사용자";
	private int age = 20;
}

public class Main01 {
	public static void main(String[] args) {
		User user = new User();
		
//		퍼블릭이라 접근 가능
		System.out.println(user.name);
//		프라이빗이라 접근 불가
//		System.out.println(user.age);
		
		
	}
}
