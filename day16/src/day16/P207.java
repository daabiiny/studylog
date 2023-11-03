package day16;

import java.util.Scanner;

public class P207 {
	
	public static void main(String[] args) {
		
		String name;	// 학생이름
		int ban;		// 반
		int no;			// 번호
		int kor;		// 국어점수
		int eng;		// 영어점수
		int math;		// 수학점수
		
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
		System.out.println();
		
		System.out.println("이름:" + s.getName());
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		while(true) {
			System.out.println("1. 학생 추가 등록");
			System.out.println("2. 학생 전체 목록");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				System.out.print("학생 이름 : ");
				name = sc.nextLine();
				System.out.print("반 : ");
				ban = Integer.parseInt(sc.nextLine());
				System.out.print("번호 : ");
				no = Integer.parseInt(sc.nextLine());
				System.out.print("국어 점수 : ");
				kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 점수 : ");
				eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 점수 : ");
				math = Integer.parseInt(sc.nextLine());
//			case 2:
//				arr.showList();
//				break;
			case 0:
				sc.close();
				return;
				
			}
		}
	}
}
class Student{

	private String name;	// 학생이름
	private int ban;		// 반
	private int no;			// 번호
	private int kor;		// 국어점수
	private int eng;		// 영어점수
	private int math;		// 수학점수
	Student[] arr = new Student[5];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void showList() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%s,%d,%d,%d,%d,%d", name, ban, no, kor, eng, math);
			}
		}
	}
	
	Student (String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		int sum = kor + eng + math;
		float avg =  Float.valueOf(String.format("%.1f", sum / 3.0));
		String answer = name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + sum + "," + avg;
	
		return answer; 
	}
	int getTotal() {

		int total = kor + eng + math;
		return total;
		
	}
	float getAverage() {

		int sum = kor + eng + math;
		float avg = Float.valueOf(String.format("%.1f", sum / 3.0));
		return avg;
		
	}
	
}