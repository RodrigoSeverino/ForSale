package domain.inmuebles;

public class Casa extends Inmueble {

    private double precioBase;

    @Override
    public double precio(){
        return this.precioBase + super.precio();
    }

}
