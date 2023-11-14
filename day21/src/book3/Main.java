package book3;

import java.util.Scanner;

public class Main {

	// Main(I/O) ↔ Handler(function)
	// case2의 입력부분, Scanner를 매개변수로 전달받아서 객체를 생성하고, 
	// 사용자 입력값으로 객체를 구성하여 그 객체를 반환하는 함수
	
	// main에서 입력받아야 하는 함수이기때문에 Handler로 옮기지 않음
	static Book getBookFromUserInput(Scanner sc) {
		Book book = new Book();
		String name, author, publisher;
		int price;						
		
		System.out.print("도서 이름 : ");
		name = sc.nextLine();
		
		System.out.print("작가 이름 : ");
		author = sc.nextLine();
		
		System.out.print("출판사 이름 : ");
		publisher = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		book.setAuthor(author);
		book.setName(name);
		book.setPrice(price);
		book.setPublisher(publisher);
		return book;
	}
	
	public static void main(String[] args) {
		// Book 클래스의 필드값을 입력받거나 출력을 위해
		// 지역변수를 만들어두는 편이 좋다
		
		// 변수선언
		Handler handler = new Handler();
		Book book = null;						// ★ 추가 수정 삭제 검색에서 사용할 객체를 받기 위한 변수
		String name;
//		String author, publisher;				// Book의 String 타입 필드 (입력받기 위한 값)
//		int price;								// Book의 int타입 필드 (입력받기 위한 값)
		int menu = -1;							// switch와 연동하기 위한 메뉴
		int row = 0;							// 추가 및 삭제가 정상적으로 수행되었는지 확인하기 위한 변수
		
		Scanner sc = new Scanner(System.in);	// 입력받기 위한 Scanner
		
		// arr = { null, null, null, null, null, null, null, null, null, null } 
		
		// 입력 및 출력 (자료형 + 대입, 제어문 + 연산자 활용)
		while(true) {
			// 사용자 메뉴 출력
			System.out.println("1. 도서 목록");
			System.out.println("2. 도서 추가");
			System.out.println("3. 도서 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {	// 사용자가 입력한 메뉴에 따라서 서로 다른 코드를 수행한다 (분기문)
			case 1:			// 1. 전체 출력
				handler.showList();;
				break;
				
			case 2:			// 2. 도서 추가
				book = getBookFromUserInput(sc);	// 이미 값이 모두 세팅
				row = handler.insertBook(book);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;	// 추가하고 나서 break가 없으면 case0으로 넘어가버리니까 switch의 break
				
			case 3:
				// 배열 내부의 도서 중에서 이름이 일치하는 객체를 찾아서 제거한다
				System.out.print("검색어를 입력하세요 : ");
				name = sc.nextLine();
				row = handler.deleteBook(name);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;

			case 0:
				System.out.println("프로그램이 종료되었습니다");
				sc.close();
				return;
			}
				
		}
			
	}
		
}

