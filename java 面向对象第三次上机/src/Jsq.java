import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;


public class Jsq extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	int a,b,d;
	int flag=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jsq frame = new Jsq();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jsq() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(14, 13, 301, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 13, 301, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(14, 84, 301, 214);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
				if(flag==0)
				{
					a = 1;
					//flag = 1;
				}
				else if(flag == 1 )
				{
					b = 1;
					flag = 2;
				}
				
			}
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");
				if(flag==0)
				{
					a = 2;
					//flag = 1;
				}
				else if(flag == 1 )
				{
					b = 2;
					flag = 2;
				}
			}
		});
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
				if(flag==0)
				{
					a = 3;
					//flag = 1;
				}
				else if(flag == 1 )
				{
					b = 3;
					flag = 2;
				}
			}
		});
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_8 = new JButton("+");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d=1;
				flag=1;
			}
		});
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_12 = new JButton("4");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
				if(flag==0)
				{
					a=4;
					//flag = 1;
				}
				else if(flag == 1 )
				{
					b = 4;
					flag = 2;
				}
			}
		});
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_3 = new JButton("5");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");
				if(flag==0)
				{
					a=5;
					//flag = 1;
				}
				else if(flag == 1 )
				{
					b = 5;
					flag = 2;
				}
			}
		});
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
				if(flag==0)
				{
					a=6;
					//flag = 1;
				}
				else if(flag == 1 )
				{
					b = 6;
					flag = 2;
				}
			}
		});
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d = 2;
				flag=1;
			}
		});
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("7");
				if(flag==0)
				{
					a=7;
					//flag = 1;
				}
				else if(flag == 1 )
				{
					b = 7;
					flag = 2;
				}
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
				if(flag==0)
				{
					a=8;
					//flag = 1;
				}
				else if(flag == 1 )
				{
					b = 8;
					flag = 2;
				}
			}
		});
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("9");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
				if(flag==0)
				{
					a=9;
					//flag = 1;
				}
				else if(flag == 1 )
				{
					b = 9;
					flag = 2;
				}
			}
		});
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("*");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d=3;
				flag=1;
			}
		});
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				if(flag==0)
				{
					a = 0;
					//flag = 1;
				}
				else if(flag == 1 )
				{
					b = 0;
					flag = 2;
				}
			}
		});
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton(".");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(flag == 2){
				if(d==1)
					textField.setText((a+b)+"");
				else if(d==2)
				textField.setText((a-b)+"");
				else if(d==3)
					textField.setText((a*b)+"");
				else if(d==4)
					textField.setText((a/b)+"");
				}
				flag = 0;	
			}
		});
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d = 4;
				flag=1;
			}
		});
		panel_1.add(btnNewButton_15);
	}

}
