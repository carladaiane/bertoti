public class ICMScalc implements ImpostoInterface {

    @Override
    public double calcular(double valor) {
        double imposto = valor * 0.10; // ICMS é 10%
        return imposto * 0.98;
    }
}
