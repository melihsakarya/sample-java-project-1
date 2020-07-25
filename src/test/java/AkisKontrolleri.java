import org.junit.Test;

public class AkisKontrolleri {

    @Test
    public void ifKosulu(){

        int x = 0;

        if(x > 0){
            System.out.println("X değeri sifirdan büyük");
        }
        else if(x == 0){
            System.out.println("X değeri sifirdir");
        }
        else{
            System.out.println("X değeri sifirdan küçük");
        }

    }

    @Test
    public void forDongusuOrnegi(){

        for(int i=0; i < 10; i++){
            if( i == 5) {
                System.out.println("i : " + i);
            }
        }
    }

    //0-100 arasında 7 ye bölünebilen sayilari yazdirin
    @Test
    public void yedininKatlariniYazdirma(){
        for (int i = 0; i < 100; i++){
            if(i % 7 == 0){
                System.out.println(i);
            }
        }
    }

    //0-100 arasindaki asal Asal sayilari bulun

    @Test
    public void asalSayiBulma(){
        for (int kontrolEdilecekSayi = 2; kontrolEdilecekSayi < 100; kontrolEdilecekSayi ++){
            boolean asalMi = true;
            for (int bolenSayi = 2; bolenSayi < kontrolEdilecekSayi; bolenSayi ++){
                if(kontrolEdilecekSayi % bolenSayi == 0){
                    //System.out.println(kontrolEdilecekSayi + " sayisi " + bolenSayi + " sayisina tam bolunebiliyor.");
                    asalMi = false;
                    break;
                }
            }
            if(asalMi){
                System.out.println(kontrolEdilecekSayi);
            }
        }
    }

    @Test
    public void ornekWhileDongusu(){
        int i = 0;
        while(i<10){
            System.out.println("i = " + i++);
        }

    }

}
