public class RekeningBank {
    private final String noRek;
    private final String namaPemilik;
    private double saldo;

    public RekeningBank(String noRek, String namaPemilik, double saldoAwal) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }

    public void tampilkanData() {
        System.out.println("No Rek: " + noRek + ", Nama: " + namaPemilik + ", Saldo: " + saldo);
    }
}
