
package pheptoan;

import java.util.Scanner;

public class PhepToan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so nguyen a: ");
        int a=scanner.nextInt();
        System.out.println("Nhap so nguyen b: ");
        int b=scanner.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int i=a%b;
        System.out.println("Tong 2 so a va b: "+ c);
        System.out.println("Hieu 2 so a va b: "+ d);
        System.out.println("Tich 2 so a va b: "+ e);
        System.out.println("Chia 2 so a va b: "+ f);
        System.out.println("Chia lay du 2 so a va b: "+ i);
    }
    
}
