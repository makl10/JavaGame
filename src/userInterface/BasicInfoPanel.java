package userInterface;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import character.AttributeSet;
import character.Character;
import character.Race;

public class BasicInfoPanel extends JPanel implements ActionListener
{
	   final static String BASICINFO = "Basic Character Info";
	   final static String ATTRIBUTES = "Attributes";
	   final static String SKILLS = "Skill Selection";
	   final static String INVENTORY = "Basic Inventory Selection";
	   final static String ClASS = "Class Selection";
	   final static String NAMEBUTTONSTRING = "Enter!";
	   final static String FINISHBUTTONSTRING = "SAVE!";
	   final static String HUMANNAMESTRING = "Human";
	   final static String ELFNAMESTRING = "Elf";
	   final static String DWARFNAMESTRING = "Dwarf";

	   
	   private String aName;
	   private Race aRace;
	   Character aCharacter;
	   
	   Character main;
	   
	   //Character Name Panel Set Up
	   JButton nameButtonEnter;
	   JButton saveButton;
	   JTextField nameTextField;
	   JLabel nameLabel;
	   
	   //Race RadioButtons
	   JRadioButton humanButton;
	   JRadioButton elfButton;
	   JRadioButton dwarfButton;
	   
	   boolean isHuman = false;
	   boolean isElf = false;
	   boolean isDwarf = false;
	   
	   public BasicInfoPanel()
	   {
		   this.setLayout(new FlowLayout());
		   this.setPreferredSize(new Dimension(240, 300));

		   //Name Panel Set up
	       nameButtonEnter = new JButton(NAMEBUTTONSTRING);
	       nameButtonEnter.addActionListener(this);
	       saveButton = new JButton(FINISHBUTTONSTRING);
	       saveButton.addActionListener(this);
	       
	       //Name text field
	       nameTextField = new JTextField("Enter your name here!", 20);
	       nameTextField.addMouseListener(new MouseAdapter(){
	    	   @Override
	    	   public void mouseClicked(MouseEvent e){
	    		   nameTextField.setText("");
	    	   }
	       });
	       
	       //Name Label
	       nameLabel = new JLabel("Select your Personal Details");
	       
	       //Radio Buttons
	       humanButton = new JRadioButton(HUMANNAMESTRING);
	       elfButton = new JRadioButton(ELFNAMESTRING);
	       dwarfButton = new JRadioButton(DWARFNAMESTRING);
	       
	       humanButton.addActionListener(this);
	       elfButton.addActionListener(this);
	       dwarfButton.addActionListener(this);
	       
	       //Button group to hold the radio buttons
	       ButtonGroup group = new ButtonGroup();
	       group.add(humanButton);
	       group.add(elfButton);
	       group.add(dwarfButton);
	       
	       add(nameLabel);
	       add(nameTextField);
	       for(Enumeration<AbstractButton> en = group.getElements(); en.hasMoreElements();) {
	    	   AbstractButton b = en.nextElement();
	    	   add(b);
	       }
	       
	       add(nameButtonEnter);
	       add(saveButton);
	   }
	   
	   public String getName()
	   {
		   return aName;
	   }
	   
	   public Race getRace()
	   {
		   return aRace;
	   }
	   
	   public void actionPerformed(ActionEvent event)
	   {
		   if(event.getSource() == humanButton) {
			   isHuman = true;
			   isElf = false;
			   isDwarf = false;
		   }
		   
		   else if(event.getSource() == elfButton) {
			   isHuman = false;
			   isElf = true;
			   isDwarf = false;
		   }
		   
		   else if(event.getSource() == dwarfButton) {
			   isHuman = false;
			   isElf = false;
			   isDwarf = true;
		   }
		   
		   else if(event.getSource() == nameButtonEnter && isHuman){
			   aRace = Race.HUMAN;
			   aName = nameTextField.getText();
			   System.out.println(aName);
			   System.out.println(aRace);
		   }
		   
		   else if(event.getSource() == nameButtonEnter && isElf){
			   aRace = Race.ELF;
			   aName = nameTextField.getText();
			   System.out.println(aName);
			   System.out.println(aRace);
		   }
		   
		   else if(event.getSource() == nameButtonEnter && isDwarf){
			   aRace = Race.DWARF;
			   aName = nameTextField.getText();
			   System.out.println(aName);
			   System.out.println(aRace);
		   }
		   
		   else if(event.getSource() == saveButton && isHuman){
			   aRace = Race.HUMAN;
			   aName = nameTextField.getText();
			   AttributeSet attributes = new AttributeSet(100, 100, 0, 0, 10, 10, 10, 10);
			   main = new Character(aName, attributes, aRace);
			   System.out.println(main.toString());
		   }
		   
		   else if(event.getSource() == saveButton && isElf){
			   aRace = Race.ELF;
			   aName = nameTextField.getText();
			   AttributeSet attributes = new AttributeSet(100, 100, 0, 0, 10, 10, 10, 10);
			   main = new Character(aName, attributes, aRace);
			   System.out.println(main.toString());
		   }
		   
		   else if(event.getSource() == saveButton && isDwarf){
			   aRace = Race.DWARF;
			   aName = nameTextField.getText();
			   AttributeSet attributes = new AttributeSet(100, 100, 0, 0, 10, 10, 10, 10);
			   main = new Character(aName, attributes, aRace);
			   System.out.println(main.toString());
		   }
	   }
}
