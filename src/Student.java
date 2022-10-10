class Student extends Person {
    private String email;
    public int diemtrungbinh;
    private String masinhvien;


    public Student(String hoTen, int ngaysinh, String gioiTinh, String diachi, String email, int diemtrungbinh, String masinhvien) {
        super(hoTen, ngaysinh, gioiTinh, diachi);
        this.email = email;
        this.diemtrungbinh = diemtrungbinh;
        this.masinhvien = masinhvien;
    }


    @Override
    public String toString() {
        return "Student{" + "email='" + email + '\'' + ", diemtrungbinh=" + diemtrungbinh + ", masinhvien='" + masinhvien
                + '\'' + ", hoTen='" + hoTen + '\'' + ", ngaysinh=" + ngaysinh + ", gioiTinh='" + gioiTinh + '\'' + ", Diachi='" + Diachi + '\'' + '}';
    }

    public boolean checkHB() {
        return this.diemtrungbinh > 8;
    }

    public void thongTinSv() {
        System.out.println("Tên SV là :" + super.getHoTen() + "Address : " + super.getDiachi() +
                + getNgaysinh() + "Giới tính là :" + getGioiTinh() + "Mã sinh viên là:" + masinhvien + "Email or number: "
                + email + "Điểm trung bình là" + diemtrungbinh);
    }
}

