/* Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Tek Sayı Girilene Kadar 4'ün Katlarının Toplamını Bulan Program. ");
        Scanner input = new Scanner(System.in);
        int number,sum=0;
        System.out.print("Bir sayı giriniz: ");
        number=input.nextInt();
        while(number%2==0){
            if(number%4==0){
                sum=sum+number;
            }
            System.out.print("Bir sayı giriniz: ");
            number=input.nextInt();
        }
        System.out.println("Tek Sayı Girdiniz. Sonucunuz Hesaplanıyor");
        System.out.println("Girdiğiniz Sayılarda 4'ün Katları Olan Sayıların Toplamı: " + sum);
    }
}