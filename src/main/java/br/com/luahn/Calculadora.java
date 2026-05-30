package br.com.luahn;

public class Calculadora {
    
    /**
     * Soma dois números inteiros.
     *
     * Args:
     *     valor_a (int): O primeiro valor.
     *     valor_b (int): O segundo valor.
     *
     * Returns:
     *     int: A soma de valor_a e valor_b.
     */
    public int somar(int valor_a, int valor_b) {
        return valor_a + valor_b;
    }

    /**
     * Subtrai dois números inteiros.
     *
     * Args:
     *     valor_a (int): O valor base.
     *     valor_b (int): O valor a ser subtraído.
     *
     * Returns:
     *     int: O resultado da subtração.
     */
    public int subtrair(int valor_a, int valor_b) {
        return valor_a - valor_b;
    }
}
