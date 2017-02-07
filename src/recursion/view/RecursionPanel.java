package recursion.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 30, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, 0, SpringLayout.EAST, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 107, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 182, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, -107, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 0, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 40, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}
}

