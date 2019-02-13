public class sumapares
{
    public static void main(String[] args)
    {
        int a = 0;
        for (int i=2; i< 200;i++)
        {
            System.out.println(a);

            a= a + 2;
        }
        System.out.println("La suma de los pares es: "+ a);
    }
}