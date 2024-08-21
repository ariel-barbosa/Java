import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Snake extends JFrame  {

    private static final JLabel labelDirecoes = new JLabel("Seu nome: ");
    private static final JLabel labelSaida = new JLabel();
    private static final JTextField nomeBox = new JTextField(25);
    private static final JButton nomeBotao = new JButton("ENTER");

    public static void main(String[] args) throws Exception {

        Snake janela = new Snake();
        
        // usando propiedades do Jframe
        janela.setSize(400, 400);
        janela.setTitle("Snake Game");
        janela.setVisible(true);

        janela.setLayout(new FlowLayout()); // constroi meu layout
        
        // aqui adiciona os objetos no meu painel
        janela.getContentPane().add(labelDirecoes);
        janela.getContentPane().add(nomeBox);
        janela.getContentPane().add(nomeBotao);
        janela.getContentPane().add(labelSaida);

        janela.getContentPane().setBackground(new Color(200,196,200));
        nomeBox.setForeground(new Color(200,300,300));

        // se quiser que o JFrame fique do menor tanmanho possivel
        // mas mostrando os componentes usamos o pack... Que não é o Grenn Bay Packers infelizmente
        // janela.pack();

        // add um action listener

        // add objetos javaSwing
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sem o EXITE_ON_CLOSE sempre que sair do Frame ele continua rodando

        nomeBotao.addActionListener((ActionEvent e) -> {
            clique(e);  // funçao que trata deste Evento
        });
    } // fim do metodo main

    public static void clique(ActionEvent e) {
        // codigo que vai desponder ao clique do botão

        JOptionPane.showMessageDialog(null, "Funcionou!!", "Oops", JOptionPane.INFORMATION_MESSAGE);
        // esta linha acima é um teste para o botão

        // String nome = nomeBox.getText(); // estou conseguindo instancioar aqui o objeto nomeBox porque é Global
        // String mensagem = "Olá " + nome;

        // labelSaida.setText(mensagem);


    }

}
