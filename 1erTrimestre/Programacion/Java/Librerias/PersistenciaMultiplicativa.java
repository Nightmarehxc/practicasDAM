import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PersistenciaMultiplicativa
{


    public static int Ejercicio()
    {
        Scanner input = new Scanner(System.in);



        System.out.println("Introduce el numero para calcular");
        int c =0;
        int n = input.nextInt();
        Integer[] digits = getDigits(n);


        System.out.println(Arrays.toString(digits));



        int temp = digits[0]*digits[1];
        c++;

        do
            {
                c++;
                digits = getDigits(temp);


                System.out.println(temp);
                System.out.println(Arrays.toString(digits));


                temp = digits[0]*digits[1];


            }while (temp >9);
        System.out.println(c);

        return 0;

    }



    public static Integer[] getDigits(int num) {
        List<Integer> digits = new ArrayList<Integer>();
        collectDigits(num, digits);
        return digits.toArray(new Integer[]{});
    }

    private static void collectDigits(int num, List<Integer> digits) {
        if(num / 10 > 0) {
            collectDigits(num / 10, digits);
        }
        digits.add(num % 10);
    }




}