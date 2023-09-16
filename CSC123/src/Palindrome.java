import java.util.Scanner;
public class Palindrome 
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String sen = sc.nextLine();
		String reverse = "", word = "";
		sen = sen + "" ;
		int count = 0;
		
		System.out.println("Plaidrome words in this string : \n");
		for(int x = 0; x < sen.length(); x++)
		{
			if(sen.charAt(x) == ' ')
			{
				if(word.equals(reverse))
				{
					System.out.print(reverse + " ");
					count++;
				}
				reverse = "";
				word = "";
			}
			
			else
			{
				reverse = sen.charAt(x)+reverse;
				word = word + sen.charAt(x);
			}
		}
		System.out.println("\nNumber of Palindrome Words : " + count);
	}
}
