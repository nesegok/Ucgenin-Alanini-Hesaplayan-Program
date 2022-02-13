import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out. print ("1. kenarı giriniz : ");
        double a = girdi.nextInt();

        System.out.print("2. kenarı giriniz : ");
        double b = girdi.nextInt();

        System.out.print("3. kenarı giriniz : ");
        double c = girdi.nextInt();

        double u = (a+b+c)/2;

        double alan =Math.sqrt(u * (u - a)* (u - b) * (u - c));

        System.out.print("Üçgenin Alanı : " + alan);
    }
}

