/*import java.util.Scanner;
public class kdvTutariHesapla {

    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " +tutar);
        System.out.println("KDV Oranı : " +kdvOran);
        System.out.println("KDV Tutarı : " +kdvTutar);
        System.out.println("KDV'li Ücret : " +kdvliTutar);



    }

} */

import java.util.Scanner;
        public class kdvTutariHesapla {
            public static void main(String[] args) {
                double tutar, kdvliTutar, kdvOrani, kdvTutari;
                Scanner input = new Scanner(System.in);
                System.out.println("Ücret Giriniz : ");
                tutar = input.nextDouble();

                kdvOrani = (tutar > 1000) ? 0.08 : 0.18;

                kdvTutari = tutar * kdvOrani;
                kdvliTutar = tutar + kdvTutari;

                System.out.println("KDV'siz Tutar : "+ tutar);
                System.out.println("KDV Orani : "+ kdvOrani);
                System.out.println("KDV Tutarı : "+ kdvTutari);
                System.out.println("KDV'li Tutar : "+ kdvliTutar);



            }

}
