package casting;

public class Quiz2 {
	public static void main(String[] args) {
		// 문자열 변수를 선언하고 본인의 이름을 저장하세요
		String name = "홍길동";
		
		// 정수형 변수를 선언하고 본인의 나이를 저장하세요
		int age = 25;
		
		// Double형 변수를 선언하고 0을 저장하세요
		/*
			0의 자료형은 int
			db의 자료형은 Double
			int와 Double은 서로 호환되지 않는다
			
			double과 Double은 서로 호환된다
		 */
		Double db = (double)0;
		
		// 위에서 선언한 Double형 변수에 3.14를 대입하세요
		db = 3.14;
		
		// 만들어진 3개의 변수를 한줄씩 출력하세요
		System.out.println(name);
		System.out.println(age);
		System.out.println(db);
	}
}
