package test;

import java.util.Scanner;

public class random2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double r = Math.random();
		String[] English= new String[10];
		int grading = 0;
		System.out.println("���蹮�� ���ܾ� 10���� �Է��ϼ���.");
		for(int i=0; i<English.length; i++) {
			String a= in.nextLine();
			English[i]=a;
		}
		System.out.println("����� ���ܾ���:");
		for(int i=0; i<English.length; i++) {
			System.out.print(English[i]);
		}
	}
}