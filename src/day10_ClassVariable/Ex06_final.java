package day10_ClassVariable;

import java.util.Scanner;

public class Ex06_final {
	public final String KOREA = "���ѹα�"; //final�� ���̸� ���̻� ������ �Ұ����ϴ�
	public void func() {
		System.out.println("������ KOREA : "+KOREA);
		Scanner input = new Scanner(System.in);
		System.out.println("�Է�");
		//KOREA = input.next(); // fianl �ٿ��� ���� ��
		System.out.println("���� �� KOREA : "+KOREA);
	}

}
