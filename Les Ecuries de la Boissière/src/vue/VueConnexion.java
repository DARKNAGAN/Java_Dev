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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controleur.Gestion;
import controleur.Profil;
import modele.Modele;

public class VueConnexion extends JPanel implements ActionListener
{
	private JTextField txtMail = new JTextField();
	private JPasswordField txtMdp = new JPasswordField();
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btSeConnecter = new JButton("Se connecter");
	JLabel lbVide1 = new JLabel("");JLabel lbVide2 = new JLabel("");
	
	public VueConnexion()
	{
		this.setBounds(200, 350, 600, 200);
		this.setLayout(new GridLayout(4,2));
		this.setBackground(new Color(230,230,230));
		
		
		JLabel lbMail = new JLabel(" E-mail :");
		lbMail.setFont(new Font(lbMail.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbMail);		this.add(this.txtMail);
		
		JLabel lbMdp = new JLabel(" Mot de passe :");
		lbMdp.setFont(new Font(lbMdp.getText(), Font.CENTER_BASELINE, 18));
		this.add(lbMdp);		this.add(this.txtMdp);
		
		this.add(lbVide1);this.add(lbVide2);
		
		this.add(this.btAnnuler);
		this.btAnnuler.setIcon(new ImageIcon(new ImageIcon("src/images/choix1.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT)));
		this.btAnnuler.addActionListener(this);
		
		this.add(this.btSeConnecter);
		this.btSeConnecter.setIcon(new ImageIcon(new ImageIcon("src/images/choix2.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT)));
		this.btSeConnecter.addActionListener(this);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == this.btAnnuler)
		{
			this.txtMail.setText("");
			this.txtMdp.setText("");
		}
		else if(e.getSource() == this.btSeConnecter)
		{
			String adressemail = this.txtMail.getText();
			String mdp = new String(this.txtMdp.getPassword());
			
			Profil unProfil = Modele.selectWhere(adressemail, mdp);
			if(unProfil == null)
			{
				JOptionPane.showMessageDialog(this, "Veuillez v�rifier vos identifiants !");
			}
			else
			{
				JOptionPane.showMessageDialog(this,"<html><center>Connexion r�ussie!<br> Bonjour " + unProfil.getLogin() + "</center></html>");
				
				// ouvrir le menu g�n�ral
				new Generale(unProfil);
				this.txtMail.setText("");
				this.txtMdp.setText("");
				Gestion.rendreVisible(false);
			}
		}
	}
}