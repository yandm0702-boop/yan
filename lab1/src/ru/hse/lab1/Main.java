package src.ru.hse.lab1;


import src.ru.hse.lab1.second.Person;

/**
 * Главный класс
 *
 * @author Мовчун Ян Дмитриевич
 * @version 1.0
 * @since 2026
 */
public class Main {
    public static void  main (String[] args) {
        Person person = new Person("Ян", 18);
        System.out.println("Имя: "+person.getName()+"\n"+"Возраст: "+person.getAge());
    }
}
