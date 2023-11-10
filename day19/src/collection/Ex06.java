package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex06 {
	public static void main(String[] args) {
		Random ran = new Random();
		HashSet<Integer> set = new HashSet<>();	// 중복 처리에 사용
		
		while(set.size() != 6) {	// set의 size가 6이면 반복을 종료한다
			int num = ran.nextInt(45) + 1;
			System.out.println("num : " + num);
			set.add(num);
		}
		ArrayList<Integer> list = new ArrayList<>(set);	// 정렬에 사용
		list.sort(null);
		System.out.println("set : " + set);
		System.out.println("list : " + list);
		
		Random ran1 = new Random();
		HashSet<Integer> set1 = new HashSet<>();
		
		while(set1.size() != 6) {
			int num1 = ran1.nextInt(45) + 1;
			set1.add(num1);
		}
		ArrayList<Integer> list1 = new ArrayList<>(set1);
		list1.sort(null);
		System.out.println(set1);
		System.out.println(list1);
	}
}
