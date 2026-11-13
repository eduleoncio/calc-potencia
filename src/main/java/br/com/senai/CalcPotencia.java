package br.com.senai;

/** Calcula potência elétrica pela relação P = V x I. */
public class CalcPotencia {
    /**
     * Calcula a potência em watts.
     *
     * @throws IllegalArgumentException se tensão ou corrente não forem positivas
     */
    public double calcularPotencia(double tensao, double corrente) {
        if (!Double.isFinite(tensao) || tensao <= 0) {
            throw new IllegalArgumentException("A tensão deve ser um número positivo.");
        }
        if (!Double.isFinite(corrente) || corrente <= 0) {
            throw new IllegalArgumentException("A corrente deve ser um número positivo.");
        }
        return tensao * corrente;
    }
}
