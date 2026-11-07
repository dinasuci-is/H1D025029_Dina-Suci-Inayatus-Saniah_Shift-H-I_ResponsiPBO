public class Motor extends Kendaraan implements Diperiksa {

    private int cc;

    public Motor(String platNomor, String merk, int cc) {
        super(platNomor, merk);
        this.cc = cc;
    }

    public int getCc() { return cc; }
    public void setCc(int cc) { this.cc = cc; }

    @Override
    public void servis() {
        if (getKondisi() < 50) {
            System.out.println("Motor rusak -> ganti sparepart (+30)");
            setKondisi(getKondisi() + 30);
        } else {
            System.out.println("Motor masih layak -> ganti oli (+10)");
            setKondisi(getKondisi() + 10);
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("CC     : " + cc);
    }

    @Override
    public String periksa() {
        return "Periksa motor: rantai, busi, oli";
    }
}