package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		String[] English = new String[10];
		int grading = 0;    //��������
		int cnt=0;          //�������䰳��
		int[] aaa=new int[10]; 		//�ߺ������迭����
		String[] wrong= {"","","","","","","","","",""};        //���䰳��
		System.out.println("���蹮�� ���ܾ� 10���� �Է��ϼ���.");
		for (int i = 0; i < English.length; i++) {
			String a = in.nextLine();
			English[i] = a; // ���ܾ� 10���� �Է��Ͽ� English�迭�� ����
		}
		System.out.println("����� ���ܾ���:");
		for (int i = 0; i < English.length; i++) {
			System.out.print(English[i] + " ");  // �Է��� ���ܾ�10�� ���
		}
		System.out.println();
		System.out.println("Ÿ�ڿ������� �ְ����� 145���Դϴ�.");
		System.out.println("�����+10��, 2�����̻� ���������+5�� ���ʽ�");
		System.out.println("�����Ϸ��� ���͸� ��������");
		while(true) {
			if ("".equals(in.nextLine())) {    //���͸� ������ Ÿ�ڿ�������
				break;
			}            
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {           // 0~9�迭���� ��
			int n = r.nextInt(10);             //n������ ���� ���ڸ� �̾Ƽ� ����
			if (aaa[n] >0 ) {					//aaa�迭�� �����Ͽ� ���� n�ε������ڸ� �־�
				i--;							//�ߺ��Ǹ� i--�ؼ� ��Ӻ�
				continue;						//continue�� ����� �ݺ������� ���ư���.
			}
			System.out.println((i+1)+"��° �����ܾ�"); //���° �����ܾ����� ǥ��
			aaa[n]=1;
			String randomE = English[n]; // randomE�� English�������� ����

			System.out.println(randomE);             //������ �����ܾ� ���
			/* �� ���̿� �ߺ��Ұ� if�� �߰��غ���*/
			String b = in.nextLine();                //����� �ܾ �Է��� b�� ����
			if (randomE.equals(b)) { 				// ������µ� ���� �Է���b�� ��
				System.out.println("\u001B[32m"+"�����Դϴ�!(+10��)"+"\u001B[0m"); // ���ϰ�� +10�� 
				grading += 10;
				cnt++;
				if(cnt>=2) {                          // ���� �����ϰ��+5��
					grading+=5;
					System.out.println("\u001B[33m"+"��������!(+5��)"+"\u001B[0m");
				}
			} else {
				System.out.println("\u001B[31m"+"�����Դϴ�!"+"\u001B[0m"); 	// �����ϰ�� ���� �״��
				cnt=0;                           	// �����ϰ�� cnt�ʱ�ȭ
				for(int j = 0; j <wrong.length; j++) {
					if(wrong[j]=="") {            //������� null�ΰ��� ������ ������� ����
						wrong[j]=randomE;
						break;						//������ ����
					}
				}
			}
		}
		System.out.println();
		System.out.println("���������� "+grading+"�� �Դϴ�."); // ��������
		System.out.println();
		System.out.println("***���乮���ܾ�***");
		System.out.println(Arrays.toString(wrong));     // ������ ���乮�� ���
		System.out.println("���Ͻô� ���� ���ڸ� �Է��ϼ���");
		System.out.println("1.���� �絵��"+" 2.����");		
		String order=in.nextLine();
		do {                                //������ ������� �����Ʈ ����x
			if(wrong[0] == null) {             // do while�� ����Ͽ� ������ ������� ����ǵ��� ��������
				System.out.println("�����̾����ϴ�. �����մϴ�.");
				break;
			}
			if(order.equals("1")) {							//���䵵���������� �Է�
			System.out.println("���� Ÿ�ڿ����� �����մϴ�.");
			}else if(order.equals("2")) {
			System.out.println("�����մϴ�.");
			break;
			}
			for(int i=0; i<wrong.length;i++) {
				if(wrong[i]!="") {                 //null���� �ݺ��ȵǰ� ���ǰɱ�
					System.out.println(wrong[i]);		//����� �������
					String d=in.nextLine();				//�����Է�
					if(wrong[i].equals(d)) {			//wrong�� ����Ȱ��� �Է��� d�� ��
						System.out.println("\u001B[32m"+"�����Դϴ�!"+"\u001B[0m");
					}else {
						System.out.println("\u001B[31m"+"�����Դϴ�!"+"\u001B[0m");
					}
				}
			}
			System.out.println("���ܾ �Է��ϼ̽��ϴ�.");
			System.out.println("�����ϼ̽��ϴ�.");
			break; 										//�����Է� ������ ���ߵ��� �극��ũ
		}while(true);
	}
				
}