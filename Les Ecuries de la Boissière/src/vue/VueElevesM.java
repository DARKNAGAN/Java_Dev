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
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controleur.Eleve;
import modele.ModeleEleve;

public class VueElevesM extends JPanel implements ActionListener
{
	private JTextField txtPseudo = new JTextField();
	private JTextField txtNom = new JTextField();
	private JTextField txtPrenom = new JTextField();
	private JTextField txtAdresse = new JTextField();
	private JTextField txtMail = new JTextField();
	private JTextField txtImgE = new JTextField();
	private JTextField txtGalop = new JTextField();
	private ButtonGroup bg = new ButtonGroup();
	private JRadioButton jrH = new JRadioButton("HOMME");
	private JRadioButton jrF = new JRadioButton("FEMME");
	private String txtSexe =null;  
	private JTextField txtAge = new JTextField();
	private JPasswordField txtMdp = new JPasswordField();
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btAjouter = new JButton("Modifier");
	
	public VueElevesM()
	{
		JLabel lbVide1 = new JLabel("");JLabel lbVide2 = new JLabel("");JLabel lbVide3 = new JLabel("");JLabel lbVide4 = new JLabel("");JLabel lbVide5 = new JLabel("");
		JLabel lbVide6 = new JLabel("");
		
		this.setBounds(50, 130, 900, 500);
		this.setLayout(new GridLayout(16, 4));
		this.setBackground(new Color(230,230,230));
		
		
		/*TITRE*/
		JLabel titre = new JLabel("Modifier un élève");
		titre.setFont(new Font(titre.getText(), Font.ROMAN_BASELINE + Font.BOLD, 25));
		this.add(titre);
		
		this.add(lbVide1);	
		JLabel lbinfoM = new JLabel(" ! Tous les champs doivent être remplis ! ");
		lbinfoM.setFont(new Font(lbinfoM.getText(), Font.CENTER_BASELINE, 12));
		lbinfoM.setForeground(Color.red);
		this.add(lbinfoM);
		this.add(lbVide6);
		
		JLabel lbPseudo = new JLabel(" *Pseudo d'un élève éxistant:");
		lbPseudo.setFont(new Font(lbPseudo.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbPseudo);		this.add(this.txtPseudo);
		
		JLabel lbNom = new JLabel(" Nom :");
		lbNom.setFont(new Font(lbNom.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbNom);		this.add(this.txtNom);
		
		JLabel lbPrenom = new JLabel(" Prenom :");
		lbPrenom.setFont(new Font(lbPrenom.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbPrenom);		this.add(this.txtPrenom);
		
		JLabel lbAdresse = new JLabel(" Adresse :");
		lbAdresse.setFont(new Font(lbAdresse.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbAdresse);		this.add(this.txtAdresse);
		
		JLabel lbMail = new JLabel(" E-mail :");
		lbMail.setFont(new Font(lbMail.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbMail);		this.add(this.txtMail);
		
		JLabel lbMdp = new JLabel(" Mot de passe :");
		lbMdp.setFont(new Font(lbMdp.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbMdp);		this.add(this.txtMdp);
		
		JLabel lbImgE = new JLabel(" Avatar :");
		lbImgE.setFont(new Font(lbImgE.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbImgE);		this.add(this.txtImgE);
		
		JLabel lbSexe = new JLabel(" Sexe :");
		lbSexe.setFont(new Font(lbSexe.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbSexe);		this.add(lbVide2);
		jrH.setSelected(true);
	    bg.add(jrH);	    this.add(jrH);
	    bg.add(jrF);	    this.add(jrF);   
	    
		JLabel lbAge = new JLabel(" Âge :");
		lbAge.setFont(new Font(lbAge.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbAge);		this.add(this.txtAge);
		
		JLabel lbGalop = new JLabel(" Galop :");
		lbGalop.setFont(new Font(lbGalop.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbGalop);		this.add(this.txtGalop);

		this.add(lbVide3);	this.add(lbVide4);
		
		this.add(this.btAnnuler);
		this.btAnnuler.setIcon(new ImageIcon(new ImageIcon("src/images/choix1.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT)));
		this.btAnnuler.addActionListener(this);
		
		this.add(this.btAjouter);
		this.btAjouter.setIcon(new ImageIcon(new ImageIcon("src/images/choix2.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT)));
		this.btAjouter.addActionListener(this);
		
		JLabel lbinfo = new JLabel(" Les champs précédés d'une * sont obligatoires");
		lbinfo.setFont(new Font(lbinfo.getText(), Font.CENTER_BASELINE, 12));
		this.add(lbinfo);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	    if (jrH.isSelected()) {
	    	txtSexe = jrH.getText();
		}
	    else if (jrF.isSelected()) {
	    	txtSexe = jrF.getText();
		}
		// TODO Stub de la méthode généré automatiquement
		if(e.getSource()==this.btAnnuler)
		{
			this.txtAge.setBackground(Color.WHITE);
			this.txtGalop.setBackground(Color.WHITE);
			this.txtNom.setBackground(Color.WHITE);
			this.txtPrenom.setBackground(Color.WHITE);
			this.txtAdresse.setBackground(Color.WHITE);
			this.txtMail.setBackground(Color.WHITE);
			this.txtPseudo.setBackground(Color.WHITE);
			this.txtMdp.setBackground(Color.WHITE);
			this.txtImgE.setBackground(Color.WHITE);
			
			this.txtAge.setText(null);
			this.txtGalop.setText(null);
			this.txtNom.setText(null);
			this.txtPrenom.setText(null);
			this.txtAdresse.setText(null);
			this.txtMail.setText(null);	
			jrH.setSelected(true);
			this.txtSexe=(null);	
			this.txtPseudo.setText(null);
			this.txtMdp.setText(null);	
			this.txtImgE.setText(null);		
		}
		else if (e.getSource()==this.btAjouter)
		{
			int age=Integer.parseInt(this.txtAge.getText());
			int galop=Integer.parseInt(this.txtGalop.getText());
			String nom = this.txtNom.getText();
			String prenom = this.txtPrenom.getText();
			String adresse = this.txtAdresse.getText();
			String adressemail = this.txtMail.getText();
			String sexe = this.txtSexe;
			String pseudo = this.txtPseudo.getText();
			String mdp = (this.txtMdp.getText());
			String imageeleve = this.txtImgE.getText();
							
		try{ 
			
			if(pseudo.equals(""))
		{
				JOptionPane.showMessageDialog(this, "Veuillez saisir des valeurs dans les champs obligatoire");
		}	
		else
			{
				Eleve unEleve = new Eleve(age, galop, nom, prenom, adresse, adressemail, sexe, pseudo, mdp, imageeleve);
				ModeleEleve.update(unEleve, pseudo);
				JOptionPane.showMessageDialog(this, "Modification reussie");
				this.txtAge.setText(null);
				this.txtGalop.setText(null);
				this.txtNom.setText(null);
				this.txtPrenom.setText(null);
				this.txtAdresse.setText(null);
				this.txtMail.setText(null);	
				jrH.setSelected(true);
				this.txtSexe=(null);	
				this.txtPseudo.setText(null);
				this.txtMdp.setText(null);	
				this.txtImgE.setText(null);		
			}
			this.setVisible(true); // fin d'enregistrement
}
		catch (NumberFormatException exp)
		{
			JOptionPane.showMessageDialog(this,"Erreur dans la saisie");
			this.txtAge.setBackground(Color.RED);
			this.txtGalop.setBackground(Color.RED);
			this.txtNom.setBackground(Color.RED);
			this.txtPrenom.setBackground(Color.RED);
			this.txtAdresse.setBackground(Color.RED);
			this.txtMail.setBackground(Color.RED);
			this.txtPseudo.setBackground(Color.RED);
			this.txtMdp.setBackground(Color.RED);
			this.txtImgE.setBackground(Color.RED);
		}					
		}
	}
	  class StateListener implements ActionListener{
		    public void actionPerformed(ActionEvent e) {
		    }
		  }
}