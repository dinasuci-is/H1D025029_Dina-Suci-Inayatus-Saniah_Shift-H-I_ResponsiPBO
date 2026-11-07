public class Mobil extends Kendaraan implements Diperiksa, Dibayar {

    private int jumlahPintu;

    public Mobil(String platNomor, String merk, int jumlahPintu) {
        super(platNomor, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public Mobil(String platNomor, String merk, int kondisi, int jumlahPintu) {
        super(platNomor, merk, kondisi);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() { return jumlahPintu; }
    public void setJumlahPintu(int jumlahPintu) { this.jumlahPintu = jumlahPintu; }

    @Override
    public void servis() {
        if (getKondisi() < 50) {
            System.out.println("Mobil rusak -> servis besar (+40)");
            setKondisi(getKondisi() + 40);
        } else {
            System.out.println("Mobil masih layak -> servis ringan (+20)");
            setKondisi(getKondisi() + 20);
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Pintu  : " + jumlahPintu);
    }

    @Override
    public String periksa() {
        return "Periksa mobil: oli, rem, AC";
    }

    @Override
    public int hitungBiaya() {
        return BIAYA_DASAR + 100000;
    }
}