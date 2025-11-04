/*
 * Ad Soyad: [HASAN KARA]
 * Ogrenci No: [250541015]
 * Tarih: [04.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 *
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */


import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args){

        /*scanner sınıfı açtık*/

        Scanner input = new Scanner(System.in);
        //ad,soyad,yaş,öğrenci no ve gpa girilir
        String ad,soyad;
        int ogrcno,yas;
        double gpa;
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println(" ");
        System.out.print("Adınızı girin: ");
        ad = input.nextLine();
        System.out.print("Soyadınızı girin: ");
        soyad = input.nextLine();
        System.out.print("Öğrenci Numaranız: ");
        ogrcno = input.nextInt();
        System.out.print("Yaş: ");
        yas = input.nextInt();
        System.out.print("GPA(0.00-4.00): ");
        gpa = input.nextDouble();
        System.out.printf("GPA: %.2f", gpa);
        //bundan sonraki aşama çıktıda gözükecek kısım
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Ogrenci No: " +ogrcno );
        System.out.println("Yas: " + yas);
        System.out.printf("GPA: %.2f", gpa);
        System.out.println(" ");
        System.out.println("Durum: Basarili Ogrenci");
    }
}
