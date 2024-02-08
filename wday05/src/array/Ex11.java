package array;

public class Ex11 {
	public static void main(String[] args) {
		// 3개의 배열
		String[] nameArray = 	{ "도경수", "이지은", "김민정", "장원영", "최수종" };
		int[] ageArray = 		{ 31, 	   30, 		23, 	19, 	 61		};
		boolean[] adultArray = 	new boolean[nameArray.length];
		
		// ㅇㅇㅇ님은 nn살이고, 성인/미성년자 입니다
		
		for(int i = 0; i < ageArray.length; i++) {
			int age = ageArray[i];
			adultArray[i] = age >= 20;
		}
		
		for(int i = 0; i < nameArray.length; i++) {	// 반복이 수행될때 마다 내부 변수의 값이 바뀐다
			String name = nameArray[i];
			int age = ageArray[i];
			String adult = adultArray[i] ? "성인" : "미성년자";
			System.out.printf("%s님의 나이는 %d살이고, %s입니다\n", name, age, adult);
		}
	}
}
