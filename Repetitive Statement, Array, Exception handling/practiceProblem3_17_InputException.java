// practice problem 3-17
// 입력 오류 시 발생하는 예외(InputMismatchException)
// 3개의 정수를 입력 받아 합을 구하는 프로그램
// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 발생하는 InputMismatchException 예외를 처리하여 다시 입력받는 프로그램

import java.util.Scanner;
import java.util.InputMismatchException;

class practiceProblem3_17_InputException
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 3개를 입력하세요.");

		int sum = 0, n = 0;

		for(int i = 0; i < 3; i++)
		{
			System.out.print(i + ">>");;
			try
			{
				//정수 입력
				//사용자가 문자를 입력하면 InputMismatchException 예외 발생
				n = scanner.nextInt();
			}
			catch(InputMismatchException e) 
			{
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				// 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				scanner.next(); 
				// 인덱스가 증가하지 않도록 미리 감소
				i--;
				// 다음 루프
				continue; 
			}
			// 합하기
			sum += n; 
		}
		System.out.println("합은 " + sum);
		scanner.close();
	}
}