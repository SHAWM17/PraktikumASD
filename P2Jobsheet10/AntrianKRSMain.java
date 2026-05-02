package P2Jobsheet10;
import java.util.Scanner;

public class AntrianKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antri = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\n--- SISTEM ANTRIAN KRS DPA ---");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil 2 Mahasiswa (Proses KRS)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Cek Statistik & Sisa Kuota DPA");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    antri.enqueue(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 2: antri.panggilAntrian(); break;
                case 3: antri.tampilkanSemua(); break;
                case 4: antri.tampilkan2Terdepan(); break;
                case 5: antri.lihatAkhir(); break;
                case 6: antri.stats(); break;
                case 7: antri.clear(); break;
            }
        } while (pilih != 0);
        sc.close();
    }
}