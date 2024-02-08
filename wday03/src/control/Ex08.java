package control;

public class Ex08 {
	public static void main(String[] args) {
		// 세 정수의 크기를 비교하여 가장 큰 수를 화면에 출력하기
		int n1 = 100, n2 = 100, n3 = 100;
		
		if(n1 > n2 && n1 > n3) {	// 만약, n1이 가장 크면
			System.out.println("가장 큰 수는 " + n1);
		}
		else if(n2 > n1 && n2 > n3) {	// (n1이 가장 크지 않고) 만약, n2가 가장 크면
			System.out.println("가장 큰 수는 " + n2);
		}
		else if(n3 > n1 && n3 > n2) {	// (n1, n2가 가장 크지 않고) 만약, n3가 가장 크면
			System.out.println("가장 큰 수는 " + n3);
		}
		else {	// 이전에 등장한 모든 조건이 false인 경우에 작동한다
			System.out.println("세 정수의 크기가 모두 동일합니다");
		}
	}
}
