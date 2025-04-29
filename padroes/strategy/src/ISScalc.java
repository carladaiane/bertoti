public class ISScalc implements ImpostoInterface {
    @Override
    public double calcular(double valor) {
        return valor * 0.06; // ISS é 6%
    }
}
