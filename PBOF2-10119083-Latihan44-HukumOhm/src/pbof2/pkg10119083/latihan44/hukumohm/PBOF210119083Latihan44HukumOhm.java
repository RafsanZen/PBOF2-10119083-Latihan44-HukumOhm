/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbof2.pkg10119083.latihan44.hukumohm;

/**
 *
 * @Nama     : Rafsan Zen Mustaofa
 * NIM       : 10119083
 * Kelas     : IF2
 * Deskripsi : Menampilkan program ukum Om
 */
public class PBOF210119083Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai baterai = new Baterai();
        baterai.Baterai();
        baterai.Baterai(3,12);
        
        System.out.printf("Kuat Arus : %.1f ampere\n",baterai.getKuatArus());
        System.out.printf("Hambatan : %.1f ohm \n",baterai.getHambatan());
        System.out.printf("Hasil Tegangan : %.1f volt\n",baterai.hitungTegangan());
        
        System.out.println("==========================================");
        System.out.println("Developed by : Rafsan Zen Mustaofa");
    }
    
}
