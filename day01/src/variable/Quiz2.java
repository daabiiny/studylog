package variable;

public class Quiz2 {
	public static void main(String[] args) {
		// �ڽ��� �̸��� ���ڿ� ������ �����ϼ���
		
		String name = "���ٺ�";
		
		// �ڽ��� ���̸� ������ ������ �����ϼ���
		
		int age = 29;		
		Integer age2 = 29;
		
		// ���ο� �Ǽ��� ������ 0�� �����ϼ���
		
		double n1 = 0;					// �캯�� 0�� �ڷ����� ��õ��� ���� ���ͷ�������, ���ͷ� ������ �⺻�ڷ����� int�̴�
		Double n2 = (double) 0;			// Type mismatch : cannot convert from int to Double
//		Double n2 = 0.0;
// 		Double n2 = Double.valueof(0);		
		
		
		// ��� ���� �Ǽ��� ������ 3.14�� �����ϼ���
		
		n1 = 3.14;
		n2 = 3.14;
		
		// ���ݱ��� ���� 3���� ������ ��� ���� ���� ���پ� ȭ�鿡 ����ϼ���
		
		System.out.println("�� �̸��� : " + name);
		System.out.println("�� ���̴� : " + age);
		System.out.println(n1);
		
		System.out.println("�� �̸��� : " + name);
		System.out.println("�� ���̴� : " + age2);
		System.out.println(n2);
		
		
		//(primitive�� �̿��ؼ� �ѹ�, WrapperClass�� �̿��ؼ� �ѹ� �ڵ带 �����ϼ���)
		
		 
	}

}
