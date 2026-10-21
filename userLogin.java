// kullanıcı girişi 
import java.util.Scanner;

public class userLogin {
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String kullanici,parola;
     System.out.print("LÜTFEN KULLANICI ADINIZI GİRİNİZ:");
      kullanici=scan.nextLine();
      System.out.print("LÜTFEN PAROLANIZI GİRİNİZ:");
      parola= scan.nextLine();
      if(kullanici.equals("JAVA")&& parola.equals("123")){
        System.out.print("KULLANICI ADINIZ VE ŞİFRENİZ DOĞRU SİSTEME GİRİŞ YAPABİLDİNİZ :)");
      }
      else {
        System.out.print("KULLANICI ADINIZ  YA DA ŞİFRENİZ HATALI LÜTFEN TEKRAR DENEYİNİZ:(");

      }





   }
}
