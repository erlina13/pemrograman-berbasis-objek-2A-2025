import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Bank bank = new Bank();
            int pilihan;
            
            do {
                System.out.println("\n=== MENU BANK ===");
                System.out.println("1. Tambah Rekening");
                System.out.println("2. Setor Uang");
                System.out.println("3. Tarik Uang");
                System.out.println("4. Tampilkan Semua Rekening");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                pilihan = input.nextInt();
                input.nextLine(); // Buang newline
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("No Rekening: ");
                        String noRek = input.nextLine();
                        System.out.print("Nama Pemilik: ");
                        String nama = input.nextLine();
                        System.out.print("Saldo Awal: ");
                        double saldo = input.nextDouble();
                        bank.tambahRekening(new RekeningBank(noRek, nama, saldo));
                    }
                    case 2 -> {
                        System.out.print("No Rekening: ");
                        String noRek = input.nextLine();
                        RekeningBank rekSetor = bank.cariRekening(noRek);
                        if (rekSetor != null) {
                            System.out.print("Jumlah Setor: ");
                            rekSetor.setor(input.nextDouble());
                        } else {
                            System.out.println("Rekening tidak ditemukan.");
                        }
                    }
                    case 3 -> {
                        System.out.print("No Rekening: ");
                        String noRek = input.nextLine();
                        RekeningBank rekTarik = bank.cariRekening(noRek);
                        if (rekTarik != null) {
                            System.out.print("Jumlah Tarik: ");
                            rekTarik.tarik(input.nextDouble());
                        } else {
                            System.out.println("Rekening tidak ditemukan.");
                        }
                    }
                    case 4 -> bank.tampilkanSemuaRekening();
                    case 0 -> System.out.println("Terima kasih!");
                    default -> System.out.println("Pilihan tidak valid.");
                }
                
            } while (pilihan != 0);
        }
    }
}