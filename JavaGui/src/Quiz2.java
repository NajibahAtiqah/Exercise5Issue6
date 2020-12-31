import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class Quiz2 {

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
					Quiz2 window = new Quiz2();
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
	public Quiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JPanel paneltajuk = new JPanel();
		paneltajuk.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		paneltajuk.setBackground(new Color(204, 204, 255));
		paneltajuk.setBounds(10, 11, 414, 42);
		frame.getContentPane().add(paneltajuk);
		
		JLabel lblNewLabel = new JLabel("H20 CALCULATOR");
		lblNewLabel.setFont(new Font("OCR A Extended", Font.BOLD, 30));
		paneltajuk.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 153, 255));
		panel_1.setBounds(10, 130, 414, 47);
		frame.getContentPane().add(panel_1);
		
		JLabel lblWeight = new JLabel("Enter weight in Kg :");
		lblWeight.setVerticalAlignment(SwingConstants.BOTTOM);
		lblWeight.setFont(new Font("DialogInput", Font.PLAIN, 16));
		panel_1.add(lblWeight);
		
		textField1 = new JTextField();
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_1.add(textField1);
		textField1.setColumns(10);
		
		JPanel panelhijau = new JPanel();
		panelhijau.setBackground(new Color(204, 255, 204));
		panelhijau.setBounds(10, 74, 414, 45);
		frame.getContentPane().add(panelhijau);
		
		JLabel lblsoklan = new JLabel("How much water do I need in order to stay healthy?");
		lblsoklan.setFont(new Font("DialogInput", Font.PLAIN, 13));
		panelhijau.add(lblsoklan);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBackground(new Color(255, 255, 204));
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
		{
		};
		btnNewButton.setFont(new Font("DialogInput", Font.PLAIN, 13));
		btnNewButton.setBounds(172, 295, 110, 32);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panelpink = new JPanel();
		panelpink.setBackground(new Color(255, 204, 204));
		panelpink.setBounds(10, 188, 414, 68);
		frame.getContentPane().add(panelpink);
		
		JLabel lblAnswer = new JLabel("Total water needed is (litre) :");
		lblAnswer.setFont(new Font("DialogInput", Font.BOLD, 16));
		panelpink.add(lblAnswer);
		
		textField2 = new JTextField();
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setFont(new Font("DialogInput", Font.BOLD, 15));
		panelpink.add(textField2);
		textField2.setColumns(10);
		
		JLabel lblnotes = new JLabel("P/s: Pls drink enough water people!");
		lblnotes.setBounds(90, 266, 280, 18);
		frame.getContentPane().add(lblnotes);
		lblnotes.setFont(new Font("DialogInput", Font.PLAIN, 13));
	}
		}
