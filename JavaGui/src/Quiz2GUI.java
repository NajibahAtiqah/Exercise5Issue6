import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz2GUI {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2GUI window = new Quiz2GUI();
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
	public Quiz2GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(10, 11, 414, 49);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel1 = new JLabel("H20 CALCULATOR");
		lblNewLabel1.setFont(new Font("OCR A Extended", Font.BOLD, 30));
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 153));
		panel_2.setBounds(10, 112, 414, 37);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel3 = new JLabel("Enter weight (Kg) :");
		lblNewLabel3.setFont(new Font("DialogInput", Font.PLAIN, 15));
		panel_2.add(lblNewLabel3);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("DialogInput", Font.PLAIN, 15));
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Based on your weight,");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("DialogInput", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 54, 414, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(154, 160, 124, 27);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				double num1,ans;
				try {
					num1=Double.parseDouble(textField1.getText());
					
					ans=num1/25;
					textField2.setText(Double.toString(ans));
					
				}catch(Exception e) {	
					
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton.setFont(new Font("DialogInput", Font.PLAIN, 13));
		btnNewButton.setBackground(new Color(255, 255, 102));
		
		JLabel lblNewLabel_1 = new JLabel("calculate the amount of water needed in a day?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("DialogInput", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(20, 81, 414, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel4 = new JLabel("Total water needed in litre :");
		lblNewLabel4.setBounds(46, 234, 232, 18);
		frame.getContentPane().add(lblNewLabel4);
		lblNewLabel4.setFont(new Font("DialogInput", Font.BOLD, 13));
		
		textField2 = new JTextField();
		textField2.setBounds(278, 231, 86, 24);
		frame.getContentPane().add(textField2);
		textField2.setFont(new Font("DialogInput", Font.BOLD, 13));
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setColumns(10);
	}

}
