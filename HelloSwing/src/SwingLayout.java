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
	//构造方法
	public SwingLayout(){
		super("布局显示");
		//初始化容器
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(2,1));
		
		//创建两个中间容器panel，并设定布局
		JPanel upperPanel = new JPanel(new FlowLayout());
		JPanel lowJPanel  = new JPanel(new FlowLayout());
		
		//创建四个组件
		JTextField messageText = new JTextField(10);
		JLabel    messageLabel = new JLabel("message:");
		JButton    clearButton = new JButton("clear");
		JButton    closeButton = new JButton("close");
		
		//添加组件到panel
		//添加标签和文本框到upperPanel
		upperPanel.add(messageLabel);
		upperPanel.add(messageText);
		//添加按钮到lowerpanel
		lowJPanel.add(clearButton);
		lowJPanel.add(closeButton);
		
		//在主容器上添加panel
		c.add(upperPanel);
		c.add(lowJPanel);
//		c.add(new JButton("好的"));`                                                                                            
//		c.add(new JButton("坏的"));
		
		//关闭窗口时结束程序运行
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗口的大小
	    this.setSize(300,300);
		//设置窗口可见
		this.setVisible(true);	
	}
	
	@SuppressWarnings("unused")
	public static void main(String args[]){
		//创建一个实例
		SwingLayout myApp = new SwingLayout();
	}
}
