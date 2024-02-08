package control;

public class Ex07 {
	public static void main(String[] args) {
		// 두 정수중 더 큰 수를 찾아서 출력하세요
		int n1 = 100, n2 = 10;
		
		// 1) 삼항 연산자를 이용한 처리
		int max1 = n1 > n2 ? n1 : n2;
		System.out.printf("%d, %d 중에 더 큰 수는 %d입니다\n", n1, n2, max1);
		
		// 2) if를 이용한 처리 (else는 이전의 조건이 거짓이면 작동한다)
		int max2;
		if(n1 > n2) {
			max2 = n1;
			System.out.printf("%d, %d 중에 더 큰 수는 %d입니다\n", n1, n2, max2);
		}
		else if(n1 < n2) {
			max2 = n2;
			System.out.printf("%d, %d 중에 더 큰 수는 %d입니다\n", n1, n2, max2);
		}
		else if(n1 == n2) {
			System.out.println("두 수의 크기가 같습니다");
		}
		
		// if 사용 형태
		// 1) 조건에 따라 코드를 실행하거나 실행하지 않을 경우 : if
		// 2) 여러 조건을 순차적으로 모두 체크할 경우 : if ~ if ~ if
		// 3) 여러 조건 중 하나만 실행할 경우 : if ~ else if ~ else
		
		
	}
}



