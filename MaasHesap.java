/*
 * Ad Soyad: [HASAN KARA]
 * Ogrenci No: [250541015]
 * Tarih: [04.11.2025]
 * Aciklama: Gorev 2 - Maas Hesaplama 
 *
 * Bu program kullanicidan maas bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */





import java.text.DecimalFormat;
import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
       
         


        Scanner input = new Scanner(System.in);

        DecimalFormat paraFormat = new DecimalFormat("0.00");
        DecimalFormat yuzdeFormat = new DecimalFormat("0.0");

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        String isim;
        int mesaisaati,haftalikCalismaSaati;
        double brutmaas;
        System.out.println("====================================");
        System.out.println("            MAAS BORDROSU           ");
        System.out.println("====================================");
        //İŞLEMLER GİRİLECEK:

        System.out.print("Çalışan ad soyad : ");
        isim = input.nextLine();

        System.out.print("Aylık brüt maaşı giriniz : ");
        brutmaas = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        haftalikCalismaSaati = input.nextInt();

        System.out.print("Mesai yaptığınız saati giriniz : ");
        mesaisaati = input.nextInt();

        double mesaiucreti = (brutmaas/160)*mesaisaati*1.5;

        double toplamgelir = brutmaas + mesaiucreti ;
        //KESINTILER
        double sgkkesintisi = toplamgelir*SGK_ORANI;

        double gelirvergisi = toplamgelir*GELIR_VERGISI_ORANI;

        double damgavergisi = toplamgelir*DAMGA_VERGISI_ORANI;

        double toplamkesinti = sgkkesintisi+gelirvergisi+damgavergisi;

        double netmaas = toplamgelir-toplamkesinti;

        // Hesaplanacak İstatistikler:
        double kesintiorani = (toplamkesinti/toplamgelir)*100;

        double gunluknetkazanc = (netmaas/22);

        double saatliknetkazanc = (netmaas/176);

        System.out.println("");
        System.out.println("");

        //Bundan sonraki aşamalar çıktı olarak gözükecek.

        System.out.println("====================================");
        System.out.println("            MAAS BORDROSU           ");
        System.out.println("====================================");

        System.out.println("Calisan:  " + isim);
        System.out.println("");
        System.out.println("GELIRLER:");
        System.out.println("  Brut Maas              : " + paraFormat.format(brutmaas) + " TL");
        System.out.println("  Haftalık çalışma saati : " + haftalikCalismaSaati);
        System.out.println("  Mesai Ucreti (10 saat) : " + mesaiucreti + " TL");
        System.out.println("  Yapılan mesai saati    : " + mesaisaati);
        System.out.println("  ------------------------");
        System.out.println("  TOPLAM GELIR           : " + paraFormat.format(toplamgelir) + " TL");
        System.out.println("");
        //KESINTILER ÇIKTISI:
        System.out.println("KESINTILER:");
        System.out.println("  SGK Kesintisi (14.0%)  : " + paraFormat.format(sgkkesintisi) + " TL");
        System.out.println("  Gelir Vergisi (15.0%)  : " + paraFormat.format(gelirvergisi) + " TL");
        System.out.println("  Damga Vergisi (0.8%)  : " + paraFormat.format(damgavergisi) + " TL");
        System.out.println("  ------------------------");
        System.out.println("  TOPLAM KESINTI        : " + paraFormat.format(toplamkesinti) + " TL");
        System.out.println("NET MAAS            :" + paraFormat.format(netmaas) + " TL");
        System.out.println("====================================");


    }
}


