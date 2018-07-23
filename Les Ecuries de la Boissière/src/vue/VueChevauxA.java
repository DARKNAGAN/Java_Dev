package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controleur.Cheval;
import modele.ModeleCheval;

public class VueChevauxA extends JPanel implements ActionListener
{
	private JTextField txtNom = new JTextField();
	private JTextField txtProprietaire = new JTextField();
	private JTextField txtImgC = new JTextField();
	private JTextField txtAge = new JTextField();
	private JTextField txtRobe = new JTextField();
	private JTextField txtType = new JTextField();
	private JTextField txtRace = new JTextField();
	private ButtonGroup bg = new ButtonGroup();
	private JRadioButton jrH = new JRadioButton("MÂLE");
	private JRadioButton jrF = new JRadioButton("FEMELLE");
	private String txtSexe =null;  
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btAjouter = new JButton("Ajouter");
	
public VueChevauxA()
{
	JLabel lbVide1 = new JLabel("");JLabel lbVide2 = new JLabel("");JLabel lbVide3 = new JLabel(""); JLabel lbVide4 = new JLabel(""); JLabel lbVide5 = new JLabel("");
	JLabel lbVide6 = new JLabel("");
	/*AFFICHAGE ECRAN & DONNEES BDD*/
	this.setBounds(50, 130, 900, 500);
	this.setLayout(new GridLayout(14, 4));
	this.setBackground(new Color(230,230,230));
	
	
	/*TITRE*/
	JLabel titre = new JLabel("Ajouter un cheval");
	titre.setFont(new Font(titre.getText(), Font.ROMAN_BASELINE + Font.BOLD, 25));
	this.add(titre);
	
	this.add(lbVide1); 	this.add(lbVide5); 	this.add(lbVide6);
	
	JLabel lbNom = new JLabel(" *Nom :");
	lbNom.setFont(new Font(lbNom.getText(), Font.CENTER_BASELINE, 18));
	this.add(lbNom);		this.add(this.txtNom);
	
	JLabel lbProprietaire = new JLabel(" *Propriétaire :");
	lbProprietaire.setFont(new Font(lbProprietaire.getText(), Font.CENTER_BASELINE, 18));
	this.add(lbProprietaire);		this.add(this.txtProprietaire);  
    
	JLabel lbSexe = new JLabel(" Sexe :");
	lbSexe.setFont(new Font(lbSexe.getText(), Font.CENTER_BASELINE, 18));
	this.add(lbSexe);	this.add(lbVide2);
	jrH.setSelected(true);
    bg.add(jrH);	    this.add(jrH);
    bg.add(jrF);	    this.add(jrF);   
    
	JLabel lbAge = new JLabel(" Âge :");
	lbAge.setFont(new Font(lbAge.getText(), Font.CENTER_BASELINE, 18));
	this.add(lbAge);		this.add(this.txtAge);    
	
	JLabel lbType = new JLabel(" Type :");
	lbType.setFont(new Font(lbType.getText(), Font.CENTER_BASELINE, 18));
	this.add(lbType);		this.add(this.txtType);
	
	JLabel lbRace = new JLabel(" Race :");
	lbRace.setFont(new Font(lbRace.getText(), Font.CENTER_BASELINE, 18));
	this.add(lbRace);		this.add(this.txtRace);
	
	JLabel lbRobe = new JLabel(" Robe :");
	lbRobe.setFont(new Font(lbRobe.getText(), Font.CENTER_BASELINE, 18));
	this.add(lbRobe);		this.add(this.txtRobe);
	
	JLabel lbImgC = new JLabel(" Image :");
	lbImgC.setFont(new Font(lbImgC.getText(), Font.CENTER_BASELINE, 18));
	this.add(lbImgC);		this.add(this.txtImgC);
	this.add(lbVide3);	this.add(lbVide4);
	
	this.add(this.btAnnuler);
	this.btAnnuler.setIcon(new ImageIcon(new ImageIcon("src/images/choix1.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT)));
	this.btAnnuler.addActionListener(this);
	
	this.add(this.btAjouter);
	this.btAjouter.setIcon(new ImageIcon(new ImageIcon("src/images/choix2.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT)));
	this.btAjouter.addActionListener(this);
	
	JLabel lbinfo = new JLabel(" Les champs précédés d'une * sont obligatoires ");
	lbinfo.setFont(new Font(lbinfo.getText(), Font.CENTER_BASELINE, 12));
	this.add(lbinfo);
}


@Override
public void actionPerformed(ActionEvent e) {
	if(jrH.isSelected())
    {
    	txtSexe = jrH.getText();
    }
    else if(jrF.isSelected())
    {
    	txtSexe = jrF.getText();
    }
    
	// TODO Stub de la méthode généré automatiquement
	if(e.getSource()==this.btAnnuler)
	{
		this.txtAge.setBackground(Color.WHITE);
		this.txtNom.setBackground(Color.WHITE);
		this.txtProprietaire.setBackground(Color.WHITE);
		this.txtRobe.setBackground(Color.WHITE);
		this.txtType.setBackground(Color.WHITE);
		this.txtRace.setBackground(Color.WHITE);
		

		this.txtRobe.setText(null);
		this.txtNom.setText(null);
		this.txtProprietaire.setText(null);
		jrH.setSelected(true);
		this.txtRace.setText(null);
		this.txtImgC.setText(null);
		this.txtAge.setText(null);
		this.txtType.setText(null);	
	}
	
	else if (e.getSource()==this.btAjouter)
	{
		int age=Integer.parseInt(this.txtAge.getText());
		String nom = this.txtNom.getText();
		String sexe = this.txtSexe;
		jrH.setSelected(true);
		String proprietaire = this.txtProprietaire.getText();
		String robe = this.txtRobe.getText();
		String type = this.txtType.getText();		
		String race = this.txtRace.getText();
		String imagecheval = this.txtImgC.getText();
						
	try{ 
		
		if(nom.equals("")||proprietaire.equals(""))
	{
			JOptionPane.showMessageDialog(this, "Veuillez saisir des valeurs dans les champs obligatoire");
	}
		
	else
		{
			Cheval unCheval = new Cheval( age,  nom,  sexe,  proprietaire,  robe,  type,  race, imagecheval);
			ModeleCheval.insert(unCheval);
			JOptionPane.showMessageDialog(this, "Insertion reussie");
			this.txtAge.setText(null);
			this.txtNom.setText(null);
			jrH.setSelected(true);
			this.txtProprietaire.setText(null);
			this.txtRobe.setText(null);
			this.txtType.setText(null);
			this.txtRace.setText(null);
			this.txtImgC.setText(null);	
		}
		this.setVisible(true); // fin d'enregistrement
}
	catch (NumberFormatException exp)
	{
		JOptionPane.showMessageDialog(this,"Erreur dans la saisie");
		this.txtAge.setBackground(Color.RED);
		this.txtNom.setBackground(Color.RED);
		this.txtProprietaire.setBackground(Color.RED);
		this.txtRobe.setBackground(Color.RED);
		this.txtType.setBackground(Color.RED);
		this.txtRace.setBackground(Color.RED);
	}
						
	}
	
}
  class StateListener implements ActionListener{
	    public void actionPerformed(ActionEvent e) {


	    }
	  }
}
