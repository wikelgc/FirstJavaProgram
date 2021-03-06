import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//CalculateDemo

public class Student extends JFrame implements ActionListener {
	Student_1 stu;
	JTextField messageTextName,messageTextYear,messageTextDay,messageTextMonth;
	JTextArea resultText;
	JButton calBtn;
	JButton closeBth;
	
	//Constructor
	public Student(){
		super("计算圆的面积和周长");
		
		/*创建容器*/ 
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JPanel centerPanel = new JPanel(new FlowLayout());
		JPanel centerPane2 = new JPanel(new FlowLayout());
		JPanel centerPane3 = new JPanel(new FlowLayout());
		
		//创建组件标签，文本款和按钮
		messageTextName = new JTextField(10);
		messageTextYear = new JTextField(4);
		messageTextDay = new JTextField(2);
		messageTextMonth = new JTextField(2);
		JLabel messageJLabel  = new JLabel("  请 输 入 姓 名  ");
		JLabel messageJLabel1 = new JLabel("请输入出生日期");
		calBtn = new JButton("计算年龄");
		closeBth = new JButton("关闭窗口");
		resultText = new JTextArea("计算结果:",4,20);
		
		//添加组件到容器
		centerPanel.add(messageJLabel);  //请输入姓名
		centerPanel.add(messageTextName);
		centerPane2.add(messageJLabel1); //请输入出生日期
		centerPane2.add(messageTextYear);
		centerPane2.add(messageTextMonth);
		centerPane2.add(messageTextDay);
		centerPane3.add(calBtn);
		centerPane3.add(closeBth);
		c.add(centerPanel);
		c.add(centerPane2);
		c.add(centerPane3);
		c.add(resultText);
		
		//注册事件到监听器
		calBtn.addActionListener(this);
		closeBth.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,270);
		this.setVisible(true);
	}
	
	public static void main(String args[]){
		new Student();
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
		String messagename = messageTextName.getText();
		String messageYear = messageTextYear.getText();
		String messageMonth = messageTextMonth.getText();
		String messageDay = messageTextDay.getText();
		int Year = Integer.parseInt(messageYear);
		int Month= Integer.parseInt(messageMonth);
		int Day = Integer.parseInt(messageDay);
		
		
		if(messageYear.length() == 0)
			JOptionPane.showMessageDialog(null,"请输入学生信息!","提示",1);
		else{
			
			 Student_1 Stud = new Student_1(messagename, Year,Month, Day);
			  
			int age = Stud.calAge();

			
			//在文本区域中显示计算的结果，小数点后保留两位
			resultText.setText("计算结果如下:\n");
			resultText.append(messagename+"的年龄"+ age);
		}
	}
	
	public void shutDown(){
		System.exit(0);
	}

}
