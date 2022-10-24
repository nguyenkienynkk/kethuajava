package QuanLyTro;

import java.util.Scanner;




    public  class phongTro {
        private int soThangTro;
        private String tenPhong;
        private double giaPhong;
        private Nguoi nguoi;
        private String ngayThue;
        private String ngayhetHopDong;

        public phongTro(String ngayThue, String ngayhetHopDong) {
            this.ngayThue = ngayThue;
            this.ngayhetHopDong = ngayhetHopDong;
        }

        public String getNgayThue() {
            return ngayThue;
        }

        public void setNgayThue(String ngayThue) {
            this.ngayThue = ngayThue;
        }

        public String getNgayhetHopDong() {
            return ngayhetHopDong;
        }

        public void setNgayhetHopDong(String ngayhetHopDong) {
            this.ngayhetHopDong = ngayhetHopDong;
        }

        public phongTro() {
            super();
        }

        public phongTro(int soNgayTro, String tenPhong, double giaPhong) {
            super();
            this.soThangTro = soThangTro;
            this.tenPhong = tenPhong;
            this.giaPhong = giaPhong;

        }

        public Nguoi getNguoi() {
            return nguoi;
        }

        public void setNguoi(Nguoi nguoi) {
            this.nguoi = nguoi;
        }

        public void nhapThongTinCanQuanLy() {
            Scanner scanner = new Scanner(System.in);

            nguoi = new Nguoi();
            nguoi.nhapThongTinKhachTro();

            System.out.print("Nhập số tháng thuê: ");
            soThangTro = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập tên phòng: ");
            tenPhong = scanner.nextLine();
            System.out.print("Nhập giá phòng: ");
            giaPhong = scanner.nextDouble();
            System.out.println("Nhập số ngày thuê:");
            ngayThue =scanner.nextLine();
            System.out.println("Nhập số ngày hết hợp đồng: ");
            ngayhetHopDong =scanner.nextLine();

        }

        public void hienThiThongTinCanQuanLy() {
            nguoi.hienThiThongTinKhachTro();
            System.out.println("Số tháng trọ: " + soThangTro);
            System.out.println("Tên phòng: " + tenPhong);
            System.out.println("Giá phòng: " + giaPhong);
            System.out.println("Số ngày thuê:"+ ngayThue);
            System.out.println("Số ngày hết hợp đồng:"+ ngayhetHopDong);
        }


    }

