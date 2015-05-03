import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class SwingLayout extends JFrame {
	//���췽��
	public SwingLayout(){
		super("������ʾ");
		//��ʼ������
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(2,1));
		
		//���������м�����panel�����趨����
		JPanel upperPanel = new JPanel(new FlowLayout());
		JPanel lowJPanel  = new JPanel(new FlowLayout());
		
		//�����ĸ����
		JTextField messageText = new JTextField(10);
		JLabel    messageLabel = new JLabel("message:");
		JButton    clearButton = new JButton("clear");
		JButton    closeButton = new JButton("close");
		
		//��������panel
		//��ӱ�ǩ���ı���upperPanel
		upperPanel.add(messageLabel);
		upperPanel.add(messageText);
		//��Ӱ�ť��lowerpanel
		lowJPanel.add(clearButton);
		lowJPanel.add(closeButton);
		
		//�������������panel
		c.add(upperPanel);
		c.add(lowJPanel);
//		c.add(new JButton("�õ�"));`                                                                                            
//		c.add(new JButton("����"));
		
		//�رմ���ʱ������������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô��ڵĴ�С
	    this.setSize(300,300);
		//���ô��ڿɼ�
		this.setVisible(true);	
	}
	
	@SuppressWarnings("unused")
	public static void main(String args[]){
		//����һ��ʵ��
		SwingLayout myApp = new SwingLayout();
	}
}
