import java.util.Scanner;
public class GradeCalc 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your score: ");
		int gradeInput = keyboard.nextInt();
		
		if(gradeInput >= 90)
		{
			System.out.println("Your grade is A, Excellent.");
		}
		else if(gradeInput <= 89 && gradeInput >= 80)
		{
			System.out.println("Your grade is B, Good Job."); 
		}
		else if(gradeInput <= 79 && gradeInput >= 70)
		{
			System.out.println("Your grade is C, Needs Improvement.");
		}
		else if(gradeInput <= 69 && gradeInput >= 60)
		{
			System.out.println("Your grade is D, Needs Improvement.");
		}
		else
		{
			System.out.println("Your grade is F, Needs Improvement.");
		}
		
	}

}
