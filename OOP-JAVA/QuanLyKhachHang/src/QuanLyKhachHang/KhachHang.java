package QuanLyKhachHang;

import java.util.Scanner;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private int namSinh;
	private int tongLuong;
	
	KhachHang(){
		
	}
	
	KhachHang(String maKH){
		this.maKH = maKH;
	}
	
	KhachHang(String maKH, String hoTen, int namSinh, int tongLuong){
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.tongLuong = tongLuong;
	}
	
	public String getMaKH() {
		return maKH;
	}
	
	public void setMaKH(String maKH) {
		this.maKH = maKH;;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public int getNamSinh() {
		return namSinh;
	}
	
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public int getTongLuong() {
		return tongLuong;
	}
	
	public void setTongLuong(int tongLuong) {
		this.tongLuong = tongLuong;
	}
	
	public void NhapTT() {
		Scanner key = new Scanner (System.in);
		System.out.print("Ma khach hang: ");
		maKH = key.nextLine();
		System.out.print("Ten khach hang: ");
		hoTen = key.nextLine();
		System.out.print("Nam Sinh: ");
		namSinh = Integer.parseInt(key.nextLine());//khac phuc tinh trang troi lenh
		System.out.print("Tong luong khach hang: ");
		tongLuong = Integer.parseInt(key.nextLine());
		System.out.println("---------");
	}
	
	public void HienThiTT() {
		System.out.println("Ma khach hang: "+maKH);
		System.out.println("Ten khach hang: "+hoTen);
		System.out.println("Nam sinh: "+namSinh);
		System.out.println("Tong luong: "+tongLuong);
	}
	
	
	
}