import java.util.Scanner;
public class burcBulma {
    public static void main(String[] args){

        int day, month;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.println("Doğduğunuz gün : ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <=31){
                    if (day < 22) {
                        System.out.println("Oğlak Burcu");
                    } else {
                        System.out.println("Kova Burcu");
                    }
                } else {
                    System.out.println("Geçersiz bir gün girdiniz.");
                }
                    break;
            case 2:
                if (day >= 1 && day <=28){
                    if (day < 20) {
                        System.out.println("Kova Burcu");
                    } else {
                        System.out.println("Balık Burcu");
                    }
                } else {
                    System.out.println("Geçersiz bir gün girdiniz.");
                }
                break;



                default :
                    System.out.println("Hatalı bir değer girdiniz.");

                
        }


    }
}

