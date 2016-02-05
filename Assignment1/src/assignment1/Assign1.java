package assignment1;
/*Credit to IMDB for names and numbers*/

//import java.util.Arrays;
//import java.util.ArrayList;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.security.SecureRandom;
//import java.io.*;
//import java.util.Scanner;
import java.util.*;


public class Assign1 {
	
private static ArrayList Monsters = new ArrayList();

	public static void main(String[] args) {

		JFrame Who= new JFrame("Make your choice");
		Who.setLayout(new FlowLayout());
		Who.setSize(300, 200);
		Who.setLocationRelativeTo(null);
		Who.setVisible(true);
		
		JLabel words = new JLabel("Would you like to look at Doctors or Companions");
		
		JButton Doctors = new JButton("Doctors");
		JButton Companions = new JButton("Monsters");
		
		JPanel choosePanel = new JPanel();
		choosePanel.add(Doctors);
		choosePanel.add(Companions);
		
		Who.add(words);
		Who.add(choosePanel);
		
		Doctors.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				Doctors();
				return;
			}
		});
			
		Companions.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				Monsters();
				return;
			}
		});
			
		
		
				
//		int [][] numbers;
//		numbers= new int [7][2];
//		
//		SecureRandom myRandom = new SecureRandom();
//		
//		for(int i=0; i<numbers.length; i++){
//			numbers[i][0]=myRandom.nextInt(50);
//			numbers[i][1]=myRandom.nextInt(50);
//			System.out.println(numbers[i][0]+" "+ numbers[i][1]);
//		}
//		 Average(numbers);
		
//		for(int i=0; i<b.length; i++){
//			File Doctors = new File("Doctors.txt");
//			Scanner in = new Scanner(Doctors);
//			b[i][1]=in.next(Doctors);
			
		}
		
	protected static void Monsters(){
		Monsters.add("Daleks");
		Monsters.add("Cybermen");
		Monsters.add("Weeping Angels");
		Monsters.add("Slitheen");
		Monsters.add("Ood");
		Monsters.add("Vashta Narada");
		
		System.out.println(Monsters);
		int x=1;
		String more =
				JOptionPane.showInputDialog(null, "Do you want to add more items?");
		String more1 = more.toLowerCase();
//		do{
			
		switch (more1){
		
			case "yes":
			case "yeah":
				String add = JOptionPane.showInputDialog(null, "What would you like to add?");
				
				Monsters.add(add);
				System.out.println("The new array is "+ Monsters);
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "No more monsters will be added");
		
		}
		
//	}
//		while(true);
	}

	protected static void Doctors(){
		String [][] Doctors;
		Doctors= new String[4][2];
		
		Doctors[0][0]="Eccelston";
		Doctors[1][0]="Tennant";
		Doctors[2][0]="Smith";
		Doctors[3][0]="Capaldi";
		
		Doctors[0][1]="21";
		Doctors[1][1]="59";
		Doctors[2][1]="57";
		Doctors[3][1]="32";

		System.out.println("Doctor "+" "+"# of Episodes");
		for(int i=0; i<Doctors.length; i++){
			
		System.out.println(Doctors[i][0]+" "+Doctors[i][1]);	
			
		}
		
		int [] dnumbers={22,59,57,32};
		dnumbers= new int[4];
		dnumbers[0]= 22;
		dnumbers[1]= 59;
		dnumbers[2]= 57;
		dnumbers[3]= 32;
		System.out.println(dnumbers[0]);
		Average(dnumbers);
		
		
		return;
	}

	protected static void Companions(){
		String [][] Companions;
		Companions= new String[7][2];
		
		Companions[0][0]="Rose";
		Companions[1][0]="Martha";
		Companions[2][0]="Donna";
		Companions[3][0]="Amy";
		Companions[4][0]="Rory";
		Companions[5][0]="Clara";
		Companions[6][0]="River Song";

		Companions[0][1]="39";
		Companions[1][2]="24";
		Companions[2][2]="19";
		Companions[3][1]="37";
		Companions[4][1]="27";
		Companions[5][1]="39";
		Companions[6][1]="18";
		
		System.out.println("Companion "+" "+"# of Episodes");
		
		for(int i=0; i<Companions.length; i++){
				System.out.println(Companions[i][0]+" "+Companions[i][1]);	
		}
		
		int [] cnumbers={39,24,19,37,27,39,18};
		cnumbers= new int[7];
		
		cnumbers[0]=39;
		cnumbers[1]=24;
		cnumbers[2]=19;
		cnumbers[3]=37;
		cnumbers[4]=27;
		cnumbers[5]=39;
		cnumbers[6]=18;
		
		Average(cnumbers);
		
		return;
	}
	
		
	protected static void Average(int[]numbers){
		
		float sum=0;
		
		for(int i=0;i< numbers.length; i++){
			sum=sum+numbers[i];
		//	sum=sum+numbers[i][1];
		}
		
		float average =0; 
				
		average = sum/numbers.length;
		System.out.println("The average for the second column of this array is "+ average);
		return;
	}

}
