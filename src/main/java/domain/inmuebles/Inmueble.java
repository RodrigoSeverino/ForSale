package domain.inmuebles;

import domain.Ubicacion;
import domain.operacion.Operacion;

public abstract class Inmueble {

    private Ubicacion ubicacion;
    protected double metrosCuadrados;
    protected int cantidadDeAmbientes;
    private Operacion operacion;

    public double precio(){
        return this.ubicacion.getPrecio();
    }
}
