package User;

//������ å���� ���� �ִ� Ŭ����
public class Main {

	
	// main �޼���� static�־ ��ü�� �������� �ʾƵ� ȣ�Ⱑ��
	// ���α׷��� ����Ǹ� jvm�� ���� ���� main�޼��带 ȣ��(call)
	public static void main(String[] args) {
		System.out.println("���α׷��� �����մϴ�.");
	//��ü���� ����(����); �����ڸ� call�Ͽ� ��ü�� �����.
		new UserManager("�޸�");
	}

}
