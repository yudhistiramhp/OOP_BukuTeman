/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan401;

/**
 *
 * @author Yudhistira (2201010192)
 * TGL: 2024-04-23
 */
public class Latihan401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BukuTeman BTeman = new BukuTeman();
        String ulang="Iya";
        do{
            System.out.println("======================");
            System.out.println("");
            System.out.println("A. Lihat Data");
            System.out.println("B. Tambah Data");
            System.out.println("C. Edit Data");
            System.out.println("D. Hapus Data");
            System.out.println("E. Kembali");
            System.out.println("Pilih Opsi (A/B/C/D/E)");
            String MenuPilihan = BTeman.dtIN.nextLine();
            switch (MenuPilihan) {
                case "A":
                    BTeman.Viewdata();
                    break;
                case "B":
                    BTeman.Storedata();
                    break;
                case "C":
                    BTeman.Update(0);
                    break;
                case "D":
                    BTeman.Destroy(0);
                    break;
                case "E":
                    ulang = "Tidak";
                    break;
                default:
                    System.out.println("Ketik A/B/C/D/E");
                    break;
            }
        }while(ulang.equals("Iya"));
    }
}
