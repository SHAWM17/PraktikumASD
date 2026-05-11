package Pertemuan12;

import java.util.Scanner;
public class SLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList25 sll = new SingleLinkedList25();
        // System.out.print("Masukkan jumlah data: ");
        // int jumlah = sc.nextInt();
        Mahasiswa25 mhs1 = new Mahasiswa25("221", "Alvaro", "ti1d", 3.8);
        Mahasiswa25 mhs2 = new Mahasiswa25("222", "Bimon", "ti1d", 3.9);
        Mahasiswa25 mhs3 = new Mahasiswa25("223", "Cintia", "ti1d", 3.7);
        Mahasiswa25 mhs4 = new Mahasiswa25("224", "Dirga", "ti1d", 4.0);
        // for (int i = 0; i < jumlah; i++){
        //     sc.nextLine();
        //     System.out.println("Data Mahasiswa ke-"+(i+1));
        //     System.out.print("Masukkan NIM: ");
        //     String nim = sc.nextLine();
        //     System.out.print("Masukkan Nama: ");
        //     String nama = sc.nextLine();
        //     System.out.print("Masukkan Kelas: ");
        //     String kelas = sc.nextLine();
        //     System.out.print("Masukkan IPK: ");
        //     double ipk = sc.nextDouble();
        //     mhs[i] = new Mahasiswa25(nim, nama, kelas, ipk);

        //     sll.addLast(mhs[i]);
        //     System.out.println();
        // }
        // sll.print();

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        sc.close();
    }
}
