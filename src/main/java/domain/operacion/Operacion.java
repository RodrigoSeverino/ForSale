package domain.operacion;

import domain.estado.Abierta;
import domain.estado.EstadoInmueble;
import domain.inmuebles.Inmueble;

public abstract class Operacion {

    protected Inmueble inmueble;
    private EstadoInmueble estadoInmueble;


    public Operacion() {
        this.estadoInmueble = new Abierta();
    }



}
