package day10_ClassVariable;

public class Ex05_Variable {
	//public int cnt = 777; // 인스턴스 변수
	public static int cnt = 777; // static을 붙여 미리 객체를 만들어 놓겠다
	public static void func() {
		System.out.println("func"+cnt);
	}

}
