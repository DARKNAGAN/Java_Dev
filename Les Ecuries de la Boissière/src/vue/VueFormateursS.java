package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controleur.Formateur;
import modele.ModeleFormateur;

public class VueFormateursS extends JPanel implements ActionListener
{
	private JTextField txtLogin = new JTextField();
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btAjouter = new JButton("Supprimer");
	
	public VueFormateursS()
	{
		JLabel lbVide1 = new JLabel("");JLabel lbVide2 = new JLabel("");JLabel lbVide3 = new JLabel("");JLabel lbVide4 = new JLabel("");JLabel lbVide5 = new JLabel("");
		
		this.setBounds(150, 250, 700, 150);
		this.setLayout(new GridLayout(5,2));
		this.setBackground(new Color(230,230,230));
		
		/*TITRE*/
		JLabel titre = new JLabel("Supprimer un formateur");
		titre.setFont(new Font(titre.getText(), Font.ROMAN_BASELINE + Font.BOLD, 25));
		this.add(titre);
		
		this.add(lbVide1);		this.add(lbVide2);		this.add(lbVide3);
 
		JLabel lbLogin = new JLabel(" Login :");
		lbLogin.setFont(new Font(lbLogin.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbLogin);		this.add(this.txtLogin);
		
		this.add(lbVide4);			this.add(lbVide5);
	
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
			
			this.txtLogin.setBackground(Color.WHITE);
			this.txtLogin.setText(null);

		}
		
		else if (e.getSource()==this.btAjouter)
		{

			String login = this.txtLogin.getText();
							
		try{ 
		
				Formateur unFormateur = new Formateur(login);
				ModeleFormateur.delete(login);
				JOptionPane.showMessageDialog(this, "Suppression reussie de " + unFormateur.getLogin());
				this.txtLogin.setText(null);
	
			
			this.setVisible(true); // fin d'enregistrement
}
		catch (NumberFormatException exp)
		{
			
			JOptionPane.showMessageDialog(this,"Erreur dans la saisie");
			this.txtLogin.setBackground(Color.RED);

		}
							
		}
		
	}


}