package method;

/* �޼��� �ǽ�
 * 
 * ��Ģ���� ���ϱ�
 * 
 * Calc2 Ŭ������ �����ؼ�
 * - plus(),minus(),times(),divide() �޼��� 4�� 
 * - param1, param2, return
 */

class Calc2{

	int plus(int param1, int param2) {
		return param1 + param2;
	}
	int minus(int param1, int param2) {
		return param1 - param2;
	}
	int times(int param1, int param2) {
		return param1 * param2;
	}
	int divide(int param1, int param2) {
		int result = 0;	
		if(param2!=0) 
			result= param1/param2;
		
		return result;
	}
}


public class Main03 {
	public static void main(String[] args) {		
		Calc2 c1 = new Calc2();
		int a=10,b=5;
		
		System.out.println(a+"+"+b+"="+c1.plus(a, b));
		System.out.println(a+"-"+b+"="+c1.minus(a, b));
		System.out.println(a+"*"+b+"="+c1.times(a, b));
		System.out.println(a+"/"+b+"="+c1.divide(a, b));
	}
	
}
