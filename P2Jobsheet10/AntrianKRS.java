package P2Jobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int totalSudahKRS = 0;
    final int TOTAL_MAHASISWA_DPA = 30; 

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() { return size == 0; }
    public boolean isFull() { return size == max; }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil mendaftar antrian.");
        }
    }

    public void panggilAntrian() {
        if (size >= 2) {
            for (int i = 0; i < 2; i++) {
                Mahasiswa m = data[front];
                System.out.println("Memproses KRS: " + m.nama);
                front = (front + 1) % max;
                size--;
                totalSudahKRS++;
            }
        } else if (size == 1) {
            System.out.println("Hanya ada 1 mahasiswa. Memproses: " + data[front].nama);
            front = (front + 1) % max;
            size--;
            totalSudahKRS++;
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            for (int i = 0; i < size; i++) {
                data[(front + i) % max].tampilkanData();
            }
        }
    }

    public void tampilkan2Terdepan() {
        if (size >= 2) {
            System.out.println("2 Antrian Terdepan:");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        } else if (size == 1) {
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.print("Antrian paling akhir: ");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void stats() {
        System.out.println("Jumlah antrian saat ini: " + size);
        System.out.println("Total sudah proses KRS : " + totalSudahKRS);
        System.out.println("Sisa kuota DPA (Belum KRS): " + (TOTAL_MAHASISWA_DPA - totalSudahKRS));
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
}