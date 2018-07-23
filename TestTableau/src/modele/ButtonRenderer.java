package modele;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

//CTRL + SHIFT + O pour g�n�rer les imports
public class ButtonRenderer extends JButton implements TableCellRenderer{

 public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean isFocus, int row, int col) {
    //On �crit dans le bouton avec la valeur de la cellule
    setText((value != null) ? value.toString() : "");
    //On retourne notre bouton
    return this;
 }
}
