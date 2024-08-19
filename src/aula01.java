import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aula01 {

    public JPanel painelPrincipal;
    private JButton submitButton;
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton radioSoma;
    private JRadioButton radioSubtracao;
    private JRadioButton radioDivisao;
    private JRadioButton radioMultiplicacao;
    private double jpaneResultado = 0;

    public aula01() {
        radioSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(textField1.getText());
                double valor2 = Double.parseDouble(textField2.getText());
                jpaneResultado = valor1 + valor2;
            }
        });
        radioSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(textField1.getText());
                double valor2 = Double.parseDouble(textField2.getText());
                jpaneResultado = valor1 - valor2;
            }
        });
        radioDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(textField1.getText());
                double valor2 = Double.parseDouble(textField2.getText());
                jpaneResultado = valor1 * valor2;
            }
        });
        radioMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(textField1.getText());
                double valor2 = Double.parseDouble(textField2.getText());
                jpaneResultado = valor1 / valor2;
            }
   });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,jpaneResultado);
            }
        });
    }
}
