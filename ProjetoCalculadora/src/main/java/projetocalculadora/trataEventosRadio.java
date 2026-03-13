package projetocalculadora;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

public class trataEventosRadio implements ItemListener {
    public void itemStateChanged(ItemEvent event){
        if (event.getSource() == botao2dig){
            casasDecimais = 2;
        }
        if (event.getSource() == botao2dig){
            casasDecimais = 4;
        }
        if (event.getSource() == botao6dig){
            casasDecimais = 6;
        }
    }

}


Public void KeyPressed (KeyEvent e){
    if (e.getKeyCode() == e.VK_ESCAPE){
        int selectedOption = JOptionPane.showOptionDialog(this,"Deseja SAir.mene???");
        if(SelectedOption == JOptionPane.YES_NO_OPTION) {
            dispose();
            System.exit(0);
        }
        
    }
    if(e.getKeyCode() == 67) teclouC();
    if(e.getKeycode()== 69) teclouCE();
    if(e.getKeycode()==8) teclouBackspace();
    if(e.getKeyCode()== 110) teclouVirgula();
    if(((e.getKeyCode() >= e.VK_0) && (e.getKeyCode() < = e.VK_9)) || getKeyCode() >= e.VK_NUMPAD0) && ( e.getKeyCode() <= e.VK_NUMPAD9)))  teclouNumeros(""getKeyChar());
    if ((e.getKeyCode() == 61) || (e.getKeyCode() == 107)) teclouMais();
    if ((e.getKeyCode() == 45) || (e.getKeyCode() == 109)) teclouMenos();
    if ((e.getKeyCode() == 59) || (e.getKeyCode() == 111)) teclouDiv();
    if (e.getKeyCode() == 106)  teclouMultip();
    if (e.getKeyCode() == 80)  TeclouP();
    if (e.getKeyCode() == 10)  teclouEnter();
}

public void keyReleased (KeyEvent e){
    
}

public void KeyTiped(KeyEvent e){
    
}

public void teclouC(){
    valor = "0";
    visor.setText (formatSrNumerica(valor,casaDecimais));
    
}

public  void teclouCE(){
    valor = "0";
    soma = 0;
    visor.setText (formatSrNumerica(valor,casaDecimais));
    roloPapel.append(alinhaStringDir("-----------------------" + "\n"));
    roloPapel.append(alinhaStringDir("" + "\n"));

}

public void teclouP(){
    roloPapel.append(alinhaStringDir(formatSrNumerica(valor,casaDecimais)
    + "%" + "\n");
    roloPapel.append(alinhaStringDir("-----------------------" + "\n"));
    if(operador == "*") soma = soma* (Double.parseDouble(valor)/100);
    else if (operador == "/") soma = soma* (Double.parseDouble(valor)/100);
    roloPapel.append(alinhaStringDir(formatSrNumerica("" + soma, casasDecimais)
            + "\n"));
    roloPapel.append(alinhaStringDir("" + "\n"));
    visor.setTex(formatSrNumerica(""+ soma,casasDecimais));
    valorAnterior =  "" + soma;
    soma = 0;
    valor = "";
    }

    public void teclouVirgula(){
    if (valor.lastIndexof('.') == -1) valor = valor + ".";
    visor.setText(valor);
    }

    public void teclouBackspace(){
    if (valor.length() == 1) valor = "0";
    else valor = valor.substring (0,valor.length()-1);
        visor.setText(valor);


    }

    public void teclouNumeros(String s){
    if (valor.length() < = 14){
        if (valor == "0") valor = "";
        valor = valor + s;
        visor.setText(valor);
    }
        }

    public void teclouMais(){
    if (valor == "") valor = valorAnterior;
        roloPapel.append(alinhaStringDir(formatSrNumerica(valor,casaDecimais)
                + "%" + "\n");
        soma = soma + Double.parseDouble(valor);
        visor.setText (formatSrNumerica("" + soma, casasDecimais));
        valorAnterior = valor;
        valor ="";
        operador = "+";

    }


    public void teclouMenos(){
        if (valor == "") valor = valorAnterior;
        roloPapel.append(alinhaStringDir(formatSrNumerica(valor,casaDecimais)
                + "%" + "\n");
        soma = soma - Double.parseDouble(valor);
        visor.setText (formatSrNumerica("" + soma, casasDecimais));
        valorAnterior = valor;
        valor ="";
        operador = "-";
    }

    public void teclouDiv(){
        if (valor == "") valor = valorAnterior;
        roloPapel.append(alinhaStringDir(formatSrNumerica(valor,casaDecimais)
                + "%" + "\n");
        soma = Double.parseDouble(valor);
        visor.setText (formatSrNumerica("" + soma, casasDecimais));
        valorAnterior = valor;
        valor ="";
        operador = "/";    }