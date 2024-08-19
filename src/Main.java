import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("aula01");
        frame.setContentPane(new aula01().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}