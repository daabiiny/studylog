package function;

public class Ex05 {
	static boolean validateCardNumber(long cardNumber) {
		boolean isValid = false;
		int i = 1;								// 순번 (홀수번째, 짝수번째 체크)
		int total = 0;							// 각 자릿수의 합계
		while(cardNumber != 0) {				// 나누다보면 언젠가는 
			int num = (int)(cardNumber % 10);	// 뒤에서 한자리 떼어낸다
			cardNumber /= 10;					// 떼어낸 값은 제외시킨다
			if(i % 2 == 0) {				// 만약, 짝수번째이면
				num *= 2;					// 2를 곱한다
				if(num > 10) {					// 2를 곱한 값이 10보다 크면
					num = num / 10 + num % 10;	// 각 자릿수를 더해서 한자리수로 만든다
				}
			}
			total += num;					// 각 자릿수를 total에 더한다
			i++;
		}
//		System.out.println(total);
		isValid = total % 10 == 0;
		return isValid;
	}
	
	public static void main(String[] args) {
		long cardNum1 = 2720992711828767L;
		long cardNum2 = 3444063910462763L;
		long cardNum3 = 6011733895106094L;
		System.out.println(cardNum1 + " : " + validateCardNumber(cardNum1));
		System.out.println(cardNum2 + " : " + validateCardNumber(cardNum2));
		System.out.println(cardNum3 + " : " + validateCardNumber(cardNum3));
		
		// 카드번호 유효성 검증 함수 만들기 (Luhn 알고리즘)
		
		// 16자리의 카드번호를 전달받는다
		// 오른쪽부터 세어서 홀수번째는 그대로 두고, 짝수번째는 2배로 만든다
		// 만약, 2배로 만든 값이 10보다 크다면 각 자릿수를 합하여 한자리수로 만든다
		// 이렇게 만들어진 16개의 정수를 모두 더한다
		// 합계가 10으로 나누어 떨어지면 유효한 카드번호이다.
		
		// 카드번호를 전달받아서, 유효성을 true/false로 반환하는 함수를 작성하고 테스트하세요
		// 2720992711828767		true
		// 3444063910462763		false
		// 6011733895106094		true
	}
}
