package day09;

class Solution	{
	public boolean solution(String cardNumber) {
		
//		0) 최초 문제 풀이에서는 1개의 값을 처리하는 코드를 작성해야한다
//		1) 카드번호에 -가 포함되어 있다면 제거해야한다
		String s1 = cardNumber.replace("-", "");
		int sum = 0;	// 합계를 저장할 변수
		
//		2) 문자열에서 각 자리의 글자를 계산할 수 있는 숫자로 추출해야한다
		for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);	// char
			int num = ch - 48;		// int
//			int num = Character.getNumericValue(ch);
//			int num = Integer.parseInt(s1.substring(i, i + 1));
		
//		3) 왼쪽부터 INDEX를 기준으로 세어서 짝수는 2배, 홀수는 그대로 둔다
		if(i % 2 == 0) {
			num = num * 2;
		
//		4) 만약 2배한 값이 두자리수이면(10이상이면), 각 자릿수를 합한다
			if (num >= 10) {
				num = (num / 10) + (num % 10);
			}
		}
//		5) 16개의 숫자의 합계를 구할 변수가 준비되어 있어야 한다
		sum += num;
		}
		return sum % 10 == 0;
		
	}	// end of funcion solution()
}		// end of class Solution

public class Luhn {
	public static void main(String[] args) {
		
		String input = "1162-3434-1010-2111";	// 유효
		String input2 = "1162-3434-1010-2113";	// 유효하지 않음
//		!! 캐릭터에 숫자 넣을때는 변수선언할때만, 출력할떄는 글자로 취급됨 
		
//		6) 검증이 끝나면 함수형태로 변경하여 여러 값을 처리할 수 있도록 한다
		Solution s = new Solution();
		System.out.println("input이 유효한가 : " + s.solution(input));
		System.out.println("input2이 유효한가 : " + s.solution(input2));
		
	}
}
