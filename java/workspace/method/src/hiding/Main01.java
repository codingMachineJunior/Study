package hiding;

class User{
	public String name = "�����";
	private int age = 20;
}

public class Main01 {
	public static void main(String[] args) {
		User user = new User();
		
//		�ۺ��̶� ���� ����
		System.out.println(user.name);
//		�����̺��̶� ���� �Ұ�
//		System.out.println(user.age);
		
		
	}
}
