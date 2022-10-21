package KiemTra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Thong tin nhan vien kiem ke");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma Phieu : ");
        String maPhieu = scanner.nextLine();
        System.out.println("Ngay Kiem Ke :");
        int ngayKiemKe = sc.nextInt();
        System.out.println("Nhan vien kiem ke: ");
        String nhanvienkiemke = sc.nextLine();
        String dc = sc.nextLine();
        System.out.println("Chuc vu : ");
        String chucvu = sc.nextLine();
        System.out.println("Kiem ke tai phong : ");
        String taiphong = sc.nextLine();
        System.out.println("Ma phong : ");
        String maphong = sc.nextLine();
        System.out.println("Truong Phong : ");
        String truongphong = sc.nextLine();
    }
}
