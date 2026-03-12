package projetocalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class ProjetoCalculadora  extends JFrame implements KeyListener {
    private JButton botao1,botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botao0,
            botaoC, botaoCE, botaoDiv, botaoMultip, botaoMenos, botaoMais,botaoVirgula, botaoTotal,
            botaoPerc, botaoBackspace;
    private JTextArea tolopapel;
    private JLabel visor, keyCodigo;
    private JScrollPane scroll;
    private double soma = 0;
    private String valor = "", operador = "", valorAnterior = "";
    private Container container;
    private GridBagLayout layout;
    private GridBagConstraints constraints;
    private JRadioButton botao2dig, botao4dig, botao6dig;
    private ButtonGroup botaoDecimais;
    private int casasDecimais = 2;
}
