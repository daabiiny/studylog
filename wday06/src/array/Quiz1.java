package array;

public class Quiz1 {
	public static void main(String[] args) {
		String[] nameArray = 	{ "도경수", "이지은", "김민정", "장원영", "최수종" };
		int[] ageArray = 		{ 31, 	   30, 		23, 	19, 	 61		};
		
		for(int i = 0; i < nameArray.length; i++) {
			System.out.printf("%s님의 나이는 %d살입니다\n", nameArray[i], ageArray[i]);
		}
		System.out.println();
		
		// 위 출력내용을 이름 기준 내림차순 정렬하여 다시 출력해보세요
		// 정렬할 때는 선택정렬 알고리즘을 이용하세요
		for(int i = 0; i < nameArray.length; i++) {
			for(int j = i; j < nameArray.length; j++) {
				if(nameArray[i].compareTo(nameArray[j]) < 0) {
					String tmp1 = nameArray[i];
					nameArray[i] = nameArray[j];
					nameArray[j] = tmp1;
					
					int tmp2 = ageArray[i];
					ageArray[i] = ageArray[j];
					ageArray[j] = tmp2;
				}
			}
		}
		
		
		for(int i = 0; i < nameArray.length; i++) {
			System.out.printf("%s님의 나이는 %d살입니다\n", nameArray[i], ageArray[i]);
		}
		System.out.println();
	}
}
