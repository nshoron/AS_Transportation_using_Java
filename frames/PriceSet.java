package frames;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.ImageIcon;



public class  PriceSet extends JFrame implements ActionListener
{
    private JPanel panel;
  
       private JLabel Product;
       private JComboBox weight;
       private JLabel image;
       private JLabel image1;

       private JButton buttonGlass;
       private JButton buttonElec;
       private JButton buttonCloths;
       private JButton buttonBook;
       private JButton buttonOk;
       private JButton buttonGo;






       public PriceSet() {
        this.initializeComponents();
        this.setTitle("Payment");
        this.setSize(900, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
      }
    
private void initializeComponents(){
    this.panel = new JPanel(null);

    this.Product=new JLabel("Glasses");
     this.Product.setBounds(90,285,100,30);
     Product.setFont(new Font("Calibri",Font.BOLD,18));
     Product.setForeground(Color.WHITE);
      this.panel.add(this.Product);
    
   
     this.Product=new JLabel("Electronics");
     this.Product.setBounds(550,285,200,30);
     Product.setFont(new Font("Calibri",Font.BOLD,18));
     Product.setForeground(Color.WHITE);
      this.panel.add(this.Product);

      this.Product=new JLabel("Cloths");
      this.Product.setBounds(90,610,100,30);
      Product.setFont(new Font("Calibri",Font.BOLD,18));
      Product.setForeground(Color.WHITE);

       this.panel.add(this.Product);

       this.Product=new JLabel("Books");
       this.Product.setBounds(550,660,250,30);
       Product.setFont(new Font("Calibri",Font.BOLD,18));
       Product.setForeground(Color.WHITE);

        this.panel.add(this.Product);

        this.buttonGlass=new JButton("Price :250 TAKA");
		this.buttonGlass.setBounds(90,325,130,30);
		this.buttonGlass.addActionListener(this);
		this.panel.add(this.buttonGlass);

        this.buttonElec=new JButton("Price :200 TAKA");
		this.buttonElec.setBounds(550,325,130,30);
		this.buttonElec.addActionListener(this);
		this.panel.add(this.buttonElec);

        this.buttonCloths=new JButton("Price :150 TAKA");
		this.buttonCloths.setBounds(80,650,130,30);
		this.buttonCloths.addActionListener(this);
		this.panel.add(this.buttonCloths);

        this.buttonBook=new JButton("Price :60 TAKA");
		this.buttonBook.setBounds(550,700,130,30);
		this.buttonBook.addActionListener(this);
		this.panel.add(this.buttonBook);


      
   
ImageIcon imagebook= new ImageIcon(".\\Image\\book.jpeg");
this.image1 = new JLabel(imagebook);
this.image1.setBounds(410, 340, 400, 350);
this.panel.add(this.image1);   
      
   
ImageIcon imageelec= new ImageIcon(".\\Image\\ece.jpeg");
this.image1 = new JLabel(imageelec);
this.image1.setBounds(430, 0, 320, 300);
this.panel.add(this.image1);   

   
ImageIcon imagecloth= new ImageIcon(".\\Image\\cloth.jpeg");
this.image1 = new JLabel(imagecloth);
this.image1.setBounds(10, 340, 320, 300);
this.panel.add(this.image1);   
   
ImageIcon imageglass= new ImageIcon(".\\Image\\Glass.jpeg");
this.image1 = new JLabel(imageglass);
this.image1.setBounds(10, 0, 350, 300);
this.panel.add(this.image1);   

panel.setBackground(Color.BLACK);


this.buttonOk=new JButton("Back");
this.buttonOk.setBounds(300,710,100,30);
this.buttonOk.addActionListener(this);
buttonOk.setBackground(Color.RED);
this.panel.add(this.buttonOk);





    this.add(this.panel);

    
}

public void actionPerformed(ActionEvent e){
	String buttons = e.getActionCommand();

	if(buttons.equals("Back")){
		new SenderFrame();
		dispose();
	}
	else if(buttons.equals("Price :250 TAKA")){
		new Payment();
		dispose();
	}
    else if(buttons.equals("Price :200 TAKA")){
		new Payment();
		dispose();
	}
    else if(buttons.equals("Price :150 TAKA")){
		new Payment();
		dispose();
	}
    else if(buttons.equals("Price :60 TAKA")){
		new Payment();
		dispose();
	}
  }

}