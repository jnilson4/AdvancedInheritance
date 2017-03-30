package inheritance.view;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import inheritance.controller.*;

public class InheritPanel extends JPanel
{
	private SpringLayout baseLayout;
	private InheritController baseController;
	
	private JButton button1, button2;
	private JTextArea textArea;
	
	public InheritPanel(InheritController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.button1 = new JButton("Button 1");
		this.button2 = new JButton("Button 2");
		this.textArea = new JTextArea(10, 30);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(700, 500));
		this.setBackground(Color.GRAY);
		
		this.add(button1);
		this.add(button2);
		this.add(textArea);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, button1, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, button1, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, button2, 0, SpringLayout.NORTH, button1);
		baseLayout.putConstraint(SpringLayout.EAST, button2, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 26, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 170, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
