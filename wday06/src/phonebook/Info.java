package phonebook;

public class Info {	// 전화번호부 단일 자료형을 나타내는 클래스

	String name;		// 이름
	String pnum;		// 전화번호
	boolean favorite;	// 즐겨찾기 (기본값은 false)
	
	public String toString() {
		String form = "%s : %s (%s)";
		return String.format(form, name, pnum, favorite ? "★" : "☆");
	}
	
	Info(String name, String pnum) {
		this.name = name;
		this.pnum = pnum;
	}
	Info(String name, String pnum, boolean favorite) {
		// 생성자 내부에서 다른 생성자를 호출할 수 있다. this() 를 사용하며, 생성자의 첫 줄에서만 가능하다
		this(name, pnum);
		this.favorite = favorite;
	}
}
