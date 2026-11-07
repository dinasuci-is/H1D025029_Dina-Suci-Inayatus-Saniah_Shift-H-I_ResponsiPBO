public abstract class Kendaraan {

    public static final int BIAYA_DASAR = 50000;

    private final String platNomor;

    private String merk;
    private int kondisi; // 0 - 100

    public Kendaraan(String platNomor, String merk) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.kondisi = 70; // kondisi default
    }

    public Kendaraan(String platNomor, String merk, int kondisi) {
        this.platNomor = platNomor;
        this.merk = merk;
        setKondisi(kondisi);
    }

    public String getPlatNomor() { return platNomor; }
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    public int getKondisi() { return kondisi; }

    public void setKondisi(int kondisi) {
        if (kondisi > 100) {
            this.kondisi = 100;
        } else if (kondisi < 0) {
            this.kondisi = 0;
        } else {
            this.kondisi = kondisi;
        }
    }

    public String getStatus() {
        if (kondisi >= 80) {
            return "Baik";
        } else if (kondisi >= 50) {
            return "Perlu perawatan";
        } else {
            return "Rusak";
        }
    }

    public void tampilkanInfo() {
        System.out.println("Plat   : " + platNomor);
        System.out.println("Merk   : " + merk);
        System.out.println("Kondisi: " + kondisi + " (" + getStatus() + ")");
    }

    public abstract void servis();
}