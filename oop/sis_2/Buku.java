public class Buku {
    // Atribut
    private String penulis;
    private String judul;
    private double harga;
    private int nomorPenerbit;

    // Konstruktor
    public Buku(String penulis, String judul, double harga, int nomorPenerbit) {
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.nomorPenerbit = nomorPenerbit;
    }

    // Getter untuk mendapatkan harga buku
    public double getHarga() {
        return harga;
    }
}
