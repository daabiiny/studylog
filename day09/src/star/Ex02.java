package star;

public class Ex02 {
public static void main(String[] args) {
	
//	횟수를 제어할 변수를 미리 만들어두고 내가 직접 횟수를 변경/제어하기
	
	int size = 7;
	int sp = size / 2;		// 공백
	int st = 1;		// 별의 개수
	
//	다이아몬드
//	sp	st	sp
//	2	1	2
//	1	3	1
//	0	5	0
//	1	3	1
//	2	1	2
	
	for(int i = 0; i < size; i++) {
//		공백
		for(int j = 0; j < sp; j++) {
			System.out.print("  ");
		}
//		별
		for(int j = 0; j < st; j++) {
			System.out.print("* ");
		}
//		공백
		for(int j = 0; j < sp; j++) {
			System.out.print(" ");
		}
//		한줄이 끝나면 줄바꾸기	
		System.out.println();
		
		if(i < size / 2) {	// 전체 줄 중에서 가운데 도달하지 못했다면(윗부분)
			sp -= 1;
			st += 2;
		}
		else {
			sp += 1;
			st -= 2;
		}
	}
	
	
}
}
