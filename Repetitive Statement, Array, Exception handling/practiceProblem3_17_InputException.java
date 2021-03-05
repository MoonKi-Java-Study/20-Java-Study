// practice problem 3-17
// �Է� ���� �� �߻��ϴ� ����(InputMismatchException)
// 3���� ������ �Է� �޾� ���� ���ϴ� ���α׷�
// ����ڰ� ������ �ƴ� ���ڸ� �Է��� �� �߻��ϴ� �߻��ϴ� InputMismatchException ���ܸ� ó���Ͽ� �ٽ� �Է¹޴� ���α׷�

import java.util.Scanner;
import java.util.InputMismatchException;

class practiceProblem3_17_InputException
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("���� 3���� �Է��ϼ���.");

		int sum = 0, n = 0;

		for(int i = 0; i < 3; i++)
		{
			System.out.print(i + ">>");;
			try
			{
				//���� �Է�
				//����ڰ� ���ڸ� �Է��ϸ� InputMismatchException ���� �߻�
				n = scanner.nextInt();
			}
			catch(InputMismatchException e) 
			{
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				// �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
				scanner.next(); 
				// �ε����� �������� �ʵ��� �̸� ����
				i--;
				// ���� ����
				continue; 
			}
			// ���ϱ�
			sum += n; 
		}
		System.out.println("���� " + sum);
		scanner.close();
	}
}