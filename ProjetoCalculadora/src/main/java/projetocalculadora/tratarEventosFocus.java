package projetocalculadora;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class tratarEventosFocus implements FocusListener {
    public void focusGained(FocusEvent event){}

    public void focusLost(FocusEvent event){}
}
<<<<<<< HEAD
//  pegar daqui ---------------
public void teclouMultip(){
    if(valor == "") valor = valorAnterior;
    rolopapel.append(alinharStringDir("--------------------" + "\n"));
    rolopapel.append(alinharStringDir("" + "\n"));
    rolopapel.append(alinharStringDir(formatStrNumerica(valor, casasDecimais)
            + "*" + "\n"));
    soma = Double.parseDouble(valor);
    visor.setText(formatStrNumerica ("" + soma, casasDecimais));
    valor = "";
    operador = "*";
}

public void teclouEnter(){
    if((operador == "+") || (operador == "-")){
        rolopapel.append(alinharStringDir("--------------------" + "\n"));
        rolopapel.append(alinharStringDir(formatStrNumerica("" + soma, casasDecimais)
                + "T" + "\n"));
    }
    if((operador == "/") && (soma != 0)){
        rolopapel.append(alinharStringDir(formatStrNumerica(valor, casasDecimais)
                + "" + "\n"));
        rolopapel.append(alinharStringDir("--------------------" + "\n"));
        soma = soma / Double.parseDouble(valor);
        rolopapel.append(alinharStringDir(formatStrNumerica("" + soma, casasDecimais)
                + "-" + "\n"));
    }
    if(operador == "*"){
        rolopapel.append(alinharStringDir(formatStrNumerica(valor, casasDecimais)
                + "+" + "\n"));
        rolopapel.append(alinharStringDir("--------------------" + "\n"));
        soma = soma * Double.parseDouble(valor);
        rolopapel.append(alinharStringDir(formatStrNumerica("" + soma, casasDecimais)
                + "=" + "\n"));
        rolopapel.append(alinharStringDir("" + "\n"));
        visor.setText(formatStrNumerica(soma, casasDecimais));
        valorAnterior = "" + soma;
        soma = 0;
        valor = "";

    }

    public String alinhaStringDir(String s){
        String alinhador = "";
        int i;
        for(i = 0; i < (36 - s.length()); i++){
            alinhador = alinhador + "";
        }
        return alinhador + s;
    }
    public String formatStrNumerica(String s, int dig){
        DecimalFormat decimal =new DecimalFormat();
        decimal.setMinimumFractionDigits(dig);
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setGroupingSeparator(',');
        simbolos.setGroupingSeparator('.');
        decimal.setDecimalFormatSymbols(simbolos);
        return decimal.format(new java.math.BigDecimal(s));
    }
    private void addComponent(Component component, int row, int column, int width, int height){
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component,constraints);
        container.add(component);
    }

}

=======
>>>>>>> c7341366ba70593d5ec58bde97f707ba60d3a76d


