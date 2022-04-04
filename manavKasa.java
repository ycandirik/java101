import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {

        double armutKilo = 2.14;
        double elmaKilo = 3.67;
        double domatesKilo = 1.11;
        double muzKilo = 0.95;
        double patlicanKilo = 5.0;
        double a,b,c,d,e,toplam;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız : ");
        a = input.nextDouble();
        System.out.println("Kaç kilo elma aldınız : ");
        b = input.nextDouble();
        System.out.println("Kaç kilo domates aldınız : ");
        c = input.nextDouble();
        System.out.println("Kaç kilo muz aldınız : ");
        d = input.nextDouble();
        System.out.println("Kaç kilo patlıcan aldınız : ");
        e = input.nextDouble();

        toplam = (armutKilo * a) + (elmaKilo * b) + (domatesKilo * c) + (muzKilo * d) + (patlicanKilo * e);

        System.out.println("Toplam ödemeniz gereken ücret : " +toplam+ " TL");







    }

}

