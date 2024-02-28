public class App {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSisi(5);
        square.hitungLuas(); // Hitung luas
        square.hitungKeliling(); // Hitung keliling
        
        double luas = square.getLuas();
        double keliling = square.getKeliling();
        
        System.out.println("Luas Persegi dengan sisi: " + square.getLuas() + " adalah " + luas);
        System.out.println("Keliling Persegi dengan sisi: " + square.getKeliling() + " adalah " + keliling);

        Buku buku1 = new Buku("titi sunarti", "Lest Go", 200000, 1);
        Buku buku2 = new Buku("titi sunarti", "Well", 200000, 2);
        
        int total_price = buku1.bayarBuku(2) + buku2.bayarBuku(4);
        System.out.println("\nTotal Harga yang harus dibayar RP. " + total_price);
    } 
}
