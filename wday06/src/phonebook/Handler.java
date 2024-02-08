package phonebook;

public class Handler {	// 전화번호부 프로그램의 주요 기능을 작성하는 클래스
	
	// 전화번호부 정보(Info)를 여러개 저장할 수 있는 배열
	Info[] arr = new Info[5];
	
	// 프로그램의 기능을 함수로 정의
	// 추가 기능
	void add(Info info) {
		for(int i = 0; i < arr.length; i++) {	// 배열 전체에서
			if(arr[i] == null) {		// 빈칸을 찾으면
				arr[i] = info;			// 빈칸에 전달받은 정보를 저장하고
				break;					// 반복을 중단한다
			}
		}
	}
	
	// 목록 출력 기능
	void showList() {
		for(int i = 0; i < arr.length; i++) {	// 배열 전체에서
			if(arr[i] != null) {			// 빈칸이 아닌 곳을 찾아서
				System.out.println(arr[i]);	// 출력한다
			}
		}
		System.out.println();
	}
	
	// 삭제 기능
	int delete(String pnum) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].pnum.equals(pnum)) {	// 일치하는 번호를 찾아서
				arr[i] = null;		// 객체를 삭제하고
				row = 1;			// 1이면 삭제 성공, 0이면 삭제 실패
				break;
			}
		}
		return row;	// 결과를 반환한다
	}

}
