package string;

public class Quiz1_db {
	public static void main(String[] args) {
//			주어진 문자열에서 알파벳만 가져와서 새로 구성된 문자열 s2를 출력하세요
//			무조건 다시 풀어보기!

			String s1 = "a1B2c3D4e5";
			String s2 = "";
			
			for(int i = 0; i < s1.length(); i++) {
				char ch = s1.charAt(i);
				if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
					s2 += ch;
				}
			}System.out.println("S2 : " + s2);
		
		
	}
}
