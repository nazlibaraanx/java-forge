 import java.util.Scanner;

public class hesapMakinesi {
    
public static void main(String[] args) {
    
    Scanner scan=new Scanner(System.in);
     int a,b, secim ;
     System.out.print("LÜTFEN BİR SAYI GİRİNİZ :");
     a= scan.nextInt();
     System.out.print("LÜTFEN BİR SAYI GİRİNİZ :");
     b=scan.nextInt();
     System.out.print("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ YAZİNİZ :");
     System.out.println("\n1: TOPLAMA \n2: BÖLME\n3: ÇARPMA\n4: ÇIKARTMA");
    System.out.print("SEÇİMİNİZ:");
    secim=scan.nextInt();
    if(secim==1){
        System.out.print("TOPLAMA İŞLEMİNİZİN SONUCU:"+ (a+b));
       }
       else if( secim==2){
        System.out.print("BÖLME İŞLEMİNİZİN SONUCU:"+(a/b));
       }
       else if( secim==3){
        System.out.print("ÇARPMA İŞLEMİNİZİN SONUCU:"+(a*b)); 
       }
       else if( secim==4){
        System.out.print("ÇIKARMA İŞLEMİNİZİN SONUCU :"+(a-b));
       }
       else{
        System.out.print(" HATALI BİR İŞLEM SEÇTİNİZ :");
       }
    
    }
     }





