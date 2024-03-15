package Seminar1.Tasks;
/*
Реализуйте метод, принимающий в качестве аргументов двумерный массив.
Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
детализировать какие строки со столбцами не требуется.
Как бы вы реализовали подобный метод?
 */
public class Task8 {
    public static void main(String[] args) {
        /*
        0   1   2   3
      0{1   4   6   3}
      1{3   4   2}
      2{3   7}
      3{8}
         */
        int[][] matrix = {{1, 4, 6, 3}, {3, 4, 2}, {3, 7}, {8}};
        checkMatrix(matrix);
    }
    public static void checkMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                System.out.println("Длина не равна");
            }
            System.out.println("Равна");
        }
    }
}
