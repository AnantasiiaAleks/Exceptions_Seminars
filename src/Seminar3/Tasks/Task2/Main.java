package Seminar3.Tasks.Task2;

import java.io.IOException;

/*
Создайте класс Счетчик, у которого есть метод add(), увеличивающий
значение внутренней int переменнойна 1. Сделайте так, чтобы с объектом
такого типа можно было работать в блоке try-with-resources. Нужно бросить
исключение, если работа с объектом типа счетчик была не в ресурсном try
и/или ресурс остался открыт. Подумайте какой тип исключения подойдет
лучше всего.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        try (Counter counter = new Counter()) {
            counter.add();
            counter.add();
            System.out.println(counter.getValue());
            counter.close();
            counter.add();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
