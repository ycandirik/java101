import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        if(select == 1){
            System.out.println("Toplam : " + (n1 + n2));
        } else if(select == 2){
            System.out.println("Çıkarma : " + (n1 - n2));
        } else if(select == 3){
            System.out.println("Çarpım : " + (n1 * n2));
        } else if(select == 4){
            System.out.println("Bölüm : " + (n1 / n2));
        } else{
            System.out.println("Yanlış seçim yaptınız.");
        }





    }
}
