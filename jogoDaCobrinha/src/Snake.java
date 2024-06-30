import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Snake extends JFrame  {

    private static JLabel labelDirecoes = new JLabel("Seu nome: ");
    private static JLabel labelSaida = new JLabel();
    private static JTextField nomeBox = new JTextField(25);
    private static JButton nomeBotao = new JButton("ENTER");

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

        // se quiser que o JFrame fique do menor tanmanho possivel
        // mas mostrando os componentes usamos o pack... Que não é o Grenn Bay Packers infelizmente
        // -- > janela.pack();

        // add um action listener
        nomeBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cliqueBotao(e);  // funçao que trata deste Evento
            }
        });

        // add objetos javaSwing
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sem o EXITE_ON_CLOSE sempre que sair do Frame ele continua rodando

    } // fim do metodo main

    public static void cliqueBotao(ActionEvent e) {
        // codigo que vai desponder ao clique do botão

        // JOptionPane.showMessageDialog(null, "Funcionou!!", "Oops", JOptionPane.INFORMATION_MESSAGE);
        // esta linha acima é um teste para o botão

        String nome = nomeBox.getText(); // estou conseguindo instancioar aqui o objeto nomeBox porque é Global
        String mensagem = "Olá " + nome;

        labelSaida.setText(mensagem);


    }

}
