package soal1;

class MahasiswaBeasiswa extends Mahasiswa{
    private String jenisBeasiswa;
    
    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa){
        super(nama,nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }
    
    public void infoBeasiswa(){
        infoMahasiswa();
        System.out.println("Jenis Beasiswa :" + jenisBeasiswa);
        System.out.println("----------------------");
    }
}

