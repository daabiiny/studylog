package abstraction;

abstract class Animal{
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void move() {System.out.println("이동한다");}
	public abstract void bark();
	// 짖는 소리는 동물마다 다르므로 추상메서드로 생성
}
class Cat extends Animal{
	public Cat(String name, int age) {
		super(name, age);
	}
	@Override
	public void bark() {
		System.out.println("야옹!");
	}
}
class Dog extends Animal{
	public Dog(String name, int age) {
		super(name, age);
	}
	@Override
	public void bark() {
		System.out.println("멍멍!");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Dog dog = new Dog("강아지", 2);
		Cat cat = new Cat("고양이", 3);
		
		dog.move();
		dog.bark();
		
		cat.move();
		cat.bark();
	}
}
