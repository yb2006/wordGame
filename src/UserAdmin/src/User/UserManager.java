package User;

import java.util.Scanner;

public class UserManager {
	User[] UserList = new User[5];
	// ������
	UserManager(String title) {
		System.out.println(title + "ȸ���������α׷�");
		Scanner in = new Scanner(System.in);
		while (true) {
			menu();
			System.out.println("��ȣ����");
			int k = in.nextInt();
			if (k == 1) {
				add();
			} else {
				allList();
			}
		}
	}
	private void allList() {
		System.out.println("��ü���� ���");
		for(int i = 0; i<UserList.length; i++) {
			if(UserList[i]!=null) {
				System.out.println(UserList[i].id);
				System.out.println(UserList[i].name);
			}
		}
	}
	private void add() {
		System.out.println("�߰�");
		Scanner in = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���.");
		String id = in.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = in.nextLine();
		User tempUser = new User(id,name);
		for(int i =0 ; i<UserList.length; i++) {
			if(UserList[i] == null) {
				UserList[i] = tempUser;
				break;
			}
		}
	}
	public void menu() {
		System.out.println("1.�߰� 2.��ü����");
	}

}
