// practice problem 3-8
// �迭 ������ ��� ���ϱ�
// �迭�� length �ʵ带 �̿��Ͽ� �迭�� ũ�� ��ŭ ������ �Է¹ް� ����� ���ϴ� ���α׷�

import java.util.Scanner;

public class practiceProblem3_8_ArrayLength
{
	public static void main(String[] args)
	{
		//�迭�� ���� + ����
		int intArray[] = new int[5];

		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "���� ������ �Է��ϼ���>>");

		for(int i =0; i <intArray.length; i++)
		{
			//Ű���忡�� �Է� ���� ���� ����
			intArray[i] = scanner.nextInt();
		}

		for(int i =0; i <intArray.length; i++)
		{
			//�迭�� ����� ���� ���� ���ϱ�
			sum += intArray[i];
		}
		System.out.print("����� " + (double)sum/intArray.length);
		scanner.close();
	}
}