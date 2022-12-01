package instant;

class Book{
	String subject;
	String content;
	
	Book(){
		System.out.println("---생성자 실행---");
		this.subject="JAVA입문";
		this.content="JAVA는 객체지향 언어이다.";
	}
	
	void read() {
		System.out.println("--read() 실행---");
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
