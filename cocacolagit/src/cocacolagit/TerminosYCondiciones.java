package cocacolagit;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;

public class TerminosYCondiciones extends JFrame implements ActionListener, ChangeListener{

    private JTextArea textarea1;
    private JTextField field1;
    private JLabel label1, label2;
    private JScrollPane scrollpane1;
    private JCheckBox check1;
    private JButton b1, b2;
    
    TerminosYCondiciones(){
        setLayout (null);
        setTitle("Licencia de Uso");
        setBackground(new Color(112,112,112));
        try{
          Image img = ImageIO.read(new File("icon.png"));
          this.setIconImage(img);
        }catch (Exception e){
            System.out.println(e);
        }
        ImageIcon imagen = new ImageIcon("logo-coca.png");
        label1 = new JLabel(imagen);
        label1.setBounds(315,135,300,300);
        add(label1);
        
        label2 = new JLabel("\n\n          Términos y Condiciones");
        label2.setBounds(215,5,200,30);
        label2.setFont(new Font("Andale Mono", 1, 14));
        label2.setForeground(new Color(0,0,0));
        add(label2);
        
        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono",1,14));
        textarea1.setText("Terminos y Condiciones");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 50,400,300);
        add(scrollpane1);
        
        check1 = new JCheckBox("Yo Acepto");
        check1.setBounds(10,250,300,30);
        check1.addActionListener(this);
        add(check1);
        
        b1 = new JButton ("Continuar");
        b1.setBounds(10,290,100,30);
        b1.addActionListener(this);
        b1.setEnabled(false);
        add(b1);
        
        
        b2 = new JButton ("No Acepto");
        b2.setBounds(120,290,100,30);
        b2.addActionListener(this);
        b2.setEnabled(true);
        add(b2);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

    
    public void stateChanged (ChangeEvent e){
        
            }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
