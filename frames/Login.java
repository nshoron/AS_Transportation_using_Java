package frames;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import oracle.jrockit.jfr.JFR;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.BufferedReader;

import java.awt.Font;

import java.io.*;



public class  Login extends JFrame implements ActionListener
{
	private JPanel panel;
	private JLabel lebelUsername;
	private JLabel lebelPassword;
	private JTextField textuser;
	private JPasswordField textPassword;
	private JButton buttonLogin;
	private JButton buttonBack;
	private JLabel image;
	
	

	
	public Login()
	{
		this.initializeComponents();
		this.setTitle("AS TRANSPORTATION");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void initializeComponents()
	{
		this.panel=new JPanel(null);
		
		this.lebelUsername=new JLabel("PLEASE LOGIN....!");
		this.lebelUsername.setBounds(185,40,400,40);
		lebelUsername.setFont(new Font("Cooper Black",Font.BOLD,25));
		lebelUsername.setForeground(Color.BLACK);
		this.panel.add(this.lebelUsername);

		
		
		this.lebelUsername=new JLabel("Username");
		this.lebelUsername.setBounds(140,95,300,45);
		this.panel.add(this.lebelUsername);

		this.textuser=new JTextField();
		this.textuser.setBounds(230,105,150,30);
		this.panel.add(this.textuser);		
		
		this.lebelPassword=new JLabel("Password");
		this.lebelPassword.setBounds(140,140,390,40);
		this.panel.add(this.lebelPassword);	

		this.textPassword=new JPasswordField();
		this.textPassword.setBounds(230,145,150,30);
		this.panel.add(this.textPassword);		
		
		
		this.buttonLogin=new JButton("LOGIN");
		this.buttonLogin.setBounds(320,260,85,30);
		this.buttonLogin.addActionListener(this);
		this.panel.add(this.buttonLogin);
		
			
		this.buttonBack=new JButton("BACK");
		this.buttonBack.setBounds(200,260,85,30);
		this.buttonBack.addActionListener(this);
		this.panel.add(this.buttonBack);

		
		ImageIcon imageIcon = new ImageIcon(".\\Image\\logine.jpeg");
		this.image = new JLabel(imageIcon);
		this.image.setBounds(0, 0, 617, 423);
		this.panel.add(this.image);
			

		this.add(this.panel);
		
	}
	
	
	  public void actionPerformed(ActionEvent e){
    String buttonText = e.getActionCommand();
	String buttonLogin =e.getActionCommand();
 if(buttonLogin.equals("LOGIN")){
	String user = textuser.getText();
	String pass = textPassword.getText();
	if (user.isEmpty()|| pass.isEmpty()) 
	{
		JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
				JOptionPane.WARNING_MESSAGE);
	}
	
	
	else {

		try {
			
			String userNameS = "User Name : " + user;
			String passwordS = "Password : " + pass;
			BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\history.txt"));

			int totalLines = 0;
			while (reader.readLine() != null)
				totalLines++;
			reader.close();

			for (int i = 0; i <= totalLines; i++) {
				String line = Files.readAllLines(Paths.get(".\\Data\\history.txt")).get(i);
				if (line.equals(userNameS)) {
					String line2 = Files.readAllLines(Paths.get(".\\Data\\history.txt")).get((i+1));
					if (line2.equals(passwordS)) {
						
						new HomePage();
						break;
					}
				}
			}
		} 
		catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
					JOptionPane.WARNING_MESSAGE);
		}
	}


}
 
	 else if (buttonText.equals("BACK")){
		new FirstPage();
		dispose();
    }
   

   }
}
