import java.util.ArrayList;

public class Klinik {
    private final ArrayList<Pasien> daftarPasien = new ArrayList<>();

    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public void tampilkanSemuaPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien di klinik.");
        } else {
            for (Pasien pasien : daftarPasien) {
                pasien.tampilkanData();
            }
        }
    }
}

