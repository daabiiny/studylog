package string;

public class Quiz3 {
	public static void main(String[] args) {
		
		/* 문제 풀어보기
		16자리의 카드번호를 문자열로 입력받아서 replace('-', '')
		카드번호의 오른쪽 끝에서부터 세어서
		홀수번째는 그대로 두고
		짝수번째는 2를 곱한다
		만약 2를 곱한 숫자가 두자리수이면
		각 자리수를 더해서 한자리 수로 만든다
		이렇게 만들어진 16개의 한자리숫자를 모두 더하여
		그 합이 10으로 나누어 떨어지면 유효한 카드번호
		그렇지 않으면 유효하지 않은 카드번호이다/
		(Luhn 알고리즘)
		
		카드번호를 입력받아서 유효성을 검증하는 코드를 작성하세요
		(String, char, int, /, %, +)
		*/
		
//		String input = "1162-3434-1010-2111";	// 유효
//		홀수는 그대로 짝수는 2배
//		21[12]2-6464-2020-4121
//		2132-6464-2020-4121
		
		String input = "1162-3434-1010-2113";	// 유효하지 않음
		input = input.replace("-", "");
		
//		인덱스를 기준으로 
		
		char[] arr = input.toCharArray();
		System.out.println(arr);
		int sum = 0;
		
		for(int i = input.length() - 1; i >= 0; i--) {
			char ch = arr[i];
			int num = ch - 48;
			if (i % 2 == 0) {
				num *= 2;

			}
			if (num >= 10) {
				num = ( num / 10 ) + ( num % 10 );
			
			} 
			sum += num;
			
		}
		if (sum % 10 == 0) {
			System.out.println("유효한 카드번호입니다");
		}
		else
			System.out.println("유효하지 않은 카드번호입니다");
	}
}
