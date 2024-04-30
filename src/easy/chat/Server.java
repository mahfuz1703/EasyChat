/**
    @author mahfuz
**/

package easy.chat;
import javax.swing.*; // for GUI
import java.awt.*; // for set background and others color, styles

public class Server extends JFrame{
    Server(){
        
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        add(p1);
        
        setSize(450, 700);
        setLocation(700, 100);
        getContentPane().setBackground(Color.white);
        
        
        setVisible(true);
    }
    public static void main(String[] args) {
        
        new Server();
    }
}
