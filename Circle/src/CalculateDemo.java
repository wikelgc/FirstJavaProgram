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

public class CalculateDemo extends JFrame implements ActionListener {
	Circle theCircle;
	JTextField messageText;
	JTextArea resultText;
	JButton calBtn;
	JButton closeBth;
	
	//Constructor
	public CalculateDemo(){
		super("计算圆的面积和周长");
		
		/*创建容器*/
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JPanel centerPanel = new JPanel(new FlowLayout());
		
		//创建组件标签，文本款和按钮
		messageText = new JTextField(5);
		JLabel messageJLabel = new JLabel("输入圆的半径");
		calBtn = new JButton("计算");
		closeBth = new JButton("关闭窗口");
		resultText = new JTextArea("计算结果:",4,20);
		
		//添加组件到容器
		centerPanel.add(messageJLabel);
		centerPanel.add(messageText);
		centerPanel.add(calBtn);
		centerPanel.add(closeBth);
		c.add(centerPanel);
		c.add(resultText);
		
		//注册事件到监听器
		calBtn.addActionListener(this);
		closeBth.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,170);
		this.setVisible(true);
	}
	
	public static void main(String args[]){
		new CalculateDemo();
	}
	
	public void  actionPerformed(ActionEvent e) {
		//判断事件源是否是"计算"按钮
		if(e.getSource() == calBtn){
			calculate();
		}
		if(e.getSource() == closeBth){
			shutDown();
		}
		
	}
	
	//处理按钮"计算"事件方法
	private void calculate(){
		String message = messageText.getText();
		if(message.length() == 0)
			JOptionPane.showMessageDialog(null,"请输入圆的半径!","提示",1);
		else{
			int radius = Integer.parseInt(message);
			theCircle = new Circle(radius);
			int theRadius = theCircle.getRadius();
			double girth = theCircle.calGirth();
			double area = theCircle.calArea();
			
			//在文本区域中显示计算的结果，小数点后保留两位
			resultText.setText("计算结果如下:");
			resultText.append("\n圆的半径"+ theRadius);
			resultText.append("\n圆的周长是"+new DecimalFormat("#.00").format(girth));
			resultText.append("\n圆的面积是"+new DecimalFormat("#.00").format(area));
			
		}
	}
	
	public void shutDown(){
		System.exit(0);
	}

}
