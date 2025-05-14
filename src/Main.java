import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wybierz: 1-wszystkie dni 2-konkretny dzien");
        Scanner sc = new Scanner(System.in);
        int odpowiedz = sc.nextInt();
        if(odpowiedz == 1) {
            for (int i = 1; i <= 31; i++) {
                System.out.print("Dzien " + i + ": ");
                if (i % 3 == 0) {
                    System.out.print("kupon na darmowa dostawe");
                    System.out.println();
                } else if (i % 5 == 0) {
                    System.out.print("znizka 10%");
                    System.out.println();
                } else if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("SUPER BONUS: kupon na darmowa dostawe + znizka 10%");
                    System.out.println();
                } else {
                    System.out.print("brak promocji");
                    System.out.println();
                }

            }
        }else if(odpowiedz == 2) {
            System.out.println("Podaj numer dnia miesiaca OD: ");
            int dzien1 = sc.nextInt();
            System.out.println("Podaj numer dnia miesiaca OD: ");
            int dzien2 = sc.nextInt();
           for(int i = dzien1; i <= dzien2; i++) {
               System.out.print("Dzien " + i + ": ");
               if (i % 3 == 0) {
                   System.out.print("kupon na darmowa dostawe");
                   System.out.println();
               } else if (i % 5 == 0) {
                   System.out.print("znizka 10%");
                   System.out.println();
               } else if (i % 3 == 0 && i % 5 == 0) {
                   System.out.print("SUPER BONUS: kupon na darmowa dostawe + znizka 10%");
                   System.out.println();
               } else {
                   System.out.print("brak promocji");
                   System.out.println();
               }
           }
        }
    }
}
