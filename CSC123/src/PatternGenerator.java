import java.util.Scanner;
public class PatternGenerator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number n: ");
		int rows = sc.nextInt();
		
		for(int x = 1; x <= rows; x++)
		{
			for(int i = 1; i <= x;  i++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
