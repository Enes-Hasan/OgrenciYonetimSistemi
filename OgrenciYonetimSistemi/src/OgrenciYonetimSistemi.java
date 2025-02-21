import java.util.Scanner;


import java.util.Scanner;


public class OgrenciYonetimSistemi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int[] notlar = new int[5];


            for (int i = 0; i < 5; i++) {
                System.out.print("Lütfen " + (i + 1) + ". ders notunuzu giriniz: ");
                notlar[i] = scanner.nextInt();
            }


            int toplam = 0;
            int enYuksekNot = notlar[0];
            int enDusukNot = notlar[0];
            boolean dusukNotVar = false;


            for (int i = 0; i < 5; i++) {
                toplam += notlar[i];


                if (notlar[i] > enYuksekNot) {
                    enYuksekNot = notlar[i];
                }
                if (notlar[i] < enDusukNot) {
                    enDusukNot = notlar[i];
                }


                if (notlar[i] < 30) {
                    dusukNotVar = true;
                }
            }


            double ortalama = toplam / 5.0;
            System.out.println("\nNot Ortalaması: " + ortalama);


            if (ortalama >= 50) {
                System.out.println("Geçtiniz...!");
            } else {
                System.out.println("Maalesef Kaldınız...!");
            }


            if (dusukNotVar) {
                System.out.println("Düşük not aldığınız dersler var,alttan dersleri alınız!");
            }


            System.out.println("En Yüksek Not: " + enYuksekNot);
            System.out.println("En Düşük Not: " + enDusukNot);


            scanner.close();
        }


}
