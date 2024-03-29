import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
 
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  private int posX = -50;
  private int posY = -50;
  private String forme = "ROND";

  public void paintComponent(Graphics g){
    //On choisit une couleur de fond pour le rectangle
    g.setColor(Color.white);
    //On le dessine de sorte qu'il occupe toute la surface
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    //On red�finit une couleur pour le rond
    g.setColor(Color.red);
    //On d�l�gue la m�thode de dessin � la m�thode draw()
    draw(g);      
  }
 
  private void draw(Graphics g){      
    if(this.forme.equals("ROND")){
      g.fillOval(posX, posY, 50, 50); 
    }
    if(this.forme.equals("CARRE")){
      g.fillRect(posX, posY, 50, 50);
    }
    if(this.forme.equals("TRIANGLE")){
      //Calcul des sommets            
      //Le sommet 1 se situe � la moiti� du c�t� sup�rieur du carr�
      int s1X = posX + 25;
      int s1Y = posY;
      //Le sommet 2 se situe en bas � droite
      int s2X = posX + 50;
      int s2Y = posY + 50;
      //Le sommet 3 se situe en bas � gauche
      int s3X = posX;
      int s3Y = posY + 50;      
      //Nous cr�ons deux tableaux de coordonn�es
      int[] ptsX = {s1X, s2X, s3X};
      int[] ptsY = {s1Y, s2Y, s3Y};      
      //Nous utilisons la m�thode fillPolygon()
      g.fillPolygon(ptsX, ptsY, 3);
    }
    if(this.forme.equals("ETOILE")){      
      //Pour l'�toile, on se contente de tracer des lignes dans le carr�
      //correspondant � peu pr�s � une �toile...
      //Mais ce code peut �tre am�lior� !
      int s1X = posX + 25;
      int s1Y = posY;
      int s2X = posX + 50;
      int s2Y = posY + 50;        
      g.drawLine(s1X, s1Y, s2X, s2Y);      
      int s3X = posX;
      int s3Y = posY + 17;
      g.drawLine(s2X, s2Y, s3X, s3Y);      
      int s4X = posX + 50;
      int s4Y = posY + 17;
      g.drawLine(s3X, s3Y, s4X, s4Y);            
      int s5X = posX;
      int s5Y = posY + 50;
      g.drawLine(s4X, s4Y, s5X, s5Y);       
      g.drawLine(s5X, s5Y, s1X, s1Y);  
    }
  }
  
  public void setForme(String form){
    this.forme = form;
  }
  
  public int getPosX() {
    return posX;
  }
 
  public void setPosX(int posX) {
    this.posX = posX;
  }
 
  public int getPosY() {
    return posY;
  }
 
  public void setPosY(int posY) {
    this.posY = posY;
  }
}