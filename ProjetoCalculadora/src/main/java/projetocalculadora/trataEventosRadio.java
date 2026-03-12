package projetocalculadora;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
