// practice problem 3-10
// 2���� �迭�� 4�� ���� ���ϱ�
// 2���� �迭�� �г� ���� 1,2�б� �������� �����ϰ� 4�Ⱓ ��ü ���� ��� ����ϴ� ���α׷�

public class practiceProblem3_10_ScoreAverage
{
	public static void main(String[] args)
	{
		//1�г� 1�б� ~ 4�г� 2�б� ����
		double score[][] = {{3.3, 3.4},{3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		
		double sum = 0;
		
		//�� �г⺰�� �ݺ�
		for(int year = 0; year < score.length; year++)
		{
			//�� �г��� �б⺰�� �ݺ�
			for(int term = 0; term < score[year].length; term++)
			{
				//��ü ���� ��
				sum += score[year][term];
			}
		}
		//�迭�� �� ���� -> 4
		int n = score.length;
		//�迭�� �� ���� -> 2
		int m = score[0].length;

		System.out.println("4�� ��ü ���� ����� " + sum/(n*m));
	}
}