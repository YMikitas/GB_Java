package Sem_05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class Sem5_HW1 {
    /**
     * Написать метод, определяющую правильность расстановки скобок в выражении.
     * Могут содержаться следующие скобки: ()[]{}<>
     * () -> true
     * []{}((<>)) -> true
     * ) -> false
     * [) -> false
     * []{}(<)> -> false
     */

    public static void main(String[] args) {
        HashMap<String, Integer> openBracket = new HashMap<String, Integer>() {
            {
                put("{", 0);
                put("[", 1);
                put("(", 2);
                put("<", 3);
            }
        };
        HashMap<String, Integer> closeBracket = new HashMap<String, Integer>() {
            {
                put("}", 0);
                put("]", 1);
                put(")", 2);
                put(">", 3);
            }
        };

        Scanner userInput  = new Scanner(System.in);
        System.out.print("Введите выражение для проверки: \n");
        String text = userInput.nextLine();

        boolean validate = validate(openBracket, closeBracket, text);

        if (validate) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean validate(HashMap<String, Integer> openBracket,
                                   HashMap<String, Integer> closeBracket,
                                   String text) {

        String[] strings = text.split("");

        Deque<String> stack = new ArrayDeque<>();

        for (String inLine : strings) {

            for (int i = 0; i < inLine.length(); i++) {

                char character = inLine.charAt(i);
                String symbol = Character.toString(character);

                if (openBracket.containsKey(symbol)) {
                    stack.push(symbol);
                }

                else if (closeBracket.containsKey(symbol)) {

                    if (!stack.isEmpty()) {
                        Integer ordinalNumberForCheckedSymbol = closeBracket.get(symbol);
                        String firstElemFromStack = stack.pop();
                        Integer ordinalLastAddedNumberElemFromStack = openBracket.get(firstElemFromStack);

                        boolean isPairTheBrackets = ordinalLastAddedNumberElemFromStack.equals(ordinalNumberForCheckedSymbol);

                        if (isPairTheBrackets)
                            break;
                    }
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}