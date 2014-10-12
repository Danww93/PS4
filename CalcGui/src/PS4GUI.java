import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;




public class PS4GUI {

	private JFrame frame;
	private JTextField Amount;
	private JTextField years;
	private JTextField rate;
	private JLabel lblAnnualInterestRate;
	private JButton btnCalculate;
	private double amount = 0;
	private int year = 0;
	private double IRate = 0;
	private double fv = 0;
	private JTextArea textArea;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PS4GUI window = new PS4GUI();
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
	public PS4GUI() {
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
		
		Amount = new JTextField();
		Amount.setBounds(211, 43, 213, 20);
		frame.getContentPane().add(Amount);
		Amount.setColumns(10);
		
		
		years = new JTextField();
		years.setBounds(211, 66, 213, 20);
		frame.getContentPane().add(years);
		years.setColumns(10);
		
		
		rate = new JTextField();
		rate.setBounds(211, 89, 213, 20);
		frame.getContentPane().add(rate);
		rate.setColumns(10);
		
		
		JLabel lblInvestmentAmount = new JLabel("Investment Amount");
		lblInvestmentAmount.setBounds(32, 46, 169, 14);
		frame.getContentPane().add(lblInvestmentAmount);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(32, 69, 123, 14);
		frame.getContentPane().add(lblYears);
		
		lblAnnualInterestRate = new JLabel("Annual Interest Rate");
		lblAnnualInterestRate.setBounds(32, 92, 137, 14);
		frame.getContentPane().add(lblAnnualInterestRate);
		
		JLabel lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setBounds(32, 118, 96, 14);
		frame.getContentPane().add(lblFutureValue);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(138, 167, 147, 56);
		frame.getContentPane().add(btnCalculate);
		
		
		textArea = new JTextArea();
		textArea.setBackground(SystemColor.menu);
		textArea.setBounds(211, 120, 213, 22);
		frame.getContentPane().add(textArea);
		
		{
			btnCalculate.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
		        
				amount = Double.parseDouble(Amount.getText());
				year = Integer.parseInt(years.getText());
				IRate = Double.parseDouble(rate.getText());
				fv = CalcFutureValue.FutureValue(amount, year, IRate / 100);
				textArea.setText("" + fv);
				
				
		    }});
			
			
		}
		
	}
}
