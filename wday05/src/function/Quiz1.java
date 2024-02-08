package function;

public class Quiz1 {
	// 세 정수를 전달받아서, 가장 큰 수를 반환하는 함수 getMaxNum을 정의하세요
	static int getMaxNum(int n1, int n2, int n3) {
		int max = Integer.MIN_VALUE;	// 정수 범위에서 가장 작은 수를 넣어둔다
										// 최대값을 구하기 위해서, 최소값을 준비한다
		if(max < n1) 	max = n1;	// 최대값보다 n1이 더 크면, n1의 값을 최대값에 저장한다
		if(max < n2) 	max = n2;
		if(max < n3) 	max = n3;
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(getMaxNum(2, 5, 3));		// 5
		System.out.println(getMaxNum(-100, 0, 5));	// 5
		System.out.println(getMaxNum(-3, -5, -7));	// -3
	}
}
