package array;

// 대상이 존재하지 않는데 (값이 null) 대상의 속성이나 기능에 접근을 시도하면 NullPointerException 발생

class Human {	// 내가 만드는 새로운 자료형
	String name;	// 문자열 형태의 이름 (멤버 필드)	
	int age;		// 정수 형태의 나이
	
	// Human 자료형으로 생성한 데이터는 내부에 문자열 이름과, 정수 나이를 함께 저장할 수 있다
	
	void show() {	// 저장된 데이터를 일정한 형식으로 출력하는 함수 (멤버 메서드)
		System.out.printf("%s님의 나이는 %d살입니다\n", name, age);
		// 기능 = function = 함수
	}
	
	Human(String name, int age) {	// 생성자 : 클래스가 객체를 생성할 때 초기 작동을 지정하는 함수
		this.name = name;	// 외부에서 넘어온 매개변수의 값을 내부 멤버 필드에 저장한다
		this.age = age;		// 매개변수와 멤버필드의 이름이 같아서 겹치기 때문에, 필드를 가리키기 위해 this 사용
	}
}

public class Ex07 {
	public static void main(String[] args) {
//		String[] nameArray = 	{ "도경수", "이지은", "김민정", "장원영", "최수종" };
//		int[] ageArray = 		{ 31, 	   30, 		23, 	19, 	 61		};
		
		// 배열은 같은 자료형의 데이터만 묶을 수 있다
		// primitive 및 문자열만 이용해서는 보다 상세한 형태의 데이터를 나타내기 힘들다
		// 내가 원하는 자료형을 별도로 만들어서 쓸 수 있어야 한다
		
		Human ob1 = new Human("도경수", 31);
		Human ob2 = new Human("이지은", 30);
		Human ob3 = new Human("김민정", 23);
		Human ob4 = new Human("장원영", 19);
		Human ob5 = new Human("최수종", 61);
		
		Human[] arr = { ob1, ob2, ob3, ob4, ob5 };
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
		System.out.println();
		
		// Human 클래스로 생성한 객체를 나이 기준 정렬해서 다시 출력하기
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i].age - arr[j].age > 0) {	// 나이를 비교하여
					Human tmp = arr[i];			// 객체의 자리를 교체한다
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
		
	}
}





