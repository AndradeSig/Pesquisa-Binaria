
/*
   This algorithm was made with a friend: https://github.com/Defmc/
 */

import java.util.Scanner;

public class BinaryClass {

    public static int[] vector = {1,4,7,9,102,142,198,202};

    public static void main(String[] args){
        Scanner typeIn = new Scanner(System.in);
        int value = 0;
        System.out.println("Digite um Valor:"); // Type a Value:

        String vvT = typeIn.nextLine();
        value = Integer.parseInt(vvT); // Transform the int value to String

        System.out.println("O Índice pego foi: "+binaryserach(vector,value)); // The Index taken was:
    }

    public static int binaryserach(int[] vector,int ttg){
        int ii;
        int min = 0;
        int max = vector.length - 1;
        while (max - min > 1){
            System.out.println(min + " : " + max);
            ii = (min + max) / 2;
            if (vector[ii] == ttg) {
                return ii;
            }
            else if (vector[ii] < ttg) {
                min = ii;
            }
            else {
                max = ii;
            }
        }
        return -1; // If you can't find the value, return -1
    }

}
