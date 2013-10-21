package userInterface;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import character.AttributeSet;

public class AttributePanel extends JPanel implements ActionListener
{
	//Needed strings
	public static final String ATTRIBUTELABELSTRING = "Choose your Attributes";
	public static final String POINTSREMAININGSTRING = "Points Remaining: ";
	public static final String ATTRIBUTECATEGORYSTRING = "Attributes";
	public static final String ADDBUTTONLABEL = "+";
	
	public static final String HEALTHLABELSTRING = "Health: ";
	public static final String MANALABELSTRING = "Mana: ";
	public static final String DAMAGELABELSTRING = "Damage: ";
	public static final String ARMOURLABELSTRING = "Armour: ";
	
	public static final String STRENGTHLABELSTRING = "Strength: ";
	public static final String DEXTERITYLABELSTRING = "Dexterity: ";
	public static final String INTELLIGENCELABELSTRING = "Intelligence: ";
	public static final String CONSTITUTIONLABELSTRING = "Constitution: ";
	
	int pointsRemaining = 20;
	
	//The attributeSet to return
	AttributeSet attributes;
	
	//For AttributeSet
	private double health = 100;
	private double mana = 100;
	private double damage = 5;
	private double armour = 5;
	
	private int strength = 10;
	private int dexterity = 10;
	private int intelligence = 10;
	private int constitution = 10;
	
	//JLabels needed
	JLabel AttributeLabel;
	JLabel PointsRemainingLabel;
	JLabel AttributeCategoryLabel;
	JLabel HealthLabel;
	JLabel ManaLabel;
	JLabel DamageLabel;
	JLabel ArmourLabel;
	JLabel StrengthLabel;
	JLabel DexterityLabel;
	JLabel IntelligenceLabel;
	JLabel ConstitutionLabel;
	
	//JButtons needed
	JButton strengthIncrementButton;
	JButton dexterityIncrementButton;
	JButton intelligenceIncrementButton;
	JButton constitutionIncrementButton;
	
	
	
	public AttributePanel()
	{
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		this.setLayout(gridBag);
		
		//Set and add the Header
		AttributeLabel = new JLabel(ATTRIBUTELABELSTRING);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		AttributeLabel.setFont(new Font("Times", Font.BOLD, 18));
		AttributeLabel.setBackground(Color.red);
		AttributeLabel.setOpaque(true);
		add(AttributeLabel, c);
		
		//Set and add the Points Remaining 
		PointsRemainingLabel = new JLabel(POINTSREMAININGSTRING + pointsRemaining);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		PointsRemainingLabel.setFont(new Font("Times", Font.PLAIN, 16));
		//PointsRemainingLabel.setBackground(Color.gray);
		PointsRemainingLabel.setOpaque(true);
		add(PointsRemainingLabel, c);
		
		//Set Attribute Category Label
		AttributeCategoryLabel = new JLabel(ATTRIBUTECATEGORYSTRING);
		c.gridx = 0;
		c.gridy = 4;
		AttributeCategoryLabel.setFont(new Font("Times", Font.PLAIN, 16));
		AttributeCategoryLabel.setBackground(Color.white);
		AttributeCategoryLabel.setOpaque(true);
		add(AttributeCategoryLabel, c);
		
		//Set the Strength Label
		StrengthLabel = new JLabel(STRENGTHLABELSTRING + strength);
		c.gridx = 0;
		c.gridy = 6;
		StrengthLabel.setFont(new Font("Times", Font.PLAIN, 16));
		StrengthLabel.setBackground(Color.white);
		StrengthLabel.setOpaque(true);
		add(StrengthLabel, c);
		
		//Set the Strength Increment Button
		strengthIncrementButton = new JButton(ADDBUTTONLABEL);
		strengthIncrementButton.addActionListener(this);
		c.gridx = 1;
		c.gridy = 6;
		strengthIncrementButton.setFont(new Font("Times", Font.PLAIN, 16));
		strengthIncrementButton.setBackground(Color.gray);
		strengthIncrementButton.setOpaque(true);
		add(strengthIncrementButton, c);
		
		//Set the Dexterity Label
		DexterityLabel = new JLabel(DEXTERITYLABELSTRING + dexterity);
		c.gridx = 0;
		c.gridy = 8;
		DexterityLabel.setFont(new Font("Times", Font.PLAIN, 16));
		DexterityLabel.setBackground(Color.white);
		DexterityLabel.setOpaque(true);
		add(DexterityLabel, c);
		
		//Set the Dexterity Increment Button
		dexterityIncrementButton = new JButton(ADDBUTTONLABEL);
		dexterityIncrementButton.addActionListener(this);
		c.gridx = 1;
		c.gridy = 8;
		dexterityIncrementButton.setFont(new Font("Times", Font.PLAIN, 16));
		dexterityIncrementButton.setBackground(Color.gray);
		dexterityIncrementButton.setOpaque(true);
		add(dexterityIncrementButton, c);
		
		//Set the Intelligence Label
		IntelligenceLabel = new JLabel(INTELLIGENCELABELSTRING + intelligence);
		c.gridx = 0;
		c.gridy = 10;
		IntelligenceLabel.setFont(new Font("Times", Font.PLAIN, 16));
		IntelligenceLabel.setBackground(Color.white);
		IntelligenceLabel.setOpaque(true);
		add(IntelligenceLabel, c);
		
		//Set the Dexterity Increment Button
		intelligenceIncrementButton = new JButton(ADDBUTTONLABEL);
		intelligenceIncrementButton.addActionListener(this);
		c.gridx = 1;
		c.gridy = 10;
		intelligenceIncrementButton.setFont(new Font("Times", Font.PLAIN, 16));
		intelligenceIncrementButton.setBackground(Color.gray);
		intelligenceIncrementButton.setOpaque(true);
		add(intelligenceIncrementButton, c);
		
		//Set the Constitution Label
		ConstitutionLabel = new JLabel(CONSTITUTIONLABELSTRING + constitution);
		c.gridx = 0;
		c.gridy = 12;
		ConstitutionLabel.setFont(new Font("Times", Font.PLAIN, 16));
		ConstitutionLabel.setBackground(Color.white);
		ConstitutionLabel.setOpaque(true);
		add(ConstitutionLabel, c);
		
		//Set the Constitution Increment Button
		constitutionIncrementButton = new JButton(ADDBUTTONLABEL);
		constitutionIncrementButton.addActionListener(this);
		c.gridx = 1;
		c.gridy = 12;
		constitutionIncrementButton.setFont(new Font("Times", Font.PLAIN, 16));
		constitutionIncrementButton.setBackground(Color.gray);
		constitutionIncrementButton.setOpaque(true);
		add(constitutionIncrementButton, c);
		
		//Set the Health Label
		HealthLabel = new JLabel(HEALTHLABELSTRING + (health + constitution*10));
		c.gridx = 0;
		c.gridy = 14;
		HealthLabel.setFont(new Font("Times", Font.PLAIN, 16));
		HealthLabel.setBackground(Color.white);
		HealthLabel.setOpaque(true);
		add(HealthLabel, c);
		
		//Set the Mana Label
		ManaLabel = new JLabel(MANALABELSTRING + (health + constitution*10));
		c.gridx = 0;
		c.gridy = 16;
		HealthLabel.setFont(new Font("Times", Font.PLAIN, 16));
		HealthLabel.setBackground(Color.white);
		HealthLabel.setOpaque(true);
		add(HealthLabel, c);
	}
	
	//All the appropriate button responses
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == strengthIncrementButton && pointsRemaining > 0){
			strength++;
			pointsRemaining--;
			PointsRemainingLabel.setText(POINTSREMAININGSTRING + pointsRemaining);
			StrengthLabel.setText(STRENGTHLABELSTRING + strength);
		}
		
		else if(event.getSource() == dexterityIncrementButton && pointsRemaining > 0){
			dexterity++;
			pointsRemaining--;
			PointsRemainingLabel.setText(POINTSREMAININGSTRING + pointsRemaining);
			DexterityLabel.setText(DEXTERITYLABELSTRING + dexterity);
		}
		
		else if(event.getSource() == intelligenceIncrementButton && pointsRemaining > 0){
			intelligence++;
			pointsRemaining--;
			PointsRemainingLabel.setText(POINTSREMAININGSTRING + pointsRemaining);
			IntelligenceLabel.setText(INTELLIGENCELABELSTRING + intelligence);
		}
		
		else if(event.getSource() == constitutionIncrementButton && pointsRemaining > 0){
			constitution++;
			pointsRemaining--;
			PointsRemainingLabel.setText(POINTSREMAININGSTRING + pointsRemaining);
			ConstitutionLabel.setText(CONSTITUTIONLABELSTRING + constitution);
			HealthLabel.setText((HEALTHLABELSTRING + (health + constitution*10)));
		}
	}
	
	public AttributeSet getAttributeSet()
	{
		attributes = new AttributeSet(health, mana, damage, armour, strength, dexterity, intelligence, constitution);
		return attributes;
	}
}
