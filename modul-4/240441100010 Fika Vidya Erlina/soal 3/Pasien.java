public class Pasien {
    private final String nama;
    private final int umur;
    private final String keluhan;

    public Pasien(String nama, int umur, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Keluhan: " + keluhan);
        System.out.println("---------------------------");
    }
}
