import java.util.ArrayList;

public class Bank {
    private final ArrayList<RekeningBank> daftarRekening = new ArrayList<>();

    public void tambahRekening(RekeningBank rek) {
        daftarRekening.add(rek);
    }

    public RekeningBank cariRekening(String noRek) {
        for (RekeningBank rek : daftarRekening) {
            if (rek.getNoRek().equals(noRek)) {
                return rek;
            }
        }
        return null;
    }

    public void tampilkanSemuaRekening() {
        for (RekeningBank rek : daftarRekening) {
            rek.tampilkanData();
        }
    }
}
