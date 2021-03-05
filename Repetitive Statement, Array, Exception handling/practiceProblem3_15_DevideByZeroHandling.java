// practice problem 3-15
// 0���� ���� �� �߻��ϴ� ArithmeticException ���� ó��
// try-catch ����� �̿��Ͽ� ���� 3-14�� �����Ͽ�,
// ������ 0���� ������ ���� "0���� ���� �� �����ϴ�!"�� ����ϰ� �ٽ� �Է� �޴� ���α׷�

import java.util.Scanner;

public class practiceProblem3_12_DevideByZeroHandling
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		while(true)
		{
			//������ �Է�
			System.out.print("�������� �Է��Ͻÿ�.");
			int dividend = scanner.nextInt();
			//������ �Է�
			System.out.print("�������� �Է��Ͻÿ�.");
			int divisor = scanner.nextInt();

			try
			{
				//  dividend/divisor - ArithmeticException ���� �߻�
				System.out.println(dividend + "�� "+ divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
				// �������� ������ �Ϸ� �� while �����
				break;
			}

			// ArithmeticException ���� ó�� �ڵ�
			catch(ArithmeticException e)
			{
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}
		}
		scanner.close();
	}
}