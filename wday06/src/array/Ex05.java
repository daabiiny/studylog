package array;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		
		String[] nameArray = 	{ "도경수", "이지은", "김민정", "장원영", "최수종" };
		int[] ageArray = 		{ 31, 	   30, 		23, 	19, 	 61		};
		
		for(int i = 0; i < nameArray.length; i++) {
			System.out.printf("%s님의 나이는 %d살입니다\n", nameArray[i], ageArray[i]);
		}
		System.out.println();
		
		// 나이를 기준으로 오름차순 정렬하기
//		Arrays.sort(ageArray);
		for(int i = 0; i < nameArray.length; i++) {
			for(int j = i; j < nameArray.length; j++) {
				
				if(ageArray[i] > ageArray[j]) {	// 나이를 기준으로 비교하여
					int tmp1 = ageArray[i];		// 자리를 바꿀때
					ageArray[i] = ageArray[j];
					ageArray[j] = tmp1;
					
					String tmp2 = nameArray[i];	// 같은 인덱스의 이름(문자열)도 바꾼다
					nameArray[i] = nameArray[j];
					nameArray[j] = tmp2;
				}
			}
		}
		
		for(int i = 0; i < nameArray.length; i++) {
			System.out.printf("%s님의 나이는 %d살입니다\n", nameArray[i], ageArray[i]);
		}
		System.out.println();
	}
}
