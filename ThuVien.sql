create database QuanLySach_Chimxanh

CREATE TABLE DangNhap
(
    TenDangNhap VARCHAR(100) not null primary key,
    MatKhau VARCHAR(100) not null
    ,
);
CREATE TABLE NhanVien
(
    MaNV int primary key not null,
    TenTK VARCHAR(100) not null ,
	TenNV NVARCHAR(100) NOT NULL,
	ChucVu  NVARCHAR(100) NOT NULL,
	Luong money not null,
	NgaySinh date not null,
	DiaChi  NVARCHAR(200) NOT NULL,
	SDT VArchar(15) not null,
	foreign key (TenTK) references DangNhap(TenDangNhap),
);
CREATE TABLE SACH
(
    MaSach NVARCHAR(100) primary key not null,
    TenSach NVARCHAR(100) not null,
    LoaiSach NVARCHAR(100) not null,
    TenTacgia NVARCHAR(100) not null,
    NhaXuatBan NVARCHAR(100) not null,
    NamXuatBan date not null ,
    SoLuong INT not null,
    giatien money not null, 
    sotrang int not null 
);
CREATE TABLE PhieuMuon
(
    MaPhieu NVARCHAR(100) primary key not null,
    MaSach NVARCHAR(100) not null,
    ngayMuon date not null,
    ngayTra date not null,
    vitri varchar(50) not null,
    tensach nvarchar(50) not null,
    FOREIGN KEY (maSach) REFERENCES SACH(maSach),
);