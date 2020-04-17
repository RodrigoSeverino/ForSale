package domain.operacion;

import domain.Empleado;

public class Venta extends Operacion {

    private static double porcentajeComision = 0.01;

    @Override
    public void calcularComisionEmpleado(Empleado empleado) {
        double comision = super.inmueble.precio() * Venta.porcentajeComision;
        empleado.comision(comision);
    }
}
