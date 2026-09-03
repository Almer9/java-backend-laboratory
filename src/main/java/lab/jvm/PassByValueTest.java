package lab.jvm;

/**
 * Эксперимент 1.3: Демонстрация Pass-by-value.
 *
 * Суть: Любые обьекты всегда передаются в методе по значеню.
 * Ожидание: При переназначении ссылки на новый обьект в методе и его изменении обьект вне значения не меняется.
 * Фактический результат: При переназначении ссылки на новый обьект в методе и его изменении обьект вне значения не меняется.
 * Вывод: При переназначении ссылки на новый обьект в методе и его изменении обьект вне значения не меняется
 * В Java аргументы всегда передаются копированием значения.
 * Для примитивов копируется само число, а для объектов копируется адрес памяти (ссылка).
 * Переменная cat внутри метода reassignCat — это лишь локальная копия адреса в Stack Frame.
 * Переназначение этой переменной меняет адрес только в локальном фрейме, никак не затрагивая оригинальную ссылку в вызывающем методе
 */
public class PassByValueTest {

    public static class Cat{
        String name;

        public Cat(String name){
            this.name = name;
        }
    }

    public static void changeName(Cat cat, String newName){
        cat.name = newName;
    }

    public static void reassignCat(Cat cat){
        cat = new Cat("Reassigned cat name");
    }

    static void main() {

        Cat cat = new Cat("Name");
        System.out.println("Initial cat: " + cat.name);
        changeName(cat, "Changed cat name");
        System.out.println("Changed cat name: " + cat.name);
        reassignCat(cat);
        System.out.println("Reassigned cat name: " + cat.name);

    }
}
