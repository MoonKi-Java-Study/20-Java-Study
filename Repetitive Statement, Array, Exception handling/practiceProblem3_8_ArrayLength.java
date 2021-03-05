// practice problem 3-8
// 배열 원소의 평균 구하기
// 배열의 length 필드를 이용하여 배열의 크기 만큼 정수를 입력받고 평균을 구하는 프로그램

import java.util.Scanner;

public class practiceProblem3_8_ArrayLength
{
	public static void main(String[] args)
	{
		//배열의 선언 + 생성
		int intArray[] = new int[5];

		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");

		for(int i =0; i <intArray.length; i++)
		{
			//키보드에서 입력 받은 정수 저장
			intArray[i] = scanner.nextInt();
		}

		for(int i =0; i <intArray.length; i++)
		{
			//배열에 저장된 정수 값을 더하기
			sum += intArray[i];
		}
		System.out.print("평균은 " + (double)sum/intArray.length);
		scanner.close();
	}
}