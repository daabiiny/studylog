package oop;

class Circle{
	double radius;
	double area;
	double pi = 3.14;	// 필드에 초기값을 지정해두면, 생성자로 덮여쓰지 않는한
						// 모든 객체가 동일한 값을 지니게 된다
	
	// 반지름 radius를 전달받아서 저장하고,
	// 원의 넓이를 구하는 코드를 포함하는 생성자를 작성하세요
	Circle(int radius){ // -> 이 radius는 정수로 들어온 radius
		this.radius = radius;
		area = this.radius * this.radius * pi;	// this가 붙거나 같은이름이 없으면 멤버 필드를 참조
												// this.radius는 class안에 선언한 double(실수)형 radius
	}
	
	// 생성자를 오버로딩하여 정수, 혹은 실수형태로 전달받을 수 있도록 처리하세요
	Circle(double radius){
		this.radius = radius;
		area = radius * radius * pi;
	}
	
	// 원의 반지름과 넓이를 각각 출력하는 함수 show()를 정의하세요
	void show() {
		System.out.printf("원의 반지름은 : %.2f\n", radius);
		System.out.printf("원의 넓이는 : %.2f\n", area);
		
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Circle ob1 = new Circle(2);
		Circle ob2 = new Circle(3.2);
		ob1.show();
		ob2.show();
		
	}
	
}