import java.util.Scanner;
public class SecondProgram
{
    public static void main(String[] args) {
        System.out.println("Lütfen bir deger giriniz");
            double KDV = 0.18;
            int girilenDeger;

            Scanner inp = new Scanner(System.in);
            girilenDeger = inp.nextInt();

            double KDVmiktar = girilenDeger*KDV;
            double KDVliFiyat = KDVmiktar+girilenDeger;
        System.out.println("KDV'siz fiyat : "+girilenDeger );
        System.out.println("KDV miktari : "+KDVmiktar);
        System.out.println("KDV'li fiyat : "+KDVliFiyat);

    }
}
