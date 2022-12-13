package Operatorler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.print("1- Toplama:\n2- Çıkarma:\n3- Çarmpa:\n4- Bölme:\n");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım : " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez.");
                    break;
                } else {
                    System.out.println("Bölüm : " + (n1 / n2));
                    break;
                }
            default:
                System.out.println("Yanlış seçim yaptınız.\nProgramdan çıkılıyor...");
        }

    }
}
