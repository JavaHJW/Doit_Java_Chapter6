package thisex;

public class Person {
	String name;
	int age;
	
	Person() {
		this("이름없음", 1);	//this를 이용해 Person(String, int) 생성자 호출
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}
