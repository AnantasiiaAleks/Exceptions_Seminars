package Seminar3.Tasks;
/*
Создайтеклассисключения, который будет выбрасываться при делениина
0. Исключениедолжно отображать понятноедля пользователя сообщение
об ошибке.
2. Создайтеклассисключений, котороебудет возникатьпри обращении к
пустому элементув массиве ссылочного типа. Исключениедолжно
отображать понятноедля пользователя сообщениеоб ошибке
3. Создайтеклассисключения, котороебудет возникатьпри попытке открыть
несуществующий файл. Исключение должно отображать понятное для
пользователясообщение об ошибке.
 */
import java.io.FileNotFoundException;

public class Task3 {
}
class DivByZero extends ArithmeticException{
    public DivByZero(){
        super("Деление на 0 запрещено!");
    }
}

class NullPointerArray extends NullPointerException{
    public NullPointerArray(int index){
        super("Обращение к пустому элементу массива, находящимся на индексе " + index);
    }

    public NullPointerArray(){
        super("Обращение к пустому элементу массива");
    }
}

class NotFoundFile extends FileNotFoundException {
    public NotFoundFile(String path){
        super("Не найдет файл по данному пути" + path);
    }

    public NotFoundFile(){
        super("Не найдет файл");
    }
}