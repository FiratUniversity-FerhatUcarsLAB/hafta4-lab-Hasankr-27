/*
 * Ad Soyad: [HASAN KARA]
 * Ogrenci No: [250541015]
 * Tarih: [04.11.2025]
 * Aciklama: Gorev 2 - Geometrik hesap
 * Bu program kullanicidan geometrik hesaplama için bilgi alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args){
       

        /*Daire yarıcapı=5.0
          Darie alan=pi*r^2
          Daire cevre=2*pi*r
          Küre Hacmi: (4/3) * PI * r^3
          Küre Yüzey Alanı: 4 * PI * r^2 ile hesaplanır
         */
        Scanner input = new Scanner(System.in);
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        double r;
        System.out.print("Dairenin yaricapini girin(cm) : " );
        r = input.nextDouble();
        final double PI = 3.14159;
        double alan = r*r*PI;
        double cevre = 2*PI*r;
        double capi = 2*r;
        double hacim = Math.pow(r, 3)*(4.0/3.0)*PI;
        double yuzeyalanı = 4.0*PI*r*r;
        //Bundan sonra işlemlerin çıktıları yazılacak
        System.out.println("");
        System.out.println("SONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alan       : %.2f cm^2",alan);
        System.out.println("");
        System.out.printf("Çevre            : %.2f cm",cevre);
        System.out.println("");
        System.out.println("Dairenin Capi    : " + capi + " cm");
        System.out.printf("Küre Hacmi       : %.2f cm^3",hacim);
        System.out.println("");
        System.out.printf("Küre Yuzey Alanı : %.2f cm^2",yuzeyalanı);
    }
}

