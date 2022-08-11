import java.util.Scanner;
//Java'da recursive metotlar ile fibonacci serisi bulan program

public class Main {
    static int f(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return f(x - 1) + f(x - 2);
    }

    public static void main(String[] args) {
        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz: ");
        n = inp.nextInt();

        //istedigin  basamaga kadar fibonacci sayilarini gosterir:

        for (int i = 1; i <= n; i++) {
            System.out.print(f(i) + "-");
        }
    }
}
