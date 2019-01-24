import java.util.Scanner;

public class FueraRango {
    public static int comprobar() {
        int i, j = 0;
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        try {
            for (i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
                System.out.println(+a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException s) {
            System.out.println("Error:" + s.getMessage());
        }
        return comprobar();
    }
}