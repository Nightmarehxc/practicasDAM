import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {




    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i <4;i++)
        {
            System.out.println("Introduce un numero");
            lista.add(i,sc.nextInt());

        }
        Collections.sort(lista);
        for( int i = 0; i< 4;i++)
        {
            System.out.println(lista.get(i));
        }
    }
}
