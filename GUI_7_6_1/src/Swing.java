
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//CalculateDemo

public class Swing extends JFrame implements ActionListener {
	//Circle theCircle;
	JTextField messageText,messageText1,messageText2;
	JTextArea resultText;
	JButton calBtn;
	JButton closeBth;
	
	//Constructor
	public Swing(){
		super("����Բ��������ܳ�");
		
		/*��������*/
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JPanel centerPanel = new JPanel(new FlowLayout());
		
		//���������ǩ���ı���Ͱ�ť
		messageText = new JTextField(5);
		JLabel messageJLabel = new JLabel("�������鼮����");
		messageText1 = new JTextField(5);
		JLabel messageJLabe2 = new JLabel("��������鼮����ϸ����:");
		messageText2 = new JTextField(5);
		calBtn = new JButton("OK");
		closeBth = new JButton("Cancel");
		//resultText = new JTextArea("������:",4,20);
		
		//�������������
		centerPanel.add(messageJLabel);
		centerPanel.add(messageText1);
		centerPanel.add(messageJLabe2);
		centerPanel.add(messageText2);
		centerPanel.add(calBtn);
		centerPanel.add(closeBth);
		c.add(centerPanel);
		//c.add(resultText);
		
		//ע���¼���������
		calBtn.addActionListener(this);
		closeBth.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,170);
		this.setVisible(true);
	}
	
	public static void main(String args[]){
		new Swing();
	}
	
	public void  actionPerformed(ActionEvent e) {
		//�ж��¼�Դ�Ƿ���"����"��ť
		if(e.getSource() == calBtn){
			calculate();
		}
		if(e.getSource() == closeBth){
			shutDown();
		}
		
	}
	
	//������ť"����"�¼�����
	private void calculate(){
		String message = messageText.getText();
		if(message.length() == 0)
			JOptionPane.showMessageDialog(null,"������Բ�İ뾶!","��ʾ",1);
		else{
//			int radius = Integer.parseInt(message);
//			theCircle = new Circle(radius);
//			int theRadius = theCircle.getRadius();
//			double girth = theCircle.calGirth();
//			double area = theCircle.calArea();
//			
//			//���ı���������ʾ����Ľ����С���������λ
//			resultText.setText("����������:");
//			resultText.append("\nԲ�İ뾶"+ theRadius);
//			resultText.append("\nԲ���ܳ���"+new DecimalFormat("#.00").format(girth));
//			resultText.append("\nԲ�������"+new DecimalFormat("#.00").format(area));
			
		}
	}
	
	public void shutDown(){
		System.exit(0);
	}

}