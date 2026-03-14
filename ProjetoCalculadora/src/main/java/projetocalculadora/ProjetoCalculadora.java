package projetocalculadora;


import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;





public class ProjetoCalculadora extends JFrame implements KeyListener {
    private JButton botao1,botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botao0,
            botaoC, botaoCE, botaoDiv, botaoMultip, botaoMenos, botaoMais,botaoVirgula, botaoTotal,
            botaoPerc, botaoBackspace;
    private JTextArea rolopapel;
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



private class trataEventosAcao implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == botaoC) teclouC();
        else if (event.getSource() == botaoCE) teclouCE();
        else if (event.getSource() == botaoPerc) teclouP();
        else if (event.getSource() == botaoVirgula) teclouVirgula();
        else if (event.getSource() == botaoBackspace) teclouBackspace();
        else if (event.getSource() == botaoCE) teclouNumeros("1");
        else if (event.getSource() == botaoCE) teclouNumeros("2");
        else if (event.getSource() == botaoCE) teclouNumeros("3");
        else if (event.getSource() == botaoCE) teclouNumeros("4");
        else if (event.getSource() == botaoCE) teclouNumeros("5");
        else if (event.getSource() == botaoCE) teclouNumeros("6");
        else if (event.getSource() == botao7) teclouNumeros("7");
        else if (event.getSource() == botao8) teclouNumeros("8");
        else if (event.getSource() == botao9) teclouNumeros("9");
        else if (event.getSource() == botao0) teclouNumeros("0");
        else if (event.getSource() == botaoMais) teclouMais();
        else if (event.getSource() == botaoMenos) teclouMenos();
        else if (event.getSource() == botaoDiv) teclouDiv();
        else if (event.getSource() == botaoMultip) teclouMultip();
        else if (event.getSource() == botaoTotal) teclouEnter();
    }
}


public class trataEventosFocus implements FocusListener {
    public void focusGained(FocusEvent event){}

    public void focusLost(FocusEvent event){}
}

private class trataEventosRadio implements ItemListener {
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


public void KeyPressed (KeyEvent e){
    if (e.getKeyCode() == e.VK_ESCAPE){
        int selectedOption = JOptionPane.showConfirmDialog(this,"Deseja SAir.mene???");
        if(selectedOption == JOptionPane.YES_NO_OPTION) {
            dispose();
            System.exit(0);
        }

    }
    if(e.getKeyCode() == 67) teclouC();
    if(e.getKeyCode()== 69) teclouCE();
    if(e.getKeyCode()==8) teclouBackspace();
    if(e.getKeyCode()== 110) teclouVirgula();
    if(((e.getKeyCode() >= e.VK_0) && (e.getKeyCode() <= e.VK_9)) || (e.getKeyCode() >= e.VK_NUMPAD0) && (e.getKeyCode() <= e.VK_NUMPAD9)) teclouNumeros("" + e.getKeyChar());
    if ((e.getKeyCode() == 61) || (e.getKeyCode() == 107)) teclouMais();
    if ((e.getKeyCode() == 45) || (e.getKeyCode() == 109)) teclouMenos();
    if ((e.getKeyCode() == 59) || (e.getKeyCode() == 111)) teclouDiv();
    if (e.getKeyCode() == 106)  teclouMultip();
    if (e.getKeyCode() == 80)  teclouP();
    if (e.getKeyCode() == 10)  teclouEnter();
}

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
public void keyReleased (KeyEvent e){

}

public void KeyTyped(KeyEvent e){

}

public void teclouC(){
    valor = "0";
    visor.setText (formatStrNumerica(valor,casasDecimais));

}

public  void teclouCE(){
    valor = "0";
    soma = 0;
    visor.setText (formatStrNumerica(valor,casasDecimais));
    rolopapel.append(alinhaStringDir("-----------------------" + "\n"));
    rolopapel.append(alinhaStringDir("" + "\n"));

}

public void teclouP(){
    rolopapel.append(alinhaStringDir(formatStrNumerica(valor,casasDecimais)
            + "%" + "\n"));
    rolopapel.append(alinhaStringDir("-----------------------" + "\n"));
    if(operador == "*") soma = soma* (Double.parseDouble(valor)/100);
    else if (operador == "/") soma = soma* (Double.parseDouble(valor)/100);
    rolopapel.append(alinhaStringDir(formatStrNumerica("" + soma, casasDecimais)
            + "\n"));
    rolopapel.append(alinhaStringDir("" + "\n"));
    visor.setText(formatStrNumerica(""+ soma,casasDecimais));
    valorAnterior =  "" + soma;
    soma = 0;
    valor = "";
}

public void teclouVirgula(){
    if (valor.lastIndexOf('.') == -1) valor = valor + ".";
    visor.setText(valor);
}

public void teclouBackspace(){
    if (valor.length() == 1) valor = "0";
    else valor = valor.substring (0,valor.length()-1);
    visor.setText(valor);


}

public void teclouNumeros(String s){
    if (valor.length() <= 14){
        if (valor == "0") valor = "";
        valor = valor + s;
        visor.setText(valor);
    }
}

public void teclouMais(){
    if (valor == "") valor = valorAnterior;
    rolopapel.append(alinhaStringDir(formatStrNumerica(valor,casasDecimais)
            + "%" + "\n"));
    soma = soma + Double.parseDouble(valor);
    visor.setText (formatStrNumerica("" + soma, casasDecimais));
    valorAnterior = valor;
    valor ="";
    operador = "+";

}


public void teclouMenos(){
    if (valor == "") valor = valorAnterior;
    rolopapel.append(alinhaStringDir(formatStrNumerica(valor,casasDecimais)
            + "%" + "\n"));
    soma = soma - Double.parseDouble(valor);
    visor.setText (formatStrNumerica("" + soma, casasDecimais));
    valorAnterior = valor;
    valor ="";
    operador = "-";
}

public void teclouDiv(){
    if (valor == "") valor = valorAnterior;
    rolopapel.append(alinhaStringDir(formatStrNumerica(valor,casasDecimais)
            + "%" + "\n"));
    soma = Double.parseDouble(valor);
    visor.setText (formatStrNumerica("" + soma, casasDecimais));
    valorAnterior = valor;
    valor ="";
    operador = "/";    }

public void teclouMultip(){
    if(valor == "") valor = valorAnterior;
    rolopapel.append(alinhaStringDir("--------------------" + "\n"));
    rolopapel.append(alinhaStringDir("" + "\n"));
    rolopapel.append(alinhaStringDir(formatStrNumerica(valor, casasDecimais)
            + "*" + "\n"));
    soma = Double.parseDouble(valor);
    visor.setText(formatStrNumerica ("" + soma, casasDecimais));
    valor = "";
    operador = "*";
}

public void teclouEnter() {
    if ((operador == "+") || (operador == "-")) {
        rolopapel.append(alinhaStringDir("--------------------" + "\n"));
        rolopapel.append(alinhaStringDir(formatStrNumerica("" + soma, casasDecimais)
                + "T" + "\n"));
    }
    if ((operador == "/") && (soma != 0)) {
        rolopapel.append(alinhaStringDir(formatStrNumerica(valor, casasDecimais)
                + "" + "\n"));
        rolopapel.append(alinhaStringDir("--------------------" + "\n"));
        soma = soma / Double.parseDouble(valor);
        rolopapel.append(alinhaStringDir(formatStrNumerica("" + soma, casasDecimais)
                + "-" + "\n"));
    }
    if (operador == "*") {
        rolopapel.append(alinhaStringDir(formatStrNumerica(valor, casasDecimais)
                + "+" + "\n"));
        rolopapel.append(alinhaStringDir("--------------------" + "\n"));
        soma = soma * Double.parseDouble(valor);
        rolopapel.append(alinhaStringDir(formatStrNumerica("" + soma, casasDecimais)
                + "=" + "\n"));
        rolopapel.append(alinhaStringDir("" + "\n"));
        visor.setText(formatStrNumerica("" + soma, casasDecimais));
        valorAnterior = "" + soma;
        soma = 0;
        valor = "";

    }
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

    public ProjetoCalculadora() {
        super ("Calculadora 6.0 ) (Orriso)");
        container = getContentPane();
        layout = new GridBagLayout();
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
        botaoBackspace = new JButton("Tecle Backspace");
        keyCodigo = new JLabel("0");
        visor = new JLabel("0.00");
        visor.setHorizontalAlignment (SwingConstants.RIGHT);
        visor.setFont(new Font ("Courier New", Font.BOLD,16));
        visor.setForeground(Color.RED);
        visor.setToolTipText("vAlores até 14 digitos");
        rolopapel = new JTextArea(12,15);
        rolopapel.setEditable(false);
        rolopapel.setFont (new Font ("Courier New",Font.PLAIN,11));
        scroll = new JScrollPane(rolopapel,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBorder(new LineBorder (Color.pink,3,true)) ;
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
        rolopapel.setFocusable(false);
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
        addComponent (visor,1,0,5,1);
        addComponent (botao2dig,2,0,1,1);
        addComponent (botao4dig,2,1,1,1);
        addComponent (botao6dig,2,2,3,1);
        constraints.weightx = 0;
        constraints.weightx = 5;
        addComponent(botaoPerc, 3,0,1,1);
        addComponent(botaoCE, 3,4,1,1);
        addComponent(botaoC, 4,4,1,1);
        addComponent(botaoBackspace, 5,4,1,1);
        addComponent(botaoDiv, 3,1,1,1);
        addComponent(botaoMultip, 3,2,1,1);
        addComponent(botaoMenos, 3,3,1,1);
        addComponent(botao7, 4,0,1,1);
        addComponent(botao8, 4,1,1,1);
        addComponent(botao9, 4,2,1,1);
        addComponent(botaoMais, 4,3,1,1);
        addComponent(botao4, 5,0,1,1);
        addComponent(botao5, 5,1,1,1);
        addComponent(botao6, 5,2,1,2);
        addComponent(botaoVirgula, 5,3,1,1);
        addComponent(botao1, 6,0,1,1);
        addComponent(botao2, 6,1,1,1);
        addComponent(botao3, 6,2,1,1);
        addComponent(botao0, 6,3,1,1);
        addComponent(botaoTotal, 6,4,1,1);

        trataEventosAcao handletAcao = new trataEventosAcao ();
        botaoC.addActionListener(handletAcao);
        botaoCE.addActionListener(handletAcao);
        botaoPerc.addActionListener(handletAcao);
        botaoDiv.addActionListener(handletAcao);
        botaoMultip.addActionListener(handletAcao);
        botaoMenos.addActionListener(handletAcao);
        botaoMais.addActionListener(handletAcao);
        botaoTotal.addActionListener(handletAcao);
        botaoVirgula.addActionListener(handletAcao);
        botao1.addActionListener(handletAcao);
        botao2.addActionListener(handletAcao);
        botao3.addActionListener(handletAcao);
        botao4.addActionListener(handletAcao);
        botao5.addActionListener(handletAcao);
        botao6.addActionListener(handletAcao);
        botao7.addActionListener(handletAcao);
        botao8.addActionListener(handletAcao);
        botao9.addActionListener(handletAcao);
        botao0.addActionListener(handletAcao);
        botaoBackspace.addActionListener(handletAcao);

        trataEventosFocus handlerFocus = new trataEventosFocus();
        trataEventosRadio handletRadio = new trataEventosRadio();
        botao2dig.addActionListener(handletAcao);
        botao4dig.addActionListener(handletAcao);
        botao6dig.addActionListener(handletAcao);
        visor.addKeyListener(this);
        setSize(285,480);
        Dimension resVideo = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamForm = getSize();
        setLocation ((resVideo.width - tamForm.width)/2,(resVideo.height - tamForm.height)/2);
        setResizable(false);
        setVisible(true);
    }




public static void main(String[] args) {
    ProjetoCalculadora app = new ProjetoCalculadora();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}


