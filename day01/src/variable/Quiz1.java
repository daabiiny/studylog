package variable;

public class Quiz1 {
	public static void main(String[] args) {
		
		double height = 172.8;
		double weight = 67.4;
		
		// �� �� ������ ����� ���� Ȱ���Ͽ� Ű�� ü���� �Ҽ��� �Ʒ��ڸ� ����
		// ���� ���·� ����ϼ���
		// (�ڷ��� ��ȯ�� Ȱ���Ͽ� ���ο� ������ �����ϰ� ���� ����ϼ���)
		
		// *���� Ǭ��
		System.out.println((int)172.8);
		System.out.println((int)67.4);
		
		int n1 = (int)height;
		int n2 = (int)weight;
		
		// *Ǯ��
		// �Ǽ��� �Ҽ������� ǥ��������, ������ �Ҽ����� ǥ������ �ʴ´�
		// �Ǽ� ���� ������ ������ �Űܴ����� �Ҽ����� �߸��� (�ǵ��� ������ �ս�)
		
		int height2 = (int)height;
		int weight2 = (int)weight;
		
		System.out.println("Ű: " + height2);
		System.out.println("ü�� : " + weight2);
				
		
	}
}
