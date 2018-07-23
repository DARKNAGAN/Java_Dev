import java.awt.*;
import java.applet.Applet;
import java.lang.Integer;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Calculatrice extends Applet
{
//déclaration des variables pour les boutons

TextField txtDisp;
public final int NONE = 0;
public final int ADD = 1;
public final int SUB = 2;
public final int MUL = 3;
public final int DIV = 4;
public final int NEG = 5;
public final int SQRT = 6;
public final int EQ = 7;
public final int C = 8;
public final int AC = 9;
public final int DECSEP = -1;

String msDecimal;
int mnOp = NONE;
boolean mbNewNumber = true;
boolean mbDecimal = false;
double mdReg = 0.0;


/*
Initialisation de l'applet
Mise en page des boutons : couleur, et police de caractère
*/

public void init()
{
CalcButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
CalcButton btnDecSep, btnNeg, btnSqrt, btnPlus, btnMinus;
CalcButton btnTimes, btnDiv, btnEqual, btnClear, btnAllClear;

setLayout(null);
setFont(new Font("Helvetica", Font.PLAIN, 14));
//setBackground(new Color(0xCC, 0xCC, 0xCC));

btn0 = new CalcButton("0",NONE, 0);
add(btn0);
btn0.reshape(64, 164, 40, 24);
btn0.setForeground(Color.blue);

btn1 = new CalcButton("1",NONE, 1);
add(btn1);
btn1.reshape(64, 132, 40, 24);
btn1.setForeground(Color.blue);

btn2 = new CalcButton("2",NONE, 2);
add(btn2);
btn2.reshape(120, 132, 40, 24);
btn2.setForeground(Color.blue);

btn3 = new CalcButton("3",NONE, 3);
add(btn3);
btn3.reshape(176, 132, 40, 24);
btn3.setForeground(Color.blue);

btn4 = new CalcButton("4",NONE , 4);
add(btn4);
btn4.reshape(64, 100, 40, 24);
btn4.setForeground(Color.blue);

btn5 = new CalcButton("5",NONE , 5);
add(btn5);
btn5.reshape(120, 100, 40, 24);
btn5.setForeground(Color.blue);

btn6 = new CalcButton("6",NONE, 6);
add(btn6);
btn6.reshape(176, 100, 40, 24);
btn6.setForeground(Color.blue);

btn7 = new CalcButton("7",NONE, 7);
add(btn7);
btn7.reshape(64, 68, 40, 24);
btn7.setForeground(Color.blue);

btn8 = new CalcButton("8",NONE, 8);
add(btn8);
btn8.reshape(120, 68, 40, 24);
btn8.setForeground(Color.blue);

btn9 = new CalcButton("9",NONE, 9);
add(btn9);
btn9.reshape(176, 68, 40, 24);
btn9.setForeground(Color.blue);

btnDecSep = new CalcButton("·",NONE, DECSEP);
add(btnDecSep);
btnDecSep.reshape(176, 164, 40, 24);
btnDecSep.setForeground(Color.blue);


btnNeg = new CalcButton("+/-", NEG, 0);
add(btnNeg);
btnNeg.reshape(120, 164, 40, 24);
btnNeg.setForeground(Color.blue);


btnSqrt = new CalcButton("Sqrt", SQRT, 0);
add(btnSqrt);
btnSqrt.reshape(8, 80, 40, 24);
btnSqrt.setForeground(Color.red);


btnPlus = new CalcButton("+", ADD, 0);
add(btnPlus);
btnPlus.reshape(232, 112, 40, 56);
btnPlus.setForeground(Color.red);


btnMinus = new CalcButton("-", SUB, 0);
add(btnMinus);
btnMinus.reshape(288, 112, 40, 24);
btnMinus.setForeground(Color.red);


btnTimes = new CalcButton("×", MUL, 0);
add(btnTimes);
btnTimes.reshape(232, 80, 40, 24);
btnTimes.setForeground(Color.red);


btnDiv = new CalcButton("÷", DIV, 0);
add(btnDiv);
btnDiv.reshape(288, 80, 40, 24);
btnDiv.setForeground(Color.red);


btnEqual = new CalcButton("=", EQ, 0);
add(btnEqual);
btnEqual.reshape(288, 144, 40, 24);
btnEqual.setForeground(Color.red);


btnClear = new CalcButton("C", C, 0);
add(btnClear);
btnClear.reshape(8, 112, 40, 24);
btnClear.setForeground(Color.red);


btnAllClear = new CalcButton("AC", AC, 0);
add(btnAllClear);
btnAllClear.reshape(8, 144, 40, 24);
btnAllClear.setForeground(Color.red);


txtDisp = new TextField("0", 80);
txtDisp.setEditable(false);
add(txtDisp);
txtDisp.reshape(64, 8, 268, 27);
String sOneTenth = (new Double(0.1)).toString();
msDecimal = sOneTenth.substring(sOneTenth.length()-2).substring(0, 1);
}

/*
Création de la frame
*/

public static void main(String args[])
{
Frame frm = new Frame("Ma premiere calculatrice en java");
Calculatrice ex1 = new Calculatrice();
ex1.init();
frm.add("Center", ex1);
frm.pack();
frm.resize(350, 350);
frm.show();
}

/*
Fonction pour les nombres décimaux
*/

public void append(int nValue)
{
String sDigit;

if(nValue == DECSEP)
if(!mbDecimal)
{
if(mbNewNumber)
{
txtDisp.setText("0");
mbNewNumber = false;
}
mbDecimal = true;
sDigit = msDecimal;
}
else
return;
else
sDigit = (new Integer(nValue)).toString();
if(mbNewNumber)
{
txtDisp.setText(sDigit);
mbNewNumber = false;
}
else
txtDisp.setText(txtDisp.getText() + sDigit);
repaint();
}

/*
Initialisation des opérations
*/
public void doOp(int nNewOp)
{
double dDisp;
dDisp = (new Double(txtDisp.getText())).doubleValue();
switch(nNewOp)
{
case NEG:
case SQRT:
case C:
case AC:

switch(nNewOp)
{
case NEG:
txtDisp.setText((new Double(-dDisp)).toString());
break;

case SQRT:
txtDisp.setText((new Double(Math.sqrt(dDisp))).toString());
mbNewNumber = true;
mbDecimal = false;
break;
case C:
mbNewNumber = true;
mbDecimal = false;
txtDisp.setText("0");
break;
case AC:
mnOp = NONE;
mbNewNumber = true;
mbDecimal = false;
mdReg = 0.0;
txtDisp.setText("0");
break;
}
break;
case ADD:
case SUB:
case MUL:
case DIV:
case EQ:

switch(mnOp)
{
case ADD:
mdReg = mdReg + dDisp;
break;

case SUB:
mdReg = mdReg - dDisp;
break;
case MUL:
mdReg = mdReg * dDisp;
break;
case DIV:
mdReg = mdReg / dDisp;
break;
case EQ:
case NONE:
mdReg = dDisp;
break;
}
mnOp = nNewOp;
mbNewNumber = true;
mbDecimal = false;
txtDisp.setText((new Double(mdReg)).toString());
break;
}
}
/*
Initialisation de la calculatrice
*/

public Calculatrice() {
try {
jbInit();
}
catch (Exception e) {
e.printStackTrace();
}
}

private void jbInit() throws Exception {
this.setBackground(SystemColor.text);
this.setSize(new Dimension(300, 316));
}
}

/*
Initialisation des boutons
*/

class CalcButton extends Button
{
int mnOp;
int mnValue;

CalcButton(String sText, int nOp, int nValue)
{
super(sText);
mnOp = nOp;
mnValue = nValue;
}

public boolean action(Event evt, Object arg)
{
Calculatrice par = (Calculatrice)getParent();

if(mnOp == par.NONE)
par.append(mnValue);
else
{
par.doOp(mnOp);
}
return true;
}
}