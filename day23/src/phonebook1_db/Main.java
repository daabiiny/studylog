package phonebook1_db;

import java.util.Scanner;


public class Main {
	// 입력받는 값은 main에 쓰는게 좋음
	
	static PhonebookDTO getBookFromUser(Scanner sc) {
		PhonebookDTO book = new PhonebookDTO();
		String name, pnum, favorite;
		int age;
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("번호 입력 : ");
		pnum = sc.nextLine();
		
		System.out.print("나이 입력 : ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.print("즐겨찾기 입력 : ");
		favorite = sc.nextLine();

		book.setName(name);
		book.setPnum(pnum);
		book.setAge(age);
		book.setFavorite(favorite);
		
		return book;
	}
	
	public static void main(String[] args) {
		
		// 변수 생성
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		PhonebookDTO book = null;
		int menu = -1;
		int row = 0;
		String name;
		String pnum;
		
		// 입출력
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
			
			switch (menu) {
	
			// 전체 목록
			case 1:
				handler.showList();
				break;
			
			// 추가
			case 2:
				System.out.println("전화번호를 추가합니다");
				book = getBookFromUser(sc);
				row = handler.insertPhonebook(book);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				
				break;
			
			// 전화번호 수정
			case 3:
				System.out.println("전화번호를 수정합니다");
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				System.out.print("번호 입력 : ");
				pnum = sc.nextLine();
				
				row = handler.updatePnum(name, pnum);
				System.out.println(row != 0 ? "수정 성공" : "수정 실패");
			
				break;
			
			// 즐겨찾기 수정
			case 4:
				System.out.println("즐겨찾기를 수정합니다");
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				row = handler.updateFavorite(name);
				System.out.println(row != 0 ? "수정 성공" : "수정 실패");
				break;
			
			// 삭제
			case 5:
				System.out.println("삭제합니다");
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				row = handler.delete(name);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
			
			// 종료
			case 0:
				System.out.println("프로그램을 종료합니다");
			}
			System.out.println();
			
		}
		sc.close();
	}
}
