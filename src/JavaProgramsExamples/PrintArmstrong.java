package JavaProgramsExamples;

public class PrintArmstrong 
{
	public static void main(String[] args) 
	{
		for (int k = 1; k <= 600; k++) 
		{

			int a = k, n = 0;
			int i = 0, j = 0;
			n = a;
			while (a > 0) 
			{
				i = a % 10;
				j = j + (i * i * i);
				a = a / 10;
			}
			if (n == j) 
			{
				System.out.println(j);
			}

		}
	}


}
