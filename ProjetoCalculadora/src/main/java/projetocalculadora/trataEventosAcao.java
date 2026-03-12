package projetocalculadora;

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






    }
}
