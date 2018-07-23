import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Convertisseur extends JFrame implements ActionListener {
	
	private JLabel lbTitre = new JLabel("Convertisseur");
	private JButton btEuro = new JButton("Euro");
	private JButton btFr = new JButton("Franc");
	private JButton btAc = new JButton("Annuler");
	private JButton btApropos = new JButton("À propos");
	private JButton btTaux = new JButton("Taux");
	private JButton btQuitter = new JButton("Quitter");
	
	private JTextField txtMontant = new JTextField();

	private String devise;
	private float taux;
	
	public Convertisseur() {

		this.devise = "Franc";
		this.taux = (float)6.56;
		
		this.setBounds(200, 200, 450, 300);
		this.setTitle("Convertisseur");
		this.setResizable(false);
		this.setLayout(null);
		this.lbTitre.setBounds(175, 20, 200, 20);
		this.add(this.lbTitre);

		ImageIcon icon = new ImageIcon("src/convertisseur.png");
		JLabel lbIcon = new JLabel(icon);
		lbIcon.setBounds(10, 10, 70, 70);
		this.add(lbIcon);
		
		this.btEuro.setBounds(50, 100, 100, 20);
		this.add(this.btEuro);
		this.txtMontant.setBounds(170, 100, 100, 20);
		this.add(this.txtMontant);
		this.btFr.setBounds(290, 100, 100, 20);
		this.add(this.btFr);
		
		this.btApropos.setBounds(50, 170, 100, 20);
		this.add(this.btApropos);
		this.btAc.setBounds(170, 170, 100, 20);
		this.add(this.btAc);
		this.btTaux.setBounds(290, 170, 100, 20);
		this.add(this.btTaux);
		this.btQuitter.setBounds(170, 220, 100, 20);
		this.add(this.btQuitter);
		
		this.btAc.addActionListener(this);
		this.btEuro.addActionListener(this);
		this.btFr.addActionListener(this);
		this.btApropos.addActionListener(this);
		this.btTaux.addActionListener(this);
		this.btQuitter.addActionListener(this);
		
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		Convertisseur monC = new Convertisseur();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btAc) {
			this.txtMontant.setText("");
		} else if (e.getSource() == this.btEuro) {
			if (this.txtMontant.getText().equals("")) {
				JOptionPane.showMessageDialog(this,"Veuillez saisir un montant", "Erreur", JOptionPane.ERROR_MESSAGE);
			} else {
				float mt=0;
				try {
					mt = Float.parseFloat(this.txtMontant.getText());
					mt=(float) (mt/this.taux);
					this.txtMontant.setText(""+mt);
				}
				catch(NumberFormatException exp) {
					JOptionPane.showMessageDialog(this,"Veuillez vérifier votre montant", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
			}
		} else if (e.getSource() == this.btFr) {
			if (this.txtMontant.getText().equals("")) {
				JOptionPane.showMessageDialog(this,"Veuillez saisir un montant", "Erreur", JOptionPane.ERROR_MESSAGE);
			} else {
				float mt=0;
				try {
					mt = Float.parseFloat(this.txtMontant.getText());
					mt=(float) (mt*this.taux);
					this.txtMontant.setText(""+mt);
				}
				catch(NumberFormatException exp) {
					JOptionPane.showMessageDialog(this,"Veuillez vérifier votre montant", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
			}
		} else if (e.getSource() == this.btApropos) {
			JOptionPane.showMessageDialog(this,"Logiciel réalisé le 15/12/2016\n"
			+ "\n Alexandre DA COSTA"
			+ "\n Utilisant le framework Swing",
			"Information", JOptionPane.INFORMATION_MESSAGE);
		} else if (e.getSource() == this.btQuitter) {
			int r = JOptionPane.showConfirmDialog(this, "Voulez-vous quitter ?", "Quitter", JOptionPane.OK_CANCEL_OPTION);
			if (r == 0) {
				this.dispose();
			}
		} else if (e.getSource() == this.btTaux) {
			try {
				this.devise = JOptionPane.showInputDialog(this, "Saisir le nom de la devise");
				this.taux = Float.parseFloat(JOptionPane.showInputDialog(this, "Saisir le taux de la devise"));
				this.btFr.setText(this.devise);
			} catch (NumberFormatException exp) {
				this.taux = (float) 6.56;
				this.devise = "Franc";
				this.btFr.setText(this.devise);
			} catch (NullPointerException exp) {
				this.taux = (float) 6.56;
				this.devise = "Franc";
				this.btFr.setText(this.devise);
			}
		}
	}

}