package method;

class Member{
	/*
	 * - ��������� ���������� �����ϱ� ���� ������ this�� ���Ͽ� �����Ѵ�.
	 * - �޼��忡 ������ �� thisŰ���带 ����ϴ� ���� �ʼ����� ���� �ƴϴ�.
	 */
	
	
	String name;
	int age;
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return this.age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void say() {
		System.out.println(this.getName());
		System.out.println(this.getAge());
	}
}

public class Main04 {
	public static void main(String[] args) {		
		Member member = new Member();
		member.setName("�ڹ��л�");
		member.setAge(20);
		member.say();
	}
}
