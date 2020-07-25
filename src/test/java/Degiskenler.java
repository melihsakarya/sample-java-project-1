import org.junit.Test;

public class Degiskenler {

    @Test
    public void degiskenTanimlama(){
        int x = 8;
        int sayi;
        Integer yeniSayi;

        char c = 'A';
        String adSoyad = "Melih Sakarya";
        char[] adSoyadDizisi = {'M','e','l','i'};
        boolean kayit = false;
        long buyukSayi = 2147483648L;

        long a = 4;
        int b = (int)a;
    }

    @Test
    public void degiskenGecelilikleri(){
        int x=5;
        {
            int y = 4;
            //int x = 6;
        }
        int y=8;

    }

    @Test
    public void aritmetikselIslemler(){
        int x = 8;
        int y = 6;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / (double)y);
        System.out.println(x % y);
    }

    @Test
    public void degikenArtirma(){
        int x = 8;
        int y = x++;

        System.out.println("x : " + x);
        System.out.println("y : " + y);

        x += y;
        x = x + y;

    }

    @Test
    public void karsilastirma(){
        int x = 4;
        int y = 6;

        //System.out.println(x = y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
    }

    @Test
    public void birlesikKarsilastirma(){
        int x = 4;
        int y = 6;

        System.out.println(x == y && y > 0);
        System.out.println(x == y || y > 0);

    }

    @Test
    public void bilgileriYazdirin(){
        String ad = "Melih";
        String soyad = "Sakarya";
        String sehir = "Istanbul";
        String adres = "Barbaros Mah. Atasehir";

        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);
        System.out.println("Adres : " + adres);
        System.out.println("Sehir : " + sehir);

        System.out.println(ad + " " + soyad + " " + adres + " " + sehir);
    }


}
