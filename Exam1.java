

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.Scanner;
import java.lang.Math;

public class Exam1 extends JFrame {
   
    class Handler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
           
          String s= a1.getText();
          double d= Float.parseFloat(s) ;
              if(giga1.isSelected()&&giga2.isSelected()){ 
            	  a2.setText(s);
              }
              if(giga1.isSelected()&&mega2.isSelected()){   
            	  double c = d*Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
              if(giga1.isSelected()&&kilo2.isSelected()){ 
            	  double c = d*Math.pow(10,6);
            	  a2.setText( Double.toString(c));
              }
              if(giga1.isSelected()&&metre2.isSelected()){   
            	  double c = d*Math.pow(10,9);
            	  a2.setText( Double.toString(c));
              }
              if(giga1.isSelected()&&centi2.isSelected()){ 
            	  double c = d*Math.pow(10,11);
            	  a2.setText( Double.toString(c));
              }
              if(giga1.isSelected()&&milli2.isSelected()){   
            	  double c = d*Math.pow(10,12);
            	  a2.setText( Double.toString(c));
              }
              if(giga1.isSelected()&&micro2.isSelected()){ 
            	  double c = d*Math.pow(10,15);
            	  a2.setText( Double.toString(c));
              }
              if(giga1.isSelected()&&nano2.isSelected()){   
            	  double c = d*Math.pow(10,18);
            	  a2.setText( Double.toString(c));
              }
//endgiga1**********
              
              if(mega1.isSelected()&&giga2.isSelected()){ 
            	  double c = d/Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
              if(mega1.isSelected()&&mega2.isSelected()){   
            	  a2.setText(s);
              }
              if(mega1.isSelected()&&kilo2.isSelected()){ 
            	  double c = d*Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
              if(mega1.isSelected()&&metre2.isSelected()){   
            	  double c = d*Math.pow(10,6);
            	  a2.setText( Double.toString(c));
              }
              if(mega1.isSelected()&&centi2.isSelected()){ 
            	  double c = d*Math.pow(10,8);
            	  a2.setText( Double.toString(c));
              }
              if(mega1.isSelected()&&milli2.isSelected()){   
            	  double c = d*Math.pow(10,9);
            	  a2.setText( Double.toString(c));
              }
              if(mega1.isSelected()&&micro2.isSelected()){ 
            	  double c = d*Math.pow(10,12);
            	  a2.setText( Double.toString(c));
              }
              if(mega1.isSelected()&&nano2.isSelected()){   
            	  double c = d*Math.pow(10,15);
            	  a2.setText( Double.toString(c));
              }
//endmega1
              
              if(kilo1.isSelected()&&giga2.isSelected()){ 
            	  double c = d/Math.pow(10,6);
            	  a2.setText( Double.toString(c));
              }
              if(kilo1.isSelected()&&mega2.isSelected()){   
            	  double c = d/Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
              if(kilo1.isSelected()&&kilo2.isSelected()){ 
            	  a2.setText(s);
              }
              if(kilo1.isSelected()&&metre2.isSelected()){   
            	  double c = d*Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
              if(kilo1.isSelected()&&centi2.isSelected()){ 
            	  double c = d*Math.pow(10,5);
            	  a2.setText( Double.toString(c));
              }
              if(kilo1.isSelected()&&milli2.isSelected()){   
            	  double c = d*Math.pow(10,6);
            	  a2.setText( Double.toString(c));
              }
              if(kilo1.isSelected()&&micro2.isSelected()){ 
            	  double c = d*Math.pow(10,9);
            	  a2.setText( Double.toString(c));
              }
              if(kilo1.isSelected()&&nano2.isSelected()){   
            	  double c = d*Math.pow(10,12);
            	  a2.setText( Double.toString(c));
              }
//endkilo1
              
              if(metre1.isSelected()&&giga2.isSelected()){ 
            	  double c = d/Math.pow(10,9);
            	  a2.setText( Double.toString(c));
              }
              if(metre1.isSelected()&&mega2.isSelected()){   
            	  double c = d/Math.pow(10,6);
            	  a2.setText( Double.toString(c));
              }
              if(metre1.isSelected()&&kilo2.isSelected()){ 
            	  double c = d/Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
              if(metre1.isSelected()&&metre2.isSelected()){   
            	  a2.setText(s);
              }
              if(metre1.isSelected()&&centi2.isSelected()){ 
            	  double c = d*Math.pow(10,2);
            	  a2.setText( Double.toString(c));
              }
              if(metre1.isSelected()&&milli2.isSelected()){   
            	  double c = d*Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
              if(metre1.isSelected()&&micro2.isSelected()){ 
            	  double c = d*Math.pow(10,6);
            	  a2.setText( Double.toString(c));
              }
              if(metre1.isSelected()&&nano2.isSelected()){   
            	  double c = d*Math.pow(10,9);
            	  a2.setText( Double.toString(c));
              }
//endmetre1
              
              if(centi1.isSelected()&&giga2.isSelected()){ 
            	  double c = d/Math.pow(10,11);
            	  a2.setText( Double.toString(c));
              }
              if(centi1.isSelected()&&mega2.isSelected()){   
            	  double c = d/Math.pow(10,8);
            	  a2.setText( Double.toString(c));
              }
              if(centi1.isSelected()&&kilo2.isSelected()){ 
            	  double c = d/Math.pow(10,5);
            	  a2.setText( Double.toString(c));
              }
              if(centi1.isSelected()&&metre2.isSelected()){   
            	  double c = d/Math.pow(10,2);
            	  a2.setText( Double.toString(c));
              }
              if(centi1.isSelected()&&centi2.isSelected()){ 
            	  a2.setText(s);
              }
              if(centi1.isSelected()&&milli2.isSelected()){   
            	  double c = d*Math.pow(10,1);
            	  a2.setText( Double.toString(c));
              }
              if(centi1.isSelected()&&micro2.isSelected()){ 
            	  double c = d*Math.pow(10,4);
            	  a2.setText( Double.toString(c));
              }
              if(centi1.isSelected()&&nano2.isSelected()){   
            	  double c = d*Math.pow(10,7);
            	  a2.setText( Double.toString(c));
              }
//endcenti1
              

              if(milli1.isSelected()&&giga2.isSelected()){ 
            	  double c = d/Math.pow(10,12);
            	  a2.setText( Double.toString(c));
              }
              if(milli1.isSelected()&&mega2.isSelected()){   
            	  double c = d/Math.pow(10,9);
            	  a2.setText( Double.toString(c));
              }
              if(milli1.isSelected()&&kilo2.isSelected()){ 
            	  double c = d/Math.pow(10,6);
            	  a2.setText( Double.toString(c));
              }
              if(milli1.isSelected()&&metre2.isSelected()){   
            	  double c = d/Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
              if(milli1.isSelected()&&centi2.isSelected()){ 
            	  double c = d/Math.pow(10,1);
            	  a2.setText( Double.toString(c));
              }
              if(milli1.isSelected()&&milli2.isSelected()){   
            	  a2.setText(s);
              }
              if(milli1.isSelected()&&micro2.isSelected()){ 
            	  double c = d*Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
              if(milli1.isSelected()&&nano2.isSelected()){   
            	  double c = d*Math.pow(10,6);
            	  a2.setText( Double.toString(c));
              }
//endmilli1
              

              if(micro1.isSelected()&&giga2.isSelected()){ 
            	  double c = d/Math.pow(10,15);
            	  a2.setText( Double.toString(c));
              }
              if(micro1.isSelected()&&mega2.isSelected()){   
            	  double c = d/Math.pow(10,12);
            	  a2.setText( Double.toString(c));
              }
              if(micro1.isSelected()&&kilo2.isSelected()){ 
            	  double c = d/Math.pow(10,9);
            	  a2.setText( Double.toString(c));
              }
              if(micro1.isSelected()&&metre2.isSelected()){   
            	  double c = d/Math.pow(10,6);
            	  a2.setText( Double.toString(c));
              }
              if(micro1.isSelected()&&centi2.isSelected()){ 
            	  double c = d/Math.pow(10,4);
            	  a2.setText( Double.toString(c));
              }
              if(micro1.isSelected()&&milli2.isSelected()){   
            	  double c = d/Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
              if(micro1.isSelected()&&micro2.isSelected()){ 
            	  a2.setText(s);
              }
              if(micro1.isSelected()&&nano2.isSelected()){   
            	  double c = d*Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
//endmicro1
              

              if(nano1.isSelected()&&giga2.isSelected()){ 
            	  double c = d/Math.pow(10,18);
            	  a2.setText( Double.toString(c));
              }
              if(nano1.isSelected()&&mega2.isSelected()){   
            	  double c = d/Math.pow(10,15);
            	  a2.setText( Double.toString(c));
              }
              if(nano1.isSelected()&&kilo2.isSelected()){ 
            	  double c = d/Math.pow(10,12);
            	  a2.setText( Double.toString(c));
              }
              if(nano1.isSelected()&&metre2.isSelected()){   
            	  double c = d/Math.pow(10,9);
            	  a2.setText( Double.toString(c));
              }
              if(nano1.isSelected()&&centi2.isSelected()){ 
            	  double c = d/Math.pow(10,7);
            	  a2.setText( Double.toString(c));
              }
              if(nano1.isSelected()&&milli2.isSelected()){   
            	  double c = d/Math.pow(10,6);
            	  a2.setText( Double.toString(c));
              }
              if(nano1.isSelected()&&micro2.isSelected()){ 
            	  double c = d/Math.pow(10,3);
            	  a2.setText( Double.toString(c));
              }
              if(nano1.isSelected()&&nano2.isSelected()){   
            	  a2.setText(s);
              }
//endnano1
        }
    }
   
   
   
    JButton b;
    JTextArea a2;
    JTextField a1;
    JCheckBox giga1;
    JCheckBox giga2;
    JCheckBox mega1;
    JCheckBox mega2;
    JCheckBox kilo1;
    JCheckBox kilo2;
    JCheckBox metre1;
    JCheckBox metre2;
    JCheckBox centi1;
    JCheckBox centi2;
    JCheckBox milli1;
    JCheckBox milli2;
    JCheckBox micro1;
    JCheckBox micro2;
    JCheckBox nano1;
    JCheckBox nano2;
    
    
    
    testm1(){
    	Handler h= new Handler();
       
        JLabel l= new JLabel( "Prefixes Convert");
        l.setFont(new Font("Tahoma", Font.PLAIN, 14));
       l.setBounds(130, 10, 144, 20);
       getContentPane().add(l);
        JLabel l2= new JLabel( "INPUT UNIT");
       l2.setBounds(50, 74, 100, 10);
       getContentPane().add(l2);
       JLabel l3= new JLabel( "OUTPUT UNIT");
       l3.setBounds(230, 74, 100, 10);
       getContentPane().add(l3);
      b= new JButton("Convert");
      b.setBounds(210, 282, 100, 30);
      a1= new JTextField();
      a1.setBounds(130, 30, 100, 30);
      a2=new JTextArea();
      a2.setBounds(25, 282, 175, 30);
      giga1= new JCheckBox("giga");
      giga1.setBounds(50,90, 140, 20);
      giga2= new JCheckBox("giga");
      giga2.setBounds(230, 90, 140, 20);
      mega1= new JCheckBox("mega");
      mega1.setBounds(50, 112, 100,20);
      mega2 = new JCheckBox("mega");
      mega2.setBounds(230, 112, 100, 20);
      kilo1= new JCheckBox("kilo");
      kilo1.setBounds(50, 134, 100,20);
      kilo2 = new JCheckBox("kilo");
      kilo2.setBounds(230, 134, 100, 20);
      metre1 = new JCheckBox("metre");
      metre1.setBounds(50, 156, 100, 20);
      metre2 = new JCheckBox("metre");
      metre2.setBounds(230, 156, 100, 20);
      centi1 = new JCheckBox("centi");
      centi1.setBounds(50, 178, 100, 20);
      centi2 = new JCheckBox("centi");
      centi2.setBounds(230, 178, 100, 20);
      milli1 = new JCheckBox("milli");
      milli1.setBounds(50, 200, 100, 20);
      milli2 = new JCheckBox("milli");
      milli2.setBounds(230, 200, 100, 20);
      micro1 = new JCheckBox("micro");
      micro1.setBounds(50, 222, 100, 20);
      micro2 = new JCheckBox("micro");
      micro2.setBounds(230, 222, 100, 20);
      nano1 = new JCheckBox("nano");
      nano1.setBounds(50, 244, 100, 20);
      nano2 = new JCheckBox("nano");
      nano2.setBounds(230, 244, 100, 20);
      
      getContentPane().add(b);
      getContentPane().add(giga1);
      getContentPane().add(giga2);
      getContentPane().add(a1);
      getContentPane().add(a2);
      getContentPane().add(mega1);
      getContentPane().add(mega2);
      getContentPane().add(kilo1);
      getContentPane().add(kilo2);
      getContentPane().add(metre1);
      getContentPane().add(metre2);
      getContentPane().add(milli1);
      getContentPane().add(milli2);
      getContentPane().add(centi1);
      getContentPane().add(centi2);
      getContentPane().add(micro1);
      getContentPane().add(micro2);
      getContentPane().add(nano1);
      getContentPane().add(nano2);
      b.addActionListener(h);
             
             setSize(400, 400);//******
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//*****
    getContentPane().setLayout(null);//*******
    setVisible(true);//*******
   
    }
   
   
   
   
    public static void main(String args[])
    { testm1 obj= new testm1();}
}