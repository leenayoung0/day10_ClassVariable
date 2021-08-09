package day10_ClassVariable;

public class Ex05_MainClass {
	public static void main(String[] args) {
//		Ex05_Variable ex = new Ex05_Variable(); // 객체 만듦
//		ex.cnt = 888;
		Ex05_Variable.cnt = 888; // 아직 객체가 만들어지지 않아 인스턴스 사용이 불가
		System.out.println(Ex05_Variable.cnt); //이렇게 클래스 이름으로 접근 가능
		
		//Ex05_Variable.func();
	}

}
