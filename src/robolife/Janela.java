package robolife;

import javax.swing.JFrame;

/**
 *
 * @author D1350
 */
public class Janela {
    
    public static void main(String args[]){
        
        JFrame janela = new JFrame("Robo Life");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(1280, 720);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        
        janela.setVisible(true);
        
        
    }
    
    
    
}
