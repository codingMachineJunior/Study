package instant;
// �ǽ�
 
class Article{
	
	int seq;			//�� ��ȣ
	String subject;		//�� ����
	String writer;		//�ۼ���
	
	
	// �۹�ȣ, ������, �ۼ��۸� �Ķ���ͷ� �޾ƿͼ�
	// �������� ������ ���� �Ҵ����ִ� �Ķ���Ͱ� �ִ� ������ �ۼ�
	
	
	
	// print() ��������, ���� ���
	
	
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
//		Article ��ü ���� ��, print() ȣ��
		Article article = new Article(17, "�ڹ�", "����ȣ");
		
		article.print();
	}
}
