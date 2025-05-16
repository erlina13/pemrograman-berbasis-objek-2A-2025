package soal2;

import java.util.Scanner;

public class ManajemenPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        System.out.print("Masukkan jumlah buku fiksi: ");
        int jumlahFiksi = input.nextInt(); input.nextLine();

        for (int i = 0; i < jumlahFiksi; i++) {
            System.out.println("\nBuku Fiksi ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Genre: ");
            String genre = input.nextLine();
            perpustakaan.tambahkanBukuFiksi(new BukuFiksi(judul, penulis, genre));
        }

        System.out.print("\nMasukkan jumlah buku non-fiksi: ");
        int jumlahNonFiksi = input.nextInt(); input.nextLine();

        for (int i = 0; i < jumlahNonFiksi; i++) {
            System.out.println("\nBuku Non-Fiksi ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Topik: ");
            String topik = input.nextLine();
            perpustakaan.tambahkanBukuNonFiksi(new BukuNonFiksi(judul, penulis, topik));
        }

        perpustakaan.tampilkanKoleksi();
        input.close();
    }
}