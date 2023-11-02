package tv;

import java.util.Scanner;

class TV{
	
	// 필드 (변수)
	boolean power = false;
	int channel;
	int volume;
	
	int minCh = 1;
	int maxCh = 15;
	int minVl = 0;
	int maxVl = 10;
	int saveVolume;
	
	// 생성자
	// 매개변수로 받지 않아도 초기값을 지정할 수 있습니다
	// 에를 들면 채널의 초기값이 0인것은 이상합니다. 다른 값이 초기값이 되도록 하세요
	TV(){
		power = false;
		channel = 5;
		volume = 3;
	}
	
	// 메서드
	// 전원 on/off
	void turn() {
		power = !power;
		if(power == true) {
			System.out.println("tv를 켭니다");
		}
		else System.out.println("tv를 끕니다");
	}
	
	// 채널 올림 (채널은 최대값을 넘기면 최소값으로 변해야 한다)
	void channelUp() {
		if(power) {					// 전원이 켜져있으면
			channel++;				// 채널을 변경하고
			if(channel > maxCh) {	// 추가 보정이 필요하면
				channel = minCh;	// 값을 수정하고
			}
			show();					// 그 결과를 화면에 출력한다
		}
	}
	
	// 채널 내림 (채널은 최대값을 넘기면 최대값으로 변해야 한다)
	void channelDown() {
		if(power) {
			channel--;
			if(channel < minCh) {
				channel = maxCh;
			}
			show();	
		}
	}
	
	// 볼륨 올림 (볼륨은 최대값을 넘기면 최대값으로 변해야 한다)
	void volumeUp() {
		if(power) {
			volume++;
			if(volume > maxVl) {
				volume = maxVl;
			}
		}
		show();
	}
	
	// 볼륨 내림 (볼륨은 최소값을 넘기면 최소값으로 변해야 한다)
	void volumeDown() {
		if(power) {
			volume--;
			if(volume < minVl) {
				volume = minVl;
			}
		}
		show();
	}
	
	// 음소거 (마지막으로 저장된 볼륨값을 복사해두었다가, 다시 불러와야 한다)
	void mute() {
		if(power) {
			int tmp = volume;
			volume = saveVolume;
			saveVolume = tmp;
		}
		show();
	}
	
	// 화면 출력 (전체 TV의 채널과 볼륨상태를 보여줄 수 있어야 한다)
	void show() {
		
			System.out.println("┌─────────────────┐");
			System.out.printf("│    ch  : %2d\t  │\n", channel);
			System.out.printf("│    vol : %2d\t  │\n", volume);
			System.out.println("└─────────────────┘");
	}
}

public class main {
	// 만들어진 TV클래스의 객체를 생성하고
	// 사용자의 입력을 받아서, 입력에 따라 TV의 기능을 호출하는 클래서
	// (사용자) <-> (Main) <-> (TV)
	
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
			case 5:
				tv.turn();
				break;
			case 7:
				tv.channelUp();
				break;
			case 1:
				tv.channelDown();
				break;
			case 9:
				tv.volumeUp();
				break;
			case 3:
				tv.volumeDown();
				break;
			case 6:
				tv.mute();
				break;
			case 0:
				break LOOP;
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}