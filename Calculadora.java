public class Calculadora {

    /**
     * Executa uma operação matemática básica.
     * @param operacao
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.calcular( "", 0, 0 );
    }
}

