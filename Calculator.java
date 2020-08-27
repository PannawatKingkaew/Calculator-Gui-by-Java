import javax.swing.*;
import java.awt.*;

public class Calculator
{
	public static void main(String[] args)
	{
		//frame
		JFrame frame  = new JFrame();
		frame.setSize(450,410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator naja");

		//display
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);

		JTextField caltext = new JTextField(20);
		caltext.setBounds(10,10,430,100);
		panel.add(caltext);
		
		//button
		JButton num1 = new JButton("1");
		num1.setBounds(10,130,100,50);
		panel.add(num1);

                JButton num2 = new JButton("2");
                num2.setBounds(120,130,100,50);
                panel.add(num2);

                JButton num3 = new JButton("3");
                num3.setBounds(230,130,100,50);
                panel.add(num3);

                JButton add = new JButton("+");
                add.setBounds(340,130,100,50);
                panel.add(add);

                JButton num4 = new JButton("4");
                num4.setBounds(10,190,100,50);
                panel.add(num4);

                JButton num5 = new JButton("5");
                num5.setBounds(120,190,100,50);
                panel.add(num5);

                JButton num6 = new JButton("6");
                num6.setBounds(230,190,100,50);
                panel.add(num6);

                JButton subtract = new JButton("-");
                subtract.setBounds(340,190,100,50);
                panel.add(subtract);

                JButton num7 = new JButton("7");
                num7.setBounds(10,250,100,50);
                panel.add(num7);

                JButton num8 = new JButton("8");
                num8.setBounds(120,250,100,50);
                panel.add(num8);

                JButton num9 = new JButton("9");
                num9.setBounds(230,250,100,50);
                panel.add(num9);

                JButton multiply = new JButton("x");
                multiply.setBounds(340,250,100,50);
                panel.add(multiply);

                JButton num0 = new JButton("0");
                num0.setBounds(10,310,100,50);
                panel.add(num0);

                JButton decimal = new JButton(".");
                decimal.setBounds(120,310,100,50);
                panel.add(decimal);

                JButton divide = new JButton("/");
                divide.setBounds(230,310,100,50);
                panel.add(divide);

                JButton equal = new JButton("=");
                equal.setBounds(340,310,100,50);
                panel.add(equal);

		frame.setVisible(true);
	}
}
