package oop;

class Test7 {	// 게시글 목록에서의 단일 게시글을 나타내기 위한 클래스
	private static int seq = 0;		// 새 글이 작성될 때 마다 마지막 번호 + 1 을 넘겨주기 위한 필드
	
	private int idx;		// 글번호
	private String title;	// 제목
	private String writer;	// 작성자
	
	public Test7(String title, String writer) {
		idx = ++seq;			// 글 번호는 seq에 의해 자동으로 생성된다
		this.title = title;
		this.writer = writer;
	}
	
	public String toString() {
		return String.format("%d) %s | %s", idx, title, writer);
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Test7 t1 = new Test7("오늘은 토요일입니다", "test1");
		Test7 t2 = new Test7("이번주가 4주차, 마지막 주차입니다", "test2");
		Test7 t3 = new Test7("게시판 이용 안내 드립니다", "admin");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
	}
}
