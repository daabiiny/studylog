package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 	버스 한 정거장 이동하는데 3분이 걸린다고 가정한다
		 * 	이동한 정거장 수를 입력받아서, 걸린 시간을 출력해야 한다
		 * 	단, 걸린 시간이 60분을 초과하면
		 * 	시간과 분으로 나누어서 출력해야 한다
		 * 
		 * 	입력1) 15
		 * 	출력1) 45분
		 * 
		 * 	입력2) 25
		 * 	출력2) 1시간 15분
		 */
		
		// 1) 변수 선언 및 초기화 (문제에서 결과를 결정하는 요인이 되는 값을 찾아서 변수로 선언)
		Scanner sc = new Scanner(System.in);	// 입력
		int station = 3;		// 구간당 3분
		int distance;			// 이동한 거리(입력받기)
		int minute, hour = 0;	// 출력에 사용할 분, 시간
		
		// 2) 입력
		System.out.print("이동한 정거장 수를 입력 : ");
		distance = sc.nextInt();
		
		// 3) 연산 (제어문 및 연산자, 함수 활용)
		minute = distance * station;
		if(minute > 60) {
			hour = minute / 60;		// 총 시간을 60분으로 나누어서 몫을 저장한다 (시간)
			minute = minute % 60;	// 총 시간을 60분으로 나누어서 나머지를 저장한다 (분)
		}
		
		// 4) 결과 처리
		String result = (hour != 0) ? 
							String.format("%d시간 %d분", hour, minute) :
							minute + "분";
		System.out.println(result);
		
		// 5) 마무리
		sc.close();
	}
}



