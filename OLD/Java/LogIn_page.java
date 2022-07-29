//package Java;
import javax.swing.GroupLayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.FlowLayout;

public class LogIn_page {
    

    JFrame frame = new JFrame("LogIn Page");
    JPanel panel = new JPanel(new GridBagLayout());


    LogIn_page(){

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width+100, screenSize.height+100);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        Font bfont =  new Font("Arial", Font.BOLD, 45);
        Font nfont =  new Font("Arial", Font.PLAIN, 30);        


        panel.setBackground(Color.black);
        panel.setLayout(null);
        panel.setSize(screenSize.width+100, screenSize.height+100);
        panel.setLayout(new GridLayout(1,1));  



        JLabel heading = new JLabel("LogIn");
        heading.setFont(bfont);
        heading.setForeground(Color.white);
        heading.setBounds(580, 100, 150, 60);  
        

        JLabel uLabel = new JLabel("Username:", SwingConstants.CENTER);
        JLabel pLabel = new JLabel("Password:");
        uLabel.setForeground(Color.white);
        pLabel.setForeground(Color.white);
        uLabel.setFont(nfont);
        pLabel.setFont(nfont);


        JTextField uField = new JTextField();
        JTextField pField = new JTextField();  
        uField.setForeground(Color.white);
        pField.setBackground(Color.gray);
        pField.setForeground(Color.white);
        uField.setBackground(Color.gray);


        uLabel.setBounds(390, 300, 230, 40);
        pLabel.setBounds(430, 400, 230, 40);
        uField.setBounds(630, 300, 230, 40);
        pField.setBounds(630, 400, 230, 40);


        JButton button1 = new JButton("Sign In");
        JButton button2 = new JButton("Sign Up");
        button1.setBounds(410, 500, 200, 40);
        button2.setBounds(650, 500, 200, 40);


        frame.add(panel);
        panel.add(uLabel);
        panel.add(pLabel);
        panel.add(uField);
        panel.add(pField);
        panel.add(heading);
        panel.add(button1);
        panel.add(button2);
        
    }

    public static void main(String[] args) {
       
        new LogIn_page();
    }

}
