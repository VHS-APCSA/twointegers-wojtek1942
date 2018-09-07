//Problems 2.15, 2.16, 2.25, 2.26 Create a class with two instance variables of type int. 
//Include two constructors (default and one with two parameters) and get/set methods for both of them.

//Write separate methods for each problem. 
//For problem 2.15 write a method named arithmetic() and use the two instance variables to calculate the values 
//  of sum, product, difference and quotient. The method should return a String that displays the results. 
//Something like "5 + 3 = 8, 5 * 3 = 15, 5 / 3 = 1, 5 % 3 = 2" with 5 and 3 replaced with your actual numbers. 
//For problem 2.16 write a method named larger() that returns the larger integer. 
//If they're equal than it doesn't matter which one you return. 
//For problem 2.25 write a method called isEven() that returns a boolean if the sum of the two integers is even 
//  and false if the sum is odd. For problem 2.26 return a boolean that is true if the first int is a multiple 
//  of the second int and false otherwise.

//You should print the results of each method in the runner. 
//The runner should use a Scanner to take user input for two numbers and then use those two numbers to 
//  instantiate the class.



public class TwoIntegers
{
	private int num1;
	private int num2;
	
	//Default Constructor
	public TwoIntegers()
	{
		num1 = 0;
		num2 = 0;
	}
	
	//Parameters
	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	//Accessor and Mutator Methods
	public int getNum1()
	{
		return num1;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	
	public int getNum2()
	{
		return num2;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	
	//Arithmetic Method
	public String arithmetic()
	{
		//casting the integers to doubles??
		double dnum1 = this.num1;
		double dnum2 = this.num2;
		
		//rest of the equations 
		int sum = this.num1 + this.num2;
		int difference = this.num1 - this.num2;
		int product = this.num1 * this.num2;
		double quotient = dnum1 / dnum2;
		return num1 + " + " + num2 + " = " + sum
		+ "   //   " + num1 + " - " + num2 + " = " + difference 
		+ "   //   " + num1 + " * " + num2 + " = " + product 
		+ "   //   " + num1 + " / " + num2 + " = " + quotient;
	}
	
	//Larger Method; Returning the Larger variable
	public int larger()
	{
		int first = this.num1;
		int second = this.num2;
		if (first > second)
		{
			return first;
		}
		else
		{
			return second;
		}
	}
	
	//isEven Method
	public boolean isEven()
	{
		int sum = this.num1 + this.num2;
		if(sum % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Multiple Method
	public boolean multiple()
	{
		int mult1 = this.num1;
		int mult2 = this.num2;
		if(mult1 % mult2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
