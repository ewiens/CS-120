package assignment2;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;


public class Fish {

	private String Color;
	private String Name;
	
	protected void setColor(){
		
		System.out.println(Color);
		
		Color = "yellow";
		Name = "Little Swimmy";
		
		JFrame myCFrame = new JFrame();
		myCFrame.setSize(600, 400);
		myCFrame.setLayout(new FlowLayout());
		myCFrame.setLocationRelativeTo(null);
		
		JLabel myColorLabel= new JLabel("Your fish is currently "+Color+". Would you like to change it?");
        JPanel myColorPanel = new JPanel();
        
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");
    
        myColorPanel.add(yesButton);
        myColorPanel.add(noButton);
        
        myCFrame.add(myColorLabel);
        myCFrame.add(myColorPanel);
		myCFrame.setVisible(true);
	
//		System.out.println(Color);
		
		yesButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        	    myCFrame.dispose();
        	    colorIs();
        		return; 
        	}
        });
        noButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        	myCFrame.dispose();
        	return;	
        	}
        });
		
	}
	protected String colorIs(){
		Color=JOptionPane.showInputDialog("What color is your fish?");
		System.out.println(Color);
		return Color;
	}
	
	protected String getColor(){
		System.out.println(Color);
		return Color;
	}

	protected void setName(){
		
		JFrame myNFrame = new JFrame();
		myNFrame.setSize(600, 400);
		myNFrame.setLocationRelativeTo(null);
		myNFrame.setLayout(new FlowLayout());
		
		JLabel myNameLabel= new JLabel("Your fish is currently named "+Name+". Would you like to change it?");
        JPanel myNamePanel = new JPanel();
        
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");
        
       
        myNamePanel.add(yesButton);
        myNamePanel.add(noButton);
        
        myNFrame.add(myNameLabel);
        myNFrame.add(myNamePanel);
		myNFrame.setVisible(true);
		
		yesButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        	    myNFrame.dispose();
        		nameIs();
        	    return;
        	}
        }); 
        noButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		myNFrame.dispose();
        	return;	
        	}
        });
		
	}
	
	protected String nameIs(){
		Name=JOptionPane.showInputDialog("What is the name of your fish?");
		return Name;
	}
	
	protected String getName(){
		return Name;
	}
	
}
