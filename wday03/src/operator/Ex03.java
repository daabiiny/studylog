package operator;

public class Ex03 {
	public static void main(String[] args) {
		// 논리 연산자 : 서로 다른 두 조건을 판별하여 새로운 boolean값을 만든다
		
		// && (and) : 두 조건 모두 참이면 결과가 참이다
		// || (or) : 두 조건 중 하나라도 참이면 결과가 참이다
		// ! (not) : 원래 조건의 반대 결과를 만든다(참이면 거짓, 거짓이면 참)
		
		int age = 25;		// 나이
		int gender = 1;		// 홀수는 남성, 짝수는 여성
		
		boolean flag1 = (age >= 20) && (gender % 2 != 0);
		System.out.println("flag1 : " + flag1 + "\n");
		
		
		int cash = 5000;	// 현재 보유중인 현금 액수
		int card = 0;		// 신용카드 및 체크카드가 있으면 1, 없으면 0
		
		boolean byTaxi = (cash >= 10000) || (card == 1);
		System.out.println("byTaxi : " + byTaxi + "\n");
		
		
		int dice = 5;
		boolean exit = !(dice == 6);
		System.out.println("exit : " + exit);
		System.out.println("!exit : " + !exit);
		
		// and는 첫번째 조건이 거짓이면 두번째 조건을 연산하지 않는다
		// or는 첫번째 조건이 참이면 두번째 조건을 연산하지 않는다
		
		int n1 = 2, n2 = 1, n3 = 0, n4 = -1;
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		
		boolean b1 = (n1++ + ++n2 < 0) && (n3++ - ++n4 == 0);
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		System.out.println("b1 : " + b1);
		// and 연산은 두 조건 모두 참이여야 하는데, 첫번째 조건에서 거짓이 나타나면
		// 두번째 조건이 참이든 거짓이든 상관없이 전체 결과가 거짓으로 결정된다
		// 따라서, 두번째 조건을 판별할 필요가 없다
		
		boolean b2 = (n1++ + ++n2 != 0) || (--n3 + --n4 == 0);
		// or 연산은 두 조건중 하나라도 참이면 전체가 참이다
		// or 연산의 첫번째 조건이 참이면, 두번째 조건의 결과에 상관없이 전체 결과가 참으로 결정된다
		// 따라서, 두번째 조건을 판별할 필요가 없다
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		System.out.println("b2 : " + b2);
		
		
		// and연산의 연산순서 특징을 활용한 null 체크 예시
		String str1 = null;		// 문자열 변수 str의 값이 없다(존재하지 않는다)
		String str2 = "apple";
		
		System.out.println("str2와 str1의 내용이 일치하는가 : " + str2.equals(str1));
//		System.out.println("str1과 str2의 내용이 일치하는가 : " + str1.equals(str2));
//		.연산자 앞의 값은 null이 오면 안된다
		
		// 오빠의 나이를 질문한다
		// 응답자는 오빠가 없다
		// 오빠가 없기 때문에 오빠의 나이라는 속성에 접근할 수 없다
		// .연산자 앞에는 null이 오면 안된다
		
		// && 연산을 이용하여 null인지 먼저 체크하고, null이 아니면 일치여부를 확인한다
		boolean eq = (str1 != null) && (str1.equals(str2));
		System.out.println("eq : " + eq);
		
		// 첫번째 조건에서 전체 값이 결정되면, 두번째 조건을 연산하지 않는다
		
	}
}






