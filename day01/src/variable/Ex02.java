package variable;

public class Ex02 {
	public static void main(String[] args) {
		
		// ������ �̸��� �ߺ��Ǹ� �ȵȴ�
		// ������ ���� �� (������ ����) �ݵ�� �տ� �ڷ����� ����ؾ� �Ѵ�
		
		String name1 = "¯��";
		String name2 = "����";
		String name3 = "����";
		
		int age1 = 5;
		int age2 = 4;
		int age3 = 6;
		
		System.out.println(name1 + "�� ���̴� " + age1 + "���Դϴ�" );
		System.out.println(name2 + "�� ���̴� " + age2 + "���Դϴ�" );
		System.out.println(name3 + "�� ���̴� " + age3 + "���Դϴ�" );
		// ��Ŭ���� ���� �Ʒ��� �����ϱ� : ctrl + alt + ��
		// ���� Ŀ�� ��ġ�� ���� �����ϱ� : ctrl + d
		
		int num = 128;
		byte by = (byte)num;
		
		System.out.println("by : " + by);
		
		//�ڹ��� �ڷ���
		// 1) primitive type, �⺻ �ڷ���, ���� �ڷ���
		/*
		  	��			�ڷ���		���� ����				ũ��
		  	��			boolean		true/false			1����Ʈ
		  	��			byte		-128 ~ +127			1����Ʈ 
		  				short		-32768 ~ +32767		2����Ʈ
		  				char		0 ~ 65535			2����Ʈ(���ڸ� ǥ���ϱ� ���� ����)
		  	�ڡڡ�			int			-21�� ~ +21��			4����Ʈ(���� ��ǥ �ڷ���)
		  	��			long		-922�� ~ +922��		8����Ʈ
		  				float		�Ǽ�					4����Ʈ
		  	�ڡ�			double 		�Ǽ�					8����Ʈ(�Ǽ� ��ǥ �ڷ���)
		  
		 */
		
		// 2) Reference type, ���� �ڷ���
	}

}
