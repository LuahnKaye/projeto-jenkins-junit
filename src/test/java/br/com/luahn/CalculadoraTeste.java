package br.com.luahn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTeste {

    @Test
    public void testar_soma_correta() {
        // Inicializa a calculadora
        Calculadora calculadora_instancia = new Calculadora();
        
        // Executa a operação de soma
        int resultado_soma = calculadora_instancia.somar(10, 5);
        
        // Verifica se o resultado é o esperado
        assertEquals(15, resultado_soma, "A soma de 10 e 5 deve ser 15");
    }

    @Test
    public void testar_subtracao_correta() {
        Calculadora calculadora_instancia = new Calculadora();
        
        int resultado_subtracao = calculadora_instancia.subtrair(20, 8);
        
        assertEquals(12, resultado_subtracao, "A subtração de 20 por 8 deve ser 12");
    }
}
