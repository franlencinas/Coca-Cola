package cocacolagit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bienvenida extends JFrame implements ActionListener{
    private JTextField nombreusuario;
    private JLabel titulo, subtitulo, pie,label1;
    private JButton entrada;
    
    Bienvenida(){
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        //Icono
        try{
          Image img = ImageIO.read(new File("icon.png"));
          this.setIconImage(img);
        }catch (Exception e){
        
            System.out.println(e);
        }
        ImageIcon imagen = new ImageIcon("logo-coca.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);
        
       
        
        titulo = new JLabel ("Sistema de Control Vacacional");
        titulo.setBounds(35,135,300,30);
        titulo.setFont(new Font("Arial",3,18));
        titulo.setForeground(new Color(255,255,250));
        add(titulo);
        
        subtitulo = new JLabel("Ingrese su nombre");
        subtitulo.setBounds(45,212,200,30);
        subtitulo.setFont(new Font("Arial",3,12));
        subtitulo.setForeground(new Color(255,255,250));
        add(subtitulo);
        
        pie = new JLabel("©2018 The Coca-Cola Company");
        pie.setBounds(85,400,300,30);
        add(pie);
        
        nombreusuario = new JTextField ();
        nombreusuario.setBounds(50,170,200,30);
        nombreusuario.setForeground(new Color(125,125,125));
        add(nombreusuario);
        nombreusuario.addActionListener(this);
        
        entrada = new JButton("Ingresar");
        entrada.setBounds(100,300,100,30);
        add(entrada);
        nombreusuario.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}

