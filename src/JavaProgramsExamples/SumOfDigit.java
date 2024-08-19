package JavaProgramsExamples;

public class SumOfDigit 
{
	public static void main(String[] args) 
	{

		int a = 1238, count = 0;
		int i = 0;
		while (a > 0) 
		{
			i = a % 10;
			count = count + i;
			a = a / 10;

		}
		System.out.println(count);

	}


}
