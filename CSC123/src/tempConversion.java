import java.util.Scanner;
public class tempConversion {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to convert to Celsius or Fahrenheit?: ");
		String input = sc.nextLine();
		
		while(!input.equalsIgnoreCase("C") || input.equalsIgnoreCase("F"))
		{
			System.out.println("Invalid input");
			System.out.println("Enter valid input (C or F: )");
			input = sc.nextLine();
			break;
		}
		
		
		System.out.print("Please enter temperature value: ");
		Double temp = sc.nextDouble();
		
		while(temp == 0.0) 
		{
			System.out.println("Invalid input");
			System.out.println("Enter valid numeric value");
			input = sc.nextLine();
		}
		
		if(input.equalsIgnoreCase("C"))
		{
			
			fahrenheitConversion(temp);
		}	
		else 
		{
			celsiusConversion(temp);
		}
		
	

	}
	static double fahrenheitConversion(double temp)
	{
		//celsius to fahrenheit
		return (temp-32)*5/9;
	}
	
	static double celsiusConversion(double temp)
	{
		//fahrenheit to celsius
		return ((9 * temp)/5) + 32;
	}

}
