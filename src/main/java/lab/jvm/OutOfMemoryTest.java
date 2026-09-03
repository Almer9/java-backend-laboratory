package lab.jvm;

import java.util.ArrayList;
import java.util.List;
/**
 * Эксперимент 1.2: Демонстрация переполнения хипа.
 *
 * Суть: Циклическое заполнение списка.
 * Ожидание: Исчерпание памяти хипа и ошибка java.lang.OutOfMemoryError.
 * Фактический результат: Программа падает на ~4 вызове.
 * Вывод: Каждое добавлнение в список увеличивает его размер, он хранит сильные ссылки, GC не может их удалить и хип заполняется в конце концов
 */
public class OutOfMemoryTest {

    static void main() {
        int counter = 0;

        List<byte[]> list = new ArrayList<>();
        while (true){
            counter++;
            System.out.println("Current counter is: " + counter);
            list.add(new byte[1024*1024]);
        }

    }
}
