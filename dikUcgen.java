import java.util.Scanner;
public class dikUcgen {
    public static void main(String[] args) {

        int a, b, c, cevre, u;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin 1.kenarını giriniz : ");
        a = input.nextInt();
        System.out.println("Üçgenin 2.kenarını giriniz : ");
        b = input.nextInt();
        System.out.println("Üçgenin 3.kenarını giriniz : ");
        c = input.nextInt();

        u = (a + b + c) / 2;
        cevre = (a + b + c);
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin çevresi : " +cevre);
        System.out.println("Üçgenin alanı : " +alan);


    }

}
