import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class HelloSwing extends JFrame{
	//���췽��
	public HelloSwing(){
		
		super("�����ʾ");
		//��ʼ������
		Container c = this.getContentPane();
		//�������������������ʽ
		c.setLayout(new FlowLayout());
		
		//�����ı���,��ʼ���ı���
		JTextField messageText = new JTextField(10);
		//������ǩ"message"
		JLabel messageLabel = new JLabel("message:");
		
		//������ť
		JButton okBtn =new JButton("ok");
		
		//���ӱ�ǩ���ı���Ͱ�ť������
		c.add(messageLabel);
		c.add(messageText);
		c.add(okBtn);
		
		//�رմ���ʱ������������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô��ڵĴ�С
		this.setSize(300,100);
		//���ô��ڿɼ�
		this.setVisible(true);	
	}
	public static void main(String args[]){
		//�������ڵ�һ��ʵ��
		HelloSwing myapp = new HelloSwing();		
	}

}