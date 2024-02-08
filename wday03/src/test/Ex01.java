package test;

public class Ex01 {
	public static void main(String[] args) {
		// 패키지는 관련있는 클래스를 묶어서 보관하는 폴더이다
		// 같은 패키지 내부에서는 똑같은 클래스 이름을 사용하지 않는다
		// 같은 클래스 이름의 파일이 있어도
		// 서로 다른 패키지에 포함되어 있으면
		// 다른 종류의 파일로 본다
		System.out.println(Ex01.class);
		
		System.out.println(java.util.Date.class);
		System.out.println(java.sql.Date.class);
	}
}
