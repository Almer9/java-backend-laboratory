package lab.jvm;


/**
 * Эксперимент 1.1: Демонстрация переполнения стека вызовов (Thread Stack).
 *
 * Суть: Рекурсивный вызов метода без условия выхода.
 * Ожидание: Исчерпание памяти стека и ошибка java.lang.StackOverflowError.
 * Фактический результат: Программа падает на ~3374 вызове.
 * Вывод: Каждый вызов метода создает новый Stack Frame. Локальные примитивы (long)
 * хранятся во фрейме и увеличивают его размер. Чем «тяжелее» переменные внутри метода,
 * тем быстрее заполняется фиксированный лимит памяти стека потока.
 */
public class StackOverflowTest {

    public static void recursion(int counter){
        long long1 = 100000000;
        long long2 = 100000000;
        long long3 = 100000000;
        long long4 = 100000000;
        long long5 = 100000000;
        counter++;
        System.out.println("Current counter is: " + counter);
        recursion(counter);
    }

    public static void main(String[] args){
        recursion(0);

    }
}