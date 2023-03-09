package Sem_04;

/**
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида
 * text~num
 *
 * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 *
 * // text~num (например, word~4)
 * // print~num (распечатать текст)
 *
 * // word~1
 * // foo~5
 * // qwerty~10
 * // bar~5
 * // print~10 -> qwerty
 * // print~1 -> word
 * // print~2 -> пустая строка или исключение NoSuchElementException
 * // print~5 -> bar
 */

import java.util.Arrays;

public class Sem4_HW1 {
    public static void main(String[] args) {
        String input = "word~4";

        String[] split = input.split("~");
        String word = split[0];
        String numberString = split[1];
        int number = Integer.parseInt(numberString);

        System.out.println(Arrays.toString(split));
    }
}