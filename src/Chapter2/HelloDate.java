package Chapter2;

//: Chapter2/HelloDate.java
import java.util.*;

/** Первая программа-пример книги.
 * Выводит строку и текущее число.
 * @author Брюс Экель
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloDate {
    /** Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     */
    public static void main(String[] args) {
        System.out.println("Привет, сегодня:");
        System.out.println(new Date());
    }
}
