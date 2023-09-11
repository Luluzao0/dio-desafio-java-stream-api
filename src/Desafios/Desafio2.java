package Desafios;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        //filtrar pares
        List<Integer> numerosPares = numeros
                .stream()
                .filter(numero -> numero % 2 == 0)
                .toList();


        //realiza a soma
        int soma = numerosPares
                .stream().
                mapToInt(numero -> numero)
                .sum();

        System.out.println(soma);

    }

}
