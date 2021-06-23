import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Karyawan tari = new Karyawan();
        Karyawan aziz = new Karyawan(2, "12", "aziz",
                "pria", new Date(), new Date(), "admin", "gr");
        Karyawan adin = new Karyawan(3, "13", "adin");
        Karyawan nisa = new Karyawan();
        Karyawan ranti = new Karyawan(5, "15", "ranti",
                "wanita", new Date(), new Date(), "sales", "unit");
        Karyawan dian = new Karyawan(6, "16", "dian");
    }
}
