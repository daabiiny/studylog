package variable;

public class Quiz2 {
	public static void main(String[] args) {
		// 자신의 이름을 문자열 변수에 저장하세요
		
		String name = "정다빈";
		
		// 자신의 나이를 정수형 변수에 저장하세요
		
		int age = 29;		
		Integer age2 = 29;
		
		// 새로운 실수형 변수에 0을 대입하세요
		
		double n1 = 0;					// 우변의 0은 자료형이 명시되지 않은 리터럴이지만, 리터럴 정수의 기본자료형은 int이다
		Double n2 = (double) 0;			// Type mismatch : cannot convert from int to Double
//		Double n2 = 0.0;
// 		Double n2 = Double.valueof(0);		
		
		
		// 방금 만든 실수형 변수에 3.14를 대입하세요
		
		n1 = 3.14;
		n2 = 3.14;
		
		// 지금까지 만든 3개의 변수에 담긴 값을 각각 한줄씩 화면에 출력하세요
		
		System.out.println("내 이름은 : " + name);
		System.out.println("내 나이는 : " + age);
		System.out.println(n1);
		
		System.out.println("내 이름은 : " + name);
		System.out.println("내 나이는 : " + age2);
		System.out.println(n2);
		
		
		//(primitive를 이용해서 한번, WrapperClass를 이용해서 한번 코드를 실행하세요)
		
		 
	}

}
