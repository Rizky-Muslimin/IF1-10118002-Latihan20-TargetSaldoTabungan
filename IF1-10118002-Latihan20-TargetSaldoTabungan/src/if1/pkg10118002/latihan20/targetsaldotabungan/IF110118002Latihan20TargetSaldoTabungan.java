/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118002.latihan20.targetsaldotabungan;

/**
 * Nama      : Rizky Muslimin
 * Kelas     : IF-1
 * NIM       : 10118002
 * Deskripsi : Target Saldo Tabungan
 */
public class IF110118002Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int saldo = 3500000;
        int i;
        for (i = 1; i< 9 ; i++){
            saldo = (int) (saldo+(saldo*0.08));
            i=i+0;
            System.out.println("saldo di bulan ke-" +i+":"+saldo);
        }
    }
    
}
