import java.util.Scanner;

public class Praktikum_Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String NIM;
        int n;

        System.out.print("Masukkan NIM: ");
        NIM = input.nextLine();

        n = Integer.parseInt(NIM.substring(NIM.length() - 2));

        if (n < 10) {
            n += 10;
        }

        System.out.println("n: " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
