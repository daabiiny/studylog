package loop;

import java.io.File;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) throws Exception{
		String data = "";
		File f = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			data += sc.nextLine() + "\n";
		}
		sc.close();
		
		System.out.println(data);
		System.out.println();
		
//		문제) data 변수에 들어있는 글자 중에서 대문자의 개수는 총 몇개일까요?
		
		int count = 0;
		
		for(int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				count += 1;
			}
		}
		System.out.printf("data 변수에 들어있는 글자 중 대문자의 개수는 : %d개입니다\n", count);
		System.out.println();
		
//		위와 비슷한 문제
//		1에서 1000사이의 정수 중에서 13과 17의 공배수는 총 몇 개인지 출력하세요
		
		
		int count1 = 0;
		for(int i = 1; i <= 1000; i++) {
			if (i % 13 == 0 && i % 17 == 0) {
				count1 += 1;
			}
		}
		System.out.printf("13과 17의 공배수는 %d개입니다\n", count1);
		System.out.println();
		
		for(int i = 1; i <= 1000; i++) {
			if (i % 13 == 0 && i % 17 == 0) {
				System.out.println(i);
			}
		}
	}
}
