package thisex;

public class Person {
	String name;
	int age;
	
	Person() {
		this("�̸�����", 1);	//this�� �̿��� Person(String, int) ������ ȣ��
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}
