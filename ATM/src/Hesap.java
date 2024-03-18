
public class Hesap {
    
    private String kullanıcıAdı;
    private String parola;
    private int bakiye;
    
    public Hesap(String kullanıcıAdı,String parola,int bakiye){
        this.kullanıcıAdı=kullanıcıAdı;
        this.parola=parola;
        this.bakiye=bakiye;
    }
    public void paraYatırma(int tutar){
        
        bakiye+=tutar;
        System.out.println("yeni bakiyeniz = "+bakiye);
        
    }
    public void paraCek(int tutar){
       
        if((bakiye-tutar)<0){
            
            System.out.println("yeterli bakiyeniz yoktur...");
            
        }else{
            
            bakiye-=tutar;
            System.out.println("yeni bakiyeniz = "+bakiye);
        }
    }

    /**
     * @return the kullanıcıAdı
     */
    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    /**
     * @param kullanıcıAdı the kullanıcıAdı to set
     */
    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }

    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    
}
