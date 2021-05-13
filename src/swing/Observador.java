package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        /*
        A linha abaixo define que, no momento que a janela for fechada, "mate" a 
        aplicação, ou seja, encerre a execução.
         */
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        /*
        A linha abaixo centraliza a tela de acordo com a tela do computador.
        Observe que o valor do parâmetro passado é null. Caso existisse alguma
        tela executando por trás da tela 'janela', seria possível centralizá-la
        de acordo com sua tela anterior.
         */
        janela.setLocationRelativeTo(null);

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Evento ocorreu #1");
            }
        });
        // --- OU --- //
        botao.addActionListener(
                e -> {
                    System.out.println("Evento ocorreu #2");
                });

        janela.setVisible(true);
    }

}
