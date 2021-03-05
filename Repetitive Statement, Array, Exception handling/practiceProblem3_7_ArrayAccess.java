// practice problem 3-7
// 배열에 입력 받은 수 중 제일 큰 수 찾기
// 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램 작성

import java.util.Scanner;

public class practiceProblem3_7_ArrayAccess
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		//배열 생성
		int intArray[] = new int[5];

		//현재 가장 큰 수
		int max = 0;
		System.out.println("양수 5개를 입력하세요.");

		for(int i =0; i < 5; i++)
		{
			//입력 받은 정수를 배열에 저장
			intArray[i] = scanner.nextInt();

			//intArray[i]가 현재 가장 큰 수보다 클 경우
			if(intArray[i] > max)
			{
				//intArray[i]를 max로 변경
				max = intArray[i];
			}
		}
		System.out.print("가장 큰 수는" + max + "입니다.");

		scanner.close();
	}
}
