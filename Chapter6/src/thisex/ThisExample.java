package thisex;

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); //�¾ ������ 2000���� ����
		System.out.println(bDay); // ���� ���� ���
		bDay.printThis(); //this ��� �޼��� ȣ��
	}
}