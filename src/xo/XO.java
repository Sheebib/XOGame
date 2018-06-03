package xo;

import javax.swing.JFrame;


public class XO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JFrame XO = new XOGame();
        XO.setTitle("Tic-tac-toe game"); 
        XO.setSize(342, 377); 
        XO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        XO.setLocationRelativeTo(null); 
        XO.setVisible(true); 
    }
    
}
