package Sem_02;

public class Sem2_1 {
    public static void main(String[] args) {
        System.out.println(buildString(6, 'М', 'и')); // -> МиМиМи
    }

    private static String buildString(int n, char first, char second) {
        // TODO: 13.02.2023  Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
        String N = new String();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                N += first;
            } else {
                N += second;
            }
        }
        return N;
    }
}