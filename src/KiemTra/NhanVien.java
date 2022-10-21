package KiemTra;

import java.util.Date;

public class NhanVien {
    private String nhanVien;
    protected Date chucVu;
    public NhanVien (String nhanVien,Date chucVu){
        this.chucVu = chucVu;
        this.nhanVien = nhanVien;
    }

    public String getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(String nhanVien) {
        this.nhanVien = nhanVien;
    }

    public Date getChucVu() {
        return chucVu;
    }

    public void setChucVu(Date chucVu) {
        this.chucVu = chucVu;
    }
}
