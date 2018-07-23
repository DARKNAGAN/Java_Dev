package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.Produit;
import modele.Modele;

public class VueInsert extends JPanel implements ActionListener
{
	private JTextField txtRef = new JTextField(); 
	private JTextField txtDes = new JTextField(); 
	private JTextField txtQte = new JTextField(); 
	private JTextField txtPrix = new JTextField(); 
	
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btEnregistrer = new JButton("Enregistrer");
	
	public VueInsert()
	{
		this.setBounds(150, 20, 300, 300);
		this.setLayout(new GridLayout(6, 2));
		this.setBackground(Color.CYAN);
		
		this.add(new JLabel("Insertion"));
		this.add(new JLabel(""));
		
		this.add(new JLabel("Référence : "));
		this.add(this.txtRef);
		
		this.add(new JLabel("Désignation : "));
		this.add(this.txtDes);
		
		this.add(new JLabel("Quantité : "));
		this.add(this.txtQte);
		
		this.add(new JLabel("Prix : "));
		this.add(this.txtPrix);
		
		this.add(this.btAnnuler);
		this.add(this.btEnregistrer);
		this.btEnregistrer.setIcon(new ImageIcon("src/images/enregistrer.png"));
		
		//rendre les boutons cliquables 
		this.btAnnuler.addActionListener(this);
		this.btEnregistrer.addActionListener(this);
		
		this.setVisible(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.txtQte.setBackground(Color.WHITE);
		this.txtPrix.setBackground(Color.WHITE);
		
		if(e.getSource() == this.btAnnuler)
		{
			this.txtDes.setText("");
			this.txtRef.setText("");
			this.txtQte.setText("");
			this.txtPrix.setText("");
		}
		else if (e.getSource()==this.btEnregistrer)
		{
			String reference = this.txtRef.getText();
			String designation = this.txtDes.getText();
			int qte; 
			float prix;
			try{
				
				if (reference.equals("")||designation.equals(""))
				{
					JOptionPane.showMessageDialog(this, "Veuillez saisir la ref ou la des");
				}
				else
				{
					qte = Integer.parseInt(this.txtQte.getText());
					prix = Float.parseFloat(this.txtPrix.getText());
					Produit unProduit = new Produit(reference, designation, qte, prix);
					Modele.insert(unProduit);
					JOptionPane.showMessageDialog(this, "Insertion reussie");
					this.txtDes.setText("");
					this.txtRef.setText("");
					this.txtQte.setText("");
					this.txtPrix.setText("");
				}
				
				this.setVisible(false); //fin enregistrement
			}
			catch(NumberFormatException exp)
			{
				JOptionPane.showMessageDialog(this, "Erreur de saisie sur la Qte ou prix");
				this.txtQte.setBackground(Color.RED);
				this.txtPrix.setBackground(Color.RED);
			}
		}
		
	}
}






