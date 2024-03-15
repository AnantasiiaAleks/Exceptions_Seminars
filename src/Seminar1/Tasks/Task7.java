package Seminar1.Tasks;

import java.util.Arrays;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
возвращающий новый массив, каждый элемент которого равен сумме элементов двух
входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя
 */
public class Task7 {
    public static void main(String[] args) throws Exception {
        int[] arr1 = {0, 1, 2, 3, 4};
        int[] arr2 = {1, 1, 1, 1};
        arraySumArrays(arr1, arr2);
    }

    public static void arraySumArrays(int[] array1, int[] array2) throws Exception {
        int[] resultArray = new int[array1.length];
        //if (array1.length != array2.length) throw new Exception ("Массивы не равны по длине");
        System.out.println();
        for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = array1[i] + array2[i];
            }
            System.out.println(Arrays.toString(resultArray));

    }
}
