package domain.inmuebles;

public class Departamentos extends Inmueble{

    private double valorPorAmbiente;

    @Override
    public double precio(){
        return this.valorPorAmbiente * super.cantidadDeAmbientes + super.precio();
    }
}
