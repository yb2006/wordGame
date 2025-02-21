package member;

import java.util.Scanner;

public class MemberManager {
	static Scanner in = new Scanner(System.in);
	static Member[] m = new Member[10];

	MemberManager() {
		while (true) {
			System.out.println("번호를 선택해주세요.");
			System.out.println("0.종료 1.등록 2.전체보기 3.수정 4.삭제 5.검색 6.메모");
			int k = in.nextInt();
			if (k == 1) {
				sign_Up();
			} else if (k == 2) {
				view();
			} else if (k == 3) {
				update_hobby();
			} else if (k == 4) {
				delete();
			} else if (k == 5) {
				search();
			} else if (k == 6) {
				Memo();
			} else if (k == 0) {
				System.out.println("종료");
				break;
			}
		}
	}

	public void sign_Up() {
		in.nextLine();
		System.out.println("아이디를 입력하세요.");
		String id = in.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = in.nextLine();
		System.out.println("주소를 입력하세요.");
		String ad = in.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = in.nextInt();
		Member M = new Member(id, name, ad, age);
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = M;
				break;
			}

		}

	}

	public void view() {
		// 전체보기

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				System.out.println("아이디: " + m[i].id + "\n" + "이름: " + m[i].name + "\n" + "주소: " + m[i].ad);
			}
			if (m[i] != null && m[i].age < 20) {
				System.out.println("미성년자");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else if (m[i] != null && m[i].age >= 20) {
				System.out.println("성인");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}

		}

	}

	public void update_hobby() {
		System.out.println("1.수정 2.취미등록");
		int k = in.nextInt();
		if (k == 1) {
			update();
		} else if (k == 2) {
			Hobby();
		}

	}

	public void update() {
		in.nextLine();
		System.out.println("수정전 아이디를 입력해주세요.");
		String I = in.nextLine();
		System.out.println("수정할 아이디을 입력해주세요.");
		String id = in.nextLine();
		System.out.println("수정할 이름를 입력해주세요.");
		String name = in.nextLine();
		System.out.println("수정할 주소를 입력해주세요.");
		String ad = in.nextLine();
		System.out.println("수정할 나이를 입력해주세요.");
		int age = in.nextInt();
		Member M = new Member(id, name, ad, age);
		Member tempmember = new Member(id, name, ad, age);
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].id.equals(I)) {
				m[i] = tempmember;
				break;
			}

		}

	}

	public void delete() {
		System.out.println("삭제할 아이디를 입력하세요.");
		String I = in.nextLine();
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].id.equals(I)) {
				m[i] = null;
				break;
			}
		}
	}

	public void search() {
		in.nextLine();
		System.out.println("검색하실 아이디를 입력하세요.");
		String id = in.nextLine();
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].id.contains(id)) {
				System.out.println("아이디: " + m[i].id + "\n" + "이름: " + m[i].name + "\n" + "주소: " + m[i].ad);
				if (m[i] != null && m[i].age < 20) {
					System.out.println("미성년자");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				} else if (m[i] != null && m[i].age >= 20) {
					System.out.println("성인");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}

				for (int j = 0; j < 5; j++) {
					if (m[i] != null && m[i].hobby[j] != null) {
						System.out.println("취미: " + m[i].hobby[j]);
					}

				}
				for (int j = 0; j < 10; j++) {
					if (m[i].memo[0][j] != null && m[i].memo[1][j] != null) {
						System.out.println("메모제목: " + m[i].memo[0][j]);
						System.out.println("메모: " + m[i].memo[1][j]);
					}
				}
			}
		}

	}

	public void Hobby() {
		in.nextLine();
		System.out.println("취미를 추가하실 아이디를 입력하세요.");
		String I = in.nextLine();
		System.out.println("추가하실 취미를 입력하세요.");
		String hobby = in.nextLine();
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].id.equals(I)) {
				for (int j = 0; j < 10; j++) {
					if (m[i].hobby[j] == null) {
						m[i].hobby[j] = hobby;
						System.out.println("취미가 등록되었습니다.");
						break;
					}
				}
				break;
			}
		}
	}

	public void Memo() {
		in.nextLine();
		System.out.println("메모를 작성할 아이디를 입력하세요.");
		String I = in.nextLine();
		System.out.println("메모 제목을 입력해주세요.");
		String title = in.nextLine();
		System.out.println("메모를 작성하세요.");
		String memo1 = in.nextLine();
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].id.equals(I)) {
				for (int j = 0; j < 10; j++) {
					if (m[i].memo[0][j] == null && m[i].memo[1][j] == null) {
						m[i].memo[0][j] = title;
						m[i].memo[1][j] = memo1;
						System.out.println("메모 작성이 완료되었습니다.");
						break;
					}
				}
			}
		}
	}

}
