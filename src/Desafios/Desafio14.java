package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio14 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        List<Integer> nPrimos = numeros.stream().filter(Desafio14::isPrimo).toList();


        int maiorNumeroPrimo = nPrimos.stream().max(Integer::compareTo).orElse(0);
        System.out.println(maiorNumeroPrimo);
    }
    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
