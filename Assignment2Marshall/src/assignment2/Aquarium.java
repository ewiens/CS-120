package assignment2;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JPanel;

public class Aquarium extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	protected int x=0;
	protected int noF;
	
	final int numberofButtons =3;
	private JButton buttonArray[] = new JButton[numberofButtons];
	private String myFish;
	private ArrayList myFishTank = new ArrayList();
	  
	private JFrame myJFrame = new JFrame();
	
	public Aquarium(){

		try{
			int value = x/0;
		}catch(ArithmeticException e){System.out.println(e);}
		System.out.println("Testing out try/catch exception handeling");
		
		JFrame myJFrame = new JFrame("Aquarium");
		myJFrame.setSize(600, 400);
		myJFrame.setLocationRelativeTo(null);
		myJFrame.setLayout(new FlowLayout());
		
		JLabel myJLabel = new JLabel("What kind of fish is this?");
		JPanel myJPanel = new JPanel();
		
		buttonArray[0]= new JButton("Angelfish");
		buttonArray[1]= new JButton("Goldfish");
		buttonArray[2]= new JButton("Koi");
		
		for (int i=0; i<numberofButtons; i++){
			myJPanel.add(buttonArray[i]);
			buttonArray[i].addActionListener(this);
		}
		
		myJFrame.add(myJLabel);
		myJFrame.add(myJPanel);
		
		do{
		
		String FishQuestion=
				JOptionPane.showInputDialog("Would you like to add a fish?");
		String FQ = FishQuestion.toLowerCase();
			switch(FQ){
			case "yes":
				myJFrame.setVisible(true);	
				try{Thread.sleep(20000);}
				catch(Exception e){};
			break;
				
			default:
				JOptionPane.showMessageDialog(null, "Here are your fish:"+myFishTank);
				x=1;
			}
			
		} while(x!=1);
			
	}
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource()==buttonArray[0]){ //Angelfish
			
			myJFrame.dispose();
			Angelfish myAngelfish = new Angelfish();
			myAngelfish.setColor();
			myAngelfish.setName();
			myFish= myAngelfish.getColor()+" angelfish named " + myAngelfish.getName()  ;
			myFishTank.add(myFish);
		} else if(event.getSource()==buttonArray[1]){ //Goldfish
			
			myJFrame.dispose();
			Goldfish myGoldfish = new Goldfish();
			myGoldfish.setColor();
			myGoldfish.setName();
			myFish= myGoldfish.getColor()+" goldfish named " + myGoldfish.getName()  ;
			myFishTank.add(myFish);
			
		} else if(event.getSource()==buttonArray[2]){ // koi
			
			myJFrame.dispose();
			Koi myKoi = new Koi();
			myKoi.setColor();
			myKoi.setName();
			myFish= myKoi.getColor()+" koi named " + myKoi.getName()  ;
			myFishTank.add(myFish);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aquarium myAquarium = new Aquarium();

	}

}

