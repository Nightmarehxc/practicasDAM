public class CopiarUnArrayAOtro {


    public static void main(String[] args) {

        int i, j;
        int [] arrayA = new int[11];
        float [] arrayB = new float[34];

        for (i=0;i<arrayB.length;i++) {

            for (j = 0; j < arrayA.length; j++) {

                arrayB[i] = arrayA[j];
            }

            System.out.println(arrayB[i]);

        }
    }
}