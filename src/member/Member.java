package member;

//È¸¿ø
public class Member {
	String id;
	String name;
	String ad;
	int age;
	String[] hobby = new String[5];
	String[][] memo = new String[2][10];
	Member(String id, String name, String ad, int age){
		this.id = id;
		this.name = name;
		this.ad = ad;
		this.age = age;
	}
}
