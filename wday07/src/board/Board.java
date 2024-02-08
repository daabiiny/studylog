package board;

// 게시글 데이터의 형태를 정의하는 클래스

public class Board {

	private static int sequence;
	
	private int num;		// 게시글 번호
	private String title;	// 게시글 제목
	private String writer;	// 게시글 작성자
	private String content;	// 게시글 내용
	
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		num = ++sequence;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
