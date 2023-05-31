import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        while (a < 3) {
            a++;
            System.out.println("a = " + a);
        }
        a = 0;
        do {
            a++;
            System.out.println("a = " + a);
        }
        while (a < 20);

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        timer(3);
        timer(x);
    }

    public static void timer(int x){
        int min = x/60;
        int sec = x%60;
        for (int j = x; j>=0; j--) {
            min = j / 60;
            sec = j%60;
            System.out.println("Минуты: " + min + ". Cекунды: " + sec);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}