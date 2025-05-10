package uts.oop.c.pkg2301010317;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;

    public Mahasiswa() {}

    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // Overloading constructor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = "Belum Diisi";
    }

    public void displayInfo() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Jurusan: " + jurusan);
    }

    // Getter dan Setter
    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getJurusan() { return jurusan; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }
}
