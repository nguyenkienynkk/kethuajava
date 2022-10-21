package KiemTra;

public class MaPhong {
    private String maPhong ;
    private String truongPhong;

    public MaPhong(String maPhong, String truongPhong) {
        this.maPhong = maPhong;
        this.truongPhong = truongPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(String truongPhong) {
        this.truongPhong = truongPhong;
    }
}
