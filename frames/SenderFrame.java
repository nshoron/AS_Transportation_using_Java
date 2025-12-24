package frames;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.io.*;
import java.awt.*;


public class SenderFrame extends JFrame implements ActionListener

{ private JPanel panel;
  private JLabel labelpanel;
  private JLabel labelfullname1;
  private JLabel labelfullname2;
  private JTextField fullname1;
  private JTextField fullname2;
  private JLabel labelnid1;
  private JLabel labelnid2;
  private JTextField nid1;
  private JTextField nid2; 
  private JLabel labelphonenum1;
  private JLabel labelphonenum2;
  private JTextField phonenum1; 
  private JTextField phonenum2;
   
  private JLabel  labelemail1;
  private JLabel  labelemail2;
  private JTextField email1;
  private JTextField email2;

  
  private JLabel  labeladdress1;
  private JLabel  labeladdress2;
  private JTextArea address1;
  private JTextArea address2;
 
  private JButton buttoncancel;
  private JButton buttonconfirm;
  private JLabel image;
			
			

  public SenderFrame()
  {
	this.initializeComponents();

    this.setTitle("*Sender & Receiver Details");
    this.setSize(700, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);  
  }
  public void initializeComponents()
  {
	this.panel=new JPanel(null);
    this.labelpanel=new JLabel("Sender Details :");
	this.labelpanel.setBounds(20,12,200,50);
	labelpanel.setFont(new Font("Calibri",Font.BOLD,20));
    labelpanel.setForeground(Color.GRAY);
	this.panel.add(this.labelpanel);
	
	this.labelfullname1=new JLabel("Full Name :");
    this.labelfullname1.setBounds(20,50,100,20);
	this.panel.add(this.labelfullname1);
	
	this.fullname1=new JTextField();
	this.fullname1.setBounds(130,50,200,20);
	this.panel.add(this.fullname1);

    this.labelnid1=new JLabel("NID :");
	this.labelnid1.setBounds(20,80,100,20);
	this.panel.add(this.labelnid1);
	
	this.nid1=new JTextField();
	this.nid1.setBounds(130,80,200,20);
	this.panel.add(this.nid1);

    this.labelphonenum1=new JLabel("Phone Number :");
	this.labelphonenum1.setBounds(20,110,100,20);
	this.panel.add(this.labelphonenum1);
	
	this.phonenum1=new JTextField();
	this.phonenum1.setBounds(130,110,200,20);
	this.panel.add(this.phonenum1);

    this.labelemail1=new JLabel("Email :");
	this.labelemail1.setBounds(20,140,100,20);
	this.panel.add(this.labelemail1);
	
	this.email1=new JTextField();
	this.email1.setBounds(130,140,200,20);
	this.panel.add(this.email1);

	this.labeladdress1=new JLabel("Address :");
	this.labeladdress1.setBounds(20,170,100,20);
	this.panel.add(this.labeladdress1);
	
	this.address1=new JTextArea();
	this.address1.setBounds(130,170,200,20);
	this.panel.add(this.address1);

	this.labelpanel=new JLabel("Receiver Details :");
	this.labelpanel.setBounds(20,212,200,20);
	labelpanel.setFont(new Font("Calibri",Font.BOLD,20));
    labelpanel.setForeground(Color.GRAY);
	this.panel.add(this.labelpanel);

	this.labelfullname2=new JLabel("Full Name :");
    this.labelfullname2.setBounds(20,240,100,20);
	this.panel.add(this.labelfullname2);
	
	this.fullname2=new JTextField();
	this.fullname2.setBounds(130,240,200,20);
	this.panel.add(this.fullname2);

    this.labelnid2=new JLabel("NID :");
	this.labelnid2.setBounds(20,270,100,20);
	this.panel.add(this.labelnid2);
	
	this.nid2=new JTextField();
	this.nid2.setBounds(130,270,200,20);
	this.panel.add(this.nid2);

    this.labelphonenum2=new JLabel("Phone Number :");
	this.labelphonenum2.setBounds(20,300,100,20);
	this.panel.add(this.labelphonenum2);
	
	this.phonenum2=new JTextField();
	this.phonenum2.setBounds(130,300,200,20);
	this.panel.add(this.phonenum2);

    this.labelemail2=new JLabel("Email :");
	this.labelemail2.setBounds(20,330,100,20);
	this.panel.add(this.labelemail2);
	
	this.email2=new JTextField();
	this.email2.setBounds(130,330,200,20);
	this.panel.add(this.email2);

	this.labeladdress2=new JLabel("Address :");
	this.labeladdress2.setBounds(20,360,100,20);
	this.panel.add(this.labeladdress2);
	
	this.address2=new JTextArea();
	this.address2.setBounds(130,360,200,20);
	this.panel.add(this.address2);



    

    this.buttonconfirm=new JButton("Next");
	this.buttonconfirm.setBounds(230,440,100,20);
	this.buttonconfirm.addActionListener(this);
	this.panel.add(this.buttonconfirm);
	
	this.buttoncancel=new JButton("Back");
	this.buttoncancel.setBounds(100,440,100,20);
	this.buttoncancel.addActionListener(this);
	this.panel.add(this.buttoncancel);

	ImageIcon imageIcon = new ImageIcon(".\\Image\\images (4).jpeg");
    this.image = new JLabel(imageIcon);
    this.image.setBounds(0, 0, 700, 600);
    this.panel.add(this.image);

	this.add(this.panel);

  }
  
  public void actionPerformed(ActionEvent e){
	String buttonconfirm=e.getActionCommand();
	String buttoncancel=e.getActionCommand();
	if(buttoncancel.equals("Back"))
	{
		new HomePage();
		dispose();
	}
	 
	if(buttonconfirm.equals("Next"))	
	{   {
		String username1 = fullname1.getText();
		String username2 = fullname2.getText();
		String NID1= nid1.getText();
		String NID2= nid2.getText();
		String Phnnum1 = phonenum1.getText();
		String Phnnum2 = phonenum2.getText();
		String Email1=email1.getText();
		String Email2=email2.getText();
		String Address1=address1.getText();
		String Address2=address2.getText();

		
    if(username1.isEmpty()==false||username2.isEmpty()==false||NID1.isEmpty()==false||NID2.isEmpty()==false||Phnnum1.isEmpty()==false||Phnnum2.isEmpty()==false||Email1.isEmpty()==false||
	Email2.isEmpty()==false||Address1.isEmpty()==false||Address2.isEmpty()==false){
	
		  
		
		try {


		
					File file = new File(".\\Data\\pay.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file, true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					pw.println("Sender Details");
					pw.println(" Name : " + username1);
					pw.println("NID :"+NID1);
					pw.println("Phone Number :"+Phnnum1);
					pw.println("Email :"+Email1);
					pw.println("Address :"+Address1);
					pw.println("===============================================");
					pw.println("Reciever Details");
					pw.println(" Name : " + username2);
					pw.println("NID :"+NID2);
					pw.println("Phone Number :"+Phnnum2);
					pw.println("Email :"+Email2);
					pw.println("Address :"+Address2);
                    
                    pw.println("===============================================");
					pw.close();
					
				
					
				  fullname1.setText(null);
				  fullname2.setText(null);
				  nid1.setText(null);
				  nid2.setText(null);
				  phonenum1.setText(null);
				  phonenum2.setText(null);
				  email1.setText(null);
				  email2.setText(null);
				  address1.setText(null);
				address2.setText(null);
					

				  
					address1.setText(null);
					address2.setText(null);
				new PriceSet();
					
			    
				
					 
				}
				
				catch (Exception ex) {
					System.out.print(ex);
					JOptionPane.showMessageDialog(null,"Something Went wrong");
					}
				
				}

		
	}
	}
	else
	{
		
			JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
					JOptionPane.WARNING_MESSAGE);
					
		
	
	}


  }
  
  
	
  }