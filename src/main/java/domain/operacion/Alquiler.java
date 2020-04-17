import domain.Empleado;
import domain.operacion.Operacion;

public class Alquiler extends Operacion {

    private int cantDeMeses;
    private static double precioDivisor = 50000;

    @Override
    public void calcularComisionEmpleado(Empleado empleado) {
        double comision = this.cantDeMeses * super.inmueble.precio() / precioDivisor;
        empleado.comision(comision);
    }
}
