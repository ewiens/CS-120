package animation;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Assign2 extends JFrame implements ActionListener{

	final int numberofButtons = 4;
	final int numberofImages =7;
	private static final long serialVersionUID = 1L;
	private JButton buttonArray[] = new JButton[numberofButtons];
	private Icon iconArray[] = new Icon[numberofImages];
	private JLabel myJLabel = new JLabel();
	private boolean isRunning = false;
	private boolean isStopped = false;
	private boolean isReverse = true;
		
	public Assign2()  {
		setSize(800,500);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.red);
		
		//setVisible(true);
		buttonArray[0] = new JButton("Play");
		buttonArray[1] = new JButton("Pause");
		buttonArray[2] = new JButton("Stop");
		buttonArray[3] = new JButton("Reverse");
		

		
		for (int i=0;i<numberofButtons; i++){
			add(buttonArray[i]);
			buttonArray[i].addActionListener(this);
		}
		
		iconArray[0]= new ImageIcon("Sriracha0.gif");
		iconArray[1]= new ImageIcon("Sriracha1.gif");
		iconArray[2]= new ImageIcon("Sriracha2.gif");
		iconArray[3]= new ImageIcon("Sriracha3.gif");
		iconArray[4]= new ImageIcon("Sriracha4.gif");
		iconArray[5]= new ImageIcon("Sriracha5.gif");
		iconArray[6]= new ImageIcon("Sriracha6.gif");
		
		myJLabel = new JLabel(iconArray[0]);
		add(myJLabel);
		
		setVisible(true);
		
		for (int j=0; j<400 && !isStopped; j++){
			for(int i=0; i<numberofImages; i++){
				try{
					myJLabel.setIcon(iconArray[i]);
					Thread.sleep(40); // 40
					while (!isRunning){
						Thread.sleep(300);
					}
				} catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		
		if(event.getSource() == buttonArray[0]){
			isRunning =true;
		} else if (event.getSource()==buttonArray[1]){
			isRunning = false;
			buttonArray[0].setText("Resume");
		} else if (event.getSource()== buttonArray[2]){
			isStopped = true;
			buttonArray[0].setText("Bye");
			buttonArray[1].setText("Bye");
			buttonArray[2].setText("Bye");
		} else if (event.getSource()==buttonArray[3]){
			isReverse=true;
		}
	
	}
	
	
	public static void main(String args[]) throws InterruptedException{
		Assign2 myAssign2 = new Assign2();
	}
}


