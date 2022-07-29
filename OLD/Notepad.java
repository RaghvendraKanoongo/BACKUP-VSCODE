import java.awt.event.*;
import java.awt.*;

public class Notepad extends Frame {

    Notepad()   {

        Frame frame = new Frame("Notepad");
        frame.setSize(600, 700);
        frame.setVisible(true);


        frame.setLayout(new BorderLayout());

        Panel panel = new Panel();


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        
        new Notepad(); 
    } 
}
