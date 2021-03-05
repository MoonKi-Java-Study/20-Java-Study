// practice problem 3-15
// 0으로 나눌 때 발생하는 ArithmeticException 예외 처리
// try-catch 블록을 이용하여 예제 3-14를 수정하여,
// 정수를 0으로 나누는 경우애 "0으로 나눌 수 없습니다!"를 출력하고 다시 입력 받는 프로그램

import java.util.Scanner;

public class practiceProblem3_12_DevideByZeroHandling
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		while(true)
		{
			//나뉨수 입력
			System.out.print("나뉨수를 입력하시오.");
			int dividend = scanner.nextInt();
			//나눗수 입력
			System.out.print("나눗수를 입력하시오.");
			int divisor = scanner.nextInt();

			try
			{
				//  dividend/divisor - ArithmeticException 예외 발생
				System.out.println(dividend + "를 "+ divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
				// 정상적인 나누기 완료 후 while 벗어나기
				break;
			}

			// ArithmeticException 예외 처리 코드
			catch(ArithmeticException e)
			{
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
		scanner.close();
	}
}