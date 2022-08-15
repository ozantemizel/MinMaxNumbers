import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Tüm sayılar negatif girildiğinde sıralama işlemi başarısız olmaktadır.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı girmek istiyorsunuz?");
        int N = input.nextInt();
        int counter=0;
        int max=0,min=0;
        if(N>1) {
            do {
                System.out.println("Sayıyı giriniz!");
                int number = input.nextInt();
                    if (number > max) {
                        max = number;
                    } else {
                        max = max;
                    }
                    if ( (number >min) && (min!=0) ) {
                        min = min;
                    } else {
                        min = number;
                    }

                counter++;
            } while (counter < N);
        }else {
            System.out.println("Birden fazla sayı girmelisiniz.");
        }
        System.out.println("Girmiş olduğunuz sayıların;\nmaksimum değeri:"+max +"\nminimum değeri: "+min);
    }
}
