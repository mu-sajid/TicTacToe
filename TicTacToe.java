import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class TicTacToe extends Applet implements ActionListener
{
	boolean playerX = true;
	boolean winnerX = false;
	boolean winnerO = false;
	int counter = 0;
	TextField winnerField = new TextField(20);
	TextField turnField = new TextField(20);
	Button clear = new Button("Clear");
	Button b1 = new Button("1");
	Button b2 = new Button("2");
	Button b3 = new Button("3");
	Button b4 = new Button("4");
	Button b5 = new Button("5");
	Button b6 = new Button("6");
	Button b7 = new Button("7");
	Button b8 = new Button("8");
	Button b9 = new Button("9");
	public void init()
	{
		GridLayout grid = new GridLayout(4,3);
		setLayout(grid);
		add(turnField);
		add(clear);
		add(winnerField);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		clear.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		turnField.setText("-X's Turn-");
		turnField.setForeground(Color.blue);
		setFont(new Font("TimesRoman",Font.BOLD,24));
		setForeground(Color.black);
		turnField.setBackground(new Color(240,255,255));
		winnerField.setBackground(new Color(240,255,255));
		clear.setBackground(new Color(240,255,240));
		b1.setBackground(new Color(255,239,213));
		b2.setBackground(new Color(255,239,213));
		b3.setBackground(new Color(255,239,213));
		b4.setBackground(new Color(255,239,213));
		b5.setBackground(new Color(255,239,213));
		b6.setBackground(new Color(255,239,213));
		b7.setBackground(new Color(255,239,213));
		b8.setBackground(new Color(255,239,213));
		b9.setBackground(new Color(255,239,213));

	}
	public void actionPerformed(ActionEvent ae)
	{
		setFont(new Font("TimesRoman",Font.BOLD,24));
		setForeground(Color.black);

		if(!winnerX && !winnerO)
		{
			counter++;
			if(counter%2 != 0)
			{
				if(ae.getSource() == b1)
				{
					b1.removeActionListener(this);
					b1.setForeground(Color.blue);
					b1.setLabel("X");
				}
				if(ae.getSource() == b2)
				{
					b2.removeActionListener(this);
					b2.setForeground(Color.blue);
					b2.setLabel("X");
				}
				if(ae.getSource() == b3)
				{
					b3.removeActionListener(this);
					b3.setForeground(Color.blue);
					b3.setLabel("X");
				}
				if(ae.getSource() == b4)
				{
					b4.removeActionListener(this);
					b4.setForeground(Color.blue);
					b4.setLabel("X");
				}
				if(ae.getSource() == b5)
				{
					b5.removeActionListener(this);
					b5.setForeground(Color.blue);
					b5.setLabel("X");
				}
				if(ae.getSource() == b6)
				{
					b6.removeActionListener(this);
					b6.setForeground(Color.blue);
					b6.setLabel("X");
				}
				if(ae.getSource() == b7)
				{
					b7.removeActionListener(this);
					b7.setForeground(Color.blue);
					b7.setLabel("X");
				}
				if(ae.getSource() == b8)
				{
					b8.removeActionListener(this);
					b8.setForeground(Color.blue);
					b8.setLabel("X");
				}
				if(ae.getSource() == b9)
				{
					b9.removeActionListener(this);
					b9.setForeground(Color.blue);
					b9.setLabel("X");
				}

			}
			turnField.setText("-O's Turn-");
			turnField.setForeground(Color.red);
			if(counter%2 == 0)
			{
				if(ae.getSource() == b1)
				{
					b1.removeActionListener(this);
					b1.setForeground(Color.red);
					b1.setLabel("O");
				}
				if(ae.getSource() == b2)
				{
					b2.removeActionListener(this);
					b2.setForeground(Color.red);
					b2.setLabel("O");
				}
				if(ae.getSource() == b3)
				{
					b3.removeActionListener(this);
					b3.setForeground(Color.red);
					b3.setLabel("O");
				}
				if(ae.getSource() == b4)
				{
					b4.removeActionListener(this);
					b4.setForeground(Color.red);
					b4.setLabel("O");
				}
				if(ae.getSource() == b5)
				{
					b5.removeActionListener(this);
					b5.setForeground(Color.red);
					b5.setLabel("O");
				}
				if(ae.getSource() == b6)
				{
					b6.removeActionListener(this);
					b6.setForeground(Color.red);
					b6.setLabel("O");
				}
				if(ae.getSource() == b7)
				{
					b7.removeActionListener(this);
					b7.setForeground(Color.red);
					b7.setLabel("O");
				}
				if(ae.getSource() == b8)
				{
					b8.removeActionListener(this);
					b8.setForeground(Color.red);
					b8.setLabel("O");
				}
				if(ae.getSource() == b9)
				{
					b9.removeActionListener(this);
					b9.setForeground(Color.red);
					b9.setLabel("O");
				}
				turnField.setText("-X's Turn-");
				turnField.setForeground(Color.blue);
				//X Victory


			}
			if(b1.getLabel() == ("X") && b2.getLabel() == ("X") && b3.getLabel() == ("X"))
				{
					winnerX = true;
				}
				if(b4.getLabel() == ("X") && b5.getLabel() == ("X") && b6.getLabel() == ("X"))
				{
					winnerX = true;
				}
				if(b7.getLabel() == ("X") && b8.getLabel() == ("X") && b9.getLabel() == ("X"))
				{
					winnerX = true;
				}
				if(b1.getLabel() == ("X") && b4.getLabel() == ("X") && b7.getLabel() == ("X"))
				{
					winnerX = true;
				}
				if(b2.getLabel() == ("X") && b5.getLabel() == ("X") && b8.getLabel() == ("X"))
				{
					winnerX = true;
				}
				if(b3.getLabel() == ("X") && b6.getLabel() == ("X") && b9.getLabel() == ("X"))
				{
					winnerX = true;
				}
				if(b1.getLabel() == ("X") && b5.getLabel() == ("X") && b9.getLabel() == ("X"))
				{
					winnerX = true;
				}
				if(b3.getLabel() == ("X") && b5.getLabel() == ("X") && b7.getLabel() == ("X"))
				{
					winnerX = true;
				}
				//O Victory
				if(b1.getLabel() == ("O") && b2.getLabel() == ("O") && b3.getLabel() == ("O"))
				{
					winnerO = true;

				}
				if(b4.getLabel() == ("O") && b5.getLabel() == ("O") && b6.getLabel() == ("O"))
				{
					winnerO = true;

				}
				if(b7.getLabel() == ("O") && b8.getLabel() == ("O") && b9.getLabel() == ("O"))
				{
					winnerO = true;

				}
				if(b1.getLabel() == ("O") && b4.getLabel() == ("O") && b7.getLabel() == ("O"))
				{
					winnerO = true;

				}
				if(b2.getLabel() == ("O") && b5.getLabel() == ("O") && b8.getLabel() == ("O"))
				{
					winnerO = true;

				}
				if(b1.getLabel() == ("O") && b5.getLabel() == ("O") && b9.getLabel() == ("O"))
				{
					winnerO = true;

				}
				if(b3.getLabel() == ("O") && b5.getLabel() == ("O") && b7.getLabel() == ("O"))
				{
					winnerO = true;

				}
				if(b3.getLabel() == ("O") && b6.getLabel() == ("O") && b9.getLabel() == ("O"))
				{
					winnerO = true;
				}
			if(!winnerX && !winnerO && counter == 9)
			{
				turnField.setText("");
				winnerField.setForeground(Color.green);
				winnerField.setText(" * Cat Won! * ");
			}
		}
		if(winnerX == true && counter < 9)
		{
			turnField.setText("");
			winnerField.setForeground(Color.blue);
			winnerField.setText(" * X Won! * ");
		}
		else if(winnerO == true)
		{
			turnField.setText("");
			winnerField.setForeground(Color.red);
			winnerField.setText(" * O Won! * ");
		}
		if(ae.getSource() == clear)
		{
			b1.removeActionListener(this);
			b2.removeActionListener(this);
			b3.removeActionListener(this);
			b4.removeActionListener(this);
			b5.removeActionListener(this);
			b6.removeActionListener(this);
			b7.removeActionListener(this);
			b8.removeActionListener(this);
			b9.removeActionListener(this);
			b1.setLabel("1");
			b2.setLabel("2");
			b3.setLabel("3");
			b4.setLabel("4");
			b5.setLabel("5");
			b6.setLabel("6");
			b7.setLabel("7");
			b8.setLabel("8");
			b9.setLabel("9");
			clear.setLabel("Clear");
			b1.setForeground(Color.black);
			b2.setForeground(Color.black);
			b3.setForeground(Color.black);
			b4.setForeground(Color.black);
			b5.setForeground(Color.black);
			b6.setForeground(Color.black);
			b7.setForeground(Color.black);
			b8.setForeground(Color.black);
			b9.setForeground(Color.black);
			add(turnField);
			add(clear);
			add(winnerField);
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
			add(b6);
			add(b7);
			add(b8);
			add(b9);
			clear.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			turnField.setText("-X's Turn-");
			turnField.setForeground(Color.blue);
			counter = 0;
			winnerField.setText("");
			winnerX = false;
			playerX = true;
			winnerO = false;
		}

	}
}
