package day10_ClassVariable;

public class Ex05_MainClass {
	public static void main(String[] args) {
//		Ex05_Variable ex = new Ex05_Variable(); // ��ü ����
//		ex.cnt = 888;
		Ex05_Variable.cnt = 888; // ���� ��ü�� ��������� �ʾ� �ν��Ͻ� ����� �Ұ�
		System.out.println(Ex05_Variable.cnt); //�̷��� Ŭ���� �̸����� ���� ����
		
		//Ex05_Variable.func();
	}

}
