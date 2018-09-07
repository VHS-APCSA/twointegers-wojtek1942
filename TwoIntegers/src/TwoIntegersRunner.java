import java.util.Scanner;
public class TwoIntegersRunner
{
	public static void main(String[] args)
	{
		//Scanner and UI Instructions
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first integer: ");
		int input1 = input.nextInt();
		System.out.println("Enter your second integer: ");
		int input2 = input.nextInt();
		System.out.println("Your integers are " + input1 + " and " + input2);
		
		//UI Spacers
		System.out.println("_________________________________________________________________________");
		System.out.println("                                   ");
		
		//Instantiating the inputs from Scanner
		TwoIntegers pair = new TwoIntegers(input1, input2);
		
		//Arithmetic Method
		String answers = pair.arithmetic();
		System.out.println(answers);
		
		//Larger Method
		int larger = pair.larger();
		System.out.println(larger + " is the larger of the two integers");
		
		//isEven Method
		boolean isEven = pair.isEven();
		System.out.println("The sum of the two integers is even = " + isEven);
		
		//Multiple Method
		boolean multiple = pair.multiple();
		System.out.println("The first integer is a multiple of the second integer = " + multiple);
	}
}