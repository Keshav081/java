import java.util.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Guesscolour extends JFrame {

    private static final long serialVersionUID = 1L;

    Font font = new Font("Times New Roman", Font.BOLD, 30);
    
    static Random rand = new Random();
    
    static int randRed = (rand.nextInt(17)+1)*15; //randomized red green and blue values, multiples of 15
    static int randGrn = (rand.nextInt(17)+1)*15;
    static int randBlu = (rand.nextInt(17)+1)*15;
    
    static int userRed = 0;
    static int userGrn = 0;
    static int userBlu = 0;
    
    Color randColor = new Color(randRed, randGrn, randBlu);
    static Color userColor = new Color(userRed, userGrn, userBlu);
    
    Dimension d = new Dimension(500, 500); //color panel size
    Dimension b = new Dimension(50,50); //button size

    public Guesscolour() {
        initGUI();
        System.out.println("SOLUTION: " + randRed + " " + randGrn + " " + randBlu); // This is just to show what the RGB values are so you can easily solve
        setTitle("Match the color!");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void initGUI() {  //sets up the frame and functionality of UI
        JLabel title = new JLabel("Match The Color!", JLabel.CENTER);
        title.setFont(font);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setOpaque(true);
        add(title, BorderLayout.NORTH);
        
        JPanel center = new JPanel();
        center.setBackground(Color.CYAN);
        add(center, BorderLayout.CENTER);
        
        JPanel randPan = new JPanel(); //random color panel
        randPan.setBackground(randColor);
        randPan.setPreferredSize(d);
        center.add(randPan, BorderLayout.EAST);
        
        JPanel userPan = new JPanel(); //adjustable color panel
        userPan.setBackground(userColor);
        userPan.setPreferredSize(d);
        center.add(userPan, BorderLayout.WEST);
        
        
        /**BUTTONS**/
        
        JPanel butPan = new JPanel();
        add(butPan, BorderLayout.SOUTH);
        
        JButton addRed = new JButton("+");
        addRed.setBackground(Color.RED);
        addRed.setPreferredSize(b);
        addRed.setFocusPainted(false);
        addRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                increaseRed();
                userPan.setBackground(userColor);
                repaint();
                check();
            }
        });
        butPan.add(addRed);
        
        
        JButton subRed = new JButton("-");
        subRed.setBackground(Color.RED);
        subRed.setPreferredSize(b);
        subRed.setFocusPainted(false);
        subRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                decreaseRed();
                userPan.setBackground(userColor);
                repaint();
                check();
            }
        });
        butPan.add(subRed);

        
        JButton addGrn = new JButton("+");
        addGrn.setBackground(Color.GREEN);
        addGrn.setPreferredSize(b);
        addGrn.setFocusPainted(false);
        addGrn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                increaseGrn();
                userPan.setBackground(userColor);
                repaint();
                check();
            }
        });
        butPan.add(addGrn);

        
        JButton subGrn = new JButton("-");
        subGrn.setBackground(Color.GREEN);
        subGrn.setPreferredSize(b);
        subGrn.setFocusPainted(false);
        subGrn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                decreaseGrn();
                userPan.setBackground(userColor);
                repaint();
                check();
            }
        });
        butPan.add(subGrn);


        JButton addBlu = new JButton("+");
        addBlu.setBackground(Color.BLUE);
        addBlu.setPreferredSize(b);
        addBlu.setFocusPainted(false);
        addBlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                increaseBlu();
                userPan.setBackground(userColor);
                repaint();
                check();
            }
        });
        butPan.add(addBlu);

        
        JButton subBlu = new JButton("-");
        subBlu.setBackground(Color.BLUE);
        subBlu.setPreferredSize(b);
        subBlu.setFocusPainted(false);
        subBlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                decreaseBlu();
                userPan.setBackground(userColor);
                repaint();
                check();
            }
        });
        butPan.add(subBlu); 
    }
    

    //function names say it all...

    private static void increaseRed() {
        if (userRed < 255) {
            userRed += 15;  
            userColor = new Color(userRed, userGrn, userBlu);
        }
    }
    
    private static void increaseGrn() {
        if (userGrn < 255) {
            userGrn += 15;  
            userColor = new Color(userRed, userGrn, userBlu);
        }
    }
    
    private static void increaseBlu() {
        if (userBlu < 255) {
            userBlu += 15;  
            userColor = new Color(userRed, userGrn, userBlu);
        }
    }
    
    private static void decreaseRed() {
        if (userRed > 0) {
            userRed -= 15;
            userColor = new Color(userRed, userGrn, userBlu);
        }
    }
    
    private static void decreaseGrn() {
        if (userGrn > 0) {
            userGrn -= 15;
            userColor = new Color(userRed, userGrn, userBlu);
        }
    }
    
    private static void decreaseBlu() {
        if (userBlu > 0) {
            userBlu -= 15;
            userColor = new Color(userRed, userGrn, userBlu);
        }
    }
    

    //checks if the color panels are the same and displays winning message if they are

    private static void check() {
        if (userRed == randRed && userGrn == randGrn && userBlu == randBlu) {
            int choose = JOptionPane.showConfirmDialog(null, "You win! Play again?");
            if(choose == JOptionPane.YES_OPTION) {
                reset();
            } else if(choose == JOptionPane.NO_OPTION) {
                System.exit(0);
            }           
        }   
    }
    
    //resets game for when user wins and wants to play again
    private static void reset() {
        randRed = (rand.nextInt(17)+1)*15;
        randGrn = (rand.nextInt(17)+1)*15;
        randBlu = (rand.nextInt(17)+1)*15;
        userRed = 0;
        userGrn = 0;
        userBlu = 0;
        userColor = new Color(userRed, userGrn, userBlu);
        
        new Guesscolour();
    }

    //main method
    public static void main(String[] args) {
        try {
            String laf = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(laf);
        } 
        catch (Exception e) {}

        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new Guesscolour();
            }
        });
    }
}
