package userInterface;



/*
* CardLayoutDemo.java
*
*/
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import character.Character;

public class CardLayoutDemo implements ItemListener, ActionListener {
   JPanel cards; //a panel that uses CardLayout
   final static String MASTERSAVE = "Master Save!";
   final static String BASICINFO = "Basic Character Info";
   final static String ATTRIBUTES = "Attributes";
   final static String SKILLS = "Skill Selection";
   final static String INVENTORY = "Basic Inventory Selection";
   final static String CLASS = "Class Selection";
   
   Character main;
   
   //Master save stuff
   JButton masterSaveButton;
   
   BasicInfoPanel cardBasic;
   AttributePanel cardAttribute;
    
   public void addComponentToPane(Container pane) {
       //Put the JComboBox in a JPanel to get a nicer look.
       JPanel comboBoxPane = new JPanel(); //use FlowLayout
       String comboBoxItems[] = { MASTERSAVE, BASICINFO, ATTRIBUTES, CLASS, SKILLS, INVENTORY };
       JComboBox cb = new JComboBox(comboBoxItems);
       cb.setEditable(false);
       cb.addItemListener(this);
       comboBoxPane.add(cb);
       
       JPanel cardMaster = new JPanel();
       masterSaveButton = new JButton(MASTERSAVE);
       masterSaveButton.addActionListener(this);
       cardMaster.add(masterSaveButton);
        
       //Create the name panel add all of the components
       cardBasic = new BasicInfoPanel();       
        
       cardAttribute = new AttributePanel();
        
       //Create the panel that contains the "cards".
       cards = new JPanel(new CardLayout());
       cards.add(cardMaster, MASTERSAVE);
       cards.add(cardBasic, BASICINFO);
       cards.add(cardAttribute, ATTRIBUTES);

        
       pane.add(cb, BorderLayout.PAGE_START);
       pane.add(cards, BorderLayout.CENTER);
   }
    
   public void itemStateChanged(ItemEvent evt) {
       CardLayout cl = (CardLayout)(cards.getLayout());
       cl.show(cards, (String)evt.getItem());
   }
   
   public void actionPerformed(ActionEvent event)
   {
	   if(event.getSource() == masterSaveButton){
		   main = new Character(cardBasic.getName(), cardAttribute.getAttributeSet(), cardBasic.getRace());
		   System.out.println(main.toString());
	   }
   }
    
   /**
    * Create the GUI and show it.  For thread safety,
    * this method should be invoked from the
    * event dispatch thread.
    */
   private static void createAndShowGUI() {
       //Create and set up the window.
       JFrame frame = new JFrame("CharacterCreator");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       //Create and set up the content pane.
       CardLayoutDemo demo = new CardLayoutDemo();
       demo.addComponentToPane(frame.getContentPane());
        
       //Display the window.
//       frame.pack();
       frame.setSize(800, 600);
       frame.setVisible(true);
   }
    
   public static void runUI() {
       /* Use an appropriate Look and Feel */
       try {
           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
       } catch (UnsupportedLookAndFeelException ex) {
           ex.printStackTrace();
       } catch (IllegalAccessException ex) {
           ex.printStackTrace();
       } catch (InstantiationException ex) {
           ex.printStackTrace();
       } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
       }
       /* Turn off metal's use of bold fonts */
       UIManager.put("swing.boldMetal", Boolean.FALSE);
        
       //Schedule a job for the event dispatch thread:
       //creating and showing this application's GUI.
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               createAndShowGUI();
           }
       });
   }
}