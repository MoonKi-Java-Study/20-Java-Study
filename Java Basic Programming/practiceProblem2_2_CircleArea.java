// practice problem 2-2
// 변수, 리터럴(Literal), 상수(Constant) 활용
// 원의 면적(넓이)을 구하는 프로그램

public class practiceProblem2_2_CircleArea
{
	public static void main(String[] args)
	{
		//final 필드를 이용해 상수로 선언
		//원주율
		final double PI = 3.14;

		//원의 반지름
		double radius = 10.0;
		
		//원의 넓이 = 반지름 * 반지름 * PI
		double circleArea = radius * radius * PI;
		
		//원의 넓이 출력
		System.out.println("원의 면적 = " + circleArea);
	}
}
