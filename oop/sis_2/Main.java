import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah buku yang akan dibeli
        System.out.print("Masukkan jumlah buku yang akan dibeli: ");
        int jumlahBuku = scanner.nextInt();

        // Membuat array untuk menyimpan buku-buku yang akan dibeli
        Buku[] daftarBuku = new Buku[jumlahBuku];

        // Memasukkan informasi buku-buku yang akan dibeli
        for (int i = 0; i < jumlahBuku; i++) {
            scanner.nextLine(); // Membersihkan newline
            System.out.println("Masukkan informasi untuk buku ke-" + (i + 1));
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Harga: ");
            double harga = scanner.nextDouble();
            System.out.print("Nomor Penerbit: ");
            int nomorPenerbit = scanner.nextInt();

            // Membuat objek buku dan menyimpannya dalam array
            daftarBuku[i] = new Buku(penulis, judul, harga, nomorPenerbit);
        }

        // Menghitung total harga buku yang dibeli
        double totalHarga = 0.0;
        for (int i = 0; i < jumlahBuku; i++) {
            totalHarga += daftarBuku[i].getHarga();
        }

        // Menampilkan total harga
        System.out.println("Total harga semua buku yang dibeli: $" + totalHarga);

        scanner.close();
    }
}
