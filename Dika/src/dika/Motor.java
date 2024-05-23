package dika;

public class Motor {
    private String namaPenyewa;
    private String merk;
    private int tahun;
    private int hargaSewaPerHari;

    public Motor(String namaPenyewa, String merk, int tahun, int hargaSewaPerHari) {
        this.namaPenyewa = namaPenyewa;
        this.merk = merk;
        this.tahun = tahun;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    public void setHargaSewaPerHari(int hargaSewaPerHari) {
        this.hargaSewaPerHari = hargaSewaPerHari;
    }
}
