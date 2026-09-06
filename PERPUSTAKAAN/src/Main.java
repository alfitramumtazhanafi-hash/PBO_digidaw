public class Main {
    public static void main(String[] args){
        GenreBuku fiksi = new GenreBuku("Fiksi");
        GenreBuku sains = new GenreBuku("Sains");
        GenreBuku teknologi = new GenreBuku("Teknologi");

        Buku novel = new Buku("Laskar Pelangi", "Andrea Hirata", fiksi);
        Buku sainsBuku = new Buku("Sapiens", "Yuval Noah Harari", sains);
        Buku java = new Buku("Pemograman Java", "Abdul Kadir", teknologi);
        Buku py = new Buku("Dasar Pemograman Python", "Abdul Kadir", teknologi);

        Member Alfi = new Member("Alfi", "M001");
        Member yasmin = new Member("Yasmin", "M002");
        Member ryan = new Member("Ryan", "M003");
        Member hilan = new Member("Hilan", "M004");
        Member novia = new Member("Novia", "M005");

        Alfi.pinjamBuku(novel);
        yasmin.pinjamBuku(sainsBuku);
        ryan.pinjamBuku(java);
        hilan.pinjamBuku(java);
        novia.pinjamBuku(py);

        novel.tampilkanInfo();
        sainsBuku.tampilkanInfo();
        java.tampilkanInfo();
        py.tampilkanInfo();

    }
}
