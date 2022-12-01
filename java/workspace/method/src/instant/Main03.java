package instant;
// 실습
 
class Article{
	
	int seq;			//글 번호
	String subject;		//글 제목
	String writer;		//작성자
	
	
	// 글번호, 글제목, 작성작를 파라미터로 받아와서
	// 전역변수 각각에 값을 할당해주는 파라미터가 있는 생성자 작성
	
	
	
	// print() 전역변수, 각각 출력
	
	
	public Article(int seq, String subject, String writer){
		this.seq=seq;
		this.subject=subject;
		this.writer=writer;
	}
	void print() {
		System.out.println(seq+" "+subject+" "+writer);
	}
	
}

public class Main03 {
	public static void main(String[] args) {
//		Article 객체 생성 후, print() 호출
		Article article = new Article(17, "자바", "이준호");
		
		article.print();
	}
}
