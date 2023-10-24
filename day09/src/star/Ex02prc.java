package star;

public class Ex02prc {
	public static void main(String[] args) {
		
		int size = 9;
		int st = 1;
		int sp = size - st * 2;
		
//		for(int i = 0; i < size; i++) {
//			for(int j = 0; j < sp; j++) {
//				System.out.print("  ");
//			}
//			for(int j = 0; j < st; j++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//			
//			sp += 1;
//			st -= 1;
			
//		}
		
//		for(int i = 0; i < size; i++) {
//			for(int j = 0; j < sp; j++) {
//				System.out.print("  ");
//			}
//			for(int j = 0; j < st; j++) {
//				System.out.print(" *");
//			}
//			for(int j = 0; j < sp; j++) {
//				System.out.print(" ");
//			}	
//			System.out.println();
//			
//			if (i < size / 2) {
//				sp += 1;
//				st -= 2;
//			}
//			else {
//				sp -= 1;
//				st += 2;
//			}
//		}
		
//		(나비넥타이 만들기)
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < st; j++) {
				System.out.print("* ");
			}
			for(int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < st; j++) {
				System.out.print("* ");
				
				if(i == size / 2 && j == 0) {	// 가운데 줄이고, j반복의 첫번째에서만
					//st -= 1;
					j++;			// j를 한번더 증가 (for문안에서 반복횟수를 제어하는 방법)
				}
			}	
			System.out.println();
			
			if (i < size / 2) {
				st += 1;
				sp -= 2;
			}
			else {
				st -= 1;
				sp += 2;
			}

		}
	}
}
