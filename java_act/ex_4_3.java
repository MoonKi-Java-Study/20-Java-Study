// 예제 4-3 
// 두 개의 생성자를 가진 Circle 클래스
// 다음 코드는 2개의 생성자를 가진 Circle 클래스이다. 실행 결과는 무엇인가?

public class ex_4_3
{
	int radius;
	String name;

	// 매개 변수 없는 생성자
	// 생성자 이름 = 클래스 이름과 동일
	public Circle()
	{
		// radius의 초기값 = 1
		radius = 1;
		name = "";
	}

	// 매개 변수를 가진 생성자
	// 생성자는 리턴 타입 없음
	public Circle(int r, String n)
	{
		radius = r;
		name = n;
	}
	public double getArea()
	{
		return 3.14 * radius * radius;
	}

	public static void main(String[] args)
	{
		// Circle 객체 생성
		// 반지름 = 10
		Circle pizza = new Circle(10, "자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);

		Circle donut = new Circle();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}