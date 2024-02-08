package loop;

import java.io.File;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		// 정해진 횟수만큼 반복을 수행할때도 while을 사용하지만
		// 반복횟수가 코드상에 명확하게 드러나지 않는 경우도 있다
		// (아래 코드는 파일의 줄 수가 변하면, 반복 횟수도 자동으로 변한다)
		
		File f = new File("hello.txt");		// 현재 위치에서 hello.txt 라는 파일을 지정한다
		Scanner sc = new Scanner(f);		// 파일의 내용을 읽어낼 수 있는 Scanner를 생성
		
		while(sc.hasNextLine()) {		// 파일에 아직 처리하지 않은 다음줄이 있으면
			String str = sc.nextLine();	// 다음 한 줄을 문자열 형태로 불러온다
			System.out.println(str);	// 화면에 한 줄을 출력한다
			Thread.sleep(300);			// 0.3초 대기한다
		}
		System.out.println("끝");
		sc.close();		// 반복이 끝나면 Scanner 를 close 처리한다
	}
}
