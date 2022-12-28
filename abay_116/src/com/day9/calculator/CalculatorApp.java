package com.day9.calculator;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;




public class CalculatorApp {

	private JFrame frame;
	private JTextField textField;

	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp window = new CalculatorApp();
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
public CalculatorApp() {
	initialize();
}

/**
 * Initialize the contents of the frame.
 */
private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 256, 298);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	textField = new JTextField();
	textField.setBounds(6, 31, 242, 41);
	frame.getContentPane().add(textField);
	textField.setColumns(10);

	JButton backSpace = new JButton("B");
	backSpace.addActionListener((ActionListener) new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String backSpace = null;
			if(textField.getText().length()>0) {
				StringBuilder str = new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backSpace = str.toString();
				textField.setText(backSpace);
			}
		}
		
	});
	backSpace.setBounds(6, 84, 61, 41);
	frame.getContentPane().add(backSpace);
	JButton btn7 = new JButton("7");
	btn7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+btn7.getText();
			textField.setText(number);
		}
	});
	btn7.setBounds(6, 120, 61, 41);
	frame.getContentPane().add(btn7);

	JButton btn4 = new JButton("4");
	btn4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+btn4.getText();
			textField.setText(number);
		}
	});
	btn4.setBounds(6, 158, 61, 41);
	frame.getContentPane().add(btn4);

	JButton btn1 = new JButton("1");
	btn1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+btn1.getText();
			textField.setText(number);
		}
	});
	btn1.setBounds(6, 195, 61, 41);
	frame.getContentPane().add(btn1);

	JButton btn0 = new JButton("0");
	btn0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

		String number = textField.getText()+btn0.getText();
		textField.setText(number);
		}
	});
	btn0.setBounds(6, 231, 61, 41);
	frame.getContentPane().add(btn0);

	JButton btnC = new JButton("C");
	btnC.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textField.setText(null);
		}
	});
	btnC.setBounds(66, 84, 61, 41);
	frame.getContentPane().add(btnC);

	JButton btn8 = new JButton("8");
	btn8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+btn8.getText();
			textField.setText(number);
		}
	});
	btn8.setBounds(66, 120, 61, 41);
	frame.getContentPane().add(btn8);

	JButton btn5 = new JButton("5");
	btn5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+btn5.getText();
			textField.setText(number);
		}
	});
	btn5.setBounds(66, 158, 61, 41);
	frame.getContentPane().add(btn5);

	JButton btn2 = new JButton("2");
	btn2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+btn2.getText();
			textField.setText(number);
		}
	});
	btn2.setBounds(66, 195, 61, 41);
	frame.getContentPane().add(btn2);

	JButton btnDot = new JButton(".");
	btnDot.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			String number = textField.getText()+btnDot.getText();
			textField.setText(number);
		}
	});
	btnDot.setBounds(66, 231, 61, 41);
	frame.getContentPane().add(btnDot);

	JButton btn00 = new JButton("00");
	btn00.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+btn00.getText();
			textField.setText(number);
		}
	});
	btn00.setBounds(126, 84, 61, 41);
	frame.getContentPane().add(btn00);

	JButton btn9 = new JButton("9");
	btn9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+btn9.getText();
			textField.setText(number);
		}
	});
	btn9.setBounds(126, 120, 61, 41);
	frame.getContentPane().add(btn9);

	JButton btn6 = new JButton("6");
	btn6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+ btn9.getText();
			textField.setText(number);
		}
	});
	btn6.setBounds(126, 158, 61, 41);
	frame.getContentPane().add(btn6);

	JButton btn3 = new JButton("3");
	btn3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String number = textField.getText()+btn3.getText();
			textField.setText(number);
		}
	});
	btn3.setBounds(126, 195, 61, 41);
	frame.getContentPane().add(btn3);

	JButton btnNewButton_5_9 = new JButton("=");
	btnNewButton_5_9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		//String answer;
			second = Double.parseDouble(textField.getText());
			if (operation == "+") {
				result =first + second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			if (operation == "-") {
				result =first - second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if (operation == "*") {
				result =first * second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if (operation == "/") {
				result =first / second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if (operation == "%") {
				result =first % second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
		}
	});
	btnNewButton_5_9.setBounds(126, 231, 61, 41);
	frame.getContentPane().add(btnNewButton_5_9);

	JButton btnNewButton_5_10 = new JButton("+");
	btnNewButton_5_10.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "+";
		}
	});
	btnNewButton_5_10.setBounds(188, 84, 61, 41);
	frame.getContentPane().add(btnNewButton_5_10);

	JButton btnNewButton_5_11 = new JButton("-");
	btnNewButton_5_11.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "-";
		}
	});
	btnNewButton_5_11.setBounds(188, 120, 61, 41);
	frame.getContentPane().add(btnNewButton_5_11);

	JButton btnNewButton_5_12 = new JButton("*");
	btnNewButton_5_12.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "*";
		}
	});
	btnNewButton_5_12.setBounds(188, 158, 61, 41);
	frame.getContentPane().add(btnNewButton_5_12);

	JButton btnNewButton_5_13 = new JButton("/");
	btnNewButton_5_13.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "/";
		}
	});
	btnNewButton_5_13.setBounds(188, 195, 61, 41);
	frame.getContentPane().add(btnNewButton_5_13);

	JButton btnNewButton_5_14 = new JButton("%");
	btnNewButton_5_14.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "%";
		}
	});
	btnNewButton_5_14.setBounds(188, 231, 61, 41);
	frame.getContentPane().add(btnNewButton_5_14);
}
}
	
	
	
	
	
	
	
	
	
	
