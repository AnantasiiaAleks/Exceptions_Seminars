package Seminar1.Tasks;
/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
значение и покажет читаемый результат пользователю. Например, если вернулся -2,
пользователю выведется сообщение: “Искомый элемент не найден”.
 */
public class Task0_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] rrat = null;
        int a = 1;
        int minLen = 4;
        int x = checkArray(rrat, a, minLen);
        exceptionMessage(x);
    }

        public static int checkArray(int[] array, int a, int minLenght){
            if (array == null) return -3;
            if (array.length < minLenght) return -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == a) return i;
            }
            return -2;
        }

        public static void exceptionMessage(int a){
            switch (a) {
                case -1:
                    System.out.println("длина массива меньше заданного минимума");
                    break;
                case -2:
                    System.out.println("Искомый элемент не найден");
                    break;
                case -3:
                    System.out.println("Массива нет");
                    break;
                default:
                    System.out.println(a);
            }
        }

}
