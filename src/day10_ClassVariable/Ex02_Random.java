package day10_ClassVariable;

public class Ex02_Random {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			//System.out.println( (int)(Math.random()*3)+1 ); //random �������� ����(��)-> Math.random 0.0~0.9���̿� �ִ� ��
			int ran = (int)(Math.random()*3)+10;
			System.out.println( ran );
		}
		
		//(int)(Math.random()*3) -> 0~2 ������ ���� ����
		//(int)(Math.random()*3)+1 -> 1~3 ������ ���� ����
		//(int)(Math.random()*3)+10 -> 10~12 ������ ���� ����
		// �̷��� �����̶�°��� �̿��ؼ� ������°��� ���� �� ����
		
	}

}
