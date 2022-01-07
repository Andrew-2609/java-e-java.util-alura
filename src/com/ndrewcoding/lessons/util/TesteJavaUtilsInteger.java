package com.ndrewcoding.lessons.util;

@SuppressWarnings({"UnnecessaryBoxing", "WrapperTypeMayBePrimitive"})
public class TesteJavaUtilsInteger {
    public static void main(String[] args) {

        System.out.println("Número de bytes de um Integer: " + Integer.BYTES);

        int idade = 19;
        Integer idadeRef = Integer.valueOf(idade); // autoboxing
        double valor = idadeRef.doubleValue(); // unboxing

        System.out.println("Valor depois de Autoboxing e Unboxing: " + valor);

        String s;
        try {
            s = args[0];
        } catch (ArrayIndexOutOfBoundsException ex) {
            s = "42";
        }

        Integer integerRef = Integer.valueOf(s);
        int primitivo = Integer.parseInt(s);

        System.out.println("Parâmetro informado convertido para Integer: " + integerRef);
        System.out.println("Parâmetro informado convertido para int: " + primitivo);

    }
}
