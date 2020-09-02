import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Frame {

	//declare textBox contains String of user's input
	protected String textBox = "";

	//declare Event's object	
	Event e = new Event();	
		
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JTextField calText = new JTextField(20);

	JButton[] button = new JButton[16];

	public void createFrame(){
	
		// declare variables	
		char[] btnName = {'7', '8', '9', '+', 
				'4', '5', '6', '-', 
				'1', '2', '3', 'x', 
				'0', '.', '=', '/'};
		int index = 1;	
		int posX = 10;
		int posY = 130;
		int posX2 = 100;
		int posY2 = 50;
		final int padding = 10;
		
		//Display creating status
		System.out.println("Start creating");

		//screen setting	
		frame.setSize(450, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Simple Calculator");

		panel.setLayout(null);
		frame.add(panel);
		
		calText.setBounds(posX, posX, 430, posX2);
		panel.add(calText);

		//declare each button
		for(int i = 0; i < 16; i++){

			button[i] = new JButton(String.valueOf(btnName[i]));	
			button[i].addActionListener(e);
			index += 1;
			
			//Display button's name, can be delete anytimes	
			System.out.println(button[i].getText());
		}

		// display num button	
		index = 0;	
		for(int row = 1; row <= 4; row++){
			
			for(int column = 1; column <= 4; column++){

					System.out.println(String.valueOf(index));	
					
					button[index].setBounds(posX, posY, posX2, posY2);
					panel.add(button[index]);

					posX += posX2 + padding;
				
					index += 1;

			}
				
			posX = 10;
			posY += posY2 + padding;
		}
	
		//Display creating status	
		System.out.println("created"); 

		frame.setVisible(true);	
	}
public class Event implements ActionListener{

	public void actionPerformed(ActionEvent e){
		textBox += ((JButton)e.getSource()).getText();
	
		calText.setText(textBox);
		panel.add(calText);	
		//debugging output  can be delete anytimes
		System.out.printf("textBox value {%s}\n", textBox);

	}

}
}
