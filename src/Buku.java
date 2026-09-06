public class Buku {
    private String judul;
    private String pengarang;
    private GenreBuku genre;
    private boolean tersedia;

    public Buku(String judul, String pengarang, GenreBuku genre){
        this.judul = judul;
        this.pengarang = pengarang;
        this.genre = genre;
        this.tersedia = true;
    }

    public String getJudul(){
        return judul;
    }

    public String getPengarang(){
        return pengarang;
    }

    public GenreBuku getGenre(){
        return genre;
    }

    public boolean isTersedia(){
        return tersedia;
    }


    private Member peminjam;

    public void pinjam(Member m){
        this.tersedia = false;
        this.peminjam = m;
    }

    public void kembalikan(){
        this.tersedia = true;
        this.peminjam = null;
    }

    public Member getPeminjam(){
        return peminjam;
    }

    public void tampilkanInfo(){
        System.out.println("================================");
        System.out.println("Judul           : " + judul);
        System.out.println("Pengarang       : " + pengarang);
        System.out.println("Genre           : " + genre.getNamaGenre());
        System.out.println("Tersedia        : " + tersedia);
        if (peminjam == null){
            System.out.println("Buku sedang tidak dipinjam"); // print bahwa buku sedang tidak dipinjam
        } else {
            System.out.println("Nama peminjam   : " + peminjam.getNama()); //print nama peminjam 
        }
        
    }

}
