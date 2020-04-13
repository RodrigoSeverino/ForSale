package domain.inmuebles;

public class PH extends Inmueble {

    private double valorPorMetroCuadrado;
    private double valorMinimo;

    @Override
    public double precio(){
        return this.valorPorMetroCuadrado * super.metrosCuadrados + super.precio() + this.valorMinimo;
    }
}
