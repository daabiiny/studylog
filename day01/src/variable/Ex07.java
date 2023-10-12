package variable;

public class Ex07 {
	public static void main(String[] args) {
		// Wrapper Class
		// �ڹٿ��� � �� ���� ��ȣ�ۿ� ��Ű�� ���ؼ� �ݵ�� ��ü���·� ó���ؾ� �� ��찡 �ִ�
		// primitive type�� ��ü�� �ƴϹǷ�, �� ��Ȳ���� ó���� �� ����
		// ����, primitive type�� �����͸� ��ü���·� ����� ���� ���� ���� Ŭ������ �����Ѵ�
		// �̸� Wrapper Class��� �Ѵ�
		// Wrapper Class�� ��ü�� ���� �ڷ����̹Ƿ�, ������ ���� �� ����� ���ԵǾ� �ִ�
		
		//		primitive type			Wrapper Class
		//		boolean					Boolean
		//		byte					Byte
		//		short					Short
		//		char					Character
		//		int						Integer
		//		long					Long
		//		float					Float
		//		double					Double
		
		int n1 = 10;
		Integer n2 = n1;
		n1 = n2;
		
		// primitive ���̿��� �Ϲ����� ����ȯ�� ����Ǵ� ����� Wrapper Class������ ������� �ʴ´�
		Byte by = 10;
		int n3 = 20;
		n3 = by;
				
		Byte by2 = 10;
		Integer n4 = 20;
//		n4 = by2;			// Wrapper Class������ ȣȯ���� ����
		n4 = (int)(byte)by2;
		// Byte -> byte -> int -> Integer

		n4 = by2.intValue();
		// by2�� ��� ���� int���·� �ٲ㼭 ������ �� �ֵ��� ���ִ� ���(�Լ�)
		System.out.println("n4 : " + n4);
		
		System.out.println("int �ڷ����� �ּҰ� : " + Integer.MIN_VALUE);
		System.out.println("int �ڷ����� �ִ밪 : " + Integer.MAX_VALUE);
		
		System.out.println("���ڿ� 1234�� �������·� �ٲٱ� : " + Integer.parseInt("1234"));
		String  s = "1234";
		System.out.println(s + 10);
		int n = Integer.parseInt(s);
		System.out.println(n + 10);
		
		
	}
}
