package method;

class Calc{
	int plus(int x, int y) {
		return x + y;
	}
	
	int minus(int x, int y) {
		return x - y;
	}
}

public class Main02 {
	public static void main(String[] args) {
		Calc c1 = new  Calc();
		System.out.println(c1.plus(10, 20));
		System.out.println(c1.plus(100, 200));
		
		/*
		 *  - �Ķ���Ϳ� ���� ����� �����ϴ� ���,
		 *  ���� �ٸ� ���� ���Ͽ� ��ü�� ������ ������ �ʿ䰡 ����.
		 *  - ��ü������ �����͸� ���� ���°� �ƴ϶�
		 *  �ܺ��� ������ �Ķ���Ϳ� ���ؼ� ����� �����Ƿ�,
		 *  �ϳ��� ��ü�� �����ϴ� ���� �ٶ����ϴ�.
		 */
		
		
//		Calc c2 = new Calc();
//		System.out.println(c2.plus(100, 200));
	}
}
