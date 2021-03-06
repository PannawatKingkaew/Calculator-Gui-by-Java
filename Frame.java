import javax.swing.*;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Frame {

	//declare textBox contains String of user's input
	protected  String textBox = "";
	protected  String temp = "";
        protected  BigDecimal total = new BigDecimal(0);
	protected  BigDecimal value = new BigDecimal(0);
        protected  List<BigDecimal> num = new ArrayList<BigDecimal>();
        protected  ArrayList<String> op = new ArrayList<String>();


	//declare Event's object	
	Event e = new Event();
	Event equal = new Event();
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
			if (i == 14)
			{
				button[i].addActionListener(new ActionListener()
				{
			 		public void actionPerformed(ActionEvent equal)
					{ 
						num.add(value);
                                                
                                               
						if(op.get(0) == "+")
						{ 
							total = num.get(0).add(num.get(1));
						}
                                                else if(op.get(0) == "-") 
                                                { 
                                                        total = num.get(0).subtract(num.get(1));
                                                }
                                                else if(op.get(0) == "*") 
                                                { 
                                                        total = num.get(0).multiply(num.get(1));
                                                }
                                                else if(op.get(0) == "/") 
                                                { 
                                                        total = num.get(0).divide(num.get(1));
                                                }
						String stotal = String.valueOf(total); 
						op.clear();
						num.clear();
						temp ="";
						num.add(total);
						calText.setText(stotal);
						textBox = stotal;
						panel.add(calText);
					}
				});
				index += 1;
			}
                        else if (i == 3)
                        {
                                button[i].addActionListener(new ActionListener()
                                {
                                        public void actionPerformed(ActionEvent add)
                                        { 
						textBox += ((JButton)add.getSource()).getText();
              					calText.setText(textBox);
               					panel.add(calText);  
                                                num.add(value);
						op.add("+");
						temp ="";
                                                System.out.printf("textBox value {%s}\n", textBox);
                                                
                                        }
                                });
                                index += 1;
                        }
                        else if (i == 7)
                        {
                                button[i].addActionListener(new ActionListener()
                                {
                                        public void actionPerformed(ActionEvent subtract)
                                        { 
				                textBox += ((JButton)subtract.getSource()).getText();
                                                calText.setText(textBox);
                                                panel.add(calText); 
                                                num.add(value);
                                                op.add("-");
						temp="";
                                                System.out.printf("textBox value {%s}\n", textBox);
                                           
                                        }
                                });
                                index += 1;
                        }
                        else if (i == 11)
                        {
                                button[i].addActionListener(new ActionListener()
                                {
                                        public void actionPerformed(ActionEvent multiply)
                                        { 
				                textBox += ((JButton)multiply.getSource()).getText();
                                                calText.setText(textBox);
                                                panel.add(calText); 
                                                num.add(value);
                                                op.add("*");
						temp ="";
                                                System.out.printf("textBox value {%s}\n", textBox);
                                        }
                                });
                                index += 1;
                        }

                        else if (i == 15)
                        {
                                button[i].addActionListener(new ActionListener()
                                {
                                        public void actionPerformed(ActionEvent divide)
                                        { 
				                textBox += ((JButton)divide.getSource()).getText();
                                                calText.setText(textBox);
                                                panel.add(calText); 
                                                num.add(value);
                                                op.add("/");
						temp = "";
				                System.out.printf("textBox value {%s}\n", textBox);
                                        }
                                });
                                index += 1;
                        }


			else
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
		temp += ((JButton)e.getSource()).getText();
		value = new BigDecimal(temp);
		calText.setText(textBox);
		panel.add(calText);	
		//debugging output  can be delete anytimes
		System.out.printf("textBox value {%s}\n", textBox);
}
}
}
