package day10_ClassVariable;

import java.util.Scanner;

public class Quiz01_MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
		System.out.println(" === UP & Down Game ===");
		System.out.println("\t1. 게임시작");
		System.out.println("\t2. 게임전적");
		System.out.println("\t3. 게임종료");
		System.out.print(" >>>>");
		num = sc.nextInt();
		switch(num) {
		case 1: Quiz01.start(); break;
		case 2: 
		}
		
		
		}
	}

}
