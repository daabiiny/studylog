package board;

import java.util.Arrays;

// 게시판 프로그램의 기능과 데이터 저장을 담당하는 클래스

public class Handler {
	
	// 데이터를 저장하기 위한 배열
	private Board[] arr = new Board[100];
	
	public Handler() {	// 객체를 생성할 때 수행되는 작업 (생성자)
		// 미리 게시글 샘플 데이터를 생성해둔다
		arr[0] = new Board("[공지] 게시판 테스트입니다", "관리자", "TUI형태의 게시판 프로그램입니다");
		arr[1] = new Board("[공지] 게시판 기능 안내", "관리자", "목록, 작성, 열람, 삭제");
		arr[2] = new Board("안녕하세요", "관리자", "게시판 테스트 입니다");
		arr[3] = new Board("안녕하세요2", "관리자", "게시판 테스트2 입니다");
	}
	
	// 게시글을 정렬하여 목록을 보여주는 기능
	public void showList() {
		// 배열 내부의 각 게시글 a, b를 비교하여 정렬한다
		Arrays.sort(arr, (a, b) -> {
			if(a != null && b != null) {	// a, b 둘다 null이 아닐때
				return b.getNum() - a.getNum();	// 게시글 번호를 비교하여 내림차순으로 정렬한다
			}
			return 0;
		});
		Arrays.sort(arr, (a, b) -> {		
			if(a != null && b != null) {	// a, b 둘다 null이 아닐때
				return a.getTitle().startsWith("[공지]") ? -1 : 1;
				// 공지는 무조건 맨 위로 올린다
			}
			return 0;
		});
		
		for(int i = 0; i < arr.length; i++) {	// 배열을 처음부터 끝까지 순서대로 조회하여
			Board board = arr[i];				// i번째 요소를 board라고 할 때
			if(board != null) {					// board가 null이 아니면
				System.out.printf("%d) %s (%s)\n", 	// 번호, 제목, 작성자를 한 줄에 출력한다
						board.getNum(), board.getTitle(), board.getWriter());
			}
		}
		System.out.println();
	}	// end of showList()
	
	// 게시글 열람
	public void show(int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getNum() == num) {
				System.out.println("번호 : " + arr[i].getNum());
				System.out.println("제목 : " + arr[i].getTitle());
				System.out.println("작성자 : " + arr[i].getWriter());
				System.out.println("내용 : " + arr[i].getContent());
				System.out.println();
				return;
			}
		}
		System.out.println("번호가 일치하는 게시글이 없습니다");
		System.out.println();
	}

	// 게시글 추가
	public void add(Board board) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {	// 빈칸을 찾아서	
				arr[i] = board;		// 게시글을 담는다
				break;
			}
		}
	}
	
	// 게시글 삭제
	public void delete(int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getNum() == num) {	// 빈칸이 아니고 번호가 일치하면
				arr[i] = null;		// 빈칸으로 만들어버린다
			}
		}
	}
}






