package hiding;

//�ϳ��� �Խù��� ǥ���ϱ� ���� JavaBeans
public class Article {
	private int seq;	// �� ��ȣ
	private String subject;  // �� ����
	private String content;  // �� ����
	private String writer;   // �ۼ���
	private int hit;  // ��ȸ��
	private String regDate;  // �ۼ��Ͻ�
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public Article(int seq, String subject, String content, String writer, int hit, String regDate) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.regDate = regDate;
	}
	
}
