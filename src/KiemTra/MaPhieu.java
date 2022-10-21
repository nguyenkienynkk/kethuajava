package KiemTra;

public class MaPhieu {
    private String maPhieu ;
    private String ngayKiemke;
    public MaPhieu (String maPhieu,String ngayKiemke){
        this.maPhieu = maPhieu;
        this.ngayKiemke = ngayKiemke;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getNgayKiemke() {
        return ngayKiemke;
    }

    public void setNgayKiemke(String ngayKiemke) {
        this.ngayKiemke = ngayKiemke;
    }
}
