/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan401;

import java.util.Scanner;

/**
 *
 * @author Yudhistira (2201010192)
 * TGL: 2024-04-23
 */
public class BukuTeman {
    private int brs = 10;
    private int klm = 3;
    private int raktif = 0;
    private String[][] BT = new String[brs][klm];
    
    Scanner dtIN = new Scanner(System.in);
    
    public void Storedata(){
        int idx=0;
        raktif++;
        if (raktif >= brs){
            System.out.println("Data Sudah Penuh!");
            return;
        }
        if(raktif>0){
            idx = raktif-1;
        }
        System.out.println("");
        System.out.println("Menambahkan Data Teman");
        System.out.println("======================");
        System.out.print("Nama Teman : ");
        BT[idx][0] = dtIN.nextLine();
        
        System.out.print("Alamat : ");
        BT[idx][1] = dtIN.nextLine();
        
        System.out.print("Telepon : ");
        BT[idx][2] = dtIN.nextLine();
    }
    public void Update(int idx){
    if (idx >= 0 && idx < raktif) {
        System.out.println("Mengubah data teman ke-" + (idx));
        System.out.println("======================");
        System.out.print("Nama Teman: ");
        BT[idx][0] = dtIN.nextLine();
        
        System.out.print("Alamat: ");
        BT[idx][1] = dtIN.nextLine();
        
        System.out.print("No Telpon: ");
        BT[idx][2] = dtIN.nextLine();
        System.out.println("Data teman berhasil diubah.");
    } else {
        System.out.println("Index teman tidak valid.");
    }
    }
    public void Destroy(int idx){
    if (idx >= 0 && idx < raktif) {
        for (int i = idx; i < raktif - 1; i++) {
            BT[i] = BT[i + 1];
        }
        raktif--;
        System.out.println("Data teman berhasil dihapus.");
    } else {
        System.out.println("Index teman tidak valid.");
    }
    }
    public void Viewdata(){
        int posbaris = 0;
        System.out.println(" ");
        System.out.println("Daftar Teman");
        System.out.println("======================");
        for (int i=0; i<raktif; i++){
//            System.out.println(posbaris+". "+BT[i][0]+" "+BT[i][1]+" "+BT[i][2]);
            System.out.println("Data ke-"+i);
            System.out.println("Nama : "+BT[i][0]);
            System.out.println("Alamat : "+BT[i][1]);
            System.out.println("Telepon : "+BT[i][2]);
            System.out.println("");
        }
    }

    void Destroy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void Update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
