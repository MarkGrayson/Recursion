package recursion.controller;

import recursion.view.RecursionPanel;
import recursion.model.RecursionTool;
import javax.swing.JOptionPane;

public class RecursionController 
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	
	public RecursionController()
	{
		this.mathTool = new RecursionTool();
		this.baseFrame = new RecursionFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "look we are doing math");
	}
}
