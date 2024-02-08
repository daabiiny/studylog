package control;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 세 과목의 점수를 입력받아서, 합계와 평균을 구하고
		// 평균에 따라서 합격 혹은 불합격을 함께 출력하세요 (60점 이상이면 합격)
		// 평균은 소수점 둘째자리까지 계산되어야 합니다
		Scanner sc = new Scanner(System.in);
		int sub1, sub2, sub3, total = 0;
		double avg;
		String result;
		
		System.out.print("1과목 입력 : ");
		sub1 = sc.nextInt();
		
		System.out.print("2과목 입력 : ");
		sub2 = sc.nextInt();
		
		System.out.print("3과목 입력 : ");
		sub3 = sc.nextInt();
		
		total = sub1 + sub2 + sub3;
		avg = total / (double)3;
		
		if(avg >= 60) {
			result = "합격";
		}
		else {	// else는 이전의 모든 조건이 거짓일 경우 작동하기 때문에 별도의 조건식을 갖지 않는다
			result = "불합격";
		}
		System.out.printf("평균 : %.2f, 결과 : %s\n", avg, result);
		
		sc.close();
		
		
		
	}
}
