import java .util.Scanner;
public class vaultX {
     public static void main(String[] args) {
         int bakiye=1000, para,miktar;
         Scanner scan=new Scanner(System.in);
          
         System.out.println("*****MERHABALAR NAZLİ BANK'A HOŞ GELDİNİZ*****");
         System.out.print("GÜNCEL BAKİYENİZ :"+ bakiye + "tTÜRK LİRASI ");
     while (bakiye>0){
        System.out.println();
        System.out.println("1-) PARA YATIR");
        System.out.println("2-) PARA ÇEK");
        System.out.println("3-) BAKİYE SORGULA");
        System.out.println("4-) ÇIKIŞ YAP");
        System.out.print("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ ");
        para=scan.nextInt();
        if(para==1){
            System.out.print("LÜTFEN YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ ");
            miktar=scan.nextInt();
            bakiye=bakiye+miktar;
            System.out.println("YENİ BAKİYENİZ: " + bakiye + " TL\n");

        }else if(para==2){
            System.out.print("LÜTFEN ÇEKMEK İSTEDİĞİNİZ MİKTARI YAZINIZ ");
            miktar=scan.nextInt();
            if(miktar>bakiye){
                System.out.print("YETERSİZ BAKİYE\n");
            } else {
                bakiye=bakiye-miktar;
                System.out.println(" KALAN  BAKİYENİZ: " + bakiye + " TL");
            }
           
        } else if(para==3){
            System.out.print ("BAKİYENİZ:" + bakiye+"TÜRK LİRASI\n");
        }  else if(para==4){
            System.out.print("ÇIKIŞ YAPILIYOR ");
            break;
        }
        else{
            System.out.print("GEÇERSİZ BİR İŞLEM YAPTINIZ !!");
        }


     }

       System.out.print("TEKRAR BEKLERİZ.....");
     }
}
