import java.util.Scanner;
public class vucutKitleEndeksi {

    public static void main(String[] args) {

        double boy, kilo, vki;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz : ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz : ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy);

        System.out.print("Vücut Kitle Endeksiniz : "+vki);





    }


}
