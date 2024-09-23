public class ArraysJava {

    public static void main(String[] args) {

        // 1. Declare an array
        int[] enteros;
        // 2. initialize the array
        enteros = new int[3];

        // Declare and initialize
        int[] numeros = new int[2];

        enteros[0] = 13;
        enteros[2] = 67;

        System.out.println("Enteros = " + enteros[0]);

        // the numbers that aren't assign are equal to 0
        for (int n = 0; n < enteros.length; n++){
            System.out.println("enteros[n] = " + enteros[n]);
        }


        // Simplified
        // var numbers = new int[]{1, 2, 4, 5, 9};
        int[] numbers = {1, 2, 4, 5, 9};
        for (int n = 0; n < numbers.length; n++){
            System.out.println("numbers[n] = " + numbers[n]);
        }
    }
}
