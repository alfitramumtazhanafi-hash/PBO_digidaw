import java.util.List;
import java.util.ArrayList;

public class Member {
    private String nama;
    private String idMember;
    private List<Buku> daftarPinjaman;
    
    public Member(String nama, String idMember){
        this.nama = nama;
        this.idMember = idMember;
        this.daftarPinjaman = new ArrayList<>();
    }
     
    public String getNama(){
        return nama;
    }

    public String getIdMember(){
        return idMember;
    }

    public void pinjamBuku(Buku bk){
        if(bk.isTersedia()){
            daftarPinjaman.add(bk);
            bk.pinjam(this);
            System.out.println(nama + " berhasil meminjam " + bk.getJudul());
        } else {
            System.out.println(nama + " gagal meminjam " + bk.getJudul() + " (buku sedang dipinjam)");
        }
    }
}
