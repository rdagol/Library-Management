package Model;

public class Sach {

    private String MaSach;
    private String TenSach;
    private String LoaiSach;
    private String TenTacgia;
    private String NhaXuatBan ;
    private double NamXuatBan ;
    private double SoLuong ;
    private double giatien  ;
    private double sotrang;

    public Sach() {
    }

    public Sach(String MaSach, String TenSach, String LoaiSach, String TenTacgia, String NhaXuatBan, double NamXuatBan, double SoLuong, double giatien, double sotrang) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.LoaiSach = LoaiSach;
        this.TenTacgia = TenTacgia;
        this.NhaXuatBan = NhaXuatBan;
        this.NamXuatBan = NamXuatBan;
        this.SoLuong = SoLuong;
        this.giatien = giatien;
        this.sotrang = sotrang;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getLoaiSach() {
        return LoaiSach;
    }

    public void setLoaiSach(String LoaiSach) {
        this.LoaiSach = LoaiSach;
    }

    public String getTenTacgia() {
        return TenTacgia;
    }

    public void setTenTacgia(String TenTacgia) {
        this.TenTacgia = TenTacgia;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String NhaXuatBan) {
        this.NhaXuatBan = NhaXuatBan;
    }

    public double getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(double NamXuatBan) {
        this.NamXuatBan = NamXuatBan;
    }

    public double getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(double SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    public double getSotrang() {
        return sotrang;
    }

    public void setSotrang(double sotrang) {
        this.sotrang = sotrang;
    }

}
