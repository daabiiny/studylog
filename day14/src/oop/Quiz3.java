package oop;

import java.util.Scanner;

class TV{
	// TV의 속성을 필드로 작성하세요
	// 전원, 채널, 볼륨 그 외 필요하다고 생각하는 필드를 자유롭게 작성하세요
	boolean power;
	int channelUp;
	int channelDown;
	int channelNow;
	int volumeUp;
	int volumeDown;
	int volumeNow;
	int mute;
	
	
	// TV의 기능을 메서드로 정의하세요
	// 전원 on/off, 채널올림/내림, 볼륨올림/내림, TV상태 출력, 음소거
	// 채널은 일정 범위 안에서 cycle형식으로 순환되어야 합니다
	// 볼륨은 일정 범위 안에서 최소 최대치를 넘길수 없습니다
	// 음소거는 한번누르면 볼륨이 0이 되었다가 다시 누르면 원래 볼륨으로 복구되어야 합니다
	// 대부분의 기능은 전원이 켜져있는 상태에서만 작동해야 합니다
	void turn() {
		power = !power;
		if(power == true) {
			System.out.println("tv를 켭니다");
		}
		else System.out.println("tv를 끕니다");
	}
	
	void channelUp() {
		int num1 = channelUp % 10;
			System.out.printf("%d번 채널입니다", num1);
			channelUp++;
			channelNow = num1;
	}
	
	void channelDown() {
		channelDown = channelNow - 1 ;
		channelNow--;
		
		if (channelNow < 0) {
//			channelNow = -channelNow;
		}
		
		int num2 = channelNow % 10;
		System.out.printf("%d번 채널입니다", num2);
			
		}
		
	void volumeUp() {
		int volume = volumeUp;
		
		if (volume <= 10) {
			System.out.printf("현재 볼륨은 %d 입니다", volume);
			volumeUp++;	
		}
		else {
			System.out.println("더이상 볼륨을 올릴 수 없습니다");
		}
		volumeNow = volume;
	}
		
	
	void volumeDown() {
		volumeDown = volumeNow;
		int volume1 = volumeDown;
		
		if (volume1 <= 10) {
			System.out.printf("현재 볼륨은 %d 입니다", volume1);
			volumeDown--;
		}
		
		if (volume1 < 0) {
			System.out.println("더 이상 볼륨을 내릴 수 없습니다");
		}	
		
		
		}
	
	void mute() {
		
	}
		
}
	
	
	// 생성자에서 객체 생성시 초기값을 지정하세요
	// 매개변수로 받지 않아도 초기값을 지정할 수 있습니다
	// 에를 들면 채널의 초기값이 0인것은 이상합니다. 다른 값이 초기값이 되도록 하세요
	


public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		int menu;
		
		LOOP : while(true) {
			System.out.println("");
			System.out.println("");
			System.out.print("선택 >>> ");
			menu = sc.nextInt();
			switch(menu) {
			// 입력된 메뉴에 따라서 tv객체의 메서드를 호출하는 형태로 진행
			case 1:
				tv.turn();
				break;
			case 4:
				tv.channelUp();
				break;
			case 7:
				tv.channelDown();
				break;
			case 6:
				tv.volumeUp();
				break;
			case 9:
				tv.volumeDown();
				break;
			case 5:
				tv.mute();
			case 0:
				break LOOP;
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}
