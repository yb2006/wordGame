package test;

import java.util.Random;
import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		String[] Word = { "����", "����", "����", "����", "��ȯ", "ȸ��", "�ؾ�", "����", "����", "ȣ��" };
		String[] WrongWord = new String[10];
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		System.out.println("���͸� ������ ������ ���۵˴ϴ�.");
		String Enter = in.nextLine();// ���͸� �Է������� ���͸� ���� ���� enter

		if ("".equals(Enter)) {
			for (;true;) {
				System.out.println("1.����Ǯ��");
				System.out.println("2.Ʋ�� ����Ǯ��");
				System.out.println("3.��������");
				if (in.nextInt() == 1) {

					for (int i = 0; i < 10; i++) {
						if (i != 9) {
							int RandomIndex = random.nextInt(Word.length);
							String Quiz = Word[RandomIndex];
							System.out.println(Quiz);
							System.out.println("���õ� �ܾ�� �˸°� �Է��Ͻÿ�");
							String WordFit = in.nextLine();
							if (WordFit.equals(Quiz)) {
								System.out.println("100���Դϴ�");
							} else {

								for (int j = 0; j < Quiz.length() & Quiz.length() < 2; j++) {
									if (WordFit.charAt(0) == Quiz.charAt(j)) {
										System.out.println("�κ������Դϴ�");
									}
								}
							}
							if (!WordFit.equals(Quiz)) {
								for (int z = 0; z < 10; z++) {
									WrongWord[z] = Quiz;
								}
							}
						} else if (i == 9) {
							System.out.println("�����մϴ�");
						}
					}

				} else if (in.nextInt() == 2) {
					for (int i = 0; i < 10; i++) {
						int WrongRandomIndex = random.nextInt(WrongWord.length);
						String WrongQuiz = WrongWord[WrongRandomIndex];
						System.out.println(WrongQuiz);
						System.out.println("���õ� �ܾ�� �˸°� �Է��Ͻÿ�");
						System.out.println("���Ḧ ���ҽ� ���Ḧ �Է����ֽÿ�");
						String WrongWordFit = in.nextLine();
						if (WrongWordFit.equals(WrongQuiz)) {
							System.out.println("100���Դϴ�");
						} else {
							for (int j = 0; j < WrongQuiz.length(); j++) {
								if (WrongWordFit.charAt(0) == WrongQuiz.charAt(j)) {
									System.out.println("�κ������Դϴ�");
								}
							}
						}
					}

				}
			}

		}
	}
}
