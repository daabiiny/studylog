package stdout;

public class Ex02 {
	public static void main(String[] args) {
		// 서식 제어 문자와 이스케이프 시퀀스
		// 서로 다른 여러 값을 일정한 형식으로 통일해서 출력하고 싶을때 서식을 사용한다
		
		String cpuName = "인텔 코어i7-14세대 14700K";
		int cpuPrice = 622000;
		
		String boardName = "ASRock B760M Pro RS D5 에즈윈";
		int boardPrice = 177120;
		
		String ramName = "삼성전자 DDR5-5600 (16GB) x2";
		int ramPrice = 127600 * 2;
		
		String vgaName = "이엠텍 지포스 RTX 4060 D6 8G";
		int vgaPrice = 437400;
		
		String ssdName = "삼성전자 PM9A1 M.2 NVMe (1TB)";
		int ssdPrice = 109080;
		
		String hddName = "WD BLUE 5640/128M (8TB)";
		int hddPrice = 182000;
		
		String form = "%s  \t가격 : %,7d\n";
		System.out.printf(form, cpuName, cpuPrice);
		System.out.printf(form, boardName, boardPrice);
		System.out.printf(form, ramName, ramPrice);
		System.out.printf(form, vgaName, vgaPrice);
		System.out.printf(form, ssdName, ssdPrice);
		System.out.printf(form, hddName, hddPrice);
		System.out.printf(form, "앱코 G40 시그니처\t\t", 59130);
		
		// printf함수는 서로 다른 여러 값을 출력할 때 일정한 형식으로 출력할 수 있다
		// 한두개의 값이면, 사람이 직접 처리하는 경우도 가능하다
		// 직접 처리하기 힘든정도로 많은 양의 데이터를 처리하기 위해서 프로그램을 쓰게 된다
	}
}
