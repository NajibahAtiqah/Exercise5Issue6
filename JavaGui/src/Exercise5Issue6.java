import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Exercise5Issue6 {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5Issue6 window = new Exercise5Issue6();
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
	public Exercise5Issue6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setBounds(38, 22, 117, 37);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setBounds(250, 22, 107, 37);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnADD = new JButton("+");
		btnADD.setBackground(new Color(255, 218, 185));
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
				ans=num1+num2;
				textField3.setText(Integer.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnADD.setFont(new Font("Rockwell Condensed", Font.BOLD, 25));
		btnADD.setBounds(131, 81, 68, 37);
		frame.getContentPane().add(btnADD);
		
		JButton btnMINUS = new JButton("-");
		btnMINUS.setBackground(new Color(255, 192, 203));
		btnMINUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
				ans=num1-num2;
				textField3.setText(Integer.toString(ans));
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnMINUS.setFont(new Font("Rockwell Condensed", Font.BOLD, 35));
		btnMINUS.setBounds(209, 80, 68, 38);
		frame.getContentPane().add(btnMINUS);
		
		JButton btnMULTIPLE = new JButton("\u00D7");
		btnMULTIPLE.setBackground(new Color(173, 216, 230));
		btnMULTIPLE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
				ans=num1*num2;
				textField3.setText(Integer.toString(ans));
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnMULTIPLE.setFont(new Font("Rockwell Condensed", Font.BOLD, 25));
		btnMULTIPLE.setBounds(131, 129, 68, 37);
		frame.getContentPane().add(btnMULTIPLE);
		
		JButton btnDIVIDE = new JButton("\u00F7");
		btnDIVIDE.setBackground(new Color(216, 191, 216));
		btnDIVIDE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
				ans=num1/num2;
				textField3.setText(Integer.toString(ans));
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnDIVIDE.setFont(new Font("Rockwell Condensed", Font.BOLD, 25));
		btnDIVIDE.setBounds(209, 129, 68, 37);
		frame.getContentPane().add(btnDIVIDE);
		
		textField3 = new JTextField();
		textField3.setBounds(250, 205, 107, 27);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel lblAnswer = new JLabel("THE ANSWER IS :");
		lblAnswer.setFont(new Font("Bookman Old Style", Font.BOLD, 16));
		lblAnswer.setBounds(77, 212, 151, 17);
		frame.getContentPane().add(lblAnswer);
	}
}
