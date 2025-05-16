package soal2;

import java.util.ArrayList;

class Perpustakaan {
    private ArrayList<BukuFiksi> koleksiFiksi = new ArrayList<>();
    private ArrayList<BukuNonFiksi> koleksiNonFiksi = new ArrayList<>();
    
    public Perpustakaan() {
        koleksiFiksi = new ArrayList<>();
        koleksiNonFiksi = new ArrayList<>();
    }
    
    public void tambahkanBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
        System.out.println("Buku fiksi \"" + buku.judul + "\" telah ditambahkan.");
    }

    public void tambahkanBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
        System.out.println("Buku non-fiksi \"" + buku.judul + "\" telah ditambahkan.");
    }

    public void tampilkanKoleksi() {
        System.out.println("\n========== KOLEKSI PERPUSTAKAAN ==========");
        
        System.out.println("\n======= DAFTAR BUKU FIKSI =======");
        for (BukuFiksi b: koleksiFiksi) {
            b.infoFiksi();
        }
        System.out.println("\n======= DAFTAR BUKU NON-FIKSI =======");
        for (BukuNonFiksi b: koleksiNonFiksi) {
            b.infoNonFiksi();
        }
        
        System.out.println("\n========== TOTAL KOLEKSI: " + (koleksiFiksi.size() + koleksiNonFiksi.size()) + " BUKU ==========");
    }
}



