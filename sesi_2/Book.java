class Buku {
    String author;
    String title;
    int price;
    int publisher_number;
    int total_price;

    public Buku(String author, String title, int price, int publisher_number){
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher_number = publisher_number;
    }

    public int bayarBuku(int numberOfBooks){
        this.total_price = numberOfBooks * price;
        System.out.println("Membeli Buku " + title + " Sebanyak " + numberOfBooks);
        return total_price;
    }
}
