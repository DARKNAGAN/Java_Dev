package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controleur.Cours;
import modele.ModeleCours;

public class VueCoursA extends JPanel implements ActionListener
{
	private JTextField txtDate = new JTextField();
	private JTextField txtHeureD = new JTextField();
	private JTextField txtHeureF = new JTextField();
	private JTextField txtEleve = new JTextField();
	private JTextField txtFormateur = new JTextField();
	private JTextField txtCheval = new JTextField();
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btAjouter = new JButton("Ajouter");
	
	public VueCoursA()
	{
		JLabel lbVide1 = new JLabel("");JLabel lbVide2 = new JLabel("");JLabel lbVide3 = new JLabel(""); JLabel lbVide4 = new JLabel(""); JLabel lbVide5 = new JLabel("");
		JLabel lbVide6 = new JLabel("");
		/* AFFICHAGE ECRAN*/
		this.setBounds(50, 130, 900, 500);
		this.setLayout(new GridLayout(8, 4));
		this.setBackground(new Color(230,230,230));
		
		
		/*TITRE & DONNEES BDD*/
		JLabel titre = new JLabel("Ajouter un cours");
		titre.setFont(new Font(titre.getText(), Font.ROMAN_BASELINE + Font.BOLD, 25));
		this.add(titre);
		
		this.add(lbVide1);	this.add(lbVide5);	this.add(lbVide6);
		
		JLabel lbDate = new JLabel(" *Date du cours :");
		lbDate.setFont(new Font(lbDate.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbDate);		this.add(this.txtDate);
		
		JLabel lbHeureD = new JLabel(" *Heure de début :");
		lbHeureD.setFont(new Font(lbHeureD.getText(), Font.CENTER_BASELINE, 18));
		this.txtHeureD.setText("HH:MM:SS");
		this.add(lbHeureD);		this.add(this.txtHeureD);
		
		JLabel lbHeureF = new JLabel(" *Heure de fin :");
		lbHeureF.setFont(new Font(lbHeureF.getText(), Font.CENTER_BASELINE, 18));
		this.txtHeureF.setText("HH:MM:SS");
		this.add(lbHeureF);		this.add(this.txtHeureF);
		/*
		JLabel lbEleve = new JLabel(" *Numéro d'élève :");
		lbEleve.setFont(new Font(lbEleve.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbEleve);		this.add(this.txtEleve);

		JLabel lbFormateur = new JLabel(" *Numéro de formateur:");
		lbFormateur.setFont(new Font(lbFormateur.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbFormateur);		this.add(this.txtFormateur);
		
		JLabel lbCheval = new JLabel(" *Numéro de cheval :");
		lbCheval.setFont(new Font(lbCheval.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbCheval);		this.add(this.txtCheval);
		*/
		JLabel lbinfo = new JLabel(" Format Date :  2017-07-13 - Temps : 11:00:00 ");
		lbinfo.setFont(new Font(lbinfo.getText(), Font.CENTER_BASELINE, 12));
		this.txtDate.setText("AAAA-MM-JJ");	
		this.add(lbinfo);
		this.add(lbVide4);
		
		this.add(this.btAnnuler);
		this.btAnnuler.setIcon(new ImageIcon(new ImageIcon("src/images/choix1.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT)));
		this.btAnnuler.addActionListener(this);
		
		this.add(this.btAjouter);
		this.btAjouter.setIcon(new ImageIcon(new ImageIcon("src/images/choix2.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT)));
		this.btAjouter.addActionListener(this);
		
	}
	
	/*EVENT*/
	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Stub de la méthode généré automatiquement
		if(e.getSource()==this.btAnnuler)
		{
			this.txtDate.setBackground(Color.WHITE);
			this.txtHeureD.setBackground(Color.WHITE);
			this.txtHeureF.setBackground(Color.WHITE);
			this.txtEleve.setBackground(Color.WHITE);
			this.txtFormateur.setBackground(Color.WHITE);
			this.txtCheval.setBackground(Color.WHITE);
			
			this.txtDate.setText("AAAA-MM-JJ");	
			this.txtHeureD.setText("HH:MM:SS");
			this.txtHeureF.setText("HH:MM:SS");
			this.txtEleve.setText(null);
			this.txtFormateur.setText(null);
			this.txtCheval.setText(null);
			
		}
		
		else if (e.getSource()==this.btAjouter)
		{
			String datecours = this.txtDate.getText();
			String heuredebut = this.txtHeureD.getText();
			String heurefin = this.txtHeureF.getText();

							
		try{ 
			
			if(datecours.equals("")||heuredebut.equals("")||heurefin.equals("")||heuredebut.equals("HH:MM:SS")||heurefin.equals("HH:MM:SS")||datecours.equals("AAAA-MM-JJ"))
		{
				JOptionPane.showMessageDialog(this, "Veuillez saisir des valeurs correcte dans les champs obligatoire");
		}
			
		else
			{
				Cours unCours = new Cours(datecours, heuredebut, heurefin);
				ModeleCours.insert(unCours);
				JOptionPane.showMessageDialog(this, "Insertion reussie");
				this.txtFormateur.setText(null);
				this.txtCheval.setText(null);
				this.txtHeureD.setText("HH:MM:SS");
				this.txtHeureF.setText("HH:MM:SS");
				this.txtEleve.setText(null);
				this.txtDate.setText("AAAA-MM-JJ");	
			}
			this.setVisible(true); // fin d'enregistrement
}
		catch (NumberFormatException exp)
		{
			JOptionPane.showMessageDialog(this,"Erreur dans la saisie");
			this.txtDate.setBackground(Color.RED);
			this.txtHeureD.setBackground(Color.RED);
			this.txtHeureF.setBackground(Color.RED);
			this.txtEleve.setBackground(Color.RED);
			this.txtFormateur.setBackground(Color.RED);
			this.txtCheval.setBackground(Color.RED);
		}
							
		}
		
	}
	  class StateListener implements ActionListener{
		    public void actionPerformed(ActionEvent e) {


		    }
		  }

}


