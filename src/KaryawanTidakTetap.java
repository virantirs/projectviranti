public class KaryawanTidakTetap extends Karyawan{

    public String nik;
    public String nomorKontrak;
    public int durasiKontrak;

    public void menandatanganiKontrak(){

    }

    public void mengajukanPerpanjangan(){

    }

    @Override
    public String getNik() {
        return nik;
    }

    @Override
    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNomorKontrak() {
        return nomorKontrak;
    }

    public void setNomorKontrak(String nomorKontrak) {
        this.nomorKontrak = nomorKontrak;
    }

    public int getDurasiKontrak() {
        return durasiKontrak;
    }

    public void setDurasiKontrak(int durasiKontrak) {
        this.durasiKontrak = durasiKontrak;
    }

    @Override
    public void pelatihan() {
        super.pelatihan();
    }

    @Override
    public void evaluasi() {
        super.evaluasi();
    }
}
