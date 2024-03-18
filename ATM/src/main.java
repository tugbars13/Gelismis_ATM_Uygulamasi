
public class main {
    public static void main(String [] args){
        
        ATM atm = new ATM();
        Hesap hesap=new Hesap("tugba bars","123",2000);
        atm.calıs(hesap);//hesap objesini buraya gönderdik artık bu atm de
        System.out.println("programdan cikiliyor...");
        
    }
    
}
