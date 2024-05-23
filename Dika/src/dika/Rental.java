package dika;

public class Rental {
    Motor[] motorList;
    int jumlahMotor;

    public Rental(int maxSize) {
        motorList = new Motor[maxSize];
        jumlahMotor = 0;
    }

    public void tambahMotor(Motor motor) {
        if (jumlahMotor < motorList.length) {
            motorList[jumlahMotor++] = motor;
        } else {
            System.out.println("Kapasitas penyimpanan sudah penuh.");
        }
    }

    public void tampilkanData() {
        if (jumlahMotor == 0) {
            System.out.println("Tidak ada data yang tersimpan.");
        } else {
            for (int i = 0; i < jumlahMotor; i++) {
                System.out.println("Motor ke-" + (i + 1));
                System.out.println("Nama Penyewa: " + motorList[i].getNamaPenyewa());
                System.out.println("Merk: " + motorList[i].getMerk());
                System.out.println("Tahun: " + motorList[i].getTahun());
                System.out.println("Harga Sewa Per Hari: " + motorList[i].getHargaSewaPerHari());
                System.out.println();
            }
        }
    }

    public void ubahData(int index, Motor motorBaru) {
        if (index >= 0 && index < jumlahMotor) {
            motorList[index] = motorBaru;
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public void hapusData(int index) {
        if (index >= 0 && index < jumlahMotor) {
            for (int i = index; i < jumlahMotor - 1; i++) {
                motorList[i] = motorList[i + 1];
            }
            motorList[jumlahMotor - 1] = null;
            jumlahMotor--;
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }
}
