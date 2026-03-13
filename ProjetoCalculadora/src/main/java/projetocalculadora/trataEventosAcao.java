package projetocalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

    private public class trataEventosAcao implements ActionListener {
        public void actionPerformed(ActionListener event) {
            if (event.getSource() == botaoC) teclouC();
            else if  (event.getSource() == botaoCE) teclouCE();
            else if  (event.getSource() == botaoPerc) teclouP();
            else if  (event.getSource() == botaoVirgula) teclouVirgula();
            else if  (event.getSource() == botaoBackspce) teclouBackspace();
            else if  (event.getSource() == botaoCE) teclouNumeros("1");
            else if  (event.getSource() == botaoCE) teclouNumeros("2");
            else if  (event.getSource() == botaoCE) teclouNumeros("3");
            else if  (event.getSource() == botaoCE) teclouNumeros("4");
            else if  (event.getSource() == botaoCE) teclouNumeros("5");
            else if  (event.getSource() == botaoCE) teclouNumeros("6");

            else if  (event.getSource() == botao7) teclouNumeros(7);
            else if  (event.getSource() == botao8) teclouNumeros("8");
            else if  (event.getSource() == botao9) teclouNumeros("9");
            else if  (event.getSource() == botao0) teclouNumeros("0");
            else if  (event.getSource() == botaoMais) teclouMais();
            else if  (event.getSource() == botaoMenos) teclouMenos();
            else if  (event.getSource() == botaoDiv) teclouDiv();
            else if  (event.getSource() == botaoMultip) teclouMultip();
            else if  (event.getSource() == botaoTotal) teclouEnter();
        }
    }


    // ************ Projeto Calculadora*******

public ProjetoCalculadora() {
     super ("Calculadora 6.0 ) (Orriso)");
     container = getContentPane();
     layout = new GridBaglayout();
     constraints = new GridBagConstraints();

     botao1 = new JButton("1");
     botao2 = new JButton("2");
     botao3 = new JButton("3");
     botao4 = new JButton("4");
     botao5 = new JButton("5");
     botao6 = new JButton("6");
     botao7 = new JButton("7");
     botao8 = new JButton("8");
     botao9 = new JButton("9");
     botao0 = new JButton("0");
     botaoC = new JButton("C");
     botaoC.setToolTipText("Tecle C");
     botaoCE = new JButton("CE");
     botao1 = new JButton("Tecle E");
     botaoDiv = new JButton("/");
     botaoMultip = new JButton("*");
     botaoMenos = new JButton("-");
     botaoMais = new JButton("+");
     botaoVirgula = new JButton(",");
     botaoVirgula.setToolTipText ("Tecle , (Virgula)");
     botaoTotal = new JButton("T");
     botaoTotal = new JButton("Tecle ENTER");
     botaoPerc = new JButton("%");
     botaoPerc = new JButton("Tecle P ");
     botaoBackspace = new JButton("<");
     botaoBackpsace = new JButton("Tecle Backspace");
     keyCodigo = new JLabel("0");
     visor = new JLabel("0.00");
     visor.setHorizontalAligment (SwingConstants.RIGHT);
     visor.setFont(new Font ("Courier New", Font.BOLD,16));
     visor.setForegoround(Color.RED);
     visor.setToolTipText("vAlores até 14 digitos");
     roloPapel = new JTextArea(12,15);
     roloPapel.setEditable(false);
     roloPapel.setFont (new Font ("Courier New",Font.PLAIN,11));
     scroll = new JScrollPane(roloPapel),
 scrollPaneConstatants.VERTICAL SCROLIBAR ALWYS,
 scrollPaneConstants.HORIZONTAL SCROLLBAR_NEVER);
     scroll.setBorder(new LineBoder (Color.pink,3,true)) ;
     botao2dig = new JRadioButton("2", true);
     botao4dig = new JRadioButton("4", false);
     botao6dig = new JRadioButton("6 : Digitos Decimais", false);
     botaoDecimais = new ButtonGroup();
     botaoDecimais.add (botao2dig);
     botaoDecimais.add (botao4dig);
     botaoDecimais.add (botao6dig);
     visor.setFocusable(true);
     botao1.setFocusable(false);
     botao2.setFocusable(false);
     botao3.setFocusable(false);
     botao4.setFocusable(false);
     botao5.setFocusable(false);
     botao6.setFocusable(false);
     botao7.setFocusable(false);
     botao8.setFocusable(false);
     botao9.setFocusable(false);
     botaoC.setFocusable(false);
     botaoCE.setFocusable(false);
     botaoMais.setFocusable(false);
     botaoMenos.setFocusable(false);
     botaoDiv.setFocusable(false);
     botaoPerc.setFocusable(false);
     botaoMultip.setFocusable(false);
     botaoPapel.setFocusable(false);
     botaoVirgula.setFocusable(false);
     botaoTotal.setFocusable(false);
     botaoBackspace.setFocusable(false);
     botao2dig.setFocusable(false);
     botao4dig.setFocusable(false);
     botao6dig.setFocusable(false);
     constraints.anchor = GridBagConstraints.WEST;
     constraints.weightx = 0 ;
     constraints.weightx = 1 ;
     constraints.fill = GridBagConstraints.BOTH;
     addComponent (scroll, 0,0,5,1);
     addComponent
     addComponent
     addComponent
     addComponent




}






