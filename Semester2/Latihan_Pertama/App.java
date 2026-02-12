package Latihan_Pertama;

class BidangDuaDimensi {
    private String nama;

    public BidangDuaDimensi(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void info() {
        System.out.println("Nama: " + nama);
    }

    public double luas() {
        return 0; 
    }
}

class BujurSangkar extends BidangDuaDimensi {
    private double sisi;

    public BujurSangkar(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}

class Lingkaran extends BidangDuaDimensi {
    private double radius;

    public Lingkaran(String nama, double radius) {
        super(nama);
        this.radius = radius;
    }

    @Override
    public double luas() {
        return Math.PI * radius * radius;
    }
}

public class App {
    public static void main(String[] args) {

        BujurSangkar bujur = new BujurSangkar("Bujur Sangkar", 4);
        Lingkaran lingkaran = new Lingkaran("Lingkaran", 3);

        bujur.info();
        System.out.println("Luas: " + bujur.luas());
        System.out.println();

        lingkaran.info();
        System.out.printf("Luas: %.2f " , lingkaran.luas());
    }
}