
import java.util.Scanner;


public class Login {
    //bunu main classınada yazabiliriz fakat OOP mantığı otursun diye bunu yapıyoruz
    public boolean login (Hesap hesap){//giriş başarılıysa true değilse false döndericek
                                       //hesap objesi göderiyoruz
       Scanner  input=new Scanner(System.in);
       String kullanıcıAdı;
       String parola;
       
            System.out.println("kullanıcı adı : ");
            kullanıcıAdı=input.nextLine();
            System.out.println("parola : ");
            parola=input.nextLine();
            
            if(hesap.getKullanıcıAdı().equals(kullanıcıAdı) && hesap.getParola().equals(parola)){
                return true;
            }else{
                return false;
            }
}
    
}
