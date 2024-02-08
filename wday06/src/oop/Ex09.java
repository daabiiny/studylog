package oop;

class Product {	// 제품을 나타내기 위한 클래스
	
	// 제품을 구성하는 요소에는 무엇이 있는지?
	// 값은 필드에 저장하고, 기능은 메서드로 정의한다
	
	String name;
	int price;
	int salePrice;
	double score;
	
	public String toString() {	// 객체를 출력하면 원하는 형태의 문자열로 바꿔주는 기능
		String form = "%s : %,d (%,d) %.1f";
		return String.format(form, name, price, salePrice, score);
	}
	
	// 객체를 생성할 때 값을 미리 전달해서 객체에 저장하게끔 생성자를 작성한다
	Product(String name, int price, int salePrice, double score) {
		this.name = name;
		this.price = price;
		this.salePrice = salePrice;
		this.score = score;
	}
}

public class Ex09 {
	public static void main(String[] args) {
		// 일정한 형태의 여러 값을 묶어서 객체로 관리해야 할 때 클래스를 만들어서 사용한다
		Product ob1 = new Product("SNRD 런닝화", 22800, 21900, 4.5);
		Product ob2 = new Product("남성 스니커즈", 100000, 29800, 4);
		Product ob3 = new Product("휠라 펑키테니스", 55460, 27330, 4.5);
		
		System.out.println(ob1.toString());
		System.out.println(ob2);
		System.out.println(ob3);
		
		// 자바의 모든 객체는 출력하면 toString() 함수의 결과를 출력하게 되어 있다
		
		
	}
}
