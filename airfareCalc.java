import java.util.Scanner;
public class airfareCalc {
    /**
     * @param args
     */
    public static void main(final String[] args) {
        // km birim fiyatı:0.10
        //12 yaşından küçüklere fiyatta toplam %50 indirim
        //12 ve 24 yaş arasındaysa %10 indirim 
        //65 yaşından büyükse %30 indirim 
        //gidiş dönüş alırs %20 indirim
        //bu koşullara göre uçak biletini hesaplayan program 
        System.out.println("**************************************");
        System.out.println("***UÇAK BİLETİNİ HESAPLAYAN PROGRAM***");
        System.out.println("**************************************");

     final Scanner ucak=new Scanner(System.in);  
      int yas,km ,tip;
      System.out.print("LÜTFEN YAŞINIZI GİRİNİZ :");
      yas=ucak.nextInt();
       System.out.print("LÜTFEN GİDECEĞİNİZ KİLOMETREYİ YAZINIZ:");
       km=ucak.nextInt();
       System.out.print("LÜTFEN ALMAK İSTEDİĞİNİZ BİLET TEK YÖN İSE 1 GİDİŞ GELİŞ (İKİ YÖN )İSE 2  YAZINIZ :");
       tip= ucak.nextInt();
        double normalFiyat, yasIndirimi,tipIndirimi;
if (km > 0 && yas > 0  &&(tip==1) || (tip==2)){
    System.out.println("Girdiğiniz Bilgiler Doğru :");
    normalFiyat=km*0.10;
    if(yas<12){
        yasIndirimi=normalFiyat*0.5;
        normalFiyat=normalFiyat-yasIndirimi;
}
 else  if(yas>=12&&yas<=24){
    yasIndirimi=normalFiyat*0.10;
    normalFiyat-=yasIndirimi;
}
 else if(yas>=65){
    yasIndirimi=normalFiyat*0.3;
    normalFiyat-=yasIndirimi;
 }

 else {
    yasIndirimi=0;
 }
 if(tip==2){
    tipIndirimi=normalFiyat*0.2;
    normalFiyat=(normalFiyat-tipIndirimi)*2;
    System.out.print("Bilet tutarınız :"+normalFiyat);

 }
 else{
    System.out.print("Girmiş olduğunuz bilgiler hatalıdır lütfen tekrar kontrol ediniz :");
    
 }

  
    }
    }
}
