package exercisePackage;

public class MainClass
{
	public static void main(String[] args)
	{
		System.out.println(fibonacci(5));
		fibonacciPrint(5);
		System.out.println(isPrime(12));
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
	
}