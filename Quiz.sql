create database Quiz
go

use Quiz
go

if OBJECT_ID('boDeTH') is not null
drop table boDeTH
go

create table boDeTH(
	maDe nchar(10) not null,
	maNguoiTao nchar(100) not null,
	ngayTao date not null,
	constraint PK_boDeTH Primary key (maDe),
	constraint FK_boDeTH_giaoVien foreign key (maNguoiTao) references giaoVien(id)
	on Update cascade
	on Delete cascade
)

if OBJECT_ID('boDeMon') is not null
drop table boDeMon
go

create table boDeMon(
	maMon nchar(10) not null,
	maNguoiTao nchar(100) not null,
	ngayTao date not null,
	constraint PK_boDeMon Primary key (maMon),
	constraint FK_boDeMon_giaoVien foreign key (maNguoiTao) references giaoVien(id)
	on Update cascade
	on Delete cascade
)

if OBJECT_ID('cauHoi') is not null
drop table cauHoi
go

create table cauHoi(
	id int identity(1,1) not null,
	monThi nchar(10) not null,
	deTH nchar(10) not null,
	de nvarchar(max) not null,
	dapAn nvarchar(200) not null,
	daSai nvarchar(200) not null,
	daSai1 nvarchar(200) not null,
	daSai2 nvarchar(200) not null,
	constraint PK_cauHoi Primary key (id),
	constraint FK_cauHoi_boDeMon foreign key (monThi) references boDeMon(maMon),
	constraint FK_cauHoi_boDeTH foreign key (deTH) references boDeTH(maDe)
	on Update cascade
	on Delete cascade
)

if OBJECT_ID('giaoVien') is not null
drop table giaoVien
go

create table giaoVien(
	id nchar(100) not null,
	matKhau nchar(100) not null,
	ten nvarchar(100) not null,
	email nvarchar(100) not null,
	constraint PK_giaoVien Primary key (id)
)

if OBJECT_ID('hocSinh') is not null
drop table hocSinh
go

create table hocSinh(
	id nchar(100) not null,
	matKhau nchar(100) not null,
	ten nvarchar(100) not null,
	gioiTinh bit not null,
	ngaySinh date not null,
	email nvarchar(100) not null,
	ghiChu nvarchar(max) ,
	maGV nchar(100) not null,
	constraint PK_hocSinh Primary key (id),
	constraint FK_hocSinh_giaoVien foreign key(maGV) references giaoVien(id)
)

if OBJECT_ID('ketQua') is not null
drop table ketQua
go

create table ketQua(
	id int identity(1,1) not null,
	idHS nchar(100) not null,
	diem float not null,
	ngayLam date not null,
	baiLam nvarchar(100) not null,
	constraint PK_ketQua Primary key (id),
	constraint FK_ketQua_hocSinh foreign key (idHS) references hocSinh(id)	
	on Update cascade
	on Delete cascade
)