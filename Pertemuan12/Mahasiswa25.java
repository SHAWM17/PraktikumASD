package Pertemuan12;

public class Mahasiswa25 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    Mahasiswa25(){
    }
    Mahasiswa25 (String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    void tampilInformasi(){
        System.out.printf("%-10s" + "%-10s" + "%-10s" + "%.2f%n", nim, nama, kelas, ipk);
    }
}
