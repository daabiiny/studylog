package variable;

public class Ex06 {
	public static void main(String[] args) {
		
		// ���� ������ ������ ��, �ڷ����� ���ٸ� �ѹ��� ������ ���� �ִ�
		int n1 = 57, n2 = 32, n3 = 78;
		
		int total = n1 + n2 + n3;
		double avg = total / 3;				// �Ϲ��� ����ȯ, int�� double�� �ٲ�鼭 ���Եȴ�
//		double avg = total / (double)3;		// ����� ����ȯ, ������� �̸� double�� �ٲ㼭 ����Ѵ�
//		double avg = total / 3.0;
											// ���� ���꿡�� �º����� ������ �Ѱ��� �� �� �ִ�
		
		System.out.println("�հ� : " + total );
		System.out.println("��� : " + avg);

		
	}
}
