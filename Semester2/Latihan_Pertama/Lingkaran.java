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
