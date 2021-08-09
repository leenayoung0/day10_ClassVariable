package day10_ClassVariable;

import java.util.Scanner;

public class Ex06_final {
	public final String KOREA = "대한민국"; //final을 붙이면 더이상 변경이 불가능하다
	public void func() {
		System.out.println("변경전 KOREA : "+KOREA);
		Scanner input = new Scanner(System.in);
		System.out.println("입력");
		//KOREA = input.next(); // fianl 붙여서 에러 뜸
		System.out.println("변경 후 KOREA : "+KOREA);
	}

}
