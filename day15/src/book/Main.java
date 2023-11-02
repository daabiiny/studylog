package book;

import java.util.Scanner;

// 사용자의 상호작용(입출력)
// 입력값에 따라서 handler와 함수를 출력

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		
		int menu;
		String genre;
		String bookName;
		int money;
		
		while(true) {
			System.out.println("1. 도서 등록");
			System.out.println("2. 재고 확인");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				System.out.print("도서 장르 : ");
				genre = sc.nextLine();
				System.out.print("도서 이름 : ");
				bookName = sc.nextLine();
				System.out.print("도서 가격 : ");
				money = Integer.parseInt(sc.nextLine());
			}
		}
	}
}
