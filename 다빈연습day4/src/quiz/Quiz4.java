package quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		
		// 지하철 1구간당 [평균 소요 시간이 4분]이라고 가정한다
		// [이동한 구간수]를 입력받아서 이동하는데 걸리는 시간을 출력하세요
		// 단, 이동한 시간이 60분 이하이면 분으로만 출력하고
		// 이동한 시간이 60분을 초과하면 [시간]과 [분]으로 나누어서 출력하세요
		
		int perStation;
		int hour;
		int minute;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이동한 구간 수 : ");
		perStation = sc.nextInt();
		
		int time = perStation * 4;
		
		if (time <= 60) {
			System.out.printf("이동시간은 총 %d분입니다\n", time);
		}
		else {
			hour = time / 60;
			minute = time % 60;
			System.out.printf("이동시간은 총 %d시간 %d분입니다\n", hour, minute);
		}
		sc.close();
		
		
	}
}
