package dabin1;

import java.util.Scanner;

public class Main {
	
	static BookDTO getBookFromUserInput(Scanner sc) {
		BookDTO book = new BookDTO();
		String name, author, publisher;
		int price;
		
		System.out.print("도서 이름 : ");
		name = sc.nextLine();
		
		System.out.print("작가 이름 : ");
		author = sc.nextLine();
		
		System.out.print("출판사 이름 : ");
		publisher = sc.nextLine();
		
		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		book.setAuthor(author);
		book.setName(name);
		book.setPrice(price);
		book.setPublisher(publisher);
		return book;
	}
	
	public static void main(String[] args) throws Exception {
		
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		BookDTO book = null;
		int menu = -1;
		int row = 0;
		String name, publisher;
		
		while(true) {
			System.out.println("1. 도서 목록");
			System.out.println("2. 도서 입력");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				handler.showList();
				break;
				
			case 2:
				book = getBookFromUserInput(sc);
				row = handler.insertBook(book);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
				
			case 3:
				System.out.println("도서를 수정합니다");
				System.out.print("도서 이름 : ");
				name = sc.nextLine();
				System.out.print("출판사 이름 : ");
				publisher = sc.nextLine();
				
				row = handler.updateBook(name, publisher);
				System.out.println(row != 0 ? "수정 성공" : "수정 실패");
				break;
				
			case 4:
				System.out.println("도서를 삭제합니다");
				System.out.print("도서 이름 : ");
				name = sc.nextLine();
				row = handler.deleteBook(name);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 0: // 종료하기 전에 저장하고 종료한다
				System.out.println("프로그램을 종료합니다");
				sc.close();
				return;
			}
			
		}
		
		
	}
}
