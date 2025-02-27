import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GirisSayfa implements ActionListener {

    JFrame frame;

    JTextField kullanıcıAdı;
    JTextField şifre;

    JButton girişButonu;

    public GirisSayfa(){
        kullanıcıAdı = new JTextField();
        kullanıcıAdı.setPreferredSize(new Dimension(200,50));

        şifre = new JTextField();
        şifre.setPreferredSize(new Dimension(200,50));

        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JLabel kullanıcıLabel = new JLabel("Kullanıcı Adı:");
        kullanıcıLabel.setFont(new Font(null,Font.PLAIN,25));

        panel.add(kullanıcıLabel);
        panel.add(kullanıcıAdı);

        JLabel sifreLabel = new JLabel("Şifre");
        sifreLabel.setFont(new Font(null,Font.PLAIN,25));

        JPanel panelAlt = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        panelAlt.add(sifreLabel);
        panelAlt.add(şifre);

        girişButonu = new JButton("Giriş");
        girişButonu.setPreferredSize(new Dimension(300,60));
        girişButonu.addActionListener(this);

        frame.add(panel);
        frame.add(panelAlt);
        frame.add(girişButonu);
        frame.setSize(500,400);
        frame.setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==girişButonu){
            String kullaniciAdiText = kullanıcıAdı.getText();
            String sifreText = şifre.getText();

            System.out.println("Kullanıcı Adı:" + kullaniciAdiText);
            System.out.println("Şifre:" + sifreText);
            if (kullaniciAdiText.isEmpty() || sifreText.isEmpty()){
                JOptionPane.showMessageDialog(null, "Kullanıcı veya şifre Boş olamaz", "Hata", JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}