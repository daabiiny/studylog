package variable;

public class Ex02 {
	public static void main(String[] args) {
		
		// 변수의 이름은 중복되면 안된다
		// 변수를 만들 때 (변수의 선언) 반드시 앞에 자료형을 명시해야 한다
		
		String name1 = "짱구";
		String name2 = "유리";
		String name3 = "훈이";
		
		int age1 = 5;
		int age2 = 4;
		int age3 = 6;
		
		System.out.println(name1 + "의 나이는 " + age1 + "살입니다" );
		System.out.println(name2 + "의 나이는 " + age2 + "살입니다" );
		System.out.println(name3 + "의 나이는 " + age3 + "살입니다" );
		// 이클립스 한줄 아래로 복사하기 : ctrl + alt + ↓
		// 현재 커서 위치한 줄을 삭제하기 : ctrl + d
		
		int num = 128;
		byte by = (byte)num;
		
		System.out.println("by : " + by);
		
		//자바의 자료형
		// 1) primitive type, 기본 자료형, 원시 자료형
		/*
		  	빈도			자료형		값의 범위				크기
		  	★			boolean		true/false			1바이트
		  	★			byte		-128 ~ +127			1바이트 
		  				short		-32768 ~ +32767		2바이트
		  				char		0 ~ 65535			2바이트(글자를 표현하기 위한 정수)
		  	★★★			int			-21억 ~ +21억			4바이트(정수 대표 자료형)
		  	★			long		-922경 ~ +922경		8바이트
		  				float		실수					4바이트
		  	★★			double 		실수					8바이트(실수 대표 자료형)
		  
		 */
		
		// 2) Reference type, 참조 자료형
	}

}
