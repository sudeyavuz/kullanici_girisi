package JAVA101;
import java.util.Scanner;
public class dokuzuncu_ornek {
    public static void main(String[] args) {
        String username , password , newpassword ;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı Giriniz: ");
        username = input.nextLine();

        System.out.println("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if(username.equals("java") && password.equals("java123")){
            System.out.println("başarı ile giriş yaptınız");
        }else {
            System.out.println("hatalı bilgi girdiniz");
            System.out.println("yeni şifre oluşturmak için 1-evet veya 2-hayır ı tuşlayın");
            select = input.nextInt();
            if (select == 1){
                System.out.println("yeni şifreyi giriniz");

                newpassword = input.next();

                if (newpassword.equals("java123")){
                    System.out.println("yeni şifre eskisi ile aynı olamaz");
                    }else {
                       System.out.println("şifreniz oluşturuldu: "+ newpassword);
                    }
            } else if (select == 2) {
                System.out.println("şifre değiştirilmedi giriş yapılamaz");

            }else {
                System.out.println("girdiğiniz sayı 1 veya 2 değil");
            }
        }
    }
}
