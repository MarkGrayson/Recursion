package recursion.view;

import javax.swing.*;
import recursion.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	
	private RecursionController baseController;
	private JTextArea displayArea;
	private JTextField inputField;
	private JButton factButton, fibButton;
	private SpringLayout baseLayout;
	
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.displayArea = new JTextArea(5, 15);
		this.inputField = new JTextField(15);
		this.factButton = new JButton("fact");
		this.fibButton = new JButton("fib");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(displayArea);
		this.add(inputField);
		this.add(fibButton);
		this.add(factButton);
		displayArea.setEditable(false);
		displayArea.setWrapStyleWord(true);
		displayArea.setLineWrap(true);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
