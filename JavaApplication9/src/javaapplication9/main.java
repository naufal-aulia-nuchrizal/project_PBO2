/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author ADVAN
 */
import javax.swing.*;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Contoh JFrame dan JPanel");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // PANEL = isi dari frame
        JPanel panel = new JPanel();
        
        // Tambahkan komponen ke panel
        JLabel label = new JLabel("Halo, Naufal!");
        JButton button = new JButton("Klik Saya");

        panel.add(label);
        panel.add(button);

        // Tambahkan panel ke frame
        frame.add(panel);

        // Tampilkan frame
        frame.setVisible(true);
    
    }
    
}
