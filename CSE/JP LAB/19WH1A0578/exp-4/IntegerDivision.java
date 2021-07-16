import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;
public class IntegerDivision extends Applet implements ActionListener{ 
	TextField t1,t2,t3; 
	Button b; 
	Label L1,L2,L3,L4; 
	String s; 
	IntegerDivision e; 
	public void init() { 
		e=this; 
		t1=new TextField(10);
		t2=new TextField(10);		
		t3=new TextField(10);
		L1=new Label("Enter Num1:"); 
		L2=new Label("Enter Num2:");
		L3=new Label("Result:"); 
		L4=new Label("Division of Two Numbers");
		b=new Button("Divide"); 
		add(L4); 
		add(L1);
		add(t1); 
		add(L2); 
		add(t2);
		add(L3);
		add(t3);
		add(b); 
		b.addActionListener(this); 
	} 
	public void actionPerformed(ActionEvent ae){ 
		try { 
			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText()); 
			s=""+(num1/num2); 
			t3.setText(s); 
		}catch(ArithmeticException a){ 
			JOptionPane.showMessageDialog(null,"Divide by zero"); 
		}catch(NumberFormatException b){
		JOptionPane.showMessageDialog(null,"Number Format Exception"); 
		} 
	}
}
