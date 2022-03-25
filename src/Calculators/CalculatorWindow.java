package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalculatorWindow {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorWindow window = new CalculatorWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.setBounds(100, 100, 233, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 197, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// 7
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText () + btn7.getText();
				textField.setText (EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 52, 50, 50);
		frame.getContentPane().add(btn7);
		
		
		
		//8
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText () + btn8.getText();
				textField.setText (EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(60, 52, 50, 50);
		frame.getContentPane().add(btn8);
		
		
		
		
		//9
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText () + btn9.getText();
				textField.setText (EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(110, 52, 50, 50);
		frame.getContentPane().add(btn9);
		
		
		
		//+
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble (textField.getText());
				textField.setText("");
				operations = "+";
								
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(160, 52, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		
		
		
		//4
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText () + btn4.getText();
				textField.setText (EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 104, 50, 50);
		frame.getContentPane().add(btn4);
		
		
		
		//5
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText () + btn5.getText();
				textField.setText (EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(60, 104, 50, 50);
		frame.getContentPane().add(btn5);
		
		
		
		//6
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText () + btn6.getText();
				textField.setText (EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(110, 104, 50, 50);
		frame.getContentPane().add(btn6);
		
		
		//-
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble (textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(160, 104, 50, 50);
		frame.getContentPane().add(btnSub);
		
		
		
		//1
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText () + btn1.getText();
				textField.setText (EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 156, 50, 50);
		frame.getContentPane().add(btn1);
				
		
		//2
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText () + btn2.getText();
				textField.setText (EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(60, 156, 50, 50);
		frame.getContentPane().add(btn2);
		
		
		
		//3		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText () + btn3.getText();
				textField.setText (EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(110, 156, 50, 50);
		frame.getContentPane().add(btn3);
		
		
		//*
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble (textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(160, 156, 50, 50);
		frame.getContentPane().add(btnMult);
		
		
		
		
		//0
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText () + btn0.getText();
				textField.setText (EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 208, 50, 50);
		frame.getContentPane().add(btn0);
		
		
		//.	
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String EnterNumber = textField.getText () + btnDot.getText();
			textField.setText (EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(60, 208, 50, 50);
		frame.getContentPane().add(btnDot);
						
		
		
		// /
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble (textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(160, 208, 50, 50);
		frame.getContentPane().add(btnDiv);
						
		
		
		//=
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String answer;
			
			secondnum = Double.parseDouble(textField.getText());
			if (operations == "+") {
				result = firstnum +secondnum;
				answer = String.format("%.2f", result);
				textField.setText (answer); }
			
			else if (operations == "-") {
				result = firstnum - secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer); }
			
			else if (operations == "*") {
				result = firstnum * secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer); }
			
			else if (operations == "/") {
				result = firstnum / secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer); }
			
			else if (operations == "%") {
				result = firstnum % secondnum;
				answer = String.format("%.2f", result);
				textField.setText(answer); }
							
				
			}
							
			}
		);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(160, 260, 50, 50);
		frame.getContentPane().add(btnEqual);
		
		
		//%
        JButton btnPer = new JButton("%");
        btnPer.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		
        		firstnum = Double.parseDouble (textField.getText());
				textField.setText("");
				operations = "%";}});
        		
        
        btnPer.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnPer.setBounds(110, 208, 50, 50);
        frame.getContentPane().add(btnPer);
				
        JButton btnC = new JButton("C");
        btnC.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		textField.setText ("");
        	}
        });
        btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnC.setBounds(60, 260, 50, 50);
        frame.getContentPane().add(btnC);
        
        
        //<<
        JButton btnRev = new JButton("<<");
        btnRev.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		String backspace = null;
        		
        		if (textField.getText().length()>0) {
        			StringBuilder strB = new StringBuilder (textField.getText());
        			strB.deleteCharAt(textField.getText().length() -1);
        			backspace= strB.toString ();
        			textField.setText(backspace);
        			
        		}
        	}
        });
        btnRev.setFont(new Font("Tahoma", Font.BOLD, 9));
        btnRev.setBounds(10, 260, 50, 50);
        frame.getContentPane().add(btnRev);
		
	}
}
