package domain.operacion;

import domain.Empleado;

public class Alquiler extends Operacion {

    private int cantDeMeses;
    private double precioDivisor = 50000;

    public void calcularComisionEmpleado(Empleado empleado) {
        double comision = this.cantDeMeses * super.inmueble.precio() / precioDivisor;
        empleado.comision(comision);
    }
}
