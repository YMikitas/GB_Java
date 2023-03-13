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

import java.util.ArrayList;
import java.util.Scanner;

public class Sem4_HW1 {
    public static void main(String[] args) {
        System.out.println("Ведите строки: ");
        Scanner sc = new Scanner(System.in);
        ArrayList <String> resultList = new ArrayList<>();
        int arrSize = 100;

        for (int i = 0; i < arrSize; i++) {
            resultList.add(" ");
        }

        Boolean run = true;
        while (run) {
            String text = sc.nextLine();
            if (text.toLowerCase().equals("exit")) {
                run = false;
            }
            else if (text.toLowerCase().contains("print")){
                String[] split = text.split("~");
                String numberString = split[1];
                int indexNumber = Integer.parseInt(numberString);
                System.out.println(resultList.get(indexNumber));
            }
            else {
                String[] split = text.split("~");
                String word = split[0];
                String numberString = split[1];
                int indexNumber = Integer.parseInt(numberString);
                resultList.add(indexNumber, word);
            }
        }
        sc.close();
    }
}