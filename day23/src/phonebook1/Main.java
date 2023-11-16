package phonebook1;

import java.util.Scanner;

public class Main {
	
	static PhonebookDTO getBookFromUserInput(Scanner sc) {
		PhonebookDTO book = new PhonebookDTO();
		String name, pnum, favorite;
		int age;
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("번호 입력 : ");
		pnum = sc.nextLine();
		
		System.out.print("나이 입력 : ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.print("즐겨찾기 여부 : ");
		favorite = sc.nextLine();
		
		book.setName(name);
		book.setPnum(pnum);
		book.setAge(age);
		book.setFavorite(favorite);
		return book;
	}
	
	public static void main(String[] args) {
		Handler handler = new Handler();
		PhonebookDTO book = null;
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		int row = 0;
		String name; 
		String pnum;
		
		while(menu != 0) {
			System.out.println("메뉴 출력");
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			// 전체 목록
			case 1:
				handler.showList();
				break;
			
			// 추가
			case 2:
				book = getBookFromUserInput(sc);
				row = handler.insertPhoneNumber(book);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
			
			// 전화번호 수정
			case 3:
				System.out.print("검색어를 입력하세요 : ");
				name = sc.nextLine();
				
				System.out.print("번호를 입력하세요 : ");
				pnum = sc.nextLine();
				
				row = handler.updatePhoneNumber(name, pnum);
				System.out.println(row != 0 ? "수정 성공" : "수정 실패");
				break;
			
			// 즐겨찾기 수정
			case 4:
				System.out.print("검색어를 입력하세요 : ");
				name = sc.nextLine();
				row = handler.updateFavorite(name);
				System.out.println(row != 0 ? "수정 성공" : "수정 실패");
				break;
			
			// 삭제
			case 5:
				System.out.print("검색어를 입력하세요 : ");
				name = sc.nextLine();
				row = handler.deletePhoneNumber(name);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 0:
				System.out.println("프로그램을 종료합니다");
			}
			System.out.println();
		}// end of while
		
		sc.close();
	}
}
