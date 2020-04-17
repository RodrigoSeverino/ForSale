package domain;

import domain.estado.Concretado;
import domain.estado.EstadoInmueble;
import domain.estado.Reservado;
import domain.inmuebles.Inmueble;

public class Empleado {

    private String nombre;
    private String apellido;
    private double comisiones = 0.0;
    private EstadoInmueble estadoInmueble;

    public void comision(double comision){
        this.comisiones+= comision;
    }

    public void reservar(Inmueble inmueble) {
            this.estadoInmueble = new Reservado();
    }

    public void concretar(Inmueble inmueble){
        this.estadoInmueble = new Concretado();
    }
}
