package operator;

public class Ex01 {
	public static void main(String[] args) {
		// 비교 연산자 : 값의 일치 및 크기 비교를 수행하고, 그 결과를 boolean으로 나타낸다
		// >, <, >=, <=, ==, !=
		// 입력값 혹은 미리 준비된값의 크기비교를 수행하고
		// true 혹은 false에 따라서, 다음 코드를 진행하기 위한 조건식으로 활용하는 경우가 많다
		
		// 만약, 상품가격과 받은돈을 비교하여 상품가격이 더 크면(받은돈이 더 작으면), 판매불가
		// 만약, 상품가격과 받은돈이 일치하면 판매가능, 거스름돈 없음
		// 만약, 상품가격이 더 작으면(받은돈이 더 크면) 판매가능, 거스름돈 = 받은돈 - 상품가격
		
		// 크기비교는 정수 혹은 실수에 대해 가능하다
		// 문자열은 연산자를 활용한 크기비교를 지원하지 않는다
		int n1 = 10;
		int n2 = 3;
		
		System.out.printf("%d >  %d : %s\n", n1, n2, n1 > n2);
		System.out.printf("%d <  %d : %s\n", n1, n2, n1 < n2);
		System.out.printf("%d >= %d : %s\n", n1, n2, n1 >= n2);
		System.out.printf("%d <= %d : %s\n", n1, n2, n1 <= n2);
		System.out.printf("%d == %d : %s\n", n1, n2, n1 == n2);
		System.out.printf("%d != %d : %s\n", n1, n2, n1 != n2);
		

		
		
	}
}
