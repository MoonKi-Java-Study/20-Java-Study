// practice problem 3-7
// �迭�� �Է� ���� �� �� ���� ū �� ã��
// ��� 5���� �Է¹޾� �迭�� �����ϰ�, ���� ū ���� ����ϴ� ���α׷� �ۼ�

import java.util.Scanner;

public class practiceProblem3_7_ArrayAccess
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		//�迭 ����
		int intArray[] = new int[5];

		//���� ���� ū ��
		int max = 0;
		System.out.println("��� 5���� �Է��ϼ���.");

		for(int i =0; i < 5; i++)
		{
			//�Է� ���� ������ �迭�� ����
			intArray[i] = scanner.nextInt();

			//intArray[i]�� ���� ���� ū ������ Ŭ ���
			if(intArray[i] > max)
			{
				//intArray[i]�� max�� ����
				max = intArray[i];
			}
		}
		System.out.print("���� ū ����" + max + "�Դϴ�.");

		scanner.close();
	}
}
