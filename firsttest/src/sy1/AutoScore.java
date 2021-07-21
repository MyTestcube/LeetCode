package sy1;

import java.awt.*;
import javax.swing.*;

public class AutoScore extends JFrame
{
	public AutoScore(){
		init();
		setSize( 400,350 );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible( true );
	}

	public void init()
	{
	
		//{{INIT_CONTROLS
		setLayout(null);
		setSize(400,350);
		btnNew.setLabel("出题");
		getContentPane().add(btnNew);
		btnNew.setBackground(Color.lightGray);
		btnNew.setBounds(36,96,98,26);
		btnJudge.setLabel("判分");
		getContentPane().add(btnJudge);
		btnJudge.setBackground(Color.lightGray);
		btnJudge.setBounds(216,96,94,25);
		lblA.setText("text");
		getContentPane().add(lblA);
		lblA.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblA.setBounds(36,24,36,36);
		lblOp.setText("text");
		getContentPane().add(lblOp);
		lblOp.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblOp.setBounds(72,24,36,36);
		lblB.setText("text");
		getContentPane().add(lblB);
		lblB.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblB.setBounds(108,24,33,36);
		label5.setText("=");
		getContentPane().add(label5);
		label5.setFont(new Font("Dialog", Font.PLAIN, 24));
		label5.setBounds(168,24,34,36);
		getContentPane().add(txtAnswer);
		txtAnswer.setFont(new Font("Dialog", Font.PLAIN, 24));
		txtAnswer.setBounds(216,24,85,42);
		listDisp.setFont(new Font("Dialog", Font.PLAIN, 16));
		getContentPane().add(listDisp);
		listDisp.setBounds(36,144,272,106);
		//}}
	
		//{{REGISTER_LISTENERS
		SymAction lSymAction = new SymAction();
		btnNew.addActionListener(lSymAction);
		btnJudge.addActionListener(lSymAction);
		//}}
	}
	
	//{{DECLARE_CONTROLS
	Button btnNew = new Button();
	Button btnJudge = new Button();
	Label lblA = new Label();
	Label lblOp = new Label();
	Label lblB = new Label();
	Label label5 = new Label();
	TextField txtAnswer = new TextField();
	List listDisp = new List(0);
	//}}

	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == btnNew)
				btnNew_ActionPerformed(event);
			else if (object == btnJudge)
				btnJudge_ActionPerformed(event);
		}
	}

	void btnNew_ActionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
		a = (int)(Math.random()*9+1);
		b = (int)(Math.random()*9+1);
		int c = (int)(Math.random()*4);
		switch( c )
		{
		    case 0: op="+"; result=a+b; break;
		    case 1: op="-"; result=a-b; break;
		    case 2: op="*"; result=a*b;break;
		    case 3: op="/"; result=a/b;break;
		}
		lblA.setText(""+a);
		lblB.setText(""+b);
		lblOp.setText(""+op);
		txtAnswer.setText("");
	    
			 
	}
	
	int a=0,b=0;
	String op="";
	double result=0;

	void btnJudge_ActionPerformed(java.awt.event.ActionEvent event)
	{
		String str = txtAnswer.getText();
		double d = Double.valueOf(str).doubleValue();
		String disp = "" + a + op + b+"="+ str +" ";
		if( d == result ) disp += "☆";
		else disp += "╳";
		
		listDisp.add( disp );
	}

	public static void main(String [] args)
	{
		AutoScore f = new AutoScore();
	}

}
