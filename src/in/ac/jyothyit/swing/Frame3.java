package in.ac.jyothyit.swing;

import javax.swing.*;

public class Frame3 extends JFrame{				//interference
	public Frame3()								//constructor
	{
		setTitle("Welcome");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String args[]) {
		Frame3 frame = new Frame3();
	}
}
