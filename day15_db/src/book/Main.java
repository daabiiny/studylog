package book;

import java.util.Scanner;

// 사용자와 상호작용(입출력)
// 입력값에 따라서 handler의 함수를 호출

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		int menu;
		String bookName;
		String author;
		int bookPrice;
		int answer;
		
		while(true) {
			System.out.println("1. 신간 입력 : ");
			System.out.println("2. 도서 조회 : ");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				System.out.print("책 이름 입력 : ");
				bookName = sc.nextLine();
				System.out.print("작가 이름 입력 : ");
				author = sc.nextLine();
				System.out.print("책 가격 입력 : ");
				bookPrice = Integer.parseInt(sc.nextLine());
				answer = handler.add(bookName, author, bookPrice);
				System.out.println(answer != 0 ? "신간 추가" : "입력 불가");
				break;
				
			case 2:
				handler.list();
				break;
			case 0:
				sc.close();
				return;
			}
		}
	}
	
}
