package recursion.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import recursion.controller.RecursionController;

public class RecursionFrame extends JFrame
{

	private RecursionController baseController;
	private RecursionPanel appPanel;
	
	public RecursionFrame(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new RecursionPanel(baseController);
		
		setupFrame();
		
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Math with Java");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
}
