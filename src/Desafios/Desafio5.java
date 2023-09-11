package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maiorQ5 = numeros.stream().filter(n -> n >5).toList();

        double media = maiorQ5.stream().mapToInt(Integer::intValue).average().getAsDouble();

        System.out.println(media);
        System.out.println("a media é: " + media);

    }



}
