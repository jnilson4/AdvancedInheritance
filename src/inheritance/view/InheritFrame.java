package inheritance.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.Dimension;
import inheritance.controller.*;

public class InheritFrame extends JFrame
{
	private InheritController baseController;
	private InheritPanel appPanel;
	
	public InheritFrame()
	{
		super();
		this.baseController = baseController;
		this.appPanel = new InheritPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Advanced Inheritance");
		this.setSize(new Dimension(700, 500));
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
