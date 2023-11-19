package phonebook1;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	static PhonebookDTO getBookFromUserInput(Scanner sc) {
		
		PhonebookDTO dto = new PhonebookDTO();
		
		System.out.print("이름 입력 : ");
		dto.setName(sc.nextLine());
		
		System.out.print("번호 입력 : ");
		dto.setPnum(sc.nextLine());
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Handler handler = new Handler();
		List<PhonebookDTO> list = null;
		PhonebookDTO ob = null;
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		int row = 0;
		int idx;
		String name;
		
		while(menu != 0) {
			System.out.println();
			System.out.println("1. 전체 목록");
			System.out.println("2. 전화번호 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기 수정");
			System.out.println("5. 전화번호 삭제");
			System.out.println("0. 종료");
			System.out.print(" 입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			
			// 전체 목록
			case 1:
				break;
			
			// 전화번호 추가
			case 2:
				break;
			
			// 전화번호 수정
			case 3:
				break;
				
			// 즐겨찾기 수정
			case 4:
				break;
			
			// 전화번호 삭제
			case 5:
				break;
			
			// 프로그램 종료
			case 0:
				System.out.println("프로그램을 종료합니다");
			
			
			
			
			}
			
			
			
		}
		
		
		
	}
}
