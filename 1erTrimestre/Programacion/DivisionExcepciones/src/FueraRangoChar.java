import java.util.Scanner;

public class FueraRangoChar
{
    public static int comprobarChar() {
        int i, j = 0;
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        try {
            for (i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
                System.out.println(+a[i]);
            }
        } catch ( Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return comprobarChar();
    }
}
