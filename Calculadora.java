package com.calculadora;

/**
 * Calculadora completa após integração de todas as branches (amissao, oresgate, oamanhanuncamorre).
 * Este ficheiro contém as operações de soma, subtração, multiplicação e divisão.
 */
public class Calculadora {

    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
            case "soma":
                return a + b;
            case "subtracao":
                return a - b;
            case "multiplicacao":
                return a * b;
            case "divisao":
                if (b == 0) {
                    throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
                }
                return (double) a / b;
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
    }

    // Comentario obrigatorio do item 11 - Adicionado para forçar conflito de merge
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("--- Testes da Calculadora ---");
        System.out.println("Soma (5+3): " + calc.calcular("soma", 5, 3));
        System.out.println("Subtração (10-4): " + calc.calcular("subtracao", 10, 4));
        System.out.println("Multiplicação (6*7): " + calc.calcular("multiplicacao", 6, 7));
        System.out.println("Divisão (20/4): " + calc.calcular("divisao", 20, 4));
    }
}