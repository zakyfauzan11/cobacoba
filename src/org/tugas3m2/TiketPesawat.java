package org.tugas3m2;
public class TiketPesawat extends Pemesanan implements org.tugas3m2.Tiket {
    private String nama;
    private String asal;
    private String tujuan;
    private double Tiket;
    private double diskon;

    public TiketPesawat(String nmInfo, String asal, String dst, double Tiket, double disk) {
        this(new info(nmInfo, asal, dst, Tiket, disk));
    }

    public TiketPesawat(info info) {
        this(new info(info.nmInfo(), info.asal(), info.dst(), info.Tiket(), info.disk()));
    }

    public TiketPesawat(info info) {
        this.nama = info.nmInfo();  // Menggunakan nmInfo untuk nm
        this.asal = info.asal();
        this.tujuan = info.dst();
        this.Tiket = info.tiket();
        this.diskon = info.disk();  // Menggunakan parameter disk
    }

    public double hitungBiayaTiket() {
        return Tiket - (Tiket * (diskon / 100));  // Menghitung harga tiket setelah diskon
    }

    public double hitungDiskon() {
        return Tiket * (diskon / 100);  // Menghitung jumlah diskon
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());  // Mengoreksi kata "Jumlaj" menjadi "Jumlah"
    }
}

class MainApp {
    public static void main(String[] args) {
        TiketPesawat tiket = new TiketPesawat("John Doe", "Jakarta", "Bali", 1000000, 10);
        tiket.tampilkanInformasi();
    }
}