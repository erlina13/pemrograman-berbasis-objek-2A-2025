import java.util.Scanner;

public class MainPerpustakaan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Perpustakaan perpustakaan = new Perpustakaan();
            int pilihan;
            
            do {
                System.out.println("\n=== MENU PERPUSTAKAAN ===");
                System.out.println("1. Tambah Buku");
                System.out.println("2. Tampilkan Semua Buku");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                pilihan = input.nextInt();
                input.nextLine(); // buang newline
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Judul Buku: ");
                        String judul = input.nextLine();
                        System.out.print("Penulis: ");
                        String penulis = input.nextLine();
                        System.out.print("Jumlah Halaman: ");
                        int halaman = input.nextInt();
                        perpustakaan.tambahBuku(new Buku(judul, penulis, halaman));
                    }
                    case 2 -> perpustakaan.tampilkanSemuaBuku();
                    case 0 -> System.out.println("Terima kasih!");
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 0);
        }
    }
}    
