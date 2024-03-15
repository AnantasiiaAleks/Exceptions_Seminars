package Seminar1.Tasks;
/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
“подсветить”
 */
public class Task4 {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 2, null, 4, 5, 8, null};
        checkArray(array);
    }
    public static void checkArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) System.out.printf("На позиции %d встретился null\n", i);
        }
    }
}
