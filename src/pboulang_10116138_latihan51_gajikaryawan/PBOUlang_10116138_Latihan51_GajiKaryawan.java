/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan51_gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Program Menghitung Gaji Karyawan
 */
public class PBOUlang_10116138_Latihan51_GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Program Perhitungan Gaji Karyawan===");
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        Scanner scn5 = new Scanner(System.in);

        Manager manager = new Manager();
        System.out.print("Masukkan NIK = ");
        manager.setNik(scn1.next());
        System.out.print("Masukkan Nama = ");
        manager.setNama(scn2.next());
        System.out.print("Masukkan Golongan (1/2/3) = ");
        manager.setGolongan(scn3.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) = ");
        manager.setJabatan(scn4.next());
        System.out.print("Masukkan Jumlah Kehadiran = ");
        manager.setKehadiran(scn5.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK = " + manager.getNik());
        System.out.println("Nama = " + manager.getNama());
        System.out.println("Golongan = " + manager.getGolongan());
        System.out.println("Jabatan = " + manager.getJabatan());
        System.out.println("");
        System.out.println("Tunjangan Golongan = " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("Tunjangan Jabatan = " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("Tunjangan Kehadiran = " + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("Gaji Total = " + manager.totalGaji());

    }

}
