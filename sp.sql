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


