import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;  
  
public class calc implements WindowListener, ActionListener{  
JFrame f;
Label sLabel;
TextField tf;
TextField tf1;
TextField tf2;
JButton b1=new JButton("1");  
JButton b2=new JButton("2");  
JButton b3=new JButton("3");  
JButton b4=new JButton("4");  
JButton b5=new JButton("5");  
    JButton b6=new JButton("6");  
    JButton b7=new JButton("7");  
JButton b8=new JButton("8");  
    JButton b9=new JButton("9");
    JButton b0=new JButton("0"); 
    JButton be=new JButton("="); 
    JButton c=new JButton("C"); 
    JButton bp=new JButton("+");
    JButton bs=new JButton("-");
    JButton bm=new JButton("*");
    JButton bd=new JButton("/");
calc(){  
    f=new JFrame();
    sLabel=new Label("Answer");
    tf = new TextField(30);
    tf1 = new TextField(10);
    tf2 = new TextField(30);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    bp.addActionListener(this);
    bs.addActionListener(this);
    bm.addActionListener(this);
    bd.addActionListener(this);
    be.addActionListener(this);
    c.addActionListener(this);
    f.add(tf);
    f.add(tf2);f.add(sLabel);f.add(tf1);f.add(bp);
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(bs);f.add(b5);  
    f.add(b6);f.add(b7);f.add(b8);f.add(bm);f.add(b9);f.add(c);f.add(be); f.add(b0);
    f.add(bd); 
    
    f.setLayout(new GridLayout(4,3));  
    //setting grid layout of 3 rows and 3 columns  
    f.setSize(350,350);  
    f.setVisible(true);
    f.addWindowListener(this);
}  
public static void main(String[] args) {  
    new calc();  
}
@Override
public void actionPerformed(ActionEvent e) {
	int value1 = 0;
	int value=0;
	int Ans=0;
	String data;
	String data1 = null;
	String Content;
	data1=String.valueOf(value1);
	data=String.valueOf(value);
	if(e.getSource().equals(b1)){
		data=tf.getText();
		Content=data+"1";
		 tf.setText(Content);
		 System.out.print("1");
	}
	else if(e.getSource().equals(b2)){
		data=tf.getText();
		Content=data+"2";
		 tf.setText(Content);
		 System.out.print("2");
	}
	else if(e.getSource().equals(b3)){
		data=tf.getText();
		Content=data+"3";
		 tf.setText(Content);
		 System.out.print("3");
	}
	else if(e.getSource().equals(b4)){
		data=tf.getText();
		Content=data+"4";
		 tf.setText(Content);
		 System.out.print("4");
	}
	else if(e.getSource().equals(b5)){
		data=tf.getText();
		Content=data+"5";
		 tf.setText(Content);
		 System.out.print("5");
	}
	else if(e.getSource().equals(b6)){
		data=tf.getText();
		Content=data+"6";
		 tf.setText(Content);
		 System.out.print("6");
	}
	else if(e.getSource().equals(b7)){
		data=tf.getText();
		Content=data+"7";
		 tf.setText(Content);
		 System.out.print("7");
	}
	else if(e.getSource().equals(b8)){
		data=tf.getText();
		Content=data+"8";
		 tf.setText(Content);
		 System.out.print("8");
	}
	else if(e.getSource().equals(b9)){
		data=tf.getText();
		Content=data+"9";
		 tf.setText(Content);
		 System.out.print("9");
	}
	else if(e.getSource().equals(b0)){
		data=tf.getText();
		Content=data+"0";
		 tf.setText(Content);
		 System.out.print("0");
	}
	else if(e.getSource().equals(bp)){
		 data=tf.getText();
		 data1=tf2.getText();
		 value=Integer.parseInt(data);	
		 value1=Integer.parseInt(data1);
		 Ans=value+value1;
		 Content=String.valueOf(Ans);
		 tf1.setText(Content);
		 tf2.setText(Content);
		 tf.setText("");
		 System.out.print("+");
	}
	else if(e.getSource().equals(bs)){
		 data=tf.getText();
		 data1=tf2.getText();
		 value=Integer.parseInt(data);	
		 value1=Integer.parseInt(data1);
		 Ans=value-value1;
		 Content=String.valueOf(Ans);
		 tf1.setText(Content);
		 tf2.setText(Content);
		 tf.setText("");
		 System.out.print("-");
		 }
	else if(e.getSource().equals(bm)){
		 data=tf.getText();
		 data1=tf2.getText();
		 value=Integer.parseInt(data);	
		 value1=Integer.parseInt(data1);
		 Ans=value*value1;
		 Content=String.valueOf(Ans);
		 tf1.setText(Content);
		 tf2.setText(Content);
		 tf.setText("");
		 System.out.print("*");
		 }
	else if(e.getSource().equals(bd)){
		 data=tf.getText();
		 data1=tf2.getText();
		 value=Integer.parseInt(data);	
		 value1=Integer.parseInt(data1);
		 Ans=value/value1;
		 Content=String.valueOf(Ans);
		 tf1.setText(Content);
		 tf2.setText(Content);
		 tf.setText("");
		 System.out.print("/");
		 }
	else if(e.getSource().equals(c)){
		tf.setText("0");
		tf1.setText("0");
		tf2.setText("0");
		System.out.println("Operations after clear");
	}
	else if(e.getSource().equals(c)){
		data=tf.getText();
		data1=tf1.getText();
		value=Integer.parseInt(data);	
		value1=Integer.parseInt(data1);
		
		
		
	}
	else{
		
	}
	
}
@Override
public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosed(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosing(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}  
}  