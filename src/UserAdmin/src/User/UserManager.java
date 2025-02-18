package User;

import java.util.Scanner;

public class UserManager {
	User[] UserList = new User[5];
	// 생성자
	UserManager(String title) {
		System.out.println(title + "회원관리프로그램");
		Scanner in = new Scanner(System.in);
		while (true) {
			menu();
			System.out.println("번호선택");
			int k = in.nextInt();
			if (k == 1) {
				add();
			} else {
				allList();
			}
		}
	}
	private void allList() {
		System.out.println("전체보기 기능");
		for(int i = 0; i<UserList.length; i++) {
			if(UserList[i]!=null) {
				System.out.println(UserList[i].id);
				System.out.println(UserList[i].name);
			}
		}
	}
	private void add() {
		System.out.println("추가");
		Scanner in = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id = in.nextLine();
		System.out.println("이름을 입력하세요.");
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
		System.out.println("1.추가 2.전체보기");
	}

}
