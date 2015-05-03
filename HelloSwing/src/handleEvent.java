import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//�̳�java��JFrame�࣬ʵ��java��ActionListener�ӿ�
@SuppressWarnings("serial")
public class handleEvent extends JFrame implements ActionListener{
	//����ȫ�ֱ���
	JTextField messageText;
	JButton clearButton,closeButton;
	JLabel messageJLabel;
	
	//���췽��
	public handleEvent(){
		//��������
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(2,1));
		JPanel upperPanel = new JPanel(new FlowLayout());
		JPanel lowerPanel = new JPanel(new FlowLayout());
		
		//������������������Ӧ����
		messageText = new JTextField(10);
		messageJLabel = new JLabel("Message:");
		upperPanel.add(messageJLabel);
		upperPanel.add(messageText);
		c.add(upperPanel);
		
		clearButton = new JButton("clear");
		closeButton = new JButton("close");
		lowerPanel.add(clearButton);
		lowerPanel.add(closeButton);
		c.add(lowerPanel);
		
		//ע�ᰴť�¼���������Frame,�Լ�������ť�¼�
		clearButton.addActionListener(this);
		closeButton.addActionListener(this);
		
		this.setSize(300,140);
		this.setTitle("Example of Handling Event");
		this.setVisible(true);	
	}
	
	public static void main(String args[]){
		new handleEvent();
	}
	
	
	//ActionListener  �����¼��ͷ����¼�  
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == clearButton){
			clearText();
		}
		if(e.getSource() == closeButton){
			shutDown();
		}
	}
	
	//���clear�¼��Ĵ�������
	private void clearText(){
		messageText.setText("");
	}
	
	//�رմ��ڵĴ�������
	public void shutDown(){
		System.exit(0);
	}
}