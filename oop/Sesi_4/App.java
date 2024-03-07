/**
 * App.java: Main Class
 */
public class App {

    public static void main(String[] args) {

        Lingkaran lingkaranA = new Lingkaran(7, "Lingakaran A");
        lingkaranA.getInfo();

        System.out.println("\t");

        Persegi persegiA = new Persegi("Persegi A", 5);
        persegiA.getInfo();
        
        System.out.println("\t");

        SegitigaSamaKaki segitigaSamaKakiA = new SegitigaSamaKaki("Segitiga Sama Kaki A", 5, 8);
        segitigaSamaKakiA.getInfo();

        System.out.println("\t");

        SegitigaSamaSisi segitigaSamaSisiA = new SegitigaSamaSisi("Segitiga Sama Sisi A", 5);
        segitigaSamaSisiA.getInfo();

        System.out.println("\t");

        SegitigaSikuSiku segitigaSikuSikuA = new SegitigaSikuSiku("Segitiga Siku Siku A", 10, 5, 8);
        segitigaSikuSikuA.getInfo();

        System.out.println("\t");

        SegitigaSembarang segitigaSembarangA = new SegitigaSembarang("Segitiga Sembarang A", 5, 9, 6);
        segitigaSembarangA.getInfo();
    }
}