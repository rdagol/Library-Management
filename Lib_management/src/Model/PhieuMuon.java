package Model;

public class PhieuMuon {

    private String MaPhieu;
    private String MaSach;
    private String ngayMuon;
    private String ngayTra;
    private double vitri;
    private String tensach;

    public PhieuMuon() {
    }

    public PhieuMuon(String MaPhieu, String MaSach, String ngayMuon, String ngayTra, double vitri, String tensach) {
        this.MaPhieu = MaPhieu;
        this.MaSach = MaSach;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.vitri = vitri;
        this.tensach = tensach;
    }

    public String getMaPhieu() {
        return MaPhieu;
    }

    public void setMaPhieu(String MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public double getVitri() {
        return vitri;
    }

    public void setVitri(double vitri) {
        this.vitri = vitri;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }
    
}
