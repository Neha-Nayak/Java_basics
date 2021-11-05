package in.ac.jyothyit.swing;

import javax.swing.*;

public class Frame1 extends JFrame{				//interference
	public Frame1()								//constructor
	{
		setTitle("Welcome");
		setVisible(true);
	}
	public static void main(String args[]) {
		Frame1 frame = new Frame1();
	}
}