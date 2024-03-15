package Seminar1.Tasks;
/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
ошибке.
 */
public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1}, {0, 0, 1}, {1, 0, 0}};
        //sumMatrix(null);
        System.out.println(sumMatrix(matrix));
    }
    public static int sumMatrix(int[][] matrix) {
        if (matrix == null) throw new RuntimeException("Массив пустой");
        if (matrix.length != matrix[0].length) throw new RuntimeException("Матрица не квадратная");
        int sum = 0;
        for (int[] array : matrix) {
            for (int val : array) {
                if (val != 0 && val != 1) throw new RuntimeException("Или 0, или 1");
                sum += val;
            }
        }
        return sum;
    }
}
