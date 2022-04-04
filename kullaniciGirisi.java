import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz : ");
        username = input.nextLine();

        System.out.println("Şifreniz :");
        password = input.nextLine();

        if(username.equals("ycandirik") && password.equals("Bik1234")){
            System.out.println("Giriş yaptınız !");
        }else{
            System.out.println("Bilgileriniz hatalı !");
        }
    }
}
