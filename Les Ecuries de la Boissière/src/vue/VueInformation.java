package vue;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

		public class VueInformation extends JPanel 
		{
			public VueInformation()
			{
				/* FENETRE */
				this.setBounds(50, 130, 900, 500);
				this.setBackground(new Color(230,230,230));
				this.setLayout(null);
				/* TITRE */
				JLabel lbAbout = new JLabel("A propos");
				lbAbout.setFont(new Font(lbAbout.getText(),Font.ROMAN_BASELINE + Font.BOLD, 25));
				lbAbout.setBounds(390, 20, 250, 40);
				this.add(lbAbout);
				/*TEXT LIEN*/
				JLabel txtPC = new JLabel("Politique de confidentialité");
				txtPC.setFont(new Font(txtPC.getText(),Font.ROMAN_BASELINE, 20));
				txtPC.setBounds(335, 210, 250, 30);
				this.add(txtPC);
				/*LIEN*/
				JLabel txtlink = new JLabel("http://localhost:82/les_ecuries_de_la_boissiere/privacy_policy.php");
				txtlink.setFont(new Font(txtlink.getText(),Font.ROMAN_BASELINE, 25));
				txtlink.setForeground(new Color(230,230,230));
			    txtlink.setBounds(335, 210, 230, 30); 
				this.add(txtlink);
					
				/* Clickable */
				txtPC.setFocusable(false);
				txtPC.setCursor(new Cursor(Cursor.HAND_CURSOR));
				txtlink.setFocusable(false);
				txtlink.setCursor(new Cursor(Cursor.HAND_CURSOR));
			    addListener(txtlink);
			    /*DESCRIPTION*/
				JLabel txtLabel = new JLabel();
				txtLabel.setText("Les Ecuries de la Boissière © 2017 Tous droits réservés");
				txtLabel.setFont(new Font(txtLabel.getText(),Font.ROMAN_BASELINE + Font.BOLD, 20));
				txtLabel.setBounds(180, 450, 550, 30);
				this.add(txtLabel);				
			}
				/* EVENT CLICKABLE */
			private void addListener(JLabel txtlink) {
				    	txtlink.addMouseListener(new MouseAdapter() {
				            //Click sur le lien
				            public void mouseClicked(MouseEvent e) {
				                JLabel label=(JLabel)e.getSource();
				                String plainText = label.getText().replaceAll("/<.*?/>", "");
				                try {
				                    Desktop.getDesktop().browse(new URI(plainText));
				                } catch (URISyntaxException ex) {
				                    Logger.getLogger(VueInformation.class.getName()).log(Level.SEVERE, null, ex);
				                } catch (IOException ex) {
				                    Logger.getLogger(VueInformation.class.getName()).log(Level.SEVERE, null, ex);
				                }
				              }
				 
				        	});	
					this.setVisible(true);
						}
		}
			