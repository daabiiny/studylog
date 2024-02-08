package oop;

// getter, setter 자동으로 생성하기
// 1) 클래스 내부에 원하는 필드를 private으로 생성한다
// 2) 소스코드 저장 (ctrl + s)
// 3) 상단 메뉴 혹은 클래스 안에서 우클릭 후 source - generate getters and setters
// 4) 생성할 메서드의 접근제한자를 public으로 선택하고, 모두 체크한 다음 generate 버튼 클릭

class Test5 {
	private String name;
	private int age;
	private double height;
	private byte seq;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public byte getSeq() {
		return seq;
	}
	public void setSeq(byte seq) {
		this.seq = seq;
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Test5 ob1 = new Test5();
		ob1.setName("찬혁");		// ob1.name = "찬혁";
		ob1.setAge(25);			// ob1.age = 25;
		ob1.setHeight(175);		// ob1.height = 175;
		ob1.setSeq((byte)1);	// ob1.seq = (byte)1;
		
		Test5 ob2 = new Test5();
		ob2.setName("수현");
		ob2.setAge(22);
		ob2.setHeight(164);
		ob2.setSeq((byte)2);
		
		System.out.printf("%s, %d, %.1f, %d\n", 
				ob1.getName(), ob1.getAge(), ob1.getHeight(), ob1.getSeq());
		
		System.out.printf("%s, %d, %.1f, %d\n", 
				ob2.getName(), ob2.getAge(), ob2.getHeight(), ob2.getSeq());
	}
}















