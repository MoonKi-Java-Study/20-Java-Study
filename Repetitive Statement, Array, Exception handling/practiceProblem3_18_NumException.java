// practice problem 3-18
// ������ �ƴ� ���ڿ��� ������ ��ȯ�� �� ���ܹ߻�(NumberFormatException)
// ���ڿ��� ������ ��ȯ�� �� �߻��ϴ� NumberFormatException�� ó���ϴ� ���α׷�

public class practiceProblem3_18_NumException
{
	public static void main(String[] args)
	{
		String[] stringNumber = {"23", "12", "3.141592", "998"};

		int i = 0;

		try
		{
			for(i = 0; i < stringNumber.length; i++)
			{
				//��3.141592���� ������ ��ȯ�� �� NumberFormatException ���� �߻�
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("���ڷ� ��ȯ�� ���� " + j);
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println(stringNumber[i] + "�� ������ ��ȯ�� �� �����ϴ�.");
		}
	}
}
	