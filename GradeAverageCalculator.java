import java.util.Scanner;
public class GradeAverageCalculator{

public static void main(String[] args) {
    
 /*  not ortalaması hesaplama  1. yöntem 
int vize, ffinal ,quiz;
double ortalama;
  System.out.print(" Vize notunuzu giriniz :");
  vize=Integer.parseInt(System.console().readLine());
  System.out.print("Final notunuzu giriniz:");
 ffinal = Integer.parseInt(System.console().readLine());
 System.out.print("Quiz notunuzu giriniz:");
 quiz=Integer.parseInt(System.console().readLine());
 ortalama=(vize*0.3)+(ffinal*0.5)+(quiz*0.2);
System.out.print(" Ortalamaniz :"+ortalama);*/


// İkinci yöntem scanner sınıfı ile not ortalalması hesaplama 


int vize, ffinal ,quiz;
double ortalama;
@SuppressWarnings("resource")
Scanner input=new Scanner(System.in);
 System.out.print(" Vize notunuzu giriniz :");
  vize=Integer.parseInt(input.nextLine());
  System.out.print("Final notunuzu giriniz:");
 ffinal = Integer.parseInt(input.nextLine());
 System.out.print("Quiz notunuzu giriniz:");
 quiz=Integer.parseInt(input.nextLine());
 ortalama=(vize*0.3)+(ffinal*0.5)+(quiz*0.2);
System.out.println(" Ortalamaniz :"+ortalama);
String sonuc=(ortalama>=50)?"Geçtiniz":"Kaldiniz";
System.out.print("sonucunuz:"+sonuc);

}

}
