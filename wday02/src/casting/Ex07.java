package casting;

public class Ex07 {
	public static void main(String[] args) {
		// 연관성 없는 자료형끼리는 강제형변환을 수행할 수 없다
		int n1 = 500;
		long n2 = 100;
		
		n1 = (int) n2;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		String s1 = "200";
//		n1 = (int) s1;				// 강제 형변환으로 해결할 수 없다
		n1 = Integer.parseInt(s1);	// 문자열을 정수로 변환해주는 함수
		System.out.println("n1 : " + (n1 + 5));
		System.out.println("s1 : " + (s1 + 5));
		
		
		// 기본자료형에 대한 활용도를 높이기 위한 클래스 자료형
		// 비 객체형 데이터를 객체형 데이터로 취급하기 위한 자료형
		// 단순 데이터를 객체형태로 감싸주는 자료형 (Wrapper Class)
		
		// primitive type (기본 자료형)
		boolean bo1 = true;
		byte by1 = 127;
		short sh1 = 32767;
		char ch1 = 'A';
		int num1 = 1234;
		long ln1 = 3000000000L;
		float fl1 = 1.2F;
		double db1 = 3.14;
		
		// Wrapper Class
		Boolean bo2 = bo1;
		Byte by2 = by1;
		Short sh2 = sh1;
		Character ch2 = ch1;
		Integer num2 = num1;
		Long ln2 = ln1;
		Float fl2 = fl1;
		Double db2 = db1;
		
		System.out.println("bo2 : " + bo2);
		System.out.println("by2 : " + by2);
		System.out.println("sh2 : " + sh2);
		System.out.println("ch2 : " + ch2);
		System.out.println("num2 : " + num2);
		System.out.println("ln2 : " + ln2);
		System.out.println("fl2 : " + fl2);
		System.out.println("db2 : " + db2);
		System.out.println();
		
		byte b2 = Byte.valueOf("123");
		System.out.println(b2);
		
		byte b3 = Byte.parseByte("53");
		System.out.println(b3);
		
		short s2 = Short.valueOf("30000");
		System.out.println("s2 : " + s2);
		
		
	}
}







