/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan63.gradiengarislurus;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Gradien Garis Lurus
 */
public class IF110118038Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Koordinat koor = new Koordinat(2,10,5,7);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d) memiliki gradien sebesar %d\n"
                   ,koor.getX1(),koor.getY1(),koor.getX2(),koor.getY2(),koor.hitungGradien());
    
      
      Koordinat koor1 = new Koordinat(5,1,3,12);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d) memiliki gradien sebesar %d\n"
                   ,koor1.getX1(),koor1.getY1(),koor1.getX2(),koor1.getY2(),koor1.hitungGradien());
       
    }
         
}
