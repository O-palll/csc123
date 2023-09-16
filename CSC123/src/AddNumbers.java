import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int input1 = keyboard.nextInt();
		
		System.out.print("Input the second number: ");
		int input2 = keyboard.nextInt();
		int sum = input1 + input2;
		
		System.out.print("The result is: " + sum);

	}

}
