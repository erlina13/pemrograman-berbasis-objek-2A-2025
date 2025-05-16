package soal2;

class  buku{
    protected String judul;
    protected String penulis;
    
    public buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    
    public void info(){
        System.out.println("Judul :"+ judul);
        System.out.println("Penulis :"+  penulis);
    }
}