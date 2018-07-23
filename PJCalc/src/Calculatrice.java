import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
  

public class Calculatrice extends JFrame {
  private JPanel container = new JPanel();
  //Tableau stockant les éléments à afficher dans la calculatrice
  String[] tab_string = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "=", "C", "+", "-", "*", "/"};
  //Un bouton par élément à afficher
  JButton[] button = new JButton[tab_string.length];
  private JLabel ecran = new JLabel();
  private Dimension dim = new Dimension(50, 30);
  public double getValeur;
  private boolean clicOperateur = false, update = false;
  private String operateur = "";
  
  public Calculatrice(){
    this.setSize(280, 300);
    this.setTitle("Calculette");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    //On initialise le conteneur avec tous les composants
	  initComposant();
	  //On ajoute le conteneur
    this.setContentPane(container);
    this.setVisible(true);
  }
      
  private void initComposant(){
    //On définit la police d'écriture à utiliser
    Font police = new Font("Bell MT", Font.BOLD, 50);
    ecran = new JLabel("0");
    ecran.setFont(police);
    //On aligne les informations à droite dans le JLabel
    ecran.setHorizontalAlignment(JLabel.RIGHT);
    ecran.setPreferredSize(new Dimension(220, 40));
    ecran.setForeground(Color.blue);
    JPanel operateur = new JPanel();      
    operateur.setPreferredSize(new Dimension(75, 255));
    JPanel chiffre = new JPanel();
    chiffre.setPreferredSize(new Dimension(165, 255));
    JPanel panEcran = new JPanel();
    panEcran.setPreferredSize(new Dimension(250, 50));

    //On parcourt le tableau initialisé
    //afin de créer nos boutons
    for(int i = 0; i < tab_string.length; i++){
      button[i] = new JButton(tab_string[i]);
      button[i].setBackground(Color.lightGray);
      button[i].setPreferredSize(dim);
      
      switch(i){
        //Pour chaque élément situé à la fin du tableau
        //et qui n'est pas un chiffre
        //on définit le comportement à avoir grâce à un listener
        case 11 :
          button[i].addActionListener(new EgalListener());
          button[i].setBackground(Color.green);
          chiffre.add(button[i]);
          break;
        case 12 :
          button[i].setForeground(Color.blue);
          button[i].addActionListener(new ResetListener());
          button[i].setBackground(Color.gray);
          operateur.add(button[i]);
          break;
        case 13 :
          button[i].addActionListener(new PlusListener());
          button[i].setPreferredSize(dim);
          button[i].setBackground(Color.red);
          operateur.add(button[i]);
          break;
        case 14 :
          button[i].addActionListener(new MoinsListener());
          button[i].setPreferredSize(dim);
          button[i].setBackground(Color.red);
          operateur.add(button[i]);
          break;	
        case 15 :	
          button[i].addActionListener(new MultiListener());
          button[i].setPreferredSize(dim);
          button[i].setBackground(Color.red);
          operateur.add(button[i]);
          break;
        case 16 :
          button[i].addActionListener(new DivListener());
          button[i].setPreferredSize(dim);
          button[i].setBackground(Color.red);
          operateur.add(button[i]);
          break;
        default :
          //Par défaut, ce sont les premiers éléments du tableau
          //donc des chiffres, on affecte alors le bon listener
          chiffre.add(button[i]);
          button[i].addActionListener(new ChiffreListener());
          break;
      }
    }
    panEcran.add(ecran);
    panEcran.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
    container.add(panEcran, BorderLayout.NORTH);
    container.add(chiffre, BorderLayout.CENTER);
    container.add(operateur, BorderLayout.EAST);
  }

  //Méthode permettant d'effectuer un calcul selon l'opérateur sélectionné
  private void calcul(){
    if(operateur.equals("+")){
      getValeur = getValeur + 
            Double.valueOf(ecran.getText()).doubleValue();
      ecran.setText(String.valueOf(getValeur));
    }
    if(operateur.equals("-")){
      getValeur = getValeur - 
            Double.valueOf(ecran.getText()).doubleValue();
      ecran.setText(String.valueOf(getValeur));
    }          
    if(operateur.equals("*")){
      getValeur = getValeur * 
            Double.valueOf(ecran.getText()).doubleValue();
      ecran.setText(String.valueOf(getValeur));
    }     
    if(operateur.equals("/")){
      try{
        getValeur = getValeur / 
              Double.valueOf(ecran.getText()).doubleValue();
        ecran.setText(String.valueOf(getValeur));
      } catch(ArithmeticException e) {
        ecran.setText("0");
      }
    }
  }

  //Listener utilisé pour les chiffres
  //Permet de stocker les chiffres et de les afficher
  class ChiffreListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
      //On affiche le chiffre additionnel dans le label
      String str = ((JButton)e.getSource()).getText();
      if(update){
        update = false;
      }
      else{
        if(!ecran.getText().equals("0"))
          str = ecran.getText() + str;
      }
      ecran.setText(str);
    }
  }

  //Listener affecté au bouton =
  class EgalListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      calcul();
      update = true;
      clicOperateur = false;
    }
  }

  //Listener affecté au bouton +
  class PlusListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      if(clicOperateur){
        calcul();
        ecran.setText(String.valueOf(getValeur));
      }
      else{
        getValeur = Double.valueOf(ecran.getText()).doubleValue();
        clicOperateur = true;
      }
      operateur = "+";
      update = true;
    }
  }

  //Listener affecté au bouton -
  class MoinsListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      if(clicOperateur){
        calcul();
        ecran.setText(String.valueOf(getValeur));
      }
      else{
        getValeur = Double.valueOf(ecran.getText()).doubleValue();
        clicOperateur = true;
      }
      operateur = "-";
      update = true;
    }
  }

  //Listener affecté au bouton *
  class MultiListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      if(clicOperateur){
        calcul();
        ecran.setText(String.valueOf(getValeur));
      }
      else{
        getValeur = Double.valueOf(ecran.getText()).doubleValue();
        clicOperateur = true;
      }
      operateur = "*";
      update = true;
    }
  }

  //Listener affecté au bouton /
  class DivListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      if(clicOperateur){
        calcul();
        ecran.setText(String.valueOf(getValeur));
      }
      else{
        getValeur = Double.valueOf(ecran.getText()).doubleValue();
        clicOperateur = true;
      }
      operateur = "/";
      update = true;
    }
  }

  //Listener affecté au bouton de remise à zéro
  class ResetListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      clicOperateur = false;
      update = true;
      getValeur = 0;
      operateur = "";
      ecran.setText("");
    }
  }      
}