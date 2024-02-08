package oop;

class Test1 {
	// accessModifier
	// 접근제한자 : 클래스 내부 멤버 요소에 대해 외부에서 접근할 때, 공개 허용 범위를 설정
	// 객체 내부의 어떤 요소에 대해, 외부에서 함부로 접근하여 값을 수정하면 안되는 경우를 보호하기 위해서
	
	private int n1 = 10;		// 클래스 내부에서만 접근을 허용한다. 모든 외부로부터의 접근 불가
	/* package */ int n2 = 20;	// 같은 패키지 내부에서의 접근을 허용한다
	protected int n3 = 30;		// 같은 패키지 + 상속관계에서의 접근을 허용한다
	public int n4 = 40;			// 모든 외부로부터의 접근을 허용한다
}

public class Ex01 {
	public static void main(String[] args) {
		Test1 ob = new Test1();
		
//		System.out.println(ob.n1);	// The field Test1.n1 is not visible
		// Test1.n1 은 외부로부터의 접근을 허용하지 않았기 때문에 필드에 접근하여 값을 출력할 수 없다
		// Test1클래스와 Ex01클래스는 서로 다른 클래스이기 때문에 Test1기준으로는 외부로 판단한다
		
		System.out.println(ob.n2); 	// 접근제한자를 작성하지 않으면 package로 처리된다
		// Test1클래스와 Ex01클래스는 서로 다른 클래스이지만, 같은 패키지 oop에 포함되어 있어서 접근허용
		
		System.out.println(ob.n3); 	// protected : package + 상속관계에 대한 허용
		// 두 클래스가 서로 상속관계는 아니지만, 같은 패키지 내부에 있어서 접근 허용
		
		System.out.println(ob.n4); 	// public : 외부로부터의 모든 접근을 허용
		// 서로 다른 클래스에서의 접근도 모두 허용
	}
}
