/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raghavendra_kanoongo
 */
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
//import java.awt.event.WindowAdapter;

public class NewClass extends Frame implements ActionListener {

    private static final long serialVersionUID = 1L;
    Frame fm = new Frame("Calculator");
    static String[] string = {"AC", "+/-", "%", "÷", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "0", ".", "="};
    static Button[] button = new Button[string.length];
    String s1 = "";
    Label label = new Label();
    double num1 = 0, num2 = 0, Ans = 0;
    char check;


    NewClass() {
        // Font font = new Font();
        

        Panel panel = new Panel();
      //  panel.setBackground(Color.GRAY);

        fm.setSize(364, 400);
        fm.setVisible(true);

        panel.setSize(364, 400);
        panel.setVisible(true);
        
        label.setBounds(3, 30, 358, 80);
        label.setBackground(Color.white);
        label.setFont(new Font("Arial", Font.PLAIN, 30));


        panel.add(label);
        fm.add(panel);

        int a = 2;
        int count = 0;
        int j = 115;
        for (int i = 0; i < string.length; i++) {
           
            count++;
            button[i] = new Button(string[i]);
            button[i].addActionListener(this);
            button[i].setFont(new Font("Arial", Font.PLAIN, 30));
            // button.setFont(20);
            // button[i].setLabel("one");
            
            button[i].setBounds(a, j, 90, 50);
            a += 90;
            if (count % 4 == 0) {

                j = j + 50;
                a = 2;
            }

//            public void actionPerformed(ActionEvent e){
//                
//                
//            }
            //  button.setFont(new Font("Arial", Font.PLAIN, 40));
            // button[string.length()].addActionListner(this);
           // button[i].setBackground(Color.GRAY);
           // button[i].setForeground(Color.GRAY);

            panel.add(button[i]);
        }

//        Button b = new Button("Click Me");
//        b.setBackground(Color.yellow);
//        b.setForeground(Color.red); 
//        b.setBounds(100, 100, 90, 50);
//        fm.add(b);
//        
//        @Override
//
//        public void actionPerformed
//        (ActionEvent ae
//        
//            )   {
//            System.out.println("clicked");
//        }

        fm.setLayout(null);

        fm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                fm.dispose();
            }
        });
    }

    public static void main(String[] args)  {

        new NewClass();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //if ()
        //label.
        //.setBackground(Color.magenta);
        
        String str = e.getActionCommand();
        
        //    if ( !(str.equals("-") || str.equals("+") || str.equals("AC") || 
        //         str.equals("+/-") || str.equals("x") || str.equals("÷") || 
        //         str.equals("%") || str.equals("=")))     
        //     {                
            
        //         label.setText(label.getText()+str);
        //     }
                
        if (str.equals("+")) {
            check = '+';
            num1 = Double.parseDouble(label.getText());
            label.setText("");
        }

        else if (str.equals("-")) {
            check = '-';
            num1 = Double.parseDouble(label.getText());
            label.setText("");
        }

        else if (str.equals("x")) {
            check = 'x';
            num1 = Double.parseDouble(label.getText());
            label.setText("");
        }

        else if (str.equals("÷")) {
            check = '÷';
            num1 = Double.parseDouble(label.getText());
            label.setText("");
        }

        else if (str.equals("+/-")) {
            num1 = -(Double.parseDouble(label.getText()));
            label.setText(num1 + "");
        }

        else if (str.equals("%")) {
            num1 = Double.parseDouble(label.getText());
            num1 = num1 / 100;
            label.setText(num1 + "");
        }

        else if (str.equals("=")) {

            num2 = Double.parseDouble(label.getText());

            switch (check) {

            case '+':
                Ans = num1 + num2;
                break;
            case '-':
                Ans = num1 - num2;
                break;
            case 'x':
                Ans = num1 * num2;
                break;
            case '÷':
                Ans = num1 / num2;
                break;
            }
            label.setText(Ans + "");
            Ans = 0;
        } 
        else if (str.equals("AC")) {

            label.setText("");
            num1 = num2 = Ans = 0;
        } 
        else {
            label.setText(label.getText() + str);
        }           
    }
}