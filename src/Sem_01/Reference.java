package Sem_01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Reference {
    public static void main(String[] args)
    {
//        /*
//        Метод equals() более предпочтителен для сравнения строк. == может привести к неожиданному результату
//         */
//
//        String str1 = "ABC";
//        String str2 = "ABC";
//        String str3 = new String("ABC");
//        String str4 = new String("ABC");
//
//        System.out.println(str1 == str2); // -> true / Работает потому что обе эти строки находятся в одной ячейке памяти
//        System.out.println(str3 == str4); // -> false / Потому что str3 и str4 созданы через конструктор и находятся в разных ячейках памяти
//
//        System.out.println(str1.equals(str2)); // -> true / Работает корректно
//        System.out.println(str3.equals(str4)); // -> true / Работает корректно





//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("a");
//        stringBuilder.append("b");
//        stringBuilder.append("c");
//
//        String build = stringBuilder.toString(); // Преобразование хранящегося массива в памяти в строку
//        System.out.println(stringBuilder);



        Path file = Path.of("file.txt");
        try {
            Files.createFile(file);
        } catch (IOException e) {
            System.out.println("файл уже существует");
        }
    }
}
