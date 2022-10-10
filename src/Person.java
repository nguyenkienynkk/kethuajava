public class Person {
    protected String hoTen ;
    public int ngaysinh;
    public String gioiTinh ;
    protected String Diachi;

    public Person(String hoTen, int ngaysinh, String gioiTinh, String diachi) {
        this.gioiTinh = gioiTinh;
        this.hoTen = hoTen;
        this.ngaysinh = ngaysinh;
        this.Diachi = diachi;

    }

    public Person() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(int ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
}
