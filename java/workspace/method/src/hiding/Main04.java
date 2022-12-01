package hiding;

public class Main04 {
	public static void main(String[] args) {
		Article article = new Article(7, "æ»≥Á«œΩ¥", "	æ»≥Á«œΩ ¥œ±Ó", "¿Ã¡ÿ»£", 279, "20221201");
		
		System.out.println(article.getSeq());
		System.out.println(article.getSubject());
		System.out.println(article.getContent());
		System.out.println(article.getWriter());
		System.out.println(article.getHit());
		System.out.println(article.getRegDate());
	}
}
