package function;

public class Ex04 {
	static String getTime(int minute) {
		// 첫번째 줄에서는 반환자료형에 맞는 변수를 선언하고 초기값을 지정한다
		String time = "";
		int hour = minute / 60;	// 몫
		minute = minute % 60;	// 나머지
		if(minute == 0) {
			time = hour + "시간";
		}
		else {
			time = String.format("%d시간 %d분", hour, minute);
		}
		return time;
		// 마지막 줄에서는 첫줄에서 선언한 변수를 반환한다 (return)
	}
	public static void main(String[] args) {
		// 분을 전달받아서, 시간과 분으로 나누어서 문자열로 반환하는 함수
		// 단, 분이 0이면 시간만 문자열로 반환하기

		// 입력 : 75
		// 출력 : 1시간 15분
		// 입력 : 120
		// 출력 : 2시간
		System.out.println(getTime(75));
		System.out.println(getTime(120));
		System.out.println(getTime(1000));
		System.out.println(getTime(1440));
	}
}
