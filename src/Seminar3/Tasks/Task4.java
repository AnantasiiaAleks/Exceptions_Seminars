package Seminar3.Tasks;
/*
1.Напишите метод,на вход которогоподаётся двумерный строковый массив
размером 4х4. При подаче массива другого размера необходимо бросить
исключение MyArraySizeException.
2. Далее метод долженпройтись по всем элементам массива,преобразовать в
int и просуммировать. Если в каком-то элементе массива преобразование
не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в
какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные
исключения MyArraySizeException и MyArrayDataException и вывести
результат расчета (сумму элементов,при условии что подали на вход
корректный массив).
 */
public class Task4 {
    public static void main(String[] args) {
        String[][] myArray = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        System.out.println(sumArray(myArray));
    }
    public static int sumArray(String [][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 || array[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }

            }
        }
        return sum;
    }
}
class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(){
        super("Массив неверного размера");
    }
}
class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(){
        super("Невозможно преобразовать в число");
    }
}
