package JavaProgramsExamples;

public class DigitCount 
{
	public static void main(String[] args)
	{

		int a = 12567893, count = 0;
		int i = 0;
		while (a > 0) 
		{
			a = a / 10;
			count++;
		}
		System.out.println(count);

	}


}
