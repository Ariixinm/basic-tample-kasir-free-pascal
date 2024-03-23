program kasir;
uses crt;
type
data=record
kode:string[5];
nama:string[5];
harga:real;
jumlah:integer;
tota:real;
end;
var
t,n,a:stringl
jumlahbarang,i,j:byte;
totalpembelian,total,kembalian:real;
nama:string[20];
barang:array[1..100]of data;
begin
clrscr;
write('masukan jumkah item yang akan  di beli :');readln(jumlahbarang);
for i:= 1 to jumlahbarang do
begin
begin
write('nama barang ke -',i,':');readln(barang[i].nama);
write('jumlah barang ke -',i,':');readln(barang[i].jumlah);
write('harga barang ke ',i,':');readln(barang[i].harga);
end;
writeln('')
end;
writeln('|no|nama barang|harga satuan|jumlah|total');
begin
barang[i].total:=0;
for i :=1 to jumlahbrg do
begin
barang[i].total:=barang[i].harga*barang[i].jumlah;
write(i:2);
write(barang[i].nama:12);
write(barang[i].harga:14:2);
write(barang[i].jumlah:5);
write(barang[i].total:15:2);
end;
writeln('');
for j :=1 to jumlahbarang do
tot:=tot+barang[j].total;
writeln('total belanja :',tot:20:2);
write('jumlah uang yang di serah kan : ');readln(totalpembelian);
kembalian:=totalpembelian - tot;
writeln('kembalian:',kembalian:20:2);
writeln('');
writeln('terima kasih');
end;
readln;
end.