package day10_ClassVariable;

public class Ex04_MainClass {
	public static void main(String[] args) {
		Ex04_Variable ex = new Ex04_Variable();
		ex.cnt = 12345; //public은 외부에서 접근 변경 가능
		ex.func01();
		ex.func02();
	}

}
