package test;

import java.util.Scanner;

public class random2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double r = Math.random();
		String[] English= new String[10];
		int grading = 0;
		System.out.println("시험문제 영단어 10개를 입력하세요.");
		for(int i=0; i<English.length; i++) {
			String a= in.nextLine();
			English[i]=a;
		}
		System.out.println("저장된 영단어목록:");
		for(int i=0; i<English.length; i++) {
			System.out.print(English[i]);
		}
	}
}