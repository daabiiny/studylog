package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int eleA, eleB, eleC;
		
		eleA = ran.nextInt(15) + 1;	// 1~15
		eleB = ran.nextInt(15) + 1;	// 1~15
		eleC = ran.nextInt(15) + 1;	// 1~15
		
		System.out.printf("%d, %d, %d\n", eleA, eleB, eleC);
		
//		현재 자신의 위치를 1 ~ 15 사이로 입력한 다음
//		가장 가까운 엘리베이터가 몇번째인지 출력하는 코드를 작성하세요
//		(가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다
		
//		화면 세로 분할 단축키 : Ctrl + Shift + [
//		화면 가로 분할 단축키 : Ctrl + Shift + _
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("현재 내 위치는 : ");
		num = sc.nextInt();
		
		int eleAdis = eleA - num;
		int eleBdis = eleB - num;
		int eleCdis = eleC - num;
		
		if (eleAdis < 0) {
			eleAdis = -eleAdis;	// eleAdis *= -1;
		}
		
		if (eleBdis < 0) {
			eleBdis = -eleBdis;
		}
		
		if (eleCdis < 0) {
			eleCdis = -eleCdis;
		}
		
		if (eleAdis <= eleBdis && eleAdis < eleCdis) {
			System.out.println("가장 가까운 엘리베이터는 첫번째 엘리베이터다");
		}
		else if (eleBdis <= eleAdis && eleBdis < eleCdis) {
			System.out.println("가장 가까운 엘리베이터는 두번째 엘리베이터다");
		}
		else if (eleCdis <= eleAdis && eleCdis < eleBdis) {
			System.out.println("가장 가까운 엘리베이터는 세번째 엘리베이터다");
		}
		
//		* 거리중에서 최소값 찾기
//		int min;
//		if(true)				min = eleAdis;
//		if(min > eleBdis)		min = eleBdis;
//		if(min > eleCdis)		min = eleCdis;
		
//		* 최소값과 일치하는 엘리베이터에 대한 문장 출력하기
//		if(min == eleAdis)		System.out.println("A엘리베이터가 이동합니다");
//		else if(min == eleBdis)	System.out.println("B엘리베이터가 이동합니다");
//		else					System.out.println("C엘리베이터가 이동합니다");
		
		
		sc.close();
		
	}
}
