import javax.swing.*;
import java.awt.*;

public class Calculator
{
	public static void main(String[] args)
	{
		//frame
		JFrame frame  = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator naja");

		//display
		JPanel display = new JPanel();
		display.setLayout(null);
		frame.add(display);

		JTextField caltext = new JTextField(40);
		caltext.setBounds(10,10,480,50);
		display.add(caltext);
		
		//button
		JButton button
		frame.setVisible(true);
	}
}
