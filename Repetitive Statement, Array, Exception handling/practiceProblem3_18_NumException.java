// practice problem 3-18
// 정수가 아닌 문자열을 정수로 변환할 때 예외발생(NumberFormatException)
// 문자열을 정수로 변환할 때 발생하는 NumberFormatException을 처리하는 프로그램

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
				//“3.141592”를 정수로 변환할 때 NumberFormatException 예외 발생
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
	}
}
	