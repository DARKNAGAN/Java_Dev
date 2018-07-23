package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controleur.Gestion;
import controleur.Profil;



public class Generale extends JFrame implements ActionListener
{
	/*VARIABLE*/
	private JMenuBar uneBarre = new JMenuBar();
	private JMenu mnFichier = new JMenu("Menu");
	private JMenu mnGestion = new JMenu("Gestion");
	private JMenu mnCentre = new JMenu("Centre");
	private JMenu mnAide = new JMenu("Information");
	
	private JMenuItem itemAccueil = new JMenuItem("Accueil");
	private JMenuItem itemQuitter = new JMenuItem("Quitter");
	
	private JMenuItem itemInformation = new JMenuItem("A propos");
	
	private JMenuItem itemCours = new JMenuItem("Liste des cours");
	private JMenuItem itemACours = new JMenuItem("Ajouter des cours");
	private JMenuItem itemMCours = new JMenuItem("Modifier des cours");
	private JMenuItem itemSCours = new JMenuItem("Supprimer des cours");
	
	private JMenuItem itemEleves = new JMenuItem("Liste des élèves");
	private JMenuItem itemAEleves = new JMenuItem("Ajouter des élèves");
	private JMenuItem itemMEleves = new JMenuItem("Modifier des élèves");
	private JMenuItem itemSEleves = new JMenuItem("Supprimer des élèves");
	
	private JMenuItem itemChevaux = new JMenuItem("Liste des chevaux");
	private JMenuItem itemAChevaux = new JMenuItem("Ajouter des chevaux");
	private JMenuItem itemMChevaux = new JMenuItem("Modifier des chevaux");
	private JMenuItem itemSChevaux = new JMenuItem("Supprimer des chevaux");
	
	private JMenuItem itemFormateurs= new JMenuItem("Liste des formateurs");
	private JMenuItem itemAFormateurs = new JMenuItem("Ajouter des formateurs");
	private JMenuItem itemMFormateurs = new JMenuItem("Modifier des formateurs");
	private JMenuItem itemSFormateurs = new JMenuItem("Supprimer des formateurs");
	
	
	private VueInformation uneVueInformation = new VueInformation();
		private VueEleves uneVueEleves = new VueEleves();
		private VueElevesA uneVueElevesA = new VueElevesA();
		private VueElevesM uneVueElevesM = new VueElevesM();
		private VueElevesS uneVueElevesS = new VueElevesS();
			private VueCours uneVueCours = new VueCours();
			private VueCoursA uneVueCoursA = new VueCoursA();
			private VueCoursM uneVueCoursM = new VueCoursM();
			private VueCoursS uneVueCoursS = new VueCoursS();
				private VueChevaux uneVueChevaux = new VueChevaux();
				private VueChevauxA uneVueChevauxA = new VueChevauxA();
				private VueChevauxM uneVueChevauxM = new VueChevauxM();
				private VueChevauxS uneVueChevauxS = new VueChevauxS();
					private VueFormateurs uneVueFormateurs = new VueFormateurs();
					private VueFormateursA uneVueFormateursA = new VueFormateursA();
					private VueFormateursM uneVueFormateursM = new VueFormateursM();
					private VueFormateursS uneVueFormateursS = new VueFormateursS();

	
	private VueAccueil uneVueAccueil ;	
	/*VARIABLE*/
	
	/*AFFICHAGE GENERAL APPLI*/
	public Generale(Profil unProfil)
	{
		ImageIcon logo = new ImageIcon(new ImageIcon("src/images/favicon.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		
		this.setIconImage(logo.getImage());
		this.setTitle("Les Ecuries de la Boissière");
		this.setBounds(400, 150, 1000, 800);
		this.getContentPane().setBackground(new Color(117,157,135));
		
		this.setLayout(null);
		this.setResizable(false);
		
		
	this.uneVueAccueil = new VueAccueil(unProfil);
	this.add(uneVueAccueil);
		this.add(uneVueInformation);
				this.add(uneVueChevaux);
				this.add(uneVueChevauxA);
				this.add(uneVueChevauxM);
				this.add(uneVueChevauxS);
					this.add(uneVueEleves);
					this.add(uneVueElevesA);
					this.add(uneVueElevesM);
					this.add(uneVueElevesS);
						this.add(uneVueCours);	
						this.add(uneVueCoursA);	
						this.add(uneVueCoursM);	
						this.add(uneVueCoursS);	
							this.add(uneVueFormateurs);	
							this.add(uneVueFormateursA);
							this.add(uneVueFormateursM);
							this.add(uneVueFormateursS);

		
		/*BARRE MENU GROUPE*/
		this.uneBarre.add(this.mnFichier);
		this.uneBarre.add(this.mnCentre);
		this.uneBarre.add(this.mnGestion);
		this.uneBarre.add(this.mnAide);
		/*BARRE MENU GROUPE*/
		
		/*BARRE MENU LISTE GROUPE*/
		this.mnFichier.add(this.itemAccueil);
		this.mnFichier.add(this.itemQuitter);
			this.mnCentre.add(this.itemEleves);
			this.mnCentre.add(this.itemChevaux);
			this.mnCentre.add(this.itemCours);	
			this.mnCentre.add(this.itemFormateurs);	
				this.mnGestion.add(this.itemAEleves);
				this.mnGestion.add(this.itemMEleves);
				this.mnGestion.add(this.itemSEleves);
					this.mnGestion.add(this.itemAChevaux);
					this.mnGestion.add(this.itemMChevaux);
					this.mnGestion.add(this.itemSChevaux);
						this.mnGestion.add(this.itemACours);	
						this.mnGestion.add(this.itemMCours);
						this.mnGestion.add(this.itemSCours);
							this.mnGestion.add(this.itemAFormateurs);
							this.mnGestion.add(this.itemMFormateurs);
							this.mnGestion.add(this.itemSFormateurs);
					this.mnAide.add(this.itemInformation);
		/*BARRE MENU LISTE GROUPE*/
					
		this.itemQuitter.addActionListener(this);
		this.itemAccueil.addActionListener(this);	
			this.itemEleves.addActionListener(this);
			this.itemChevaux.addActionListener(this);
			this.itemCours.addActionListener(this);
			this.itemFormateurs.addActionListener(this);
				this.itemACours.addActionListener(this);
				this.itemMCours.addActionListener(this);
				this.itemSCours.addActionListener(this);
				this.itemAEleves.addActionListener(this);
				this.itemMEleves.addActionListener(this);
				this.itemSEleves.addActionListener(this);
				this.itemAChevaux.addActionListener(this);
				this.itemMChevaux.addActionListener(this);
				this.itemSChevaux.addActionListener(this);
				this.itemAFormateurs.addActionListener(this);
				this.itemMFormateurs.addActionListener(this);
				this.itemSFormateurs.addActionListener(this);
					this.itemInformation.addActionListener(this);
		
		
		this.setJMenuBar(this.uneBarre);
		
		JLabel lbTitre = new JLabel("<html><b><center>Espace de travail<br>"+ unProfil.getLogin()+"</center></b></html>");
		lbTitre.setBounds(400, 30, 300, 60);
		lbTitre.setFont(new Font(lbTitre.getText(), Font.ROMAN_BASELINE, 25));// taille titre page
		lbTitre.setForeground( Color.white);
		this.add(lbTitre) ;
		
		this.setVisible(true);
	}
	/*AFFICHAGE GENERAL APPLI*/
	
	/*ACTION GENERAL APPLI*/
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == this.itemQuitter)
		{
			Gestion.rendreVisible(true);
			
			this.setVisible(false);
		}
		else if (e.getSource()==this.itemAccueil)
		{
			uneVueAccueil.setVisible(true);
			uneVueInformation.setVisible(false);
			uneVueCours.setVisible(false);
			uneVueCoursA.setVisible(false);
			uneVueCoursM.setVisible(false);
			uneVueCoursS.setVisible(false);
			uneVueEleves.setVisible(false);
			uneVueElevesA.setVisible(false);
			uneVueElevesM.setVisible(false);
			uneVueElevesS.setVisible(false);
			uneVueChevaux.setVisible(false);
			uneVueChevauxA.setVisible(false);
			uneVueChevauxM.setVisible(false);
			uneVueChevauxS.setVisible(false);
			uneVueFormateurs.setVisible(false);
			uneVueFormateursA.setVisible(false);
			uneVueFormateursM.setVisible(false);
			uneVueFormateursS.setVisible(false);
			
		}
			else if (e.getSource()==this.itemInformation)
			{
				uneVueAccueil.setVisible(false);
				uneVueInformation.setVisible(true);
				uneVueCours.setVisible(false);
				uneVueCoursA.setVisible(false);
				uneVueCoursM.setVisible(false);
				uneVueCoursS.setVisible(false);
				uneVueEleves.setVisible(false);
				uneVueElevesA.setVisible(false);
				uneVueElevesM.setVisible(false);
				uneVueElevesS.setVisible(false);
				uneVueChevaux.setVisible(false);
				uneVueChevauxA.setVisible(false);
				uneVueChevauxM.setVisible(false);
				uneVueChevauxS.setVisible(false);
				uneVueFormateurs.setVisible(false);
				uneVueFormateursA.setVisible(false);
				uneVueFormateursM.setVisible(false);
				uneVueFormateursS.setVisible(false);
				
			}
				else if (e.getSource()==this.itemCours)
				{
					uneVueAccueil.setVisible(false);
					uneVueInformation.setVisible(false);

					uneVueCours.setVisible(true);
					uneVueCoursA.setVisible(false);
					uneVueCoursM.setVisible(false);
					uneVueCoursS.setVisible(false);
					uneVueEleves.setVisible(false);
					uneVueElevesA.setVisible(false);
					uneVueElevesM.setVisible(false);
					uneVueElevesS.setVisible(false);
					uneVueChevaux.setVisible(false);
					uneVueChevauxA.setVisible(false);
					uneVueChevauxM.setVisible(false);
					uneVueChevauxS.setVisible(false);
					uneVueFormateurs.setVisible(false);
					uneVueFormateursA.setVisible(false);
					uneVueFormateursM.setVisible(false);
					uneVueFormateursS.setVisible(false);
					
				}
		
				else if (e.getSource()==this.itemACours)
				{
					uneVueAccueil.setVisible(false);
					uneVueInformation.setVisible(false);

					uneVueCours.setVisible(false);
					uneVueCoursA.setVisible(true);
					uneVueCoursM.setVisible(false);
					uneVueCoursS.setVisible(false);
					uneVueEleves.setVisible(false);
					uneVueElevesA.setVisible(false);
					uneVueElevesM.setVisible(false);
					uneVueElevesS.setVisible(false);
					uneVueChevaux.setVisible(false);
					uneVueChevauxA.setVisible(false);
					uneVueChevauxM.setVisible(false);
					uneVueChevauxS.setVisible(false);
					uneVueFormateurs.setVisible(false);
					uneVueFormateursA.setVisible(false);
					uneVueFormateursM.setVisible(false);
					uneVueFormateursS.setVisible(false);
					
				}
				else if (e.getSource()==this.itemMCours)
				{
					uneVueAccueil.setVisible(false);
					uneVueInformation.setVisible(false);

					uneVueCours.setVisible(false);
					uneVueCoursA.setVisible(false);
					uneVueCoursM.setVisible(true);
					uneVueCoursS.setVisible(false);
					uneVueEleves.setVisible(false);
					uneVueElevesA.setVisible(false);
					uneVueElevesM.setVisible(false);
					uneVueElevesS.setVisible(false);
					uneVueChevaux.setVisible(false);
					uneVueChevauxA.setVisible(false);
					uneVueChevauxM.setVisible(false);
					uneVueChevauxS.setVisible(false);
					uneVueFormateurs.setVisible(false);
					uneVueFormateursA.setVisible(false);
					uneVueFormateursM.setVisible(false);
					uneVueFormateursS.setVisible(false);
					
				}
				else if (e.getSource()==this.itemSCours)
				{
					uneVueAccueil.setVisible(false);
					uneVueInformation.setVisible(false);

					uneVueCours.setVisible(false);
					uneVueCoursA.setVisible(false);
					uneVueCoursM.setVisible(false);
					uneVueCoursS.setVisible(true);
					uneVueEleves.setVisible(false);
					uneVueElevesA.setVisible(false);
					uneVueElevesM.setVisible(false);
					uneVueElevesS.setVisible(false);
					uneVueChevaux.setVisible(false);
					uneVueChevauxA.setVisible(false);
					uneVueChevauxM.setVisible(false);
					uneVueChevauxS.setVisible(false);
					uneVueFormateurs.setVisible(false);
					uneVueFormateursA.setVisible(false);
					uneVueFormateursM.setVisible(false);
					uneVueFormateursS.setVisible(false);
					
				}
					else if (e.getSource()==this.itemEleves)
					{
						uneVueAccueil.setVisible(false);
						uneVueInformation.setVisible(false);
	
						uneVueCours.setVisible(false);
						uneVueCoursA.setVisible(false);
						uneVueCoursM.setVisible(false);
						uneVueCoursS.setVisible(false);
						uneVueEleves.setVisible(true);
						uneVueElevesA.setVisible(false);
						uneVueElevesM.setVisible(false);
						uneVueElevesS.setVisible(false);
						uneVueChevaux.setVisible(false);
						uneVueChevauxA.setVisible(false);
						uneVueChevauxM.setVisible(false);
						uneVueChevauxS.setVisible(false);
						uneVueFormateurs.setVisible(false);
						uneVueFormateursA.setVisible(false);
						uneVueFormateursM.setVisible(false);
						uneVueFormateursS.setVisible(false);
						
					}
					else if (e.getSource()==this.itemAEleves)
					{
						uneVueAccueil.setVisible(false);
						uneVueInformation.setVisible(false);
	
						uneVueCours.setVisible(false);
						uneVueCoursA.setVisible(false);
						uneVueCoursM.setVisible(false);
						uneVueCoursS.setVisible(false);
						uneVueEleves.setVisible(false);
						uneVueElevesA.setVisible(true);
						uneVueElevesM.setVisible(false);
						uneVueElevesS.setVisible(false);
						uneVueChevaux.setVisible(false);
						uneVueChevauxA.setVisible(false);
						uneVueChevauxM.setVisible(false);
						uneVueChevauxS.setVisible(false);
						uneVueFormateurs.setVisible(false);
						uneVueFormateursA.setVisible(false);
						uneVueFormateursM.setVisible(false);
						uneVueFormateursS.setVisible(false);
						
					}
					else if (e.getSource()==this.itemMEleves)
					{
						uneVueAccueil.setVisible(false);
						uneVueInformation.setVisible(false);
	
						uneVueCours.setVisible(false);
						uneVueCoursA.setVisible(false);
						uneVueCoursM.setVisible(false);
						uneVueCoursS.setVisible(false);
						uneVueEleves.setVisible(false);
						uneVueElevesA.setVisible(false);
						uneVueElevesM.setVisible(true);
						uneVueElevesS.setVisible(false);
						uneVueChevaux.setVisible(false);
						uneVueChevauxA.setVisible(false);
						uneVueChevauxM.setVisible(false);
						uneVueChevauxS.setVisible(false);
						uneVueFormateurs.setVisible(false);
						uneVueFormateursA.setVisible(false);
						uneVueFormateursM.setVisible(false);
						uneVueFormateursS.setVisible(false);
						
					}
					else if (e.getSource()==this.itemSEleves)
					{
						uneVueAccueil.setVisible(false);
						uneVueInformation.setVisible(false);
	
						uneVueCours.setVisible(false);
						uneVueCoursA.setVisible(false);
						uneVueCoursM.setVisible(false);
						uneVueCoursS.setVisible(false);
						uneVueEleves.setVisible(false);
						uneVueElevesA.setVisible(false);
						uneVueElevesM.setVisible(false);
						uneVueElevesS.setVisible(true);
						uneVueChevaux.setVisible(false);
						uneVueChevauxA.setVisible(false);
						uneVueChevauxM.setVisible(false);
						uneVueChevauxS.setVisible(false);
						uneVueFormateurs.setVisible(false);
						uneVueFormateursA.setVisible(false);
						uneVueFormateursM.setVisible(false);
						uneVueFormateursS.setVisible(false);
						
					}
						else if (e.getSource()==this.itemChevaux)
						{
							uneVueAccueil.setVisible(false);
							uneVueInformation.setVisible(false);
		
							uneVueCours.setVisible(false);
							uneVueCoursA.setVisible(false);
							uneVueCoursM.setVisible(false);
							uneVueCoursS.setVisible(false);
							uneVueEleves.setVisible(false);
							uneVueElevesA.setVisible(false);
							uneVueElevesM.setVisible(false);
							uneVueElevesS.setVisible(false);
							uneVueChevaux.setVisible(true);
							uneVueChevauxA.setVisible(false);
							uneVueChevauxM.setVisible(false);
							uneVueChevauxS.setVisible(false);
							uneVueFormateurs.setVisible(false);
							uneVueFormateursA.setVisible(false);
							uneVueFormateursM.setVisible(false);
							uneVueFormateursS.setVisible(false);
							
						}
						else if (e.getSource()==this.itemAChevaux)
						{
							uneVueAccueil.setVisible(false);
							uneVueInformation.setVisible(false);
		
							uneVueCours.setVisible(false);
							uneVueCoursA.setVisible(false);
							uneVueCoursM.setVisible(false);
							uneVueCoursS.setVisible(false);
							uneVueEleves.setVisible(false);
							uneVueElevesA.setVisible(false);
							uneVueElevesM.setVisible(false);
							uneVueElevesS.setVisible(false);
							uneVueChevaux.setVisible(false);
							uneVueChevauxA.setVisible(true);
							uneVueChevauxM.setVisible(false);
							uneVueChevauxS.setVisible(false);
							uneVueFormateurs.setVisible(false);
							uneVueFormateursA.setVisible(false);
							uneVueFormateursM.setVisible(false);
							uneVueFormateursS.setVisible(false);
							
						}
						else if (e.getSource()==this.itemMChevaux)
						{
							uneVueAccueil.setVisible(false);
							uneVueInformation.setVisible(false);
		
							uneVueCours.setVisible(false);
							uneVueCoursA.setVisible(false);
							uneVueCoursM.setVisible(false);
							uneVueCoursS.setVisible(false);
							uneVueEleves.setVisible(false);
							uneVueElevesA.setVisible(false);
							uneVueElevesM.setVisible(false);
							uneVueElevesS.setVisible(false);
							uneVueChevaux.setVisible(false);
							uneVueChevauxA.setVisible(false);
							uneVueChevauxM.setVisible(true);
							uneVueChevauxS.setVisible(false);
							uneVueFormateurs.setVisible(false);
							uneVueFormateursA.setVisible(false);
							uneVueFormateursM.setVisible(false);
							uneVueFormateursS.setVisible(false);
							
						}
						else if (e.getSource()==this.itemSChevaux)
						{
							uneVueAccueil.setVisible(false);
							uneVueInformation.setVisible(false);
		
							uneVueCours.setVisible(false);
							uneVueCoursA.setVisible(false);
							uneVueCoursM.setVisible(false);
							uneVueCoursS.setVisible(false);
							uneVueEleves.setVisible(false);
							uneVueElevesA.setVisible(false);
							uneVueElevesM.setVisible(false);
							uneVueElevesS.setVisible(false);
							uneVueChevaux.setVisible(false);
							uneVueChevauxA.setVisible(false);
							uneVueChevauxM.setVisible(false);
							uneVueChevauxS.setVisible(true);
							uneVueFormateurs.setVisible(false);
							uneVueFormateursA.setVisible(false);
							uneVueFormateursM.setVisible(false);
							uneVueFormateursS.setVisible(false);
							
						}
						else if (e.getSource()==this.itemFormateurs)
						{
							uneVueAccueil.setVisible(false);
							uneVueInformation.setVisible(false);
		
							uneVueCours.setVisible(false);
							uneVueCoursA.setVisible(false);
							uneVueCoursM.setVisible(false);
							uneVueCoursS.setVisible(false);
							uneVueEleves.setVisible(false);
							uneVueElevesA.setVisible(false);
							uneVueElevesM.setVisible(false);
							uneVueElevesS.setVisible(false);
							uneVueChevaux.setVisible(false);
							uneVueChevauxA.setVisible(false);
							uneVueChevauxM.setVisible(false);
							uneVueChevauxS.setVisible(false);
							uneVueFormateurs.setVisible(true);
							uneVueFormateursA.setVisible(false);
							uneVueFormateursM.setVisible(false);
							uneVueFormateursS.setVisible(false);
							
						}
						else if (e.getSource()==this.itemAFormateurs)
						{
							uneVueAccueil.setVisible(false);
							uneVueInformation.setVisible(false);
		
							uneVueCours.setVisible(false);
							uneVueCoursA.setVisible(false);
							uneVueCoursM.setVisible(false);
							uneVueCoursS.setVisible(false);
							uneVueEleves.setVisible(false);
							uneVueElevesA.setVisible(false);
							uneVueElevesM.setVisible(false);
							uneVueElevesS.setVisible(false);
							uneVueChevaux.setVisible(false);
							uneVueChevauxA.setVisible(false);
							uneVueChevauxM.setVisible(false);
							uneVueChevauxS.setVisible(false);
							uneVueFormateurs.setVisible(false);
							uneVueFormateursA.setVisible(true);
							uneVueFormateursM.setVisible(false);
							uneVueFormateursS.setVisible(false);
							
						}
						else if (e.getSource()==this.itemMFormateurs)
						{
							uneVueAccueil.setVisible(false);
							uneVueInformation.setVisible(false);
		
							uneVueCours.setVisible(false);
							uneVueCoursA.setVisible(false);
							uneVueCoursM.setVisible(false);
							uneVueCoursS.setVisible(false);
							uneVueEleves.setVisible(false);
							uneVueElevesA.setVisible(false);
							uneVueElevesM.setVisible(false);
							uneVueElevesS.setVisible(false);
							uneVueChevaux.setVisible(false);
							uneVueChevauxA.setVisible(false);
							uneVueChevauxM.setVisible(false);
							uneVueChevauxS.setVisible(false);
							uneVueFormateurs.setVisible(false);
							uneVueFormateursA.setVisible(false);
							uneVueFormateursM.setVisible(true);
							uneVueFormateursS.setVisible(false);
							
						}
						else if (e.getSource()==this.itemSFormateurs)
						{
							uneVueAccueil.setVisible(false);
							uneVueInformation.setVisible(false);
		
							uneVueCours.setVisible(false);
							uneVueCoursA.setVisible(false);
							uneVueCoursM.setVisible(false);
							uneVueCoursS.setVisible(false);
							uneVueEleves.setVisible(false);
							uneVueElevesA.setVisible(false);
							uneVueElevesM.setVisible(false);
							uneVueElevesS.setVisible(false);
							uneVueChevaux.setVisible(false);
							uneVueChevauxA.setVisible(false);
							uneVueChevauxM.setVisible(false);
							uneVueChevauxS.setVisible(false);
							uneVueFormateurs.setVisible(false);
							uneVueFormateursA.setVisible(false);
							uneVueFormateursM.setVisible(false);
							uneVueFormateursS.setVisible(true);
							
						}

		
	}
	/*ACTION GENERAL APPLI*/
	
}
