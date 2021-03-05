// practice problem 2-4
// Scanner를 이용한 키 입력 연습
// 이름, 도시, 나이, 체중, 독신 여부를 입력 받고 다시 출력하는 프로그램

import java.util.Scanner;

public class practiceProblem2_4_ScannerEx
{
	public static void main(String[] args)
	{
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		
		//Scanner 클래스
		//Scanner의 객체 생성
		Scanner scanner = new Scanner(System.in);

		//문자열 읽기
		String name = scanner.next();
		System.out.print("이름은" + name +",");

		//문자열 읽기
		String city = scanner.next();
		System.out.print("도시는" + city +",");

		//정수 읽기
		int age = scanner.nextInt();
		System.out.print("나이는" + age + "살,");

		//실수 읽기
		double weight = scanner.nextDouble();
		System.out.print("체중은" + weight + "kg,");

		//논리값 읽기
		boolean single = scanner.nextBoolean();
		System.out.println("독신 여부" + single + "입니다.");

		//scanner 닫기
		scanner.close();
	}
}
//Scanner의 객체 생성
//이렇게 객체 생성을 하며 System.in은 입력한 값을 byte 단위로 읽는 것을 의미

//next() 메소드
//공백 이전까지의 무자열을 입력받는 메소드
//next + 자료형() : 자료형(정수, 실수, ...)에 맞게 입력받는 것
//(예) nextlnt(), nextDouble(), ...
//nextLine() 메소드 = 문자열 전체를 입력받는 메소드