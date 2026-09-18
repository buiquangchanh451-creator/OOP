package Bai9;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhập số lượng công nhân tối đa của danh sách: ");
	int n = sc.nextInt();
	DanhSachCongNhan danhSach = new DanhSachCongNhan(null, n);
	System.out.print("Bạn muốn nhập bao nhiêu công nhân lúc này? ");
	int soLuongNhap = sc.nextInt();
	sc.nextLine(); 
	for (int i = 0; i < soLuongNhap; i++) {
		System.out.println("\nNhập thông tin công nhân thứ " + (i + 1) + ":");
        System.out.print("Mã công nhân: ");
        String ma = sc.nextLine();
        System.out.print("Họ: ");
        String ho = sc.nextLine();
        System.out.print("Tên: ");
        String ten = sc.nextLine();
        System.out.print("Số sản phẩm: ");
        int soSP = sc.nextInt();
        sc.nextLine(); 
        CongNhan cn = new CongNhan(ma, ho, ten, soSP);
      
	}
	}
}

