package day10_ClassVariable;

public class Ex03_Variable {
	public int variable01() {
		int var = 12345;
		System.out.println("01 var : "+var);
		//variable02(var); // 3. ���2. (variable02() -> variable02(int var)�� ����
		return var; // 4. ���3. ( ���� ��ȯ���� void ���� int�� ��������)
	}
	public void variable02(int var) {
		// int var = 12;  //2. ���1. ���⵵ var�� ���� �����������
		System.out.println("02 var : "+var);// 1.�����߻� -> ��������
		//return �� �̿��� ���� �ȳ��� �� �� ����
		
	}

}
