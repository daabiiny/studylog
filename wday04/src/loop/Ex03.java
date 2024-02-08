package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		// 1 ~ 100 사이의 정수를 무작위로 뽑는다
		Random ran = new Random();
		int start = 1;
		int end = 1000;
		int answer = ran.nextInt(end) + start;
		int mid = 0;
		int count = 0;
		
		// 정답을 직접 지정해보고 싶다면
		Scanner sc = new Scanner(System.in);
		System.out.printf("정답을 미리 입력하세요 (%d ~ %d) : ", start, end);
		answer = sc.nextInt();
		sc.close();
		
		while(start <= end) {			// 시작값이 끝값보다 작거나 같을때까지만 반복을 수행한다
			mid = (start + end) / 2;
			System.out.printf("%d ~ %d : %d\n", start, end, mid);
			count++;
			
			if(answer < mid)		end = mid - 1;
			else if(answer > mid)	start = mid + 1;
			else					break;
		}
		System.out.printf("%d회 만에 답을 찾았음. 정답 : %d\n", count, mid);
		
		
	}
}
