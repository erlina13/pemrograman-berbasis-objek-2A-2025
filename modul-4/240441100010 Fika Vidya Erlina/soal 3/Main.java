import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Klinik klinik = new Klinik();
            int pilihan;
            
            do {
                System.out.println("\n=== MENU KLINIK ===");
                System.out.println("1. Tambah Pasien");
                System.out.println("2. Tampilkan Semua Pasien");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                pilihan = input.nextInt();
                input.nextLine(); // buang newline
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Nama Pasien: ");
                        String nama = input.nextLine();
                        System.out.print("Umur Pasien: ");
                        int umur = input.nextInt();
                        input.nextLine(); // buang newline
                        System.out.print("Keluhan: ");
                        String keluhan = input.nextLine();
                        klinik.tambahPasien(new Pasien(nama, umur, keluhan));
                    }
                    case 2 -> klinik.tampilkanSemuaPasien();
                    case 0 -> System.out.println("Terima kasih!");
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 0);
        }
    }
}