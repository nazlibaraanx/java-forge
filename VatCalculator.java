import java.util.Scanner;

public class VatCalculator {
    
public static void main(String[]args){

//Kdvli fiyat hesaplma 
double fiyat, kdvOrani,kdvliFiyat;
Scanner input=new Scanner (System.in);
System.out.print("Lütfen ürününüzün fiyatini giriniz:");
fiyat=input.nextDouble();
System.out.print("Lütfen ürününüzün kdv oranini giriniz : ");
kdvOrani=input.nextDouble();
kdvliFiyat=fiyat+(fiyat*kdvOrani);
System.out.println("Girmiş olduğunuz ürünün  fiyati :"+ fiyat);
System.out.println("Girmiş olduğunuz kdv orani:"+ kdvOrani);
System.out.println("Girmiş olduğunuz ürünün kdv'li fiyati :"+kdvliFiyat);



    
}




}
