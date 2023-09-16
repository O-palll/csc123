import java.util.Scanner;
public class factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a positive integer: ");
		int n = sc.nextInt();
		int fact = 1;
		int start = 1;
		
		if(n < 0)
		{
			System.out.print("Input a positive integer.");
		
		}
		else
		{
			for(start = 1; start <= n; start++)
			{
				fact = fact * start;
				
			}
			System.out.print(fact);
		}

	}

}
