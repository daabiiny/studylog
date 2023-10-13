package operator;

public class Ex08 {
	public static void main(String[] args) {
		// 비트 연산
		
		int n1 = 4;	// n1 = 100
		int n2 = 5;	// n2 = 101
		
		int a1 = n1 & n2;		// 비트 & 연산은 이진수일때 각 자리가 모두 1이면 1, 아니면 0
		int a2 = n1 | n2;		// 비트 | 연산은 이진수일떄 각 자리중 하나라도 1이 있으면 1, 아니면0
		int a3 = n1 << 1;		// 비트 시프트 연산 <<은 이진수 모양에서 각 자리수를 왼쪽으로 옮기기
		int a4 = n2 >> 1;		// 비트 시프트 연산 >>은 이진수 모양에서 각 자릿수를 오른쪽으로 옮기기
		int a5 = n1 << 2;		// 왼쪽으로 2칸씩 옮기기
		
		System.out.println("n1 : " + Integer.toBinaryString(n1));	// 10진수의 형태를 2진수의 형태로
		System.out.println("n2 : " + Integer.toBinaryString(n2));
				
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
	}

}
