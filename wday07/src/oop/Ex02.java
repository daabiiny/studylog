package oop;

import java.util.Arrays;

class Test2 {
	int[] container = { 10, 20, 30, 40, 50 };	// 아이템을 담고 있는 자판기 물품 보관소
	int money = 0;								// 자판기의 동전 보관소
	
	// 외부에서 getItem 함수를 호출하기 위해서 cost를 지불하고
	// 값이 비어있지 않은 슬롯(배열의 i번째 칸)에서 아이템을 하나 꺼내서 외부로 다시 반환하는 기능
	int getItem(int cost) {	// 메서드 : 방법, 방식
		int item = 0;								// 마지막에 반환할 아이템 변수
		for(int i = 0; i < container.length; i++) {	// 배열의 처음부터 끝까지 순서대로 조회
			if(container[i] != 0) {					// 만약 i번째 칸이 빈칸이 아니면
				item = container[i];				// i번째 아이템을 담고
				container[i] = 0;					// 원래 자리에는 0을 넣어서 아이템이 비었음을 표시
				money += cost;						// 지불받은 돈을 보관
				break;								// 반복을 중단
			}
		}
		if(item == 0) {		// 만약 배열전체를 순회했는데도, 아이템이 없다면 
			item = cost;	// 지불한 비용을 아이템에 담아서 반환하기
		}
		return item;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Test2 ob = new Test2();			// 자판기 역할의 객체
		int item1 = ob.getItem(100);	// 100원을 지불하고 내부 아이템 10을 꺼내서 반환받았음
		System.out.println("item1 : " + item1);
		System.out.println(Arrays.toString(ob.container));
		System.out.println();
		
		int item2 = ob.container[1];	// Ex02클래스에서 Test2의 내부로 접근이 허용되기 때문에
		ob.container[1] = 0;			// 직접 손을 넣어서 원하는 아이템을 꺼냈다 (비용 지불 X)
		
		// item2는 클래스 작성자의 의도대로 진행되지 않았다
		System.out.println("item2 : " + item2);
		System.out.println(Arrays.toString(ob.container));
		System.out.println();
		
		System.out.println("ob.money : " + ob.money);
		
		// 위 예시처럼, 클래스 작성자의 의도대로 코드를 진행시키기 위해서 접근제한자가 필요하다
		// 클래스 내부 데이터에 직접 접근하는 것을 막기 위해 필드는 보통 private으로 설정한다
		// 원하는 작동대로 진행하기 위해서, 미리 만들어둔 함수(메서드)는 접근을 허용하기 위해 public으로 설정한다
	}
}
