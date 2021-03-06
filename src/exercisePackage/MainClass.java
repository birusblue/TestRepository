package exercisePackage;

public class MainClass
{
	public static void main(String[] args)
	{
		System.out.println(fibonacci(5));
		fibonacciPrint(5);
		System.out.println(isPrime(12));
		System.out.println(isPalindrome(1211));
		System.out.println(factorial(5));
		System.out.println(factorialRecursion(5));
		System.out.println(isArmstrongNumber(371));
	}
	public static int fibonacci(int n)
	{
		if(n==1)
		{ return 1;}
		else if(n==0)
		{return 0;}
		else 
		{ return fibonacci(n-1)+ fibonacci(n-2) ; }
	}
	 
	public static void fibonacciPrint(int n)
	{
		int a,b,c;
		a=0;
		b=1;
		for(int i=0;i<n;i++)
		{
			c=a;
			System.out.println(a);
			a=b;
			b=c+b;
		}
	}
	public static boolean isPrime(int number)
	{
		int mynumber=number;
		boolean primeOrNot=true;
		int half=mynumber/2;
		for(int i=2;i<=half;i++)
		{
			if((mynumber%i)==0)
			{
				primeOrNot=false;
			}
		}		
		return primeOrNot;
	}
	public static boolean isPalindrome(int number)
	{
		boolean palindromeOrNot=false;
		int mynumber=number;
		int reverse=0;
		while(mynumber>0)
		{			
			int last= mynumber%10;
			reverse=(reverse*10)+last;
			mynumber=mynumber/10;
		}
		if(reverse==number)
		{ palindromeOrNot=true;}
		return palindromeOrNot;
	}
	public static int factorial(int number)
	{ 
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;			
		}
		return fact;
	}
	public static int factorialRecursion(int number)
	{
		if(number==1)
		{return 1;}
		return factorialRecursion(number-1)*number;
	}
	public static boolean isArmstrongNumber(int number)
	{
		boolean armstrongOrNot=false;
		int temp=number;
		int ifarmStrong=0;
		while(temp>0)
		{
			int last=temp%10;
			ifarmStrong=ifarmStrong+(last*last*last);
			temp=temp/10;
		}
		if(ifarmStrong==number)
		{ armstrongOrNot=true;}
		return armstrongOrNot;
	}
}