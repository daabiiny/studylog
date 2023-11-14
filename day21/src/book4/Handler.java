package book4;

import java.util.ArrayList;

// 데이터 저장소(배열 -> 리스트 -> 파일 -> DB)를 직접 참조하거나, 연결할 수 있음
// 프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스

// Handler
// book3 -> book4 기능이 짧아짐 
// main이 너무 길어지면 흐름 파악이 어려움
// 주요 기능을 남겨두고 상세 기능을 Handler로 옮김

public class Handler {
	
	// 1) 데이터 저장소
//	private Book[] arr = new Book[10];				// 여러 Book 객체를 저장하기 위한 배열
	// 배열은 자료형에 맞는 0값으로 초기화된다
	// 참조형 변수(클래스 타입 변수)의 초기값은 null
	
	// 배열에서 리스트로 전환 (배열의 자료형 Book은 리스트의 제네릭 타입이 된다)
	/*		array				list
		arr.length				list.size()
		arr[i]					list.get(i)
		arr[i] = ob				list.add(ob)
		arr[i] = null			list.remove(i)
								list.remove(ob)
	*/
	
	private ArrayList<Book> list = new ArrayList<>();
	
	// 2) 기능
	// 배열을 전달받아서, 배열 내부의 각 객체를 서식에 맞게 출력하는 함수 (case 1)
	public void showList() {
		// 4가지 방법
		// (1) index를 사용하는 for문
//		for(int i = 0; i < list.size(); i++) {
//			Book ob = list.get(i);	
//			System.out.println(ob);
//		}
		
		// (2) 향상된 for문(index를 사용하지 않음)
//		for(Book ob : list) {
//			System.out.println(ob);
//		}
		
		// (3) 람다식 + 컬렉션 forEach()
		list.forEach(ob -> System.out.println(ob));
		
		// (4) 메서드 참조
//		list.forEach(System.out::println);	// :: 메서드 참조 연산자
	}

	// 도서 추가
	public int insertBook(Book ob) {
		int row = 0;
//		for(int i = 0; i < arr.length; i++) {	// 배열의 처음부터 끝까지 순회하면서
//			if(arr[i] == null) {				// 빈칸을 찾았다면
//				arr[i] = ob;					// 값이 준비된 객체를 넣으면 끝
//				row = 1;						// ★ 반환값을 1로 해줘야하는데 안적으면 0이라서 추가실패라 뜸
//				break;	// 다음칸에 또 값을 넣으면 안되니까 break (반복 중단)
//			}
//		}
		boolean flag = list.add(ob);			// 추가 성공하면 true가 반환된다
		row = flag ? 1 : 0;						// true이면 row가 1, 아니면 row가 0
		return row;
	}
	
	// 도서 이름을 전달받아서, 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	public int deleteBook(String name) {
			int row = 0;
//			for(int i = 0; i < arr.length; i++) {
//				if(arr[i] != null && arr[i].getName().equals(name)) {	
//									// arr[i] != null은 nullPointerException 생김 방지
//					arr[i] = null;	// 참조변수가 객체를 참조하지 않도록 한다
//									// 모두에게서 잊혀진 참조변수는 소멸한다
//					row = 1;		// 삭제했다는 결과를 반환하기 위해 row값을 1로 설정한다
//					break;			// 하나 지웠으면 중단한다
//				}
//			}
			boolean flag = list.removeIf(ob -> ob.getName().equals(name));
			// removeIf를 name값으로 지우는데 이름이 같은 경우 같은 이름값이 다 지워질 수 있음
			// 따라서 객체에 고유성을 부여할 수 있는 기본키(식별고유번호)가 필요함
			
			row = flag ? 1 : 0;
			return row;
			
		}
		
		
		
}
