package soal1;

class MahasiswaReguler extends Mahasiswa{
    private String kelas;

    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }
    
    public void infoReguler(){
        infoMahasiswa();
        System.out.println("kelas :" + kelas);
        System.out.println("----------------------");
    }
}

