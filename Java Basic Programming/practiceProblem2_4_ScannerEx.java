// practice problem 2-4
// Scanner�� �̿��� Ű �Է� ����
// �̸�, ����, ����, ü��, ���� ���θ� �Է� �ް� �ٽ� ����ϴ� ���α׷�

import java.util.Scanner;

public class practiceProblem2_4_ScannerEx
{
	public static void main(String[] args)
	{
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		
		//Scanner Ŭ����
		//Scanner�� ��ü ����
		Scanner scanner = new Scanner(System.in);

		//���ڿ� �б�
		String name = scanner.next();
		System.out.print("�̸���" + name +",");

		//���ڿ� �б�
		String city = scanner.next();
		System.out.print("���ô�" + city +",");

		//���� �б�
		int age = scanner.nextInt();
		System.out.print("���̴�" + age + "��,");

		//�Ǽ� �б�
		double weight = scanner.nextDouble();
		System.out.print("ü����" + weight + "kg,");

		//���� �б�
		boolean single = scanner.nextBoolean();
		System.out.println("���� ����" + single + "�Դϴ�.");

		//scanner �ݱ�
		scanner.close();
	}
}
//Scanner�� ��ü ����
//�̷��� ��ü ������ �ϸ� System.in�� �Է��� ���� byte ������ �д� ���� �ǹ�

//next() �޼ҵ�
//���� ���������� ���ڿ��� �Է¹޴� �޼ҵ�
//next + �ڷ���() : �ڷ���(����, �Ǽ�, ...)�� �°� �Է¹޴� ��
//(��) nextlnt(), nextDouble(), ...
//nextLine() �޼ҵ� = ���ڿ� ��ü�� �Է¹޴� �޼ҵ�