package 数据访问类的实现;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JPasswordField;

public class studentView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentView frame = new studentView();
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
	public studentView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 24));
		lblNewLabel.setBounds(14, 0, 212, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("userID");
		lblNewLabel_1.setBounds(50, 50, 95, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(160, 50, 120, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("userpress");
		lblNewLabel_2.setBounds(50, 90, 95, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("username");
		lblNewLabel_3.setBounds(50, 130, 95, 20);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 130, 120, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User firstUser;
				String userID = textField.getText();
				String username = textField_2.getText();
				String userpress = passwordField.getText();
				
				UserDA.initialize();
				//测试find方法
				try{
					firstUser = UserDA.find(userID);
					System.out.println("查询"+firstUser.getDetails());
				}
				catch(NotFoundException ee){
					System.out.println(ee);
					
				}
				UserDA.terminate();
				JOptionPane.showMessageDialog(null, "查找成功", "提示", 1, null);
			}
		});
		
		btnNewButton.setBounds(10, 180, 80, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userID = textField.getText();
				String username = textField_2.getText();
				String userpress = passwordField.getText();
				
				User firstUser  = new User(userID, username, userpress);
				
				UserDA.initialize();
				
				//测试add方法
				try{
					UserDA.add(firstUser);			
					JOptionPane.showMessageDialog(null, "添加成功", "提示", 1, null);
					
				}
				catch(DuplicateException ee){
					System.out.print(ee);
				}
				UserDA.terminate();		
			}
		});
		btnNewButton_1.setBounds(100, 180, 80, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("delect");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userID = textField.getText();
				
				UserDA.initialize();
				
//				try{
					UserDA.delete(userID);
					System.out.println("已要删除ID:"+userID);
//				}
//				catch(NotFoundException eee){
//					System.out.println(eee);
//				}
				JOptionPane.showMessageDialog(null, "删除成功", "提示", 1, null);
				UserDA.terminate();
				
			}
		});
		btnNewButton_2.setBounds(190, 180, 80, 30);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("updata");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				
				String userID = textField.getText();
				String userpress = passwordField.getText();
				UserDA.initialize();
				User firstUser;
				//测试update方法
				try{
					firstUser = UserDA.find("userID");
					firstUser.setPassword("userperss");
					UserDA.updata(firstUser);
				}
				catch(NotFoundException ee){
					System.out.println(ee);
				}
				JOptionPane.showMessageDialog(null, "修改成功", "提示", 1, null);
				UserDA.terminate();
//				
			}
		});
		btnNewButton_3.setBounds(280, 180, 80, 30);
		contentPane.add(btnNewButton_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(160, 90, 120, 24);
		contentPane.add(passwordField);
	}
}
