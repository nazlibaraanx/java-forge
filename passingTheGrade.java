// Notlara göre sınıf geçme 
import java.util.Scanner;

public class passingTheGrade {
   public static void main(String[]args){

   Scanner not= new Scanner(System.in);
    int algoritma,veri,cebir,ntp,yapayZeka;
    System.out.println("******NOT HESAPLAMA SİSTEMİ******");
System.out.print("Lütfen algoritma sınav notunuzu giriniz :");
   algoritma= not.nextInt();
System.out.print("Lütfen veri dersinizin sınav notunu giriniz  :");
   veri=not.nextInt();
System.out.print("Lütfen cebir dersinizin sınav notunu giriniz :");
   cebir=not.nextInt();
System.out.print("Lütfen nesne tabanlı programlama dili dersinizin sınav notunu giriniz :");
   ntp=not.nextInt();
System.out.print("Lütfen yapay zeka dersinizin notunu giriniz :");
   yapayZeka=not.nextInt();
   int ortalama=((algoritma+veri+cebir+ntp+yapayZeka)/5);
   if (ortalama>=50){
    System.out.print("TEBRİKLER SINIFI GEÇTİNİZ :)");
    System.out.print("GEÇME NOTUNUZ :"+ortalama);
   }
   else{
    System.out.print("SINIFI GEÇEMEDİNİZ BİR SONRAKİ SENE GEÇMENİZ İÇİN BAŞARILAR :(");
    System.out.print("KALMA NOTUNUZ :"+ortalama);
   }




   }   
}
