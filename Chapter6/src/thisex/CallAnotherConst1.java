package thisex;

public class CallAnotherConst1 {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf(); //this ���� Ŭ���� ������ ����
		System.out.println(p);				//noName.returnItSelf()�� ��ȯ�� ���
		System.out.println(noName);			//���� ���� ���
	}
}
