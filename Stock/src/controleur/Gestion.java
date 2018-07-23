package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.omg.CORBA.UNSUPPORTED_POLICY_VALUE;

import modele.Modele;
import vue.VueAccueil;
import vue.VueDelete;
import vue.VueInsert;
import vue.VueMenu;

public class Gestion extends JFrame implements ActionListener
{

	private static VueInsert uneVueInsert ; 
	private static VueMenu uneVueMenu; 
	private static VueAccueil uneVueAccueil; 
	private static VueDelete uneVueDelete;
	
	private JMenuBar uneBarre = new JMenuBar();
	private JMenu mnFichier = new JMenu("Fichier");
	private JMenu mnOperations = new JMenu("Opérations");
	private JMenu mnAide = new JMenu("Aide");
	private JMenuItem itemQuitter = new JMenuItem("Quitter");
	
	private JMenuItem itemAjouter = new JMenuItem("Ajouter");
	private JMenuItem itemLister = new JMenuItem("Lister");
	private JMenuItem itemSupprimer= new JMenuItem("Supprimer");
	private JMenuItem itemRechercher= new JMenuItem("Rechercher");
	private JMenuItem itemApropos = new JMenuItem("Apropos");
	
	
	
	public Gestion()
	{
		this.setTitle("Gestion de stock");
		this.setBounds(200, 200, 500, 350);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		uneVueInsert = new VueInsert();
		uneVueMenu = new VueMenu(); 
		uneVueAccueil = new VueAccueil();
		uneVueDelete = new VueDelete(); 
		
		this.add(uneVueInsert);
		this.add(uneVueMenu);
		this.add(uneVueAccueil);
		this.add(uneVueDelete);
		
		this.mnFichier.add(this.itemQuitter);
		this.mnOperations.add(this.itemAjouter);
		this.mnOperations.add(this.itemLister);
		this.mnOperations.add(this.itemSupprimer);
		this.mnOperations.add(this.itemRechercher);
		this.mnAide.add(this.itemApropos);
		
		this.uneBarre.add(this.mnFichier);
		this.uneBarre.add(this.mnOperations);
		this.uneBarre.add(this.mnAide);
		
		this.setJMenuBar(this.uneBarre);
		//rendre les items cliquables 
		this.itemAjouter.addActionListener(this);
		this.itemSupprimer.addActionListener(this);
		this.itemLister.addActionListener(this);
		this.itemRechercher.addActionListener(this);
		this.itemApropos.addActionListener(this);
		this.itemQuitter.addActionListener(this);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Gestion ();
	}
	
	public static void rendreVisibleVueInsert(boolean valeur)
	{
		uneVueInsert.setVisible(valeur);
	}
	public static void rendreVisibleVueAccueil(boolean valeur)
	{
		uneVueAccueil.setVisible(valeur);
	}
	
	
	public static void rendreVisibleVueDelete(boolean valeur)
	{
		uneVueDelete.setVisible(valeur);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource()==this.itemAjouter)
		 {
			 uneVueAccueil.setVisible(false);
			 uneVueDelete.setVisible(false);
			 uneVueInsert.setVisible(true);
		 }else if (e.getSource()==this.itemApropos)
		 {
			 uneVueDelete.setVisible(false);
			 uneVueAccueil.setVisible(true);
			 uneVueInsert.setVisible(false);
		 }else if (e.getSource()==this.itemQuitter)
		 {
			 this.dispose();
		 }else if (e.getSource()==this.itemSupprimer)
		 {
			 uneVueDelete.setVisible(true);
			 uneVueAccueil.setVisible(false);
			 uneVueInsert.setVisible(false);
		 }
		
	}

}
