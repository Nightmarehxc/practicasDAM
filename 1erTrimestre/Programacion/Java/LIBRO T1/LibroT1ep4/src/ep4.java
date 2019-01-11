public class ep4 {

    public static void main (String[] args)

    {
        int  num=5;
        num += num - 1 * 4 +1; // Aquí primero se realiza la multiplicación, y después la suma: (num= num + num) - 4 + 1.
        System.out.println(num);// El resultado será 7
        num=4;
        num %= 7 * num % 3 * 7 >> 1;// Aquí el resultado de la operación lo desplaza un bit hacia la derecha.
        System.out.println(num);// El resultado será 1.
    }
}
