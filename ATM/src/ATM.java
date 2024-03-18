
import java.util.Scanner;


public class ATM {
    
    public void calıs(Hesap hesap){//hesap objesini göndermiş olduk
        Login login= new Login();
        Scanner input=new Scanner(System.in);
        System.out.println("bankamiza hos geldiniz....");
        System.out.println("***************************************");
        System.out.println("kullanici girisi");
        System.out.println("***************************************");
        int girisHakki=3;
        
        while(true){
            if(login.login(hesap)){//bu sefer hesap  buraya gönderildi
                System.out.println("giris basarili...");
                break;
                
            }else{
                System.out.println("giris basarisis...");
                girisHakki-=1;
                System.out.println("kalan giris hakki : "+girisHakki);
                
            }
            if(girisHakki==0){
                System.out.println("giris hakkiniz bitmistir...");
                
                return;
            }
        }
        System.out.println("***************************************");
        String islemler = "1-bakiye goruntule\n"
                        + "2-para yatirma\n"
                        + "3-para cekme\n"
                        + "cikis icin q ya basin";
        System.out.println(islemler);
        System.out.println("****************************************");
        
        while(true){
            System.out.println("islemi seciniz : ");
            String islem = input.nextLine();
            
            if(islem.equals("q")){
                break;
            }else if(islem.equals("1")){
                System.out.println("bakiyenis : "+hesap.getBakiye());
            }else if(islem.equals("2")){
                System.out.println("yatirmak istediginiz tutar : ");
                int tutar=input.nextInt();
                input.nextLine();
                hesap.paraYatırma(tutar);
            }else if(islem.equals("3")){
                System.out.println("cekmek istediginiz tutar : ");
                int tutar=input.nextInt();
                input.nextLine();
                hesap.paraCek(tutar);
                
            }else{
                System.out.println("geversiz islem ...");
            }
        }
    }
    
}
