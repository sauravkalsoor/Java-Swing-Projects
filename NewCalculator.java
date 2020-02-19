import javax.swing.*;
import java.awt.event.*;
public class NewCalculator {

	JFrame mainFrame;
	JTextField display;
	JButton num1,num2,num3,num4,num5,num6,num7,num8,num9;
	JButton add,sub,div,mul,ans,clear;
	double firstnum;
	double secondnum;
	char operation;
	
	public void setComponents()
	{
		
		mainFrame = new JFrame("Calculator");
		display = new JTextField();
		num1 = new JButton("1");
		num2 = new JButton("2");
		num3 = new JButton("3");
		num4 = new JButton("4");
		num5 = new JButton("5");
		num6 = new JButton("6");
		num7 = new JButton("7");
		num8 = new JButton("8");
		num9 = new JButton("9");
		add = new JButton("+");
		sub = new JButton("-");
		div = new JButton("/");
		mul = new JButton("X");
		ans = new JButton("Ans");
		clear = new JButton("Clear");
		
	}
	
	public void addComponents()
	{
		mainFrame.setSize(500,500);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainFrame.add(display);
		mainFrame.add(num1);
		mainFrame.add(num2);
		mainFrame.add(num3);
		mainFrame.add(num4);
		mainFrame.add(num5);
		mainFrame.add(num6);
		mainFrame.add(num7);
		mainFrame.add(num8);
		mainFrame.add(num9);
		mainFrame.add(add);
		mainFrame.add(sub);
		mainFrame.add(div);
		mainFrame.add(mul);
		mainFrame.add(ans);
		mainFrame.add(clear);
		
		display.setBounds(10,10,480,60);
		num1.setBounds(30,90,90,90);
		num4.setBounds(30,200,90,90);
		num7.setBounds(30,310,90,90);
		num2.setBounds(140,90,90,90);
		num5.setBounds(140,200,90,90);
		num8.setBounds(140,310,90,90);
		num3.setBounds(250,90,90,90);
		num6.setBounds(250,200,90,90);
		num9.setBounds(250,310,90,90);
		add.setBounds(355,90,120,70);
		sub.setBounds(355,170,120,70);
		mul.setBounds(355,250,120,70);
		div.setBounds(355,330,120,70);
		ans.setBounds(60,410,220,50);
		clear.setBounds(340,410,70,50);
	}
	
	public void setButtons()
	{
		num1.addActionListener(new Handler("1"));
		num2.addActionListener(new Handler("2"));
		num3.addActionListener(new Handler("3"));
		num4.addActionListener(new Handler("4"));
		num5.addActionListener(new Handler("5"));
		num6.addActionListener(new Handler("6"));
		num7.addActionListener(new Handler("7"));
		num8.addActionListener(new Handler("8"));
		num9.addActionListener(new Handler("9"));
		add.addActionListener(new Handler("10"));
		sub.addActionListener(new Handler("11"));
		mul.addActionListener(new Handler("12"));
		div.addActionListener(new Handler("13"));
		clear.addActionListener(new Handler("-1"));
		ans.addActionListener(new Handler("14"));
	}
	
	class Handler implements ActionListener
	{
		
		public int type;
		public Handler(String s)
		{
			type = Integer.parseInt(s);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			if(type>=1 && type<=9)
			{
				display.setText(display.getText()+type);
			}
			else if(type==-1)
			{
				display.setText("");
			}
			else
			{
				if(type==10)
				{
					firstnum=Double.parseDouble(display.getText());
					display.setText(null);
					operation='+';
				}
					
				if(type==11)
				{
					firstnum=Double.parseDouble(display.getText());
					display.setText(null);
					operation='-';
				}
				if(type==12)
				{
					firstnum=Double.parseDouble(display.getText());
					display.setText(null);
					operation='x';
				}
				if(type==13)
				{
					firstnum=Double.parseDouble(display.getText());
					display.setText(null);
					operation='/';
				}
				if(type==14)
				{
					Double ans=0.0;
					secondnum=Double.parseDouble(display.getText());
					if(operation=='+')
					{
						ans=firstnum+secondnum;
					}
					else if(operation=='-')
					{
						ans=firstnum-secondnum;
					}
					else if(operation=='x')
					{
						ans=firstnum*secondnum;
					}
					else
					{
						ans=firstnum/secondnum;
					}
					display.setText(""+ans);
				}
					
			}
			
			
		}
	}
	
	public static void main(String []args)
	{
		NewCalculator nc = new NewCalculator();
		nc.setComponents();
		nc.addComponents();
		nc.setButtons();
	}
}
