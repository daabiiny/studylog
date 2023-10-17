package quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
//		지하철 1구간당 평균 소요시간이 4분이라고 가정한다
//		이동한 구간수를 입력받아서 이동하는데 걸리는 시간을 출력하세요
//		단, 이동한 시간이 60분 이하이면 분으로만 출력하고
//		이동한 시간이 60분을 초과하면 시간과 분으로 나누어서 출력하세요

		Scanner sc = new Scanner(System.in);
		int num;
		int station;
		int hour, min;
				
		System.out.print("이동한 구간 수 : ");
		num = sc.nextInt();
		
		station = num * 4;
		hour = station / 60;
		min = station - hour * 60;
		
		if (station <= 60) {
			System.out.printf("%d분 걸립니다\n", station);
		}
		else if (station > 60) {
			System.out.printf("%d시간 %d분 걸립니다\n", hour, min);
		}
		
		sc.close();	
		
	}
}
