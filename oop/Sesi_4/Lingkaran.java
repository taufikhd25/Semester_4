public class Lingkaran extends BangunDatar{
    protected double r;
    protected double phi = 3.14;

    public Lingkaran(double r, String name){
        super.setNama(name);
        this.r = r;
        
        hitungLuas(phi);
        hitungKeliling(phi);
    }    

    @Override
    public void getInfo() {
        System.out.println("Jenis: Lingakaran");
        super.getInfo();
    }
    
    public void hitungLuas() {
        super.luas = Math.round(Math.PI * 100.0) / 100.0 * this.r * this.r;
    }

    public void hitungLuas(double pi) {
        super.luas = Math.round(pi * 100.0) / 100.0 * this.r * this.r;
    }

    public void hitungKeliling() {
        super.keliling = 2 * Math.round(Math.PI * 100.0) / 100.0 * this.r;
    }

    public void hitungKeliling(double pi) {
        super.keliling = 2 * Math.round(pi * 100.0) / 100.0 * this.r;
    }
}