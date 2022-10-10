package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calc implements ActionListener {
  
	JFrame theGUI;
	JTextField display;
	JPanel buttons;
	JPanel upperHalf;
	JPanel lowerHalf;
	JPanel moreButtons;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bdiv,bmult,bClear,bEnter,bdec,bsqrt,bsquare,babs,bneg;
	static double x = 0,y=0,result=0;
	static int function =0;

	Calc(){
		theGUI = new JFrame("Marshall's Really Awesome Calculator");
		display = new JTextField();
		buttons = new JPanel();
		upperHalf = new JPanel();
		lowerHalf = new JPanel();
		moreButtons = new JPanel();

		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bClear = new JButton("C");
		bEnter = new JButton("=");
		b0 = new JButton("0");
		badd = new JButton("+");
		bsub = new JButton("-");
		bmult = new JButton("*");
		bdiv = new JButton("/");
		bdec = new JButton(".");
		bsqrt = new JButton("Sqrt.");
		bsquare = new JButton("Square.");
		babs = new JButton("Abs.");
		bneg = new JButton("Neg.");

		buttons.setLayout(new GridLayout(4,4));
		buttons.add(b7);
		buttons.add(b8);
		buttons.add(b9);
		buttons.add(bdiv);
		buttons.add(b4);
		buttons.add(b5);
		buttons.add(b6);
		buttons.add(bmult);
		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);
		buttons.add(badd);
		buttons.add(bClear);
		buttons.add(b0);
		buttons.add(bdec);
		buttons.add(bsub);

		lowerHalf.setLayout(new GridLayout(1,1));
		lowerHalf.add(buttons);

		moreButtons.setLayout(new GridLayout(1,5));
		moreButtons.add(bsqrt);
		moreButtons.add(bsquare);
		moreButtons.add(babs);
		//moreButtons.add(bneg);
		moreButtons.add(bEnter);

		upperHalf.setLayout(new GridLayout(2,1));
		upperHalf.add(display);
		upperHalf.add(moreButtons);

		theGUI.setLayout(new GridLayout(2,1));
		theGUI.add(upperHalf);
		theGUI.add(lowerHalf);
		theGUI.setVisible(true);
		theGUI.setSize(600, 500);
		theGUI.setResizable(false);

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
		bdec.addActionListener(this);
		bdiv.addActionListener(this);
		bmult.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bEnter.addActionListener(this);
		bClear.addActionListener(this);
		bsqrt.addActionListener(this);
		bsquare.addActionListener(this);
		babs.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == b1){
			display.setText(display.getText().concat("1"));
		}
		if(e.getSource() == b2){
			display.setText(display.getText().concat("2"));
		}
		if(e.getSource() == b3){
			display.setText(display.getText().concat("3"));
		}
		if(e.getSource()== b4){
			display.setText(display.getText().concat("4"));
		}
		if(e.getSource()==b5){
			display.setText(display.getText().concat("5"));
		}
		if(e.getSource()==b6){
			display.setText(display.getText().concat("6"));
		}
		if(e.getSource()==b7){
			display.setText(display.getText().concat("7"));
		}
		if(e.getSource()==b8){
			display.setText(display.getText().concat("8"));
		}
		if(e.getSource()==b9){
			display.setText(display.getText().concat("9"));
		}
		if(e.getSource()==b0){
			display.setText(display.getText().concat("0"));
		}
		if(e.getSource()==badd){
			x = Double.parseDouble(display.getText());
			function = 1;
			display.setText("");
		}
		if(e.getSource()==bsub){
			x = Double.parseDouble(display.getText());
			function = 2;
			display.setText("");
		}
		if(e.getSource()==bmult){
			x = Double.parseDouble(display.getText());
			function = 3;
			display.setText("");
		}
		if(e.getSource()==bdiv){
			x = Double.parseDouble(display.getText());
			function = 4;
			display.setText("");
		}
		if(e.getSource()==bsqrt){
			x = Double.parseDouble(display.getText());
			function = 5;
			y = 0.0;
			bEnter.doClick();
		}
		if(e.getSource()==bsquare){
			x = Double.parseDouble(display.getText());
			function = 6;
			y = 0.0;
			bEnter.doClick();
		}
		if(e.getSource()==babs){
			x = Double.parseDouble(display.getText());
			function = 7;
			y = 0.0;
			bEnter.doClick();
		}
		if(e.getSource()==bdec){
			display.setText(display.getText().concat("."));
		}
		if(e.getSource()==bEnter){
			y = Double.parseDouble(display.getText());

			switch(function){
			case 1: result = x+y;
			break;

			case 2: result = x -y;
			break;

			case 3: result = x * y;
			break;

			case 4: result = x / y;
			break;

			case 5: result = Math.sqrt(x);
			break;

			case 6: result = x * x;
			break;

			case 7: result = Math.abs(x);
			break;

			default: result = 0;
			}
			display.setText(""+result);
		}
		if(e.getSource()==bClear){
			display.setText("");
		}
	}

	public static void main(String[] args)	{
		new Calc();
	}


}
