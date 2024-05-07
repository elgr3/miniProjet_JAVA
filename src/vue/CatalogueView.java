package vue;

import java.awt.*;
import javax.swing.*;
import java.awt.*;

/*public class Login extends JFrame {

        private JTextField email;
        private JPasswordField password;
        private JButton login_button;
        private JButton register_button;

        public Login(String title) {
            //fenetre
            JFrame login = new JFrame();
            this.setVisible(true);
            this.setTitle(title);
            this.setSize(700, 700);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setContentPane(new JPanel(new GridLayout(2, 2)));

            this.setLayout(new BorderLayout());

            JPanel inputPanel = new JPanel(new GridLayout(2, 2));
            inputPanel.add(new JLabel("Email:"));
            email = new JTextField();
            inputPanel.add(email);
            inputPanel.add(new JLabel("Mot de passe:"));
            password = new JPasswordField();
            inputPanel.add(password);

            // Panneau pour les boutons
            JPanel buttonPanel = new JPanel();
            login_button = new JButton("Se connecter");
            buttonPanel.add(login_button);
            register_button = new JButton("S'inscrire");
            buttonPanel.add(register_button);

            //champs de saisie


            //container.setBackground(Color.white);


            //panel
            /*JPanel pan = new JPanel();
            pan.setBackground(Color.ORANGE);
            this.setContentPane(pan); // on ajoute le panel a notre fenetre
            this.setVisible(true);*/

        //}

    /*public class Panneau extends JPanel {
        public void paintComponent(Graphics g){
//Vous verrez cette phrase chaque fois que la méthode sera invoquée
            System.out.println("Je suis exécutée !");
            g.drawRoundRect(10, 10, 100, 500, 30, 30);

        }

}*/

/*public class CatalogueView {
    private JFrame frame;
    private JList<String> filmList, serieList, docList;
    private JButton refreshButton;

    public CatalogueView() {
        frame = new JFrame("Catalogue Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setLayout(new GridLayout(1, 3));

        filmList = new JList<>();
        serieList = new JList<>();
        docList = new JList<>();

        frame.add(new JScrollPane(filmList));
        frame.add(new JScrollPane(serieList));
        frame.add(new JScrollPane(docList));

        refreshButton = new JButton("Refresh");
        frame.add(refreshButton, BorderLayout.SOUTH);
    }

    public void setFilmListData(String[] data) {
        filmList.setListData(data);
    }

    public void setSerieListData(String[] data) {
        serieList.setListData(data);
    }

    public void setDocListData(String[] data) {
        docList.setListData(data);
    }

    public void showGUI() {
        frame.setVisible(true);
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }
}*/

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class CatalogueView {
    private JFrame frame;
    private JList<String> filmList, serieList, docList;
    private JButton refreshButton;
    private JPanel panel;

    public CatalogueView() {
        frame = new JFrame("Catalogue Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        //frame.setLayout(new GridLayout(1, 3));

        filmList = new JList<>();
        serieList = new JList<>();
        docList = new JList<>();

        /*frame.add(new JScrollPane(filmList));
        frame.add(new JScrollPane(serieList));
        frame.add(new JScrollPane(docList));*/

        /*refreshButton = new JButton("Refresh");
        frame.add(refreshButton, BorderLayout.SOUTH);*/

        panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setPreferredSize(new Dimension(200, 200));
        frame.add(panel, BorderLayout.WEST);

        //Bouton films
        JPanel buttonFilms = new JPanel();
        buttonFilms.add(new JButton("Films"));
        buttonFilms.setAlignmentX(Component.CENTER_ALIGNMENT);  // Center horizontally
        buttonFilms.setAlignmentY(Component.CENTER_ALIGNMENT);
        panel.add(buttonFilms);
        panel.add(Box.createVerticalGlue());
        //this.setVisible(true);
    }


    /*public void setFilmListData(String[] data) {
        filmList.setListData(data);
    }

    public void setSerieListData(String[] data) {
        serieList.setListData(data);
    }

    public void setDocListData(String[] data) {
        docList.setListData(data);
    }*/

    public void showGUI() {
        frame.setVisible(true);
    }

    /*public JButton getRefreshButton() {
        return refreshButton;
    }*/
}





