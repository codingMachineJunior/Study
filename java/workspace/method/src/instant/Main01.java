package instant;

class Book{
	String subject;
	String content;
	
	Book(){
		System.out.println("---������ ����---");
		this.subject="JAVA�Թ�";
		this.content="JAVA�� ��ü���� ����̴�.";
	}
	
	void read() {
		System.out.println("--read() ����---");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
}

public class Main01 {
	public static void main(String[] args) {
		Book book = new Book();
		book.read();
		
	}
}
