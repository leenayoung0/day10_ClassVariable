package day10_ClassVariable;

public class Ex02_Random {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			//System.out.println( (int)(Math.random()*3)+1 ); //random 무작위의 숫자(값)-> Math.random 0.0~0.9사이에 있는 값
			int ran = (int)(Math.random()*3)+10;
			System.out.println( ran );
		}
		
		//(int)(Math.random()*3) -> 0~2 까지의 수만 나옴
		//(int)(Math.random()*3)+1 -> 1~3 까지의 수만 나옴
		//(int)(Math.random()*3)+10 -> 10~12 까지의 수만 나옴
		// 이렇게 랜덤이라는것을 이용해서 범위라는것을 구할 수 있음
		
	}

}
