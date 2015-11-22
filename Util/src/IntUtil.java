/**
 * Created by Компаниец on 08.11.2015.
 */
import java.util.Random;

public final class IntUtil {
    /**
     * изменение размера массива
     */
    public static int[] resize(int[] a, int newLength){
        int[] res =new int[newLength];
        int min = Math.min(a.length,newLength);
        for (int j=0;j<min;j++)
            res[j] = a[j];
        if (min < newLength) {
            for (int j = min; j < newLength; j++) {
                res[j] = 0;
            }
        }
        return res;
    }

    private static int countElems(int [] array, int elem) {
        int count = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                elem  = array[i];
                for(int j = i+1; j < array.length; j++){
                    if (elem == array[j]){
                        count ++;
                    }
                }

            }
            return count;
        }
        else
            count = 0;

        return count;
    }

    /**
     * сравнение двух массивов без учета порядка
     */
    public static boolean compare(int []a, int[]b){
        if(a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                int count1 = countElems(a, a[i]);
                int count2 = countElems(b, b[i]);
                if (count1 != count2) {
                    return false;
                }
            }
        }
        else
            return false;

        return true;
    }

    /**
     * перемешивание массива
     */
    static int[] shuffleArray(int[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int swapIndex = rnd.nextInt(i + 1);
            int a = array[swapIndex];
            array[swapIndex] = array[i];
            array[i] = a;
        }
        return array;
    }

    /**
     * вывод массива
     */
    public static void print(int []a){
        for (int i = 0; i< a.length; i++){

            System.out.print(a[i]);
            System.out.print("\t");
        }
        System.out.println();
        System.out.println();
    }
}