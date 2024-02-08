package operator;

public class Ex04 {
	public static void main(String[] args) {
		// 단항 연산자 : 값 1개에 대한 연산을 수행하는 연산자 (논리 부정 연산 !)
		// 이항 연산자 : 값 2개에 대한 연산을 수행하는 연산자 (산술 연산, 비교 연산, 논리 연산)
		
		// 단항 증감 연산자 : 변수의 값을 1씩 증가시키거나, 감소시킨다
		//				   연산자의 위치에 따라 선처리 혹은 후처리로 나누어진다
		int num = 10;
		System.out.println("num++ : " + num++);	// 먼저 출력하고, 이후 증가시킨다
		System.out.println("++num : " + ++num);	// 먼저 증가시키고, 이후 출력한다
		System.out.println("--num : " + --num);	// 먼저 감소시키고, 이후 출력한다
		System.out.println("num-- : " + num--);	// 먼저 출력하고, 이후 감소시킨다
		System.out.println();
		System.out.println("num : " + num);
		
		// 연산자의 위치에 따라서, 전위(혹은 전치)/후위(혹은 후치) 증감 연산자로 부르기도 한다
		
		// 단항 부호 연산자 : 변수앞에 부호를 붙여서 부호를 반전시킬 수 있다
		System.out.println("+num : " + +num);
		System.out.println("-num : " + -num);	// <=
		System.out.println();
		System.out.println("num : " + num);	// 원본이 바뀌는 것은 아니다
		
		// 부호 반전의 예시
		int unit = 1;
		int length = 1;
		for(int i = 0; i < 5; i++) {
			System.out.print(i + " : ");
			for(int j = 0; j < length; j++) {
				System.out.print("# ");
			}
			System.out.println();
			if(i < 5 / 2) {
				length += unit;		// 단위만큼 증가시킨다 (1씩 더한다)
			}
			else {
				length += -unit;	// 단위만큼 감소시킨다 (-1씩 더한다 == 1씩 감소시킨다)
			}
		}
		
		
		
		
	}
}
