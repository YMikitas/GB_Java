package Sem_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Sem2HW {
    public static void main(String[] args) throws IOException {
        System.out.println(isPalindrom("шалаш"));
        Test100("file.txt");
    }

    private static Boolean isPalindrom(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static void Test100(String fileName) throws IOException {
        Path file = Path.of(fileName);
        String str = "";
        for (int i = 0; i < 100; i++) {
            if (i == 99) {
                str += "TEST";
            } else str += "TEST\n";
        }
        if (Files.exists(file)) {
            Files.writeString(file, str);
        } else {
            Files.createFile(file);
            Files.writeString(file, str);
        }
    }
}

// 1. Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш
// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.