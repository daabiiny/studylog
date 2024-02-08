package control;

public class Ex09 {
	public static void main(String[] args) {
		// 세 정수의 크기를 비교하여 가장 큰 수 출력하기 (Ex08과 코드 진행 및 조건을 비교해보자)
		int max = 0;
		int n1 = 10, n2 = 50, n3 = -100;
		
		max = n1;		// n1이 가장 큰 값이라고 가정한다
		if(max < n2) {	// 만약, 최대값보다 n2가 더 크면
			max = n2;	// n2를 최대값으로 지정한다 (n2의 값을 최대값에 저장한다)
		}
		if(max < n3) {	// (이전 코드와 상관없이) 만약, 최대값보다 n3가 더 크면 
			max = n3;	// n3를 최대값으로 지정한다
		}
		System.out.println("최대값은 " + max);	// 저장된 최대값을 출력한다
	}
}
