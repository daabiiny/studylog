package polymorphism;

interface Person{
	void eat();
	void sleep();
}
class Act implements Person{

	@Override
	public void eat() {
		System.out.println("밥을 먹는다");
	}
	
	@Override
	public void sleep() {
		System.out.println("5시간 잔다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person person = new Act();
		person.eat();
		person.sleep();
	}
}


