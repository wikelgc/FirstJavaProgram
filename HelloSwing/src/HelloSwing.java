import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class HelloSwing extends JFrame{
	//构造方法
	public HelloSwing(){
		
		super("组件显示");
		//初始胡容器
		Container c = this.getContentPane();
		//设置容器排列组件的形式
		c.setLayout(new FlowLayout());
		
		//创建文本框,初始化文本框
		JTextField messageText = new JTextField(10);
		//创建标签"message"
		JLabel messageLabel = new JLabel("message:");
		
		//创建按钮
		JButton okBtn =new JButton("ok");
		
		//添加标签，文本框和按钮到容器
		c.add(messageLabel);
		c.add(messageText);
		c.add(okBtn);
		
		//关闭窗口时结束程序运行
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗口的大小
		this.setSize(300,100);
		//设置窗口可见
		this.setVisible(true);	
	}
	
	public static void main(String args[]){
		//创建窗口的一个实例
		HelloSwing myapp = new HelloSwing();		
	}

}
