package day10_ClassVariable;

import java.util.Scanner;

public class Ex08_ST {
	// �ν��Ͻ� ������ ����	
	public int age;
	public String name;
	
	public void display() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�̸��Է�");
		name = input.next();
		System.out.println("�����Է�");
		age = input.nextInt();
		
		
	}
	// �Է�, ��� ������� ��������
	public void print() {
		System.out.println("�̸� : "+name);
		System.out.println("age : "+age);
	}

}
