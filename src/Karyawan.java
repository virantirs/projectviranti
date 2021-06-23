import java.util.Date;

public class Karyawan {
    private int id;
    private String nik;
    private String namaLengkap;
    private String jenisKelamin;
    private Date tanggalLahir;
    private Date tanggaldiangkat;
    private String jabatan;
    private String divisi;

    public void pelatihan(){

    }

    public void pengujian(){

    }

    public void penilaian(){

    }

    public void evaluasi(){

    }

    public Karyawan() {
    }

    public Karyawan(int id, String nik, String namaLengkap, String jenisKelamin, Date tanggalLahir, Date tanggaldiangkat, String jabatan, String divisi) {
        this.id = id;
        this.nik = nik;
        this.namaLengkap = namaLengkap;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.tanggaldiangkat = tanggaldiangkat;
        this.jabatan = jabatan;
        this.divisi = divisi;
    }

    public Karyawan(int id, String nik, String namaLengkap) {
        this.id = id;
        this.nik = nik;
        this.namaLengkap = namaLengkap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTanggaldiangkat() {
        return tanggaldiangkat;
    }

    public void setTanggaldiangkat(Date tanggaldiangkat) {
        this.tanggaldiangkat = tanggaldiangkat;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
}
