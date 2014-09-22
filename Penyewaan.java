class Penyewaan{
public static void main (String[]args){
String sInput=null;
system.out.println ("Nama: Muhammad Rifqi A.");
system.out.println ("NIM : 1127050109");
system.out.println (" masukan id peminjam:") ; 
system.out.println("masukan judul buku :");
system.out.println ("masukan lama peminjaman:");

penyewaan generalx=new penyewaan();
AgusRifai penyewaan1=new AgusRifai(); 
RijalDendi penyewaan2=new RijalDendi();
AsepIpo penyewaan3=new AsepIpo();
AstriKurmiati penyewaan4=new AstriKurmiati();
InputStreamReader inputan=new InputStreamReader(System.in);
BufferedReader jm=new BufferedReader(inputan);
sInput=jm.readLine();
int i=Integer.parseInt(sInput);
switch(i){
case 1:
generalx.KelasAggota(); 
penyewaan1.TampilkanAgusRifai();break;
case 2:
generalx.KelasAggota(); 
penyewaan2.TampilkanRijalDendi();
case 3:
generalx.KelasAggota();
penyewaan3.Tampilkan AsepIpo();
case 4:
generalx.KelasAggota();
penyewaan4.Tampilkan AstriKurmiati();
}
BufferedReader jm=new BufferedReader(inputan);
switch(i){
case 1:
generalx.Kelasfilm();
penyewaan1.Tampilkanfilm1();
case 2:
generalx.Kelasfilm();
penyewaan2.Tampilkanfilm2();
case 3:
generalx.Kelasfilm();
penyewaan3.Tampilkan film3();
case 4:
generalx.Kelasfilm();
penyewaan4.Tampilkan film4();
}
}
}
