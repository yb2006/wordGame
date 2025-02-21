package member;

import java.util.Scanner;

public class MemberManager {
	static Scanner in = new Scanner(System.in);
	static Member[] m = new Member[10];

	MemberManager() {
		while (true) {
			System.out.println("��ȣ�� �������ּ���.");
			System.out.println("0.���� 1.��� 2.��ü���� 3.���� 4.���� 5.�˻� 6.�޸�");
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
				System.out.println("����");
				break;
			}
		}
	}

	public void sign_Up() {
		in.nextLine();
		System.out.println("���̵� �Է��ϼ���.");
		String id = in.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = in.nextLine();
		System.out.println("�ּҸ� �Է��ϼ���.");
		String ad = in.nextLine();
		System.out.println("���̸� �Է��ϼ���.");
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
		// ��ü����

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				System.out.println("���̵�: " + m[i].id + "\n" + "�̸�: " + m[i].name + "\n" + "�ּ�: " + m[i].ad);
			}
			if (m[i] != null && m[i].age < 20) {
				System.out.println("�̼�����");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else if (m[i] != null && m[i].age >= 20) {
				System.out.println("����");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}

		}

	}

	public void update_hobby() {
		System.out.println("1.���� 2.��̵��");
		int k = in.nextInt();
		if (k == 1) {
			update();
		} else if (k == 2) {
			Hobby();
		}

	}

	public void update() {
		in.nextLine();
		System.out.println("������ ���̵� �Է����ּ���.");
		String I = in.nextLine();
		System.out.println("������ ���̵��� �Է����ּ���.");
		String id = in.nextLine();
		System.out.println("������ �̸��� �Է����ּ���.");
		String name = in.nextLine();
		System.out.println("������ �ּҸ� �Է����ּ���.");
		String ad = in.nextLine();
		System.out.println("������ ���̸� �Է����ּ���.");
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
		System.out.println("������ ���̵� �Է��ϼ���.");
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
		System.out.println("�˻��Ͻ� ���̵� �Է��ϼ���.");
		String id = in.nextLine();
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].id.contains(id)) {
				System.out.println("���̵�: " + m[i].id + "\n" + "�̸�: " + m[i].name + "\n" + "�ּ�: " + m[i].ad);
				if (m[i] != null && m[i].age < 20) {
					System.out.println("�̼�����");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				} else if (m[i] != null && m[i].age >= 20) {
					System.out.println("����");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}

				for (int j = 0; j < 5; j++) {
					if (m[i] != null && m[i].hobby[j] != null) {
						System.out.println("���: " + m[i].hobby[j]);
					}

				}
				for (int j = 0; j < 10; j++) {
					if (m[i].memo[0][j] != null && m[i].memo[1][j] != null) {
						System.out.println("�޸�����: " + m[i].memo[0][j]);
						System.out.println("�޸�: " + m[i].memo[1][j]);
					}
				}
			}
		}

	}

	public void Hobby() {
		in.nextLine();
		System.out.println("��̸� �߰��Ͻ� ���̵� �Է��ϼ���.");
		String I = in.nextLine();
		System.out.println("�߰��Ͻ� ��̸� �Է��ϼ���.");
		String hobby = in.nextLine();
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].id.equals(I)) {
				for (int j = 0; j < 10; j++) {
					if (m[i].hobby[j] == null) {
						m[i].hobby[j] = hobby;
						System.out.println("��̰� ��ϵǾ����ϴ�.");
						break;
					}
				}
				break;
			}
		}
	}

	public void Memo() {
		in.nextLine();
		System.out.println("�޸� �ۼ��� ���̵� �Է��ϼ���.");
		String I = in.nextLine();
		System.out.println("�޸� ������ �Է����ּ���.");
		String title = in.nextLine();
		System.out.println("�޸� �ۼ��ϼ���.");
		String memo1 = in.nextLine();
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].id.equals(I)) {
				for (int j = 0; j < 10; j++) {
					if (m[i].memo[0][j] == null && m[i].memo[1][j] == null) {
						m[i].memo[0][j] = title;
						m[i].memo[1][j] = memo1;
						System.out.println("�޸� �ۼ��� �Ϸ�Ǿ����ϴ�.");
						break;
					}
				}
			}
		}
	}

}
