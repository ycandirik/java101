import java.util.Scanner;
public class daire {
    public static void main(String[] args) {

        int r;
        double pi = 3.14, cevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();

        cevre = (2 * pi * r);
        alan = pi * (r * r);

        System.out.println("Dairenin çevresi : " +cevre);
        System.out.println("Dairenin alanı: " +alan);





    }

}
