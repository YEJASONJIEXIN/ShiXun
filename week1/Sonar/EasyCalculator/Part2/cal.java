import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
 
public class cal extends Frame implements ActionListener
{
	private JPanel Panel;
	private JButton plus,minus,mul,div,ok;
	private JTextField Text1,Text2,Text3,Text4,Text5;
	private float a,b;
	String s = "";
	
	public cal(){
	 super("Easy Calculator");
	 Panel=new JPanel();
	 Panel.setLayout(null);
	 
     plus=new JButton("+");
     minus=new JButton("-");
	 mul=new JButton("*");
	 div=new JButton("/");
	 ok=new JButton("OK");     
	 
     Text1=new JTextField("",4);
	 Text2=new JTextField("",4);
	 Text3=new JTextField("",4);
	 Text4=new JTextField("=",4);
	 Text5=new JTextField("",4);

	 Text1.setBackground(Color.WHITE);
	 Text2.setBackground(Color.gray);
	 Text3.setBackground(Color.WHITE);
	 Text4.setBackground(Color.gray);
	 Text5.setBackground(Color.WHITE);
	 Text1.setHorizontalAlignment(JTextField.CENTER);
	 Text2.setHorizontalAlignment(JTextField.CENTER);
	 Text3.setHorizontalAlignment(JTextField.CENTER);
	 Text4.setHorizontalAlignment(JTextField.CENTER);
	 Text5.setHorizontalAlignment(JTextField.CENTER);
	 
	 
     Text2.setEditable(false); 
     Text4.setEditable(false); 

 
      	this.setSize(300,100);
        this.setLocation(300,240);
        this.setResizable(false);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        
		this.add(Text1);
		this.add(Text2);
		this.add(Text3);
		this.add(Text4);
		this.add(Text5);
        this.add(plus); 
		this.add(minus); 
		this.add(mul);
		this.add(div);
		this.add(ok);
		
        
		plus.addActionListener(this);
		minus.addActionListener(this);
		mul.addActionListener(this);
        div.addActionListener(this);
        ok.addActionListener(this);
        this.addWindowListener(new Wadapt());
		
        this.setVisible(true); 
    }
	
	public void actionPerformed(ActionEvent e)
    {
		a = Float.parseFloat(Text1.getText());
		b = Float.parseFloat(Text3.getText());
       if(e.getSource()==plus){
		   Text2.setText("+");
		}
	   else if(e.getSource()==minus){
		   Text2.setText("-");
	   }
	   else if(e.getSource()==mul){
		   Text2.setText("*");
		}
	   else if(e.getSource()==div){
		   Text2.setText("/");		   
	   }  
	   else if(e.getSource()==ok) {
		   if(Text2.getText().equalsIgnoreCase("+")) {
			   s = String.valueOf(a+b);
		   }
		   else if(Text2.getText().equalsIgnoreCase("-")) {
			   s = String.valueOf(a-b);
		   }
		   else if(Text2.getText().equalsIgnoreCase("*")) {
			   s = String.valueOf(a*b);
		   }
		   else if(Text2.getText().equalsIgnoreCase("/")) {
			   if (b==0) {Text3.setText("null");}
			   else {
				   s = String.valueOf(a/b);
			   }
		   }
		   Text5.setText(s);
	   }
	   
    }
    public static void main(String args[])
    {
    	cal mycal=new cal();
    }
}
class Wadapt extends WindowAdapter
{
    public void windowClosing(WindowEvent evt)
    {
        Frame frm=(Frame)evt.getSource();
        frm.setVisible(false);
        frm.dispose();
        System.exit(0);
    }
}
