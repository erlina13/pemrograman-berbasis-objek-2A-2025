import java.util.ArrayList;

public class Perpustakaan {
    private final ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanSemuaBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku di perpustakaan.");
        } else {
            for (Buku buku : daftarBuku) {
                buku.tampilkanData();
            }
        }
    }
}

