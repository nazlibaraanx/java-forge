import java. util. Scanner;
public class sortDescending {
    public static void main(String[] args) {
       //a>b>c veya a>c>b
       //b>a>c veya  b>c>a
       //c>a>b veya c>b>a
 Scanner sayi=new Scanner(System.in);
 int a,b,c;
 System.out.print("LÜTFEN A  SAYISINI GİRİNİZ :");
 a=sayi.nextInt();
 System.out.print("LÜTFEN  B SAYISINI GİRİNİZ  :");
 b=sayi.nextInt();
 System.out.print("LÜTFEN C SAYISINI  GİRİNİZ  :");
 c=sayi.nextInt();

 // 1. A'nın en büyük olduğu durum
if (a > b && a > c) {
    if (b > c) {
        System.out.print("A > B > C");
    } else {
        System.out.print("A > C > B");
    }
} 
// 2. B'nin en büyük olduğu durum (A en büyük değilse buraya bakar)
else if (b > a && b > c) {
    if (a > c) {
        System.out.print("B > A > C");
    } else {
        System.out.print("B > C > A");
    }
} 
// 3. Geriye tek ihtimal kalır: C'nin en büyük olduğu durum
else {
    if (a > b) {
        System.out.print("C > A > B");
    } else {
        System.out.print("C > B > A");
    }
}
    }
}


    