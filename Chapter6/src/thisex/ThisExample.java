package thisex;

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); //태어난 연도를 2000으로 지정
		System.out.println(bDay); // 참조 변수 출력
		bDay.printThis(); //this 출력 메서드 호출
	}
}
