
package uts.oop.c.pkg2301010317;

import java.util.Scanner;

/**
 *
 * @author Rambu Intan
 * TGL 10 Mei 2025
 */
class UTSOOPC2301010317s {
    static Mahasiswa[] data = new Mahasiswa[100];
    static int jumlahData = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== MENU APLIKASI MAHASISWA ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1: tambahData(); break;
                case 2: tampilkanData(); break;
                case 3: ubahData(); break;
                case 4: hapusData(); break;
            }
        } while (pilihan != 5);
    }

    static void tambahData() {
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();
        data[jumlahData] = new Mahasiswa(nim, nama, jurusan);
        jumlahData++;
        System.out.println("Data berhasil ditambahkan.");
    }

    static void tampilkanData() {
        for (int i = 0; i < jumlahData; i++) {
            System.out.print((i + 1) + ". ");
            data[i].displayInfo();
        }
    }

    static void ubahData() {
        tampilkanData();
        System.out.print("Pilih data yang ingin diubah (nomor): ");
        int index = input.nextInt() - 1;
        input.nextLine();
        if (index >= 0 && index < jumlahData) {
            System.out.print("Nama baru: ");
            data[index].setNama(input.nextLine());
            System.out.print("Jurusan baru: ");
            data[index].setJurusan(input.nextLine());
            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static void hapusData() {
        tampilkanData();
        System.out.print("Pilih data yang ingin dihapus (nomor): ");
        int index = input.nextInt() - 1;
        input.nextLine();
        if (index >= 0 && index < jumlahData) {
            for (int i = index; i < jumlahData - 1; i++) {
                data[i] = data[i + 1];
            }
            data[jumlahData - 1] = null;
            jumlahData--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
}
    

