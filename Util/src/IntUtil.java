/**
 * Created by Компаниец on 08.11.2015.
 */
import java.util.Random;

public final class IntUtil {
    /**
     * изменение размера массива
     */
    public static int[] resize(int[] arrayToResize, int newLength){
        int[] res =new int[newLength];
        int min = Math.min(arrayToResize.length,newLength);
        for (int j=0;j<min;j++)
            res[j] = arrayToResize[j];
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
    public static boolean compare(int []firstArray, int[]secondArray){
        if(firstArray.length == secondArray.length) {
            for (int index = 0; index < firstArray.length; index++) {
                int count1 = countElems(firstArray, firstArray[index]);
                int count2 = countElems(secondArray, secondArray[index]);
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
        for (int index = array.length - 1; index > 0; index--) {
            int swapIndex = rnd.nextInt(index + 1);
            int temp = array[swapIndex];
            array[swapIndex] = array[index];
            array[index] = temp;
        }
        return array;
    }

    /**
     * вывод массива
     */
    public static void print(int []arrayToPrint){
        for (int index = 0; index< arrayToPrint.length; index++){

            System.out.print(arrayToPrint[index]);
            System.out.print("\t");
        }
        System.out.println();
        System.out.println();
    }
}