import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class greetUserMethod extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static JFrame frame = new JFrame();
	

		public static void main(String[] args)
			{
			
				String [] comp = new String [4];
				comp [0] = ", you look like you've been hitting the gym lately.";
				comp [1] = ", I like your backpack.";
				comp [2] = ", you look great today.";
				comp [3] = ", you look very good today.";
				int randomNum = (int) (Math.random( ) * 3);
						name = JOptionPane.showInputDialog("What is your name?");  
						JOptionPane.showMessageDialog(frame, "Hi, " + name + comp[randomNum]);
						
					
					
			}
	
	}

