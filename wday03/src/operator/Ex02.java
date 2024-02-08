package operator;

public class Ex02 {
	public static void main(String[] args) {
		// 대입 연산자 : 변수에 값을 할당할 때 사용한다
		// 단순 대입 연산자와 복합 대입 연산자로 구분할 수 있다
		
		// 1) 단순 대입 연산자는 오른쪽의 값을 왼쪽의 변수안에 복사하여 저장한다
		// 이때, 왼쪽 변수에 이미 다른 값이 있었다면, 기존 값을 덮어씌운다
		// 비교 연산자의 ==과 구분해야 한다
		// = : 대입연산자
		// == : 비교연산자(일치)
		
		int n1 = 10;
		System.out.println("n1 : " + n1);
		n1 = 3;
		System.out.println("n1 : " + n1);
		System.out.println();
		
		// 변수에 다른 변수를 대입할 수도 있다
		// 이때는, 왼쪽은 변수 공간을 나타내고, 오른쪽은 변수의 값을 나타낸다
		int n2 = 55;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		n1 = n2;	// n2의 값을 n1의 변수공간에 복사하여 저장한다
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		// 2) 복합 대입 연산자 : 산술연산과 대입연산을 동시에 수행한다
		// 좌변과 우변에 동일한 변수가 있고, 값을 산술연산할 때 사용한다
		n1 = 10;
		n2 = 3;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		n1 = n1 + n2;	// n1 + n2의 값을 계산하여 그 값을 다시 n1에 대입한다
						// n1 : 10 => 13
						// 계산 결과 기존 n1의 값에서 3만큼 증가한 형태이다
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		n1 += n2;		// 위 식을 복합대입연산자로 줄여서 작성한 형태
						// 원래 값을 유지한 상태에서 n2의 값만큼 증가시킨다
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		n1 -= n2;	// n1 = n1 - n2
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		n1 *= n2;	// n1 = n1 * n2
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		n1 /= n2;	// n1 = n1 / n2
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		n1 %= n2;	// n1 = n1 % n2
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
	}
}




