package loop;

public class Ex05 {
	public static void main(String[] args) {
		// 일정 횟수 안에서 코드를 반복하기
		
		// 1) 1부터 100사이의 모든 정수의 합계를 구하세요
		int total = 0;
		int cnt = 0;
		while(cnt < 100) {	// 100보다 작을때까지 반복
//			System.out.println(cnt);
			total += (cnt + 1);
			cnt++;
		}
		System.out.println("1 ~ 100사이 정수의 합계 : " + total + "\n");
		
		// 2) 1부터 100사이 정수 중에서 7의 배수의 합계 구하기
		// 반복문 범위 안에서 특정 조건을 만족하는 집합 구하기 (while + if)
		total = 0;
		cnt = 0;
		while(cnt < 100) {				// 범위를 설정하고
			if((cnt + 1) % 7 == 0) {	// 범위 안에서 특정 조건을 만족하는 경우에만	
				total += (cnt + 1);		// 합계에 더한다
			}
			cnt++;
		}
		System.out.println("1 ~ 100사이 7의 배수의 합계 : " + total + "\n");
		
	}
}
