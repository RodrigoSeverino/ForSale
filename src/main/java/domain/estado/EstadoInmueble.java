package domain.estado;

import domain.inmuebles.Inmueble;


public abstract class EstadoInmueble {

    protected Inmueble inmueble;

    public abstract boolean estaReservado();

}
