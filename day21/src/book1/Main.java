package book1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Book 클래스의 필드값을 입력받거나 출력을 위해
		// 지역변수를 만들어두는 편이 좋다
		
		// 변수선언
		String name, author, publisher;			// Book의 String 타입 필드 (입력받기 위한 값)
		int price;								// Book의 int타입 필드 (입력받기 위한 값)
		int menu = -1;							// switch와 연동하기 위한 메뉴
		
		Scanner sc = new Scanner(System.in);	// 입력받기 위한 Scanner
		Book[] arr = new Book[10];				// 여러 Book 객체를 저장하기 위한 배열
												// 배열은 자료형에 맞는 0값으로 초기화된다
												// 참조형 변수(클래스 타입 변수)의 초기값은 null
		// arr = { null, null, null, null, null, null, null, null, null, null } 
		
		// 입력 및 출력 (자료형 + 대입, 제어문 + 연산자 활용)
		while(true) {
			// 사용자 메뉴 출력
			System.out.println("1. 도서 목록");
			System.out.println("2. 도서 추가");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {	// 사용자가 입력한 메뉴에 따라서 서로 다른 코드를 수행한다 (분기문)
			case 1:			// 1. 전체 출력
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {	// 배열의 각 초기값 null을 처리(회피)하기 위한 if
					System.out.printf("%s (%s, %s) : %,d원\n",
							arr[i].name, arr[i].author, arr[i].publisher, arr[i].price);
					}
				}
				break;
				
			case 2:			// 2. 도서 추가
				System.out.print("도서 이름 : ");
				name = sc.nextLine();
				
				System.out.print("작가 이름 : ");
				author = sc.nextLine();
				
				System.out.print("출판사 이름 : ");
				publisher = sc.nextLine();
				
				System.out.print("도서 가격 : ");
				price = Integer.parseInt(sc.nextLine());
				
				// 4개의 값을 입력받았다면 하나의 객체로 구성하기 위해서 생성자를 호출한다
				// 배열의 10칸 중에서 빈칸을 하나 찾아서 거기에 객체를 생성하고 값을 넣어준다
				// 다음 칸에도 똑같은 값을 넣으면 안되니까 break를 수행해야한다
				
				for(int i = 0; i < arr.length; i++) {	// 배열의 처음부터 끝까지 순회하면서
					if(arr[i] == null) {				// 빈칸을 찾았다면
						arr[i] = new Book();			// 빈칸에 객체를 생성하고
						arr[i].name = name;				// Scanner로 입력받은 값을 객체의 속성으로 대입한다
						arr[i].author = author;			// 갈색) 메인함수 지역변수, 파란색) 객체의 멤버필드
						arr[i].publisher = publisher;	
						arr[i].price = price;
						break;	// 다음칸에 또 값을 넣으면 안되니까 break (반복 중단)
					}
				}
				break;	// 추가하고 나서 break가 없으면 case0으로 넘어가버리니까 switch의 break

			case 0:
				System.out.println("프로그램이 종료되었습니다");
				sc.close();
				return;
					
			}
				
		}
			
	}
		
}

