import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.println("Ngày sinh :");
        int ngaysinh = sc.nextInt();
        System.out.println("Địa chỉ: ");
        String diachi = sc.nextLine();
        String dc = sc.nextLine();
        System.out.println("Giới tính : ");
        String gioitinh = sc.nextLine();
        System.out.println("Mã sinh viên : ");

        String ma = sc.nextLine();
        System.out.println("Điểm trung bình : ");
        int dtb = Integer.parseInt(sc.nextLine());
        System.out.println("Email : ");

        String email = sc.nextLine();
        Student sv;
        sv = new Student(hoTen, ngaysinh, gioitinh, diachi, email, dtb, ma);
        sv.thongTinSv();
        if (dtb > 8) {
            System.out.println(" được học bổng ");
        } else {
            System.out.println(" không Được học bổng : ");
        }

    }

}


