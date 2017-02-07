package recursion.controller;

import recursion.view.RecursionPanel;
import recursion.model.RecursionTool;
import javax.swing.JOptionPane;
import recursion.view.RecursionFrame;
import recursion.model.Timer;

public class RecursionController 
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private Timer mathTimer;
	
	public RecursionController()
	{
		this.mathTimer = new Timer();
		this.mathTool = new RecursionTool();
		this.baseFrame = new RecursionFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "look we are doing math");
	}
	
	public String transferFactorial(String input)
	{
		String factorialInfo = "The factorial of " + input + " is ";
		
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			factorialInfo += mathTool.calculateFactorial(Double.parseDouble(input));
		}
		
		mathTimer.stopTimer();
		factorialInfo += "\n" + mathTimer.toString();
		
		return factorialInfo;
	}
	
	public String transferFibonacci(String input)
	{
		String fibonacciInfo = "";
		
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			fibonacciInfo += mathTool.calculateFibonacci(Integer.parseInt(input));
		}
		
		mathTimer.stopTimer();
		fibonacciInfo += "\n" + mathTimer;
		
		return fibonacciInfo;
	}
	
	private boolean isValid(String testValue)
	{
		try
		{
			double test = Double.parseDouble(testValue);
			if(test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid number >= 0");
			return false;
		}
	}
}
