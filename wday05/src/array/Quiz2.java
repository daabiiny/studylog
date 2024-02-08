package array;

import java.util.Arrays;
import java.util.Random;

public class Quiz2 {
	public static void main(String[] args) {
		// 5명의 학생이 자격증 시험에 응시했습니다
		// 합격점수는 60점 이상입니다
		// 각 학생의 점수에 따라 합격/불합격 결과를 boolean 타입으로 나타내주세요
		// 예를 들어, 60점 이상이면 true, 60점 미만이면 false가 나와야 합니다
		
		// 배열과 반복문을 활용해주세요
		
		Random ran = new Random();
		int size = 100;
		int[] score = new int[size];
		boolean[] result = new boolean[size];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = ran.nextInt(100) + 1;	// 1 ~ 100 랜덤
		}
		System.out.println(Arrays.toString(score));
		
		// 풀이
		for(int i = 0; i < score.length; i++) {
			result[i] = score[i] >= 60;
			System.out.printf("%d점 결과 : %s\n", score[i], result[i]);
		}
		System.out.println(Arrays.toString(result));
		
		// 일정한 양의 데이터를 일정한 코드에 따라 처리하는 요령을 파악하면
		// 데이터의 개수는 크게 중요하지 않다
		
		
	}
}





