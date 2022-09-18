import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class TicTacToeGUI extends JFrame implements ActionListener
{
	private JTextField turn, buttonField;
	private JButton one, two, three, four, five, six, seven, eight, nine, resetButton;
	private JPanel topPane, midPane, midPaneTwo, bottomPane, mainPane;
	private ImageIcon printPic = new ImageIcon("901843-200.png");
	boolean winnerX = false;
	boolean winnerO = false;
	int counter = 0;


	private JButton[] buttons;

	public static void main(String[] args) throws IOException
	{
		JFrame frame = new TicTacToeGUI();

		frame.pack();
		frame.setVisible(true);

		WindowListener w = new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		};
		frame.addWindowListener(w);
	}

	TicTacToeGUI()
	{




		mainPane = new JPanel();
		mainPane.setLayout(new GridLayout(4,3));
		mainPane.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.blue));
		mainPane.setPreferredSize(new Dimension(500, 300));

		turn = new JTextField("X's Turn");
		resetButton = new JButton(printPic);
		buttonField = new JTextField("Winner?");

		mainPane.add(turn);
		mainPane.add(resetButton);
		mainPane.add(buttonField);

		resetButton.addActionListener(this);

		buttons = new JButton[9];
		for(int i = 0; i < buttons.length; i++)
		{
			buttons[i] = new JButton(i + 1 + "");
			mainPane.add(buttons[i]);
			buttons[i].addActionListener(this);
		}

		setContentPane(mainPane);
	}

	public void actionPerformed(ActionEvent e)
	{



		for(int i = 0; i < buttons.length; i++)
		{

			System.out.println(counter);
			if(e.getSource() == buttons[i])
			{
				System.out.println(buttons[i].getLabel());
				if(counter%2 == 0)
				{
				buttons[i].setLabel("X");
				buttons[i].setForeground(Color.blue);
				buttons[i].removeActionListener(this);
			//	counter++;
				turn.setText("O's Turn");

				}
			}

			if(e.getSource() == buttons[i])
			{
			if(counter%2 == 1)
			{
				buttons[i].setLabel("O");
				buttons[i].setForeground(Color.red);
				buttons[i].removeActionListener(this);
			//	counter++;
				turn.setText("X's Turn");

			}
			}

		}
			counter++;


		if(buttons[0].getLabel() == ("X") && buttons[1].getLabel() == ("X") && buttons[2].getLabel() == ("X"))
		{
					winnerX = true;
		}
		if(buttons[3].getLabel() == ("X") && buttons[4].getLabel() == ("X") && buttons[5].getLabel() == ("X"))
		{
					winnerX = true;
		}
		if(buttons[6].getLabel() == ("X") && buttons[7].getLabel() == ("X") && buttons[8].getLabel() == ("X"))
		{
					winnerX = true;
		}
		if(buttons[0].getLabel() == ("X") && buttons[3].getLabel() == ("X") && buttons[6].getLabel() == ("X"))
		{
					winnerX = true;
		}
		if(buttons[1].getLabel() == ("X") && buttons[4].getLabel() == ("X") && buttons[7].getLabel() == ("X"))
		{
					winnerX = true;
		}
		if(buttons[2].getLabel() == ("X") && buttons[5].getLabel() == ("X") && buttons[8].getLabel() == ("X"))
		{
					winnerX = true;
		}
		if(buttons[0].getLabel() == ("X") && buttons[4].getLabel() == ("X") && buttons[8].getLabel() == ("X"))
		{
					winnerX = true;
		}
		if(buttons[2].getLabel() == ("X") && buttons[4].getLabel() == ("X") && buttons[6].getLabel() == ("X"))
		{
					winnerX = true;
		}

			if(buttons[0].getLabel() == ("O") && buttons[1].getLabel() == ("O") && buttons[2].getLabel() == ("O"))
		{
					winnerO = true;
		}
		if(buttons[3].getLabel() == ("O") && buttons[4].getLabel() == ("O") && buttons[5].getLabel() == ("O"))
		{
					winnerO = true;
		}
		if(buttons[6].getLabel() == ("O") && buttons[7].getLabel() == ("O") && buttons[8].getLabel() == ("O"))
		{
					winnerO = true;
		}
		if(buttons[0].getLabel() == ("O") && buttons[3].getLabel() == ("O") && buttons[6].getLabel() == ("O"))
		{
					winnerO = true;
		}
		if(buttons[1].getLabel() == ("O") && buttons[4].getLabel() == ("O") && buttons[7].getLabel() == ("O"))
		{
					winnerO = true;
		}
		if(buttons[2].getLabel() == ("O") && buttons[5].getLabel() == ("O") && buttons[8].getLabel() == ("O"))
		{
					winnerO = true;
		}
		if(buttons[0].getLabel() == ("O") && buttons[4].getLabel() == ("O") && buttons[8].getLabel() == ("O"))
		{
					winnerO = true;
		}
		if(buttons[2].getLabel() == ("O") && buttons[4].getLabel() == ("O") && buttons[6].getLabel() == ("O"))
		{
					winnerO = true;
		}

		if(winnerX == true)
		{
			buttonField.setText("PLAYER X WINS!");
			turn.setText("Play Again?");
	/*		for(int i = 0; i < buttons.length; i++)
		{
			buttons[i].removeActionListener(this);
		}*/

		}
		if(winnerO == true)
		{
			buttonField.setText("PLAYER O WINS!");
			turn.setText("Play Again?");
	/*			for(int i = 0; i < buttons.length; i++)
		{
			buttons[i].removeActionListener(this);
		}*/

		}

		if(winnerX == false && winnerO == false && counter == 9)
		{
			buttonField.setText("CAT WINS!");
			turn.setText("Play Again?");
		/*	for(int i = 0; i < buttons.length; i++)
		{
			buttons[i].removeActionListener(this);
		}*/
		}



				if(e.getSource() == resetButton)
		{
			for(int i = 0; i < buttons.length; i++)
		{
			if(e.getSource() == buttons[i])
			{
			buttons[i].removeActionListener(this);
			}

			counter = 0;
			turn.setText("X's Turn");
			buttonField.setText("Winner?");
			one.setText("1");
			two.setText("2");
			three.setText("3");
			four.setText("4");
			five.setText("5");
			six.setText("6");
			seven.setText("7");
			eight.setText("8");
			nine.setText("9");

				for( i = 0; i < buttons.length; i++)
		{

			if(e.getSource() == buttons[i])
			{
			add(buttons[i]);
			buttons[i].addActionListener(this);
			buttons[i].setForeground(Color.black);

			}
		}

			winnerO = false;
			winnerX = false;

			}


			}

	}


	}

