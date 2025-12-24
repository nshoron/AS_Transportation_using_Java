package frames;
import javax.swing.*;
import javax.swing.ImageIcon;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class Payment extends JFrame implements ActionListener {
  private JPanel panel;
  
  private JLabel labeleCash;
  private JLabel fullfill;
  private JLabel Crd;
  private JLabel labelCN;
  private JLabel top;
  private JLabel Cnum;
  private JLabel CVV;



  
  
  private JTextField textUser;
  private JTextField textP;
  private JTextField textConfirm;
  private JTextField textEmail;
  private JButton buttonConfirm;
  private JButton buttonPrevious;
  private JButton buttonExit;
 

  private JLabel image;
  private JLabel image1;

  private JLabel image2;


  public Payment() {
    this.initializeComponents();
    this.setTitle("Payment Page");
    this.setSize(900, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    
  }

private void initializeComponents(){

  this.panel = new JPanel(null);

this.top=new JLabel("Pay Your Bill");
this.top.setBounds(420,30,300,40);
top.setFont(new Font("Calibri",Font.BOLD,38));
top.setForeground(Color.black);

this.panel.add(this.top);

this.labeleCash=new JLabel("We accept only");
this.labeleCash.setBounds(410,108,250,30);
labeleCash.setFont(new Font("Calibri",Font.BOLD,30));
labeleCash.setForeground(Color.BLACK);
this.panel.add(this.labeleCash);

ImageIcon imagemaster= new ImageIcon(".\\Image\\mc.jpeg");
this.image1 = new JLabel(imagemaster);
this.image1.setBounds(608, 100, 67, 45);
this.panel.add(this.image1);

ImageIcon imagevisa= new ImageIcon(".\\Image\\visa.jpeg");
this.image2 = new JLabel(imagevisa);
this.image2.setBounds(678, 100, 67,45);
this.panel.add(this.image2);

this. textUser=new JTextField();
this.textUser.setBounds(550,210,200,30);
textUser.setFont(new Font("Calibri",Font.PLAIN,20));
textUser.setBackground(Color.WHITE);
this.panel.add(this.textUser);

this.fullfill=new JLabel("Please Fillup Your Card Details Below.....");
this.fullfill.setBounds(410,148,400,50);
fullfill.setFont(new Font("Calibri",Font.BOLD,23));
fullfill.setForeground(Color.BLACK);
this.panel.add(this.fullfill);

this.textP=new JTextField();
this.textP.setBounds(550,250,200,30);
textP.setFont(new Font("Calibri",Font.PLAIN,20));
textP.setBackground(Color.WHITE);
this.panel.add(this.textP);

this.Crd=new JLabel("Name On Card:");
this.Crd.setBounds(410,215,200,20);
Crd.setForeground(Color.BLACK);
this.panel.add(this.Crd);
Crd.setFont(new Font("Calibri",Font.BOLD,20));


this.labelCN=new JLabel("Card Number:");
this.labelCN.setBounds(410,255,200,20);
labelCN.setFont(new Font("Calibri",Font.BOLD,20));
labelCN.setForeground(Color.BLACK);
this.panel.add(this.labelCN);

this.textEmail=new JTextField();
this.textEmail.setBounds(550,330,100,30);
textEmail.setFont(new Font("Calibri",Font.PLAIN,20));
textEmail.setBackground(Color.WHITE);
this.panel.add(this.textEmail);

this.Cnum=new JLabel("Valid On:");
this.Cnum.setBounds(410,295,200,20);
Cnum.setForeground(Color.BLACK);
this.panel.add(this.Cnum);
Cnum.setFont(new Font("Calibri",Font.BOLD,20));


this.textConfirm=new JTextField();
this.textConfirm.setBounds(550,290,100,30);
textConfirm.setFont(new Font("Calibri",Font.PLAIN,20));
textConfirm.setBackground(Color.WHITE);
this.panel.add(this.textConfirm);

this.CVV=new JLabel("CVV Code:");
this.CVV.setBounds(410,336,200,20);
CVV.setForeground(Color.BLACK);
this.panel.add(this.CVV);
CVV.setFont(new Font("Calibri",Font.BOLD,20));



ImageIcon image= new ImageIcon(".\\Image\\SICon.jpeg");
this.image = new JLabel(image);
this.image.setBounds(20, 20, 300, 500);
this.panel.add(this.image);


this.buttonConfirm=new JButton("Confirm Payment");
this.buttonConfirm.setBounds(510,405,200,30);
buttonConfirm.setFont(new Font("Calibri",Font.BOLD,20));
buttonConfirm.setForeground(Color.DARK_GRAY);
buttonConfirm.setBackground(Color.GREEN);
this.buttonConfirm.addActionListener(this);

this.panel.add(this.buttonConfirm);

this.buttonPrevious=new JButton("Previous");
this.buttonPrevious.setBounds(400,460,120,30);
buttonPrevious.setFont(new Font("Calibri",Font.BOLD,20));
buttonPrevious.setForeground(Color.DARK_GRAY);
buttonPrevious.setBackground(Color.PINK);
this.buttonPrevious.addActionListener(this);

this.panel.add(this.buttonPrevious);

this.buttonExit=new JButton("Exit");
this.buttonExit.setBounds(698,460,120,30);
buttonExit.setFont(new Font("Calibri",Font.BOLD,20));
buttonExit.setForeground(Color.DARK_GRAY);
buttonExit.setBackground(Color.RED);
this.buttonExit.addActionListener(this);

this.panel.add(this.buttonExit);



this.add(this.panel);


   }

   public void actionPerformed(ActionEvent e){
    String buttonText = e.getActionCommand();
	
    if(buttonText.equals("Exit")){
      System.exit(0);
    }
  else if(buttonText.equals("Previous")){
new PriceSet();
dispose();

  }

 

   }
  }
