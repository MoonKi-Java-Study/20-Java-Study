// practice problem 3-12
// �迭 ����
// ���� 4���� ������ 1���� �迭�� �����ϰ�, 1,2,3,4�� �ʱ�ȭ�� ����,
// �迭�� �����ϴ� makeArray()�� �ۼ��ϰ�, �� �޼ҵ�κ��� �迭�� ���޹޾� ���� ����ϴ� ���α׷�

public class practiceProblem3_12_ReturnArray
{
	// ������ �迭�� �����ϴ� �޼ҵ�
	static int[] makeArray()
	{
		//�迭 ����
		int temp[] = new int[4];

		for(int i = 0; i < temp.length; i++)
		{
			//�迭�� ���Ҹ� 0, 1, 2, 3���� �ʱ�ȭ
			temp[i] = i;
		}
		//�迭 ����
		return temp;
	}
	public static void main(String[] args)
	{
		//�迭 ���۷��� ���� ����
		int intArray[];

		//�޼ҵ�κ��� �迭 ���޹���
		intArray = makeArray();

		for(int i = 0; i < intArray.length; i++)
		{
			//�迭 ��� ���� ���
			System.out.print(intArray[i] + " ");
		}
	}
}

