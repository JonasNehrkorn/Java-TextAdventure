// Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Schule extends JFrame {
  // Anfang Attribute
  
  private JTextField jTextField1 = new JTextField();
  private JButton jButton1 = new JButton();
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private Raum aktuellerRaum;
  // Ende Attribute
  
  public Schule() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1280;
    int frameHeight = 720;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Schule");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jTextField1.setBounds(2, 227, 189, 30);
    cp.add(jTextField1);
    jButton1.setBounds(200, 229, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jTextArea1ScrollPane.setBounds(3, 6, 278, 213);
    cp.add(jTextArea1ScrollPane);
    // Ende Komponenten
    
    setVisible(true);
    
    // Initialisierung der Räume
    Raum flur = new Raum("Sie betreten einen Flur mit drei Türen.");
    this.aktuellerRaum = flur;
    Raum computerraum = new Raum("Sie stehen im Computerraum, ein Rechner läuft.");
    Raum lehrerzimmer = new Raum("Das ist das Lehrerzimmer, alle Fächer sind leer.");
    Raum abstellkammer = new Raum("Das ist eine Abstellkammer, sie ist leer.")
  } // end of public Schule
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Schule();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class Schule

