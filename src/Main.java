import java.util.Scanner;

public class Main {
    static boolean asalSayi(int a) {
        int sayac = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Gİrin: ");
        int a = scanner.nextInt();

        if (asalSayi(a)) {
            System.out.println(a + " sayısı asaldır !");
        } else {
            System.out.println(a + " sayısı asal değildir !");
        }
    }
}
