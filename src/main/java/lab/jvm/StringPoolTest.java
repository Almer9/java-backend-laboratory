package lab.jvm;
/**
 * Эксперимент 1.4: Демонстрация работы String Pool.
 *
 * Суть: Литеральные строки хранятся в String Pool и при сравнении по ссылке со строками в куче выдают false. Литеральная строка с одним значением
 * всегда одна (даже если мы "создали" ее дважды.
 * Ожидание: При сравнении "двух" одинаковых строк из String Pool мы получим true.При сравнении по ссылке одинаковых
 * строк с оператором new мы получим false После примнения intern на строке из хипа она создастся в String Pool.
 * Фактический результат: При сравнении "двух" одинаковых строк из String Pool мы получили true.При сравнении по ссылке одинаковых
 * строк с оператором new мы получили false После примнения intern на строке из хипа она создалась в String Pool.
 * Вывод: Строки в хипе и String Pool - разные обьекты, даже если значение строки одинаково. Мы можем создавать строку из Heap в String pool
 * через intern.
 */
public class StringPoolTest {

    static void main() {
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        System.out.println("s1 = s2: " + (s1 == s2));
        System.out.println("s1 = s3: " + (s1 == s3));
        System.out.println("s1 equals s3: " + s1.equals(s3));
        String s4 = s3.intern();
        System.out.println("s1 = s3 interned: " + (s1 == s4));
    }
}
