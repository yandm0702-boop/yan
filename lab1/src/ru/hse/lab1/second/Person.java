package src.ru.hse.lab1.second;

/**
 * Класс Person
 *
 * @author Мовчун Ян Дмитриевич
 * @version 1.0
 * @since 2026
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
