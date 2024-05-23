package dika;

import java.util.Scanner;

public class Aplikasi {
    private Rental rental;

    public Aplikasi() {
        rental = new Rental(10);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Menu Aplikasi:");
            System.out.println("1. Tambah Motor");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("0. Keluar");

            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahMotor(scanner);
                    break;
                case 2:
                    rental.tampilkanData();
                    break;
                case 3:
                    ubahData(scanner);
                    break;
                case 4:
                    hapusData(scanner);
                    break;
                case 0:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void tambahMotor(Scanner scanner) {
        scanner.nextLine(); // consume newline
        System.out.print("Masukkan Nama Penyewa: ");
        String namaPenyewa = scanner.nextLine();
        System.out.print("Masukkan Merk: ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan Tahun: ");
        int tahun = scanner.nextInt();
        System.out.print("Masukkan Harga Sewa Per Hari: ");
        int harga = scanner.nextInt();

        rental.tambahMotor(new Motor(namaPenyewa, merk, tahun, harga));
        System.out.println("Motor berhasil ditambahkan.");
    }

    private void ubahData(Scanner scanner) {
        System.out.print("Masukkan indeks data yang ingin diubah: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < rental.jumlahMotor) {
            System.out.println("Data saat ini:");
            System.out.println("Nama Penyewa: " + rental.motorList[index].getNamaPenyewa());
            System.out.println("Merk: " + rental.motorList[index].getMerk());
            System.out.println("Tahun: " + rental.motorList[index].getTahun());
            System.out.println("Harga Sewa Per Hari: " + rental.motorList[index].getHargaSewaPerHari());
            scanner.nextLine(); // consume newline
            System.out.print("Masukkan Merk baru: ");
            String merkBaru = scanner.nextLine();
            System.out.print("Masukkan Tahun baru: ");
            int tahunBaru = scanner.nextInt();
            System.out.print("Masukkan Harga Sewa Per Hari baru: ");
            int hargaBaru = scanner.nextInt();

            rental.ubahData(index, new Motor(rental.motorList[index].getNamaPenyewa(), merkBaru, tahunBaru, hargaBaru));
            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    private void hapusData(Scanner scanner) {
        System.out.print("Masukkan indeks data yang ingin dihapus: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < rental.jumlahMotor) {
            rental.hapusData(index);
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public static void main(String[] args) {
        Aplikasi aplikasi = new Aplikasi();
        aplikasi.menu();
    }
}
