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

//继承java的JFrame类，实现java的ActionListener接口
@SuppressWarnings("serial")
public class handleEvent extends JFrame implements ActionListener{
	//声明全局变量
	JTextField messageText;
	JButton clearButton,closeButton;
	JLabel messageJLabel;
	
	//构造方法
	public handleEvent(){
		//创建容器
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(2,1));
		JPanel upperPanel = new JPanel(new FlowLayout());
		JPanel lowerPanel = new JPanel(new FlowLayout());
		
		//创建组件并加组件到相应容器
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
		
		//注册按钮事件到监听器Frame,以监听器按钮事件
		clearButton.addActionListener(this);
		closeButton.addActionListener(this);
		
		this.setSize(300,140);
		this.setTitle("Example of Handling Event");
		this.setVisible(true);	
	}
	
	public static void main(String args[]){
		new handleEvent();
	}
	
	
	//ActionListener  接收事件和分派事件  
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == clearButton){
			clearText();
		}
		if(e.getSource() == closeButton){
			shutDown();
		}
	}
	
	//清楚clear事件的处理方法
	private void clearText(){
		messageText.setText("");
	}
	
	//关闭窗口的处理方法
	public void shutDown(){
		System.exit(0);
	}
}
