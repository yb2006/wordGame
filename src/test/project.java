package test;

import java.util.Random;
import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		String[] Word = { "성준", "윤빈", "재훈", "동훈", "정환", "회성", "준아", "성대", "익희", "호영" };
		String[] WrongWord = new String[10];
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		System.out.println("엔터를 눌러야 게임이 시작됩니다.");
		String Enter = in.nextLine();// 엔터를 입력했을때 엔터를 넣을 변수 enter

		if ("".equals(Enter)) {
			for (;true;) {
				System.out.println("1.문제풀기");
				System.out.println("2.틀린 문제풀기");
				System.out.println("3.완전종료");
				if (in.nextInt() == 1) {

					for (int i = 0; i < 10; i++) {
						if (i != 9) {
							int RandomIndex = random.nextInt(Word.length);
							String Quiz = Word[RandomIndex];
							System.out.println(Quiz);
							System.out.println("제시된 단어와 알맞게 입력하시오");
							String WordFit = in.nextLine();
							if (WordFit.equals(Quiz)) {
								System.out.println("100점입니다");
							} else {

								for (int j = 0; j < Quiz.length() & Quiz.length() < 2; j++) {
									if (WordFit.charAt(0) == Quiz.charAt(j)) {
										System.out.println("부분점수입니다");
									}
								}
							}
							if (!WordFit.equals(Quiz)) {
								for (int z = 0; z < 10; z++) {
									WrongWord[z] = Quiz;
								}
							}
						} else if (i == 9) {
							System.out.println("종료합니다");
						}
					}

				} else if (in.nextInt() == 2) {
					for (int i = 0; i < 10; i++) {
						int WrongRandomIndex = random.nextInt(WrongWord.length);
						String WrongQuiz = WrongWord[WrongRandomIndex];
						System.out.println(WrongQuiz);
						System.out.println("제시된 단어와 알맞게 입력하시오");
						System.out.println("종료를 원할시 종료를 입력해주시오");
						String WrongWordFit = in.nextLine();
						if (WrongWordFit.equals(WrongQuiz)) {
							System.out.println("100점입니다");
						} else {
							for (int j = 0; j < WrongQuiz.length(); j++) {
								if (WrongWordFit.charAt(0) == WrongQuiz.charAt(j)) {
									System.out.println("부분점수입니다");
								}
							}
						}
					}

				}
			}

		}
	}
}
