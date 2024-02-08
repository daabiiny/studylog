package phonebook;

import java.util.Scanner;

public class Main {	// 사용자와의 입출력을 담당하는 Main
	static Info newInfo(Scanner sc) {
		String name, pnum;
		String favorite;
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.print("전화번호 입력 : ");
		pnum = sc.nextLine();
		System.out.print("즐겨찾기에 등록하시겠습니까 (y/N) : ");
		favorite = sc.nextLine();
		Info info = new Info(name, pnum, favorite.equalsIgnoreCase("y"));
		return info;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		Info info = null;
		String pnum;
		int menu, row;
		
		while(true) {
			System.out.println("1. 목록 출력");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				handler.showList();
				break;
			case 2:
				info = newInfo(sc);
				handler.add(info);
				break;
			case 3:
				System.out.print("삭제할 전화번호 입력 : ");
				pnum = sc.nextLine();
				row = handler.delete(pnum);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				sc.close();
				return;		// 메인함수의 종료
			}
		}
	}
}









