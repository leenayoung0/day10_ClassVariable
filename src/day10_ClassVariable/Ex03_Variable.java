package day10_ClassVariable;

public class Ex03_Variable {
	public int variable01() {
		int var = 12345;
		System.out.println("01 var : "+var);
		//variable02(var); // 3. 방법2. (variable02() -> variable02(int var)로 변경
		return var; // 4. 방법3. ( 위에 반환형도 void 에서 int로 변경해줌)
	}
	public void variable02(int var) {
		// int var = 12;  //2. 방법1. 여기도 var를 새로 지정해줘야함
		System.out.println("02 var : "+var);// 1.에러발생 -> 지역변수
		//return 을 이용해 에러 안나게 할 수 있음
		
	}

}
