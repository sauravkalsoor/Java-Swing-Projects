import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginSystem {
	JFrame mainFrame;
	JLabel username;
	JLabel password;
	JPasswordField enterPassword;
	JTextField enterUsername;
	JButton login;
	JButton reset;
	
	public void setComponents()
	{
		mainFrame = new JFrame("Login Form");
		username = new JLabel("Username: ");
		password = new JLabel("Password: ");
		enterPassword = new JPasswordField();
		enterUsername = new JTextField();
		login = new JButton("Login");
		reset = new JButton("Reset");
		
		
	}
	
	public void addComponents()
	{
		mainFrame.setSize(300,150);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainFrame.add(username);
		mainFrame.add(enterUsername);
		mainFrame.add(password);
		mainFrame.add(enterPassword);
		mainFrame.add(login);
		mainFrame.add(reset);
		
		username.setBounds(20,0,90,50);
		enterUsername.setBounds(100,15,130,20);
		password.setBounds(20,30,90,50);
		enterPassword.setBounds(100,45,130,20);
		login.setBounds(40,80,70,30);
		reset.setBounds(150,80,70,30);
		
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				enterPassword.setText(null);
				enterUsername.setText(null);
			}
		});
		
		login.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e)
			{
				String user = enterUsername.getText();

				String pass = enterPassword.getText();
				
				if(user.equalsIgnoreCase("saurav") && pass.equalsIgnoreCase("saurav"))
				{
					LoginSystem.main(null);
				}
				else
				{
					
				}
			}
		});
	}
	
	public void setActions()
	{
		
	}
	public static void main(String[] args)
	{
		LoginSystem ls = new LoginSystem();
		ls.setComponents();
		ls.addComponents();
		ls.setActions();
	}
}
