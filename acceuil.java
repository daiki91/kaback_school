import javax.swing.*;

public class acceuil {
    public static void main(String[] args) {
        // creation d'une fenetre de lecture graphique
        JFrame fen = new JFrame("coordi");
        fen.setSize(500, 400);

        // System.out.println("bienvenue sur karang");
        JPanel pan = new JPanel();
        fen.setContentPane(pan);
        // ajout de label
        JLabel bienvenue = new JLabel("bienvenue sur karang" );
        fen.getContentPane().add(bienvenue);
        // creation de bouton
        JButton ecoleList = new JButton("page Ecole");
        fen.getContentPane().add(ecoleList);
        JButton eleveList = new JButton("page Eleve");
        fen.getContentPane().add(eleveList);
        JButton profList = new JButton("page prof");
        fen.getContentPane().add(profList);

        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fen.setVisible(true);
    }

}
