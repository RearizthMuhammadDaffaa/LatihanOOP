
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Latihan1 {
    public static void main(String[] args) {
        String inputAngkaPertama;
        String inputAngkaKedua;
        int angka1;
        int angka2;
        
        inputAngkaPertama = JOptionPane.showInputDialog("Masukkan Angka Pertama: ");
        angka1 = Integer.valueOf(inputAngkaPertama).intValue();
        inputAngkaKedua = JOptionPane.showInputDialog("Masukkan Angka Kedua: ");
        angka2 = Integer.valueOf(inputAngkaKedua).intValue();
        int sum = angka1 + angka2 ;
      
        JOptionPane.showMessageDialog(null,angka1 + "+" + angka2 +"="+ sum );
        
    }
    
    
}
