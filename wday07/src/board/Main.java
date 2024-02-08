package board;

import java.util.Scanner;

public class Main {
	// newBoard함수는 게시글 작성기능인데 왜 Handler에 포함시키지 않는가?
	// Main 클래스에서만 사용자와의 입출력 상호작용을 하도록 설정하기 위해서
	static Board newBoard(Scanner sc) {
		String title;
		String writer;
		String content;
		System.out.print("제목 입력 : ");
		title = sc.nextLine();
		System.out.print("작성자 입력 : ");
		writer = sc.nextLine();
		System.out.print("내용 입력 : ");
		content = sc.nextLine();
		Board board = new Board(title, writer, content);
		return board;
	}
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		int num;
		Board board;
		int menu;
		
		while(true) {
			System.out.println("1. 목록");
			System.out.println("2. 작성");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:		// 목록 출력
				handler.showList();
				break;
			case 2: 	// 게시글 작성 및 추가
				board = newBoard(sc);
				handler.add(board);
				break;
			case 3:		// 단일 게시글 조회 (내용까지 열람)
				System.out.print("열람할 글 번호를 입력 : ");
				num = Integer.parseInt(sc.nextLine());
				handler.show(num);
				break;
			case 4:		// 단일 게시글 삭제
				System.out.print("삭제할 글 번호를 입력 : ");
				num = Integer.parseInt(sc.nextLine());
				handler.delete(num);
				break;
			case 0:		// 프로그램 종료
				System.out.println("프로그램을 종료합니다");
				sc.close();
				return;
			}
		}
	}
}
