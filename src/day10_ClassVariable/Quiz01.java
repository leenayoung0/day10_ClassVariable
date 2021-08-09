package day10_ClassVariable;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz01 {
	public static void start() {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int n, n1;
		n = ran.nextInt(100);
		System.out.println("컴퓨터 숫자 : "+n);
		System.out.println(" ===  START  ===");
		for(int i=1; i<100; i++) {
			System.out.print("Input Number -->");
			n1 = sc.nextInt();
			if(n<n1) System.out.println(" ===  Down  ===");
			if(n>n1) System.out.println(" ===  U  P  ===");
			if(n==n1) {
				System.out.println(i+"회 만에 맞췄습니다!!!");
				int h = history(i);
				
				break;
			}
		}
	
	}
	public static int history(int h) {
		ArrayList arr = new ArrayList();
		arr.add(h);
		for(int i=0; i<arr.size(); i++) {
			
		}
		return 0;
	}
	

}
