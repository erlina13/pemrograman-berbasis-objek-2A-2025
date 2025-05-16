package soal1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<MahasiswaReguler> daftarReguler = new ArrayList<>();
        ArrayList<MahasiswaBeasiswa> daftarBeasiswa = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa reguler: ");
        int jumlahReguler = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < jumlahReguler; i++) {
            System.out.println("Data Mahasiswa Reguler ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();

            daftarReguler.add(new MahasiswaReguler(nama, nim, kelas));
        }

        System.out.print("\nMasukkan jumlah mahasiswa beasiswa: ");
        int jumlahBeasiswa = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < jumlahBeasiswa; i++) {
            System.out.println("Data Mahasiswa Beasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Jenis Beasiswa: ");
            String beasiswa = input.nextLine();

            daftarBeasiswa.add(new MahasiswaBeasiswa(nama, nim, beasiswa));
        }

        System.out.println("\n=== DATA MAHASISWA REGULER ===");
        for (MahasiswaReguler m : daftarReguler) {
            m.infoReguler();
        }

        System.out.println("=== DATA MAHASISWA BEASISWA ===");
        for (MahasiswaBeasiswa m : daftarBeasiswa) {
            m.infoBeasiswa();
        }

        input.close();
    }
}