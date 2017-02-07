package recursion.model;

public class RecursionTool 
{
	
	public double calculateFactorial(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public int calculateFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber - 1) + calculateFibonacci(currentNumber - 2);
		}
	}
	
	public int calculateIterativeFib(int n)
	{
		{
		    if (n == 0) return 0;
		    if (n == 1) return 1;
		        
		    int prevPrev = 0;
		    int prev = 1;
		    int result = 0;
		        
		    for (int i = 2; i <= n; i++)
		    {
		        result = prev + prevPrev;
		        prevPrev = prev;
		        prev = result;
		    }
		    return result;
		}
	}
	
	public int calculateIterativeFact(int n)
	{
		{
		    int sum = 1;
		    if (n <= 1) return sum;
		    while (n > 1)
		    {
		        sum *= n;
		        n--;
		    }
		    return sum;
		}
	}
}
