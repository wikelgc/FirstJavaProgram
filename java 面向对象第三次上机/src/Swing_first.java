import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JEditorPane;

import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Swing_first extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing_first frame = new Swing_first();
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
	public Swing_first() {
		super("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(14, 32, 474, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("�������鼮������:");
		lblNewLabel.setBounds(24, 13, 158, 18);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(24, 44, 443, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(14, 136, 474, 249);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("�������鼮����ϸ����:");
		lblNewLabel_1.setBounds(27, 13, 166, 18);
		panel_1.add(lblNewLabel_1);
		
		textArea = new TextArea();
		textArea.setBounds(26, 37, 438, 190);
		panel_1.add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(14, 384, 474, 53);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("   Ok    ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message1 = textField.getText();
				String message2 = textArea.getText();
				JOptionPane.showMessageDialog(null, "�鼮����:"+message1 + "\n�鼮����:" + message2, "��� ", 1);

			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" Cancer ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnNewButton_1);
	}
}
