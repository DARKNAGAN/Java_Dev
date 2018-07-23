package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controleur.Produit;
import modele.Modele;

public class VueDelete extends JPanel implements ActionListener
{
	private JComboBox cbxChoix = new JComboBox();
	private JButton btOk = new JButton("Ok");
	private JLabel lbMessage = new JLabel(""); 
	
	public VueDelete ()
	{
		this.setBounds(150, 20, 300, 300);
		this.setLayout(new GridLayout(5, 1));
	
		this.setBackground(Color.GRAY);
		this.add(new JLabel("Suppression d'un produit"));
		this.add(this.cbxChoix);
		this.add(this.btOk);
		this.add(lbMessage);
		this.add(new JLabel());
		
		this.remplirCbx();
		this.btOk.addActionListener(this);
		
		this.setVisible(false);
		
	}
	
	public void remplirCbx()
	{
		ArrayList<Produit> lesProduits = Modele.selectAll();
		for (Produit unProduit : lesProduits)
		{
			this.cbxChoix.addItem(unProduit.toString());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== this.btOk)
		{
			String chaine = this.cbxChoix.getSelectedItem().toString();
			String tab[]= chaine.split("-");
			Modele.delete(tab[0]);
			JOptionPane.showMessageDialog(this, "Suppression effectuee");
			this.lbMessage.setText("Suppression effectue");
			//on vide tout dans le cbx et on rerempli ou supprimer l'item seclectionne
		}
		
	}
}
