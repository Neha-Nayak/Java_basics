package in.ac.jyothyit.swing;

import javax.swing.*;

public class Frame2 extends JFrame{				//interference
	public Frame2()								//constructor
	{
		setTitle("Welcome");
		setSize(500,400);
		setVisible(true);
	}
	public static void main(String args[]) {
		Frame2 frame = new Frame2();
	}
}
