  import java.util.Scanner;
public class eventProposal {
    public static void main(String[] args) {
        
        //hava sıcakliğini alsın 
        //30 derece ve üzeri ise yüzme öner 
        //5 ve 30 arasında ise sinemeya gitmeyi öner 
        // 4 den küçükse kayak kaymaya gitmeyi öner 
        System.out.println("*************************");
         System.out.println("***ETKİNLİK ÖNERİSİ ***");
         System.out.println("************************");
               Scanner oner=new Scanner(System.in);
               int sicaklik;
               System.out.print("LÜTFEN HAVA SICAKLIĞINI GİRİNİZ :");
               sicaklik=oner.nextInt();
               if(sicaklik>=30){
                System.out.print("YÜZMEYE GİTMEK İÇİN ÇOK GÜZEL BİR GÜN :)");
               }
               else if(sicaklik>=5&&sicaklik<30){
                System.out.print("SİNEMAYA GİTMEK İÇİN ÇOK GÜZEL BİR GÜN :)");
               }
               else{
                System.out.print("KAYAK MERKEZİNE GİTMEK İÇİN ÇOK GÜZEL BİR GÜN:)");
               }
               
               }
               
               

            
    }

