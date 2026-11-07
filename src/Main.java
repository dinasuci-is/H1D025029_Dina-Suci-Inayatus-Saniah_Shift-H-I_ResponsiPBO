public class Main {
    public static void main(String[] args) {

        System.out.println("=== Bengkel Otomotif Jaya Motor ===");
        System.out.println("Biaya dasar servis: Rp" + Kendaraan.BIAYA_DASAR);

        Mobil avanza = new Mobil("R 1234 AB", "Toyota Avanza", 4);
        Mobil brio = new Mobil("R 5678 CD", "Honda Brio", 30, 4);
        Motor beat = new Motor("R 9999 XY", "Honda Beat", 110);

        System.out.println("\n--- Kendaraan masuk bengkel ---");
        avanza.tampilkanInfo();
        System.out.println();
        brio.tampilkanInfo();
        System.out.println();
        beat.tampilkanInfo();

        System.out.println("\n--- Pemeriksaan kendaraan ---");
        Diperiksa cek1 = avanza;
        Diperiksa cek2 = beat;
        System.out.println(cek1.periksa());
        System.out.println(cek2.periksa());

        System.out.println("\n--- Proses servis ---");
        System.out.println("Kondisi Brio sebelum servis: " + brio.getKondisi());
        brio.servis();
        System.out.println("Kondisi Brio sesudah servis: " + brio.getKondisi() + " (" + brio.getStatus() + ")");
        System.out.println();
        beat.servis();
        System.out.println("Kondisi Beat sesudah servis: " + beat.getKondisi() + " (" + beat.getStatus() + ")");

        System.out.println("\n--- Pembayaran ---");
        Dibayar tagihan = brio;
        System.out.println("Tagihan servis " + brio.getMerk() + " (" + brio.getPlatNomor() + "): Rp" + tagihan.hitungBiaya());
    }
}