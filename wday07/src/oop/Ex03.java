package oop;

import java.util.Arrays;

class Test3 {
	// 필드는 외부에서 직접 접근할 수 없다
	private int[] container = { 10, 20, 30, 40, 50 };	
	private int money = 0;								
	
	// 메서드는 어디서나 접근할 수 있다
	public int getMoney() {	// money의 값을 변경할 수는 없으나
		return money;		// 현재 money의 값이 얼마인지 확인은 가능하다
	}
	
	public String showContainer() {			// container에 직접 접근하여 아이템을 가져갈 수는 없고
		return Arrays.toString(container);	// 현재 container에 어떤 값들이 있는지 확인만 가능
	}
	
	public int getItem(int cost) {
		int item = 0;			
		for(int i = 0; i < container.length; i++) {
			if(container[i] != 0) {					
				item = container[i];				
				container[i] = 0;					
				money += cost;						
				break;								
			}
		}
		if(item == 0) {		 
			item = cost;	
		}
		return item;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Test3 ob = new Test3();
		
		// 아이템을 직접 가져올 수 없다
		// int item1 = ob.container[0];
		// The field Test3.container is not visible
		// 접근제한자에 의해 접근이 막히면, 필드가 있다/없다를 구분하는 게 아니라 보이지 않는다 라고 판단
		
		// 클래스에서 제공하는 방식(메서드)을 이용하면 아이템을 순차적으로 꺼내올 수 있다
		System.out.println(ob.showContainer());
		
		int item1 = ob.getItem(100);
		System.out.println("item1 : " + item1);
		System.out.println(ob.showContainer());
		
		int item2 = ob.getItem(200);
		System.out.println("item2 : " + item2);
		System.out.println(ob.showContainer());
		
	}
}














