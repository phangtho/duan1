create database Quiz
go

use Quiz
go


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

insert into giaoVien values ('gv001','abc','Quan','Quanld@fpt.edu')

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
	constraint PK_hocSinh Primary key (id)
)

insert into hocSinh values ('quanld','abc','Quan','Quanld@fpt.edu')

if OBJECT_ID('ketQua') is not null
drop table ketQua
go

create table ketQua(
	id int identity(1,1) not null,
	idHS nchar(100) not null,
	diem float not null,
	ngayLam nvarchar(100) not null,
	baiLam nvarchar(100) not null,
	constraint PK_ketQua Primary key (id),
	constraint FK_ketQua_hocSinh foreign key (idHS) references hocSinh(id)	
	on Update cascade
	on Delete cascade
)

if OBJECT_ID('boDeTH') is not null
drop table boDeTH
go

create table boDeTH(
	maDe varchar(255) not null,
	maNguoiTao nchar(100) not null,
	ngayTao date not null,
	constraint PK_boDeTH Primary key (maDe),
	constraint FK_boDeTH_giaoVien foreign key (maNguoiTao) references giaoVien(id)
	on Update cascade
	on Delete cascade
)

insert into boDeTH values ('D01','gv001','01/01/2019')
insert into boDeTH values ('D02','gv001','01/01/2019')
insert into boDeTH values ('D03','gv001','01/01/2019')


if OBJECT_ID('boDeMon') is not null
drop table boDeMon
go

create table boDeMon(
	maMon varchar(255) not null,
	maNguoiTao nchar(100) not null,
	ngayTao date not null,
	constraint PK_boDeMon Primary key (maMon),
	constraint FK_boDeMon_giaoVien foreign key (maNguoiTao) references giaoVien(id)
	on Update cascade
	on Delete cascade
)

insert into boDeMon values ('M01','gv001','01/01/2019')
insert into boDeMon values ('M02','gv001','01/01/2019')
insert into boDeMon values ('M03','gv001','01/01/2019')


if OBJECT_ID('cauHoi') is not null
drop table cauHoi
go

create table cauHoi(
	id int not null,
	monThi varchar(255) not null,
	deTH varchar(255) not null,
	de nvarchar(max) not null,
	dapAn nvarchar(max) not null,
	daSai nvarchar(max) not null,
	daSai1 nvarchar(max) not null,
	daSai2 nvarchar(max) not null,
	constraint PK_cauHoi Primary key (id),
	constraint FK_cauHoi_boDeMon foreign key (monThi) references boDeMon(maMon),
	constraint FK_cauHoi_boDeTH foreign key (deTH) references boDeTH(maDe)
	on Update cascade
	on Delete cascade
)
-- import Data from Excel

create proc sp_diemTrungBinh
as begin
	select 
	hocSinh.id,
	ten,
	AVG(diem) diemTrungBinh
	from hocSinh inner join ketQua on hocSinh.id = ketQua.idHS
	group by hocSinh.id,ten
	end
go
create proc sp_soCauHoi
as begin
	select 
	boDeMon.maMon,
	COUNT(*) soCauHoi
	from boDeMon inner join cauHoi on boDeMon.maMon = cauHoi.monThi
	group by boDeMon.maMon
	end
go
create proc sp_soLanThi
as begin
	select 
	hocSinh.id,
	COUNT(*) soLanThi
	from hocSinh inner join ketQua on hocSinh.id = ketQua.idHS
	group by hocSinh.id
	end
	go