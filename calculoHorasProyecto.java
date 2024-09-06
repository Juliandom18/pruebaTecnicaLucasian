/*La empresa  Lucasian Labs va a desarrollar un nuevo proyecto de software
con su  cliente Banco Caja Social, de acuerdo con la siguiente información El número de horas estimado es de 3390 y el valor de hora de trabajo es de $70.000 pesos colombianos */

//Importaciones para formatear el valor total del proyecto
import java.text.NumberFormat;
import java.util.Locale;

public class calculoHorasProyecto {
    public static void main(String[] args) {

        //Variables para guardar las operaciones de los datos que ya se saben
        int valorPorHora = 70000;
        int totalHorasEsfuerzo = 3390;
        double cantidadHorasRequerimientos = (double) (3390 * 0.10);
        double cantidadHorasArquitectura = (double) (3390 * 0.05);
        double cantidadHorasDesarrollo = (double) (3390 * 0.6);
        double cantidadHorasCalidad = (double) (3390 * 0.2);
        double cantidadHorasGerencia = (double) (3390 * 0.05);
        
        //Imprimo el mensaje con la respuesta a cuantas horas de esfuerzo llevarían la etapa de desarrollo y calidad
        System.out.println("El número de horas para la etapa de desarrollo y calidad es de: " + (cantidadHorasDesarrollo + cantidadHorasCalidad) + " horas");

        //Imprimo el mensaje con la respuesta a cuantas horas de esfuerzo llevaría la estapa de Arquitectura
        System.out.println("El número de horas para la etapa de arquitectura es de: " + (cantidadHorasArquitectura) + " horas");

        //Formateo del valor total antes de imprimirlo
        NumberFormat formateador = NumberFormat.getInstance(Locale.getDefault());
        String numeroFormateado = formateador.format(valorPorHora * totalHorasEsfuerzo);
        
        //Imprimo el mensaje con la respuesta de cuánto es el valor total del proyecto
        System.out.println("El valor total del proyecto es de: $" + (numeroFormateado) + " millones de pesos colombianos");

        
    }
}