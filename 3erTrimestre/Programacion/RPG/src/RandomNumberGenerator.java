import java.util.Random;

public class RandomNumberGenerator
{
    void usingRandomClass(int a_att) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(a_att) + 1;
        System.out.println("Random number generated is : " + randomInt);
    }
}