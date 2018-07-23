package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controleur.Cours;
import modele.ModeleCours;


public class VueCoursS extends JPanel implements ActionListener
{
	private JTextField txtDate = new JTextField();
	private JTextField txtHeureD = new JTextField();
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btAjouter = new JButton("Supprimer");
	
	public VueCoursS()
	{
		JLabel lbVide1 = new JLabel("");JLabel lbVide2 = new JLabel("");JLabel lbVide3 = new JLabel("");JLabel lbVide4 = new JLabel("");JLabel lbVide5 = new JLabel("");
		
		this.setBounds(150, 250, 700, 150);
		this.setLayout(new GridLayout(6,2));
		this.setBackground(new Color(230,230,230));
		
		/*TITRE*/
		JLabel titre = new JLabel("Supprimer un cours");
		titre.setFont(new Font(titre.getText(), Font.ROMAN_BASELINE + Font.BOLD, 25));
		this.add(titre);

		this.add(lbVide3);		this.add(lbVide4);	this.add(lbVide5);
		
		JLabel lbDate = new JLabel(" Date du cours :");
		lbDate.setFont(new Font(lbDate.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbDate);		this.add(this.txtDate);
		
		JLabel lbHeure = new JLabel(" Heure du cours :");
		lbHeure.setFont(new Font(lbHeure.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbHeure);		this.add(this.txtHeureD);
		
		JLabel lbinfo = new JLabel(" Format Date :  2017-07-13 - Temps : 11:00:00 ");
		lbinfo.setFont(new Font(lbinfo.getText(), Font.CENTER_BASELINE, 12));
		this.add(lbinfo);
		this.add(lbVide2);	
		
		this.add(this.btAnnuler);
		this.btAnnuler.setIcon(new ImageIcon(new ImageIcon("src/images/choix1.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT)));
		this.btAnnuler.addActionListener(this);
		
		
		this.add(this.btAjouter);
		this.btAjouter.setIcon(new ImageIcon(new ImageIcon("src/images/choix2.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT)));
		this.btAjouter.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Stub de la méthode généré automatiquement
		if(e.getSource()==this.btAnnuler)
		{
			this.txtDate.setBackground(Color.WHITE);
			this.txtHeureD.setBackground(Color.WHITE);

			
			this.txtDate.setText(null);
			this.txtHeureD.setText(null);

		}
		
		else if (e.getSource()==this.btAjouter)
		{

			String datecours = this.txtDate.getText();
			String heuredebut = this.txtHeureD.getText();
							
		try{ 
		
				Cours unCours = new Cours(datecours , heuredebut);
				ModeleCours.delete(datecours,heuredebut);
				JOptionPane.showMessageDialog(this, "<html>Suppression reussie du cours de <br> " + unCours.getHeureDebut() + " du <html>" + unCours.getDateCours());
				this.txtDate.setText(null);
				this.txtHeureD.setText(null);
	
			
			this.setVisible(true); // fin d'enregistrement
}
		catch (NumberFormatException exp)
		{
			JOptionPane.showMessageDialog(this,"Erreur dans la saisie");
			this.txtDate.setBackground(Color.RED);
			this.txtHeureD.setBackground(Color.RED);
		}					
		}
	}
}