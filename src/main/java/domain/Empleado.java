package domain;

public class Empleado {

    private double comisiones = 0.0;

    public void comision(double comision){
        this.comisiones+= comision;
    }
}
